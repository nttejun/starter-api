package starter.api.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import starter.api.dto.BoardRequestDto;
import starter.api.entity.Board;
import starter.api.persistance.BoardRepository;

import javax.transaction.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public Long createBoard(BoardRequestDto dto){
        // getNo 값 반환
        return boardRepository.save(dto.createBoard()).getNo();
    }

}
