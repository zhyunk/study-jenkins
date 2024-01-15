package kim.zhyun.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class AppController {
    
    @GetMapping("/**")
    public ResponseEntity<Object> run() {
        return ResponseEntity.ok(new Object() {
            public String dateTime = ZonedDateTime
                    .now(ZoneId.of("Asia/Seoul"))
                    .format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일  HH시 mm분 ss초"));
            public String message = """
                    Hello Jenkins!
                    
                             __   _______ .__   __.  __  ___  __  .__   __.      _______.
                            |  | |   ____||  \\ |  | |  |/  / |  | |  \\ |  |     /       |
                            |  | |  |__   |   \\|  | |  '  /  |  | |   \\|  |    |   (----`
                      .--.  |  | |   __|  |  . `  | |    <   |  | |  . `  |     \\   \\
                      |  `--'  | |  |____ |  |\\   | |  .  \\  |  | |  |\\   | .----)   |
                       \\______/  |_______||__| \\__| |__|\\__\\ |__| |__| \\__| |_______/
                      
                    """;
        });
    }
    
}
