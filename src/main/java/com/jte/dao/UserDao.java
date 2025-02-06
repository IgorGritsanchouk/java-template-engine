package com.jte.dao;

import com.jte.domain.User;
//import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    private final JdbcTemplate jdbcTemplate;

    private final Logger logger= LoggerFactory.getLogger(UserDao.class);

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user) {
//        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
//                //.withSchemaName("postgres_db")
//                .withSchemaName("public")
//                .withProcedureName("add_user")
//                .withoutProcedureColumnMetaDataAccess()  // This prevents it from expecting a function
//                .declareParameters(buildSqlParameters());
//
//                MapSqlParameterSource mapSqlParameterSource= new MapSqlParameterSource();
//                mapSqlParameterSource.addValue("p_first_name", user.getFirstName());
//                mapSqlParameterSource.addValue("p_last_name", user.getLastName());
//                mapSqlParameterSource.addValue("p_email", user.getEmail());
//                mapSqlParameterSource.addValue("p_country", user.getCountry());
//                mapSqlParameterSource.addValue("p_street_address", user.getStreetAddress());
//                mapSqlParameterSource.addValue("p_city", user.getCity());
//                mapSqlParameterSource.addValue("p_region", user.getRegion());
//                mapSqlParameterSource.addValue("p_postal_code", user.getPostalCode());
//
//                Map<String, Object> result = simpleJdbcCall.execute(mapSqlParameterSource);

        String sql = "CALL public.add_user(?, ?, ?, ?, ?, ?, ?, ?)";
        int id= jdbcTemplate.update(sql,
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getCountry(),
                user.getStreetAddress(),
                user.getCity(),
                user.getRegion(),
                user.getPostalCode()
        );

        //return (List<User>) result.get("users");
    }

//    public SqlParameter[] buildSqlParameters() {
//        return new SqlParameter[]{
//                new SqlParameter("p_first_name", Types.VARCHAR),
//                new SqlParameter("p_last_name", Types.VARCHAR),
//                new SqlParameter("p_email", Types.VARCHAR),
//                new SqlParameter("p_country", Types.VARCHAR),
//                new SqlParameter("p_street_address", Types.VARCHAR),
//                new SqlParameter("p_city", Types.VARCHAR),
//                new SqlParameter("p_region", Types.VARCHAR),
//                new SqlParameter("p_postal_code", Types.VARCHAR)
//                //new SqlOutParameter("l_clob", Types.CLOB)
//        };
//    }

    public List<User> selectUsersForCountry(String p_country_name) {
//        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
//                //.withProcedureName("get_users_by_country")
//                .withFunctionName("get_users_by_country")
//                .useInParameterNames(countryName)
//                .returningResultSet("users", BeanPropertyRowMapper.newInstance(User.class));
//
//        Map<String, Object> result = simpleJdbcCall.execute();


        String sql = "SELECT * FROM public.get_users_by_country('"+p_country_name+"')";
       // List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));


        var rowMapper = BeanPropertyRowMapper.newInstance(User.class);
        var users = jdbcTemplate.query(sql, rowMapper);

        users.forEach(country -> logger.info("{}", country));
        logger.info("users num: "+ users.size()+ "  country:"+ p_country_name);

        return users;
        //return (List<User>) result.get("users");
    }
}
