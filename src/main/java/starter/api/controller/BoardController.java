package starter.api.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import starter.api.dto.BoardRequestDto;
import starter.api.entity.Board;
import starter.api.service.BoardService;

import java.util.Collection;

//@Controller
//@AllArgsConstructor
public class BoardController {

    private static Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public String board(Model model) {

        logger.info(">>> START BoardController board()");

        long boardNo = boardService.getBoardNo();

        model.addAttribute("boardNo", boardNo);

        logger.info("<<< END BoardController board()");

        return "board";

    }

    @PostMapping("/board/create")
    public String createBoard(@RequestBody BoardRequestDto dto) {

        logger.info(">>> START BoardController createBoard()");

        boardService.createBoard(dto);

        logger.info("<<< END BoardController createBoard()");

        return "board";

    }
}
