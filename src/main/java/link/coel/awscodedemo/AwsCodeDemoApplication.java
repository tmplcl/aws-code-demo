package link.coel.awscodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@SpringBootApplication
public class AwsCodeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsCodeDemoApplication.class, args);
    }

}

@RestController
class PingService {

    @GetMapping("/ping")
    public Ping getPing() {
        return new Ping(Instant.now(), "Ping!");
    }

    private record Ping(Instant time, String message) {
    }
}
