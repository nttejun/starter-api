package starter.api.persistance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import starter.api.dto.UserRequestDto;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    UserRepository userRepository;

    @Test
    public void 클래스정보_확인() {

        //객체의 실제 이름
        Class<?> cls = userRepository.getClass();
        System.out.println(cls);

        //클래스가 구현하고 있는 인터페이스 목록
        Class<?>[] interfaces = cls.getInterfaces();
        Stream.of(interfaces).forEach(inter -> System.out.println(inter.getName()));

        //클래스의 부모 클래스
        Class<?> superClasses = cls.getSuperclass();
        System.out.println(superClasses.getName());

    }

    @Test
    public void 회원가입_요청() {

        logger.info(" ");
        logger.info("### START JOIN USER");

        UserRequestDto dto = new UserRequestDto();
        userRepository.save(dto.joinUser());

        logger.info("### END JOIN USER");
        logger.info(" ");

    }

    @Test
    public void 중복아이디_조회() {

        logger.info(" ");
        logger.info("### START CHECK OVERLAP USER");

        userRepository.findByEmail("nttejun").ifPresent(user -> {

            logger.info("### USER IS NOT NULL >> ");

        });

        logger.info("### USER IS NULL");

        logger.info("### END CHECK OVERLAP USER");
        logger.info(" ");

    }

}