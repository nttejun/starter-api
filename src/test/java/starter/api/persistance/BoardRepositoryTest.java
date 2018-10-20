package starter.api.persistance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger("BoardRepositorytest.class");

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void 게시물번호() {
        logger.info(">>> START getBoardNo Method");
        long boardNo = boardRepository.getBoardNo();
        logger.info("=== RESULT DATA : " + String.valueOf(boardNo));
        logger.info("<<< END getBoardNo Method");
    }

}
