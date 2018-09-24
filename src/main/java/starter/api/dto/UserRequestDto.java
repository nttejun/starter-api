package starter.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import starter.api.entity.User;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDto {

    public User joinUser(){

        User user = new User.Builder()
                .email("이메일")
                .nm("이름")
                .phone("010")
                .pw("비밀번호")
                .salt("암호화비밀번호")
                .auth("사용자권한")
                .reg("등록자")
                .build();

        return user;

    }

}
