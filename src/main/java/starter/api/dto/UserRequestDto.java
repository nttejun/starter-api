package starter.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import starter.api.entity.User;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDto {

    private String email;
    private String nm;
    private String phone;
    private String pw;
    private String salt;
    private String auth;
    private String reg;

    public User joinUser(){

        User user = new User.Builder()
                .email(email)
                .nm(nm)
                .phone(phone)
                .pw(pw)
                .salt(salt)
                .auth(auth)
                .reg(reg)
                .build();

        return user;

    }

    public User chkUser(){
        User user = new User.Builder()
                .email(email)
                .build();

        return user;
    }

}
