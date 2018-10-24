package starter.api.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import starter.api.dto.BoardRequestDto;
import starter.api.entity.Board;
import starter.api.persistance.BoardRepository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class BoardService {

    private static final Logger logger = LoggerFactory.getLogger(BoardService.class);

    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public void createBoard(BoardRequestDto dto){

        logger.info(">>> START BoardService createBoard()");

        // 등록할 게시물번호
        dto.setNo(getBoardNo()+1);

        logger.info("=== ENROLL BOARD DATA = " + dto.toString());

        // 중복 데이터가 존재하지 않으면 등록하고 등록된 회원번호를 반환한다
        boardRepository.save(dto.createBoard());

        logger.info(">>> END BoardService createBoard()");
    }


    @Transactional
    public long getBoardNo() {

        logger.info(">>> START getBoardNo Method");

        return boardRepository.getBoardNo();

    }

    @Transactional
    public List<BoardRequestDto> getBoardList(){
        return boardRepository.findAllDesc()
                .map(BoardRequestDto::new)
                .collect(Collectors.toList());
    }

}
