package starter.api.controller;

import jdk.nashorn.internal.objects.NativeJSON;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import starter.api.dto.BoardRequestDto;
import starter.api.service.BoardService;

@Controller
@AllArgsConstructor
public class BoardController {

    private static Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public String board() {
        return "main";
    }

    @PostMapping("/board/create")
    public String createBoard(@RequestBody BoardRequestDto dto) {
        logger.info(">>> START BoardController createBoard()");
        boardService.createBoard(dto);
        return "test";
    }

}
