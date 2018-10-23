package starter.api.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import starter.api.entity.Board;
import starter.api.persistance.BoardRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardServiceTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void 게시물목록조회(){
        Board board = (Board) boardRepository.findAll();

    }

}