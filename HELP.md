install docker and then run
PS C:\APP_DEV\java-template-engine>docker compose up
to instantiate postgres data base as a container, to check tables and stored proc use link below:
http://localhost:8081/browser/
postgress client access url:
user:admin@admin.admin
pwd: admin
postgres  user: admin   password: password

-------   SP calls to oracle db  ---------
https://www.youtube.com/watch?v=DMU-8tNaeGI
## connecting to oracle db
#spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/oracle-xe-cnr
#spring.datasource.username=system
#spring.datasource.password=Password123
#spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
Added one func and one stored proc to insert user and select from users
for given country. Just a test on how proc anf functions can be added to postgres_db
---   func and stored proceadure call  ----
CALL add_user('mark','avreliy', 'igor@gmail.com', 'England', 'Flat 7 Chappel Arches', 'Maidenhead', 'Berkshire','SL61RU');
SELECT * FROM GET_USERS_BY_COUNTRY('England');

To run the application docker desktop is required to be installed
1) docker compose up       --  to start postgres database
2) And then start spring boot application  localhost:81 will display jte Uhttp://localhost:81
3) http://localhost:81 -- with vertical menu
3) http://localhost:81/user-form-vm    -- with vertical menu
3)  http://localhost:81/home  -- without vertical menu
    http://localhost:8081/login?next=/browser/
    user:  admin@admin.admin
    pswd:  admin
    -- pg db client ---
    download native Graal jdk from :
    https://www.graalvm.org/release-notes/JDK_21/
    -- native compile  POINT to: JAVA_HOME=C:\Program Files\Java\graalvm-jdk-21.0.5+9.1
    PS C:\APP_DEV\java-template-engine> ./mvnw -Pnative native:compile
    PS C:\APP_DEV\java-template-engine\target> start java-template-engine.exe
    java-template-engine> docker build -f Dockerfile -t igr025/jt-engine-21-img:v0.1 .
    java-template-engine> docker push igr025/jt-engine-21-img:v0.1
    ---  USE mvn wrapper package to install node and npm ---
    PS C:\APP_DEV\java-template-engine> ./mvnw compile
    PS C:\APP_DEV\java-template-engine> ./mvnw clean package

# 1. --- Before running from a jar file in production ---
PS C:\APP_DEV\java-template-engine>
java -jar target/java-template-engine-0.0.1-SNAPSHOT.jar

# 2. --- USE production jte precompiled settings ---
gg.jte.development-mode=false
gg.jte.developmentMode=false
gg.jte.usePrecompiledTemplates=true

---- pages to access ----
http://localhost/save-user-template
http://localhost:81/to-do

-----------------------------------------
---- tailwind css added to project ----
-----------------------------------------
install node and npm
PS C:\APP_DEV\java-template-engine> node -v
v16.13.1
PS C:\APP_DEV\java-template-engine> npm -v
8.1.2
PS C:\APP_DEV\java-template-engine> mkdir src/main/frontend
PS C:\APP_DEV\java-template-engine> cd src/main/frontend
--- create a project in frontend folder ---
PS C:\APP_DEV\java-template-engine\src\main\frontend> npm init
New major version of npm available! 8.1.2 -> 11.0.0
npm notice Run npm install -g npm@11.0.0 to update!
PS C:\APP_DEV\java-template-engine\src\main\frontend> npm install -D tailwindcss
added 112 packages, and audited 113 packages in 6s
PS C:\APP_DEV\java-template-engine\src\main\frontend> npx tailwindcss init
---  adds tailwind.config.js  to frontend folder ---
PS C:\APP_DEV\java-template-engine\src\main\frontend> npm run build
PS C:\APP_DEV\java-template-engine\src\main\frontend> npm run watch


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.1/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.1/maven-plugin/build-image.html)
* [JTE](https://jte.gg/)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

## JTE

This project has been configured to use [JTE precompiled templates](https://jte.gg/pre-compiling/).

However, to ease development, those are not enabled out of the box.
For production deployments, you should remove

```properties
gg.jte.development-mode=true
```

from the `application.properties` file and set

```properties
gg.jte.use-precompiled-templates=true
```

instead.
For more details, please take a look at [the official documentation](https://jte.gg/spring-boot-starter-3/).

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
========   Stored Proc and Func  examples which could be called from DAO.java class ====
--------  worked ok. just an investigation  ----------
http://localhost:81/employee-orders?employeeId=1
--  call to get_employee_orders() works fine. Can be tested by url above. OK
CREATE OR REPLACE FUNCTION get_employee_orders(empid INT)
RETURNS TABLE(
employee_id INT,
first_name VARCHAR,
last_name VARCHAR,
mobile_phone BIGINT,
order_id INT,
order_date TIMESTAMP,
order_status VARCHAR,
tracking_number VARCHAR,
customer_id INT,
company_name VARCHAR,
phone VARCHAR
) AS
$$
BEGIN
RETURN QUERY
SELECT e.employee_id, e.first_name, e.last_name, e.mobile_phone, o.order_id, o.order_date, o.order_status, o.tracking_number, c.customer_id, c.company_name, c.phone
FROM employees e
INNER JOIN orders o ON o.employee_id = e.employee_id
INNER JOIN customers c ON o.customer_id = c.customer_id
WHERE e.employee_id = empid;
END;
$$ LANGUAGE plpgsql;

drop function get_employee_orders(empid integer);
SELECT * FROM get_employee_orders(1);


CREATE OR REPLACE FUNCTION GET_USERS_BY_COUNTRY(p_country_name VARCHAR(50))
RETURNS TABLE (id INT, first_name VARCHAR, last_name VARCHAR, email VARCHAR, country VARCHAR,
street_address VARCHAR, city VARCHAR, region VARCHAR, postal_code VARCHAR) AS $$
DECLARE
user_count INT;
BEGIN
-- Check if country exists --
SELECT COUNT(*) INTO user_count
FROM users
WHERE users.country = p_country_name; -- Explicitly reference table column

    IF user_count > 0 THEN
        -- If country exists, return the users
        RETURN QUERY
        SELECT u.id, u.first_name, u.last_name, u.email, u.country,
               u.street_address, u.city, u.region, u.postal_code
        FROM users u
        WHERE u.country = p_country_name; -- Explicitly reference table column
    ELSE
        -- If the country does not exist, return an empty result set
        RETURN;
    END IF;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE PROCEDURE add_user(
p_first_name VARCHAR,
p_last_name VARCHAR,
p_email VARCHAR,
p_country VARCHAR,
p_street_address VARCHAR,
p_city VARCHAR,
p_region VARCHAR,
p_postal_code VARCHAR
)
AS $$
BEGIN
INSERT INTO users (first_name, last_name, email, country, street_address, city, region, postal_code)
VALUES (p_first_name, p_last_name, p_email, p_country, p_street_address, p_city, p_region, p_postal_code);
END;
$$ LANGUAGE plpgsql;
