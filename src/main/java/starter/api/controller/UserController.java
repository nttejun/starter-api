package starter.api.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import starter.api.dto.UserRequestDto;
import starter.api.persistance.UserRepository;
import starter.api.service.UserService;

@RestController
@AllArgsConstructor
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("/user/chkUser")
    public void chkUser(@RequestBody UserRequestDto dto){
        userService.chkDuplicateUser(dto.chkUser());
    }

    @PostMapping("/user/joinUser")
    public void joinUser(@RequestBody UserRequestDto dto){
        userRepository.save(dto.joinUser());
    }
}
