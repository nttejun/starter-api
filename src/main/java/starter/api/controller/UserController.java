package starter.api.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import starter.api.dto.UserRequestDto;
import starter.api.persistance.UserRepository;

@RestController
@AllArgsConstructor
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserRepository userRepository;

    @GetMapping("/join")
    public String login(){
        return "join";
    }

    @PostMapping("/join/chkUser")
    public void chkId(@RequestBody UserRequestDto dto){
        userRepository.findById("nttejun").ifPresent(user -> {
            logger.info("USER IS NOT NULL");
        });
        logger.info("USER IS NULL");
    }

    @PostMapping("/join/joinUser")
    public void joinUser(@RequestBody UserRequestDto dto){
        userRepository.save(dto.joinUser());
    }
}
