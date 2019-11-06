package prilaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        String USERNAME = "root";
        String PASSWORD = "82527931Losetemper1008";
        String URL = "jbdc:mysql://localhost:3306/registration";

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e){
            System.out.println("~!!!!!!!!!!!!!!~");
        }


        SpringApplication.run(Application.class, args);
    }

}