package starter.api.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import starter.api.dto.BoardRequestDto;
import starter.api.service.BoardService;

@RestController
@AllArgsConstructor
public class BoardController {

    private static Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public String board() {
        return "board";
    }

    @PostMapping("/board/create")
    public Long createBoard(@RequestBody BoardRequestDto dto) {
        return boardService.createBoard(dto);
    }

}
