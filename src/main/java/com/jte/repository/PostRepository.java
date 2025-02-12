package com.jte.repository;

import com.jte.domain.Post;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface PostRepository extends ListCrudRepository<Post,Integer> {

    Optional<Post> findByTitle(String title);

}
