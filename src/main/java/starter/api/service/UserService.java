package starter.api.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import starter.api.entity.User;
import starter.api.persistance.UserRepository;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    
    @Transactional
    public String chkDuplicateUser(User dto) {

        userRepository.findByEmail(dto.getEmail()).ifPresent(user -> { });

        return "";
    }
}
