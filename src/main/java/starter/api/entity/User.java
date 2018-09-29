package starter.api.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user")
@Getter
@Setter
@Entity
public class User {

    @Id
    @Column(name = "user_no")
    private BigInteger idx;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_nm")
    private String nm;

    @Column(name = "user_auth")
    private String auth;

    @Column(name = "user_pw")
    private String pw;

    @Column(name = "user_phone")
    private String phone;

    @Column(name = "user_salt")
    private String salt;

    @Column(name = "user_reg")
    private String reg;

    @CreationTimestamp
    @Column(name = "user_regdttm")
    private Date regdttm;

    @Column(name = "user_upt")
    private String upt;

    @CreationTimestamp
    @Column(name = "user_uptdttm")
    private Date uptdttm;

    public static class Builder {

        // 선택적 인자 초기화
        private String email = "";
        private String nm = "";
        private String auth = "";
        private String pw = "";
        private String phone = "";
        private String salt = "";
        private String reg = "";

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder nm(String val) {
            nm = val;
            return this;
        }

        public Builder auth(String val) {
            auth = val;
            return this;
        }

        public Builder pw(String val) {
            pw = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public Builder salt(String val) {
            salt = val;
            return this;
        }

        public Builder reg(String val) {
            reg = val;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @lombok.Builder
    private User(Builder builder) {
        email = builder.email;
        nm = builder.nm;
        auth = builder.auth;
        pw = builder.pw;
        phone = builder.phone;
        salt = builder.salt;
        reg = builder.reg;
    }

}
