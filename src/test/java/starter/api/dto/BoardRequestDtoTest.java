package starter.api.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import starter.api.persistance.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRequestDtoTest {

    private Logger logger = LoggerFactory.getLogger("BoardRequestDtoTest");

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void 게시판생성(){
        BoardRequestDto dto = new BoardRequestDto();
        boardRepository.save(dto.createBoard());
    }

}
