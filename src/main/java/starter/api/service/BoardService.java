package starter.api.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import starter.api.dto.BoardRequestDto;
import starter.api.persistance.BoardRepository;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {

    private static final Logger logger = LoggerFactory.getLogger(BoardService.class);

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserService userService;

    @Transactional
    public void createBoard(BoardRequestDto dto){

        logger.info(">>> START BoardService createBoard()");
        logger.info(">>> DTO DATA = " + dto.toString());

        // 중복 데이터가 존재하지 않으면 등록하고 등록된 회원번호를 반환한다
        boardRepository.save(dto.createBoard());
//        return boardRepository.save(dto.createBoard()).getNo();

    }

}
