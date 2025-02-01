package com.jte.component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jte.domain.User;
import com.jte.domain.Users;
import com.jte.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class UserDataLoader implements CommandLineRunner {

    private final Logger logger= LoggerFactory.getLogger(UserDataLoader.class);
    private final ObjectMapper objectMapper;
    private final UserRepository userRepository;

    public UserDataLoader(ObjectMapper objectMapper, UserRepository userRepository){
        this.objectMapper= objectMapper;
        this.userRepository= userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.count() == 0){
            String USERS_JSON = "/data/users.json";
            logger.info("Loading users into database from JSON: {}", USERS_JSON);
            try (InputStream inputStream = TypeReference.class.getResourceAsStream(USERS_JSON)) {
                Users response= objectMapper.readValue(inputStream,Users.class);
                List<User> users= response.getUsers();

                for(int i=0; i < users.size(); i++){
                    User user= users.get(i);
                    user.setId(null); // reset to null in order to insert new entry
                    userRepository.save(user);
                }
                //userRepository.saveAll(users.getUsers());
            } catch (IOException e) {
                throw new RuntimeException("Failed to read JSON data from users json", e);
            }
        }
    }

}
