package starter.api.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import starter.api.persistance.BoardRepository;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRequestDtoTest {

    private Logger logger = LoggerFactory.getLogger("BoardRequestDtoTest");

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void 게시물생성(){
        BoardRequestDto dto = new BoardRequestDto();
        boardRepository.save(dto.createBoard());
    }

    @Test
    @Transactional
    public void 게시물조회(){

        List<BoardRequestDto> list = boardRepository.findAllDesc()
                .map(BoardRequestDto::new)
                .collect(Collectors.toList());

        // 원하는 데이터 추출
        for (BoardRequestDto dto : list){

            System.out.println(">>> "+dto.getNo());
            System.out.println(">>> "+dto.getTitle());

        }
    }

}
