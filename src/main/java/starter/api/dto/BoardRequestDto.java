package starter.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.api.entity.Board;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {

    private static final Logger logger = LoggerFactory.getLogger(BoardRequestDto.class);

    private long idx;
    private long no;
    private String bcategory;
    private String mcategory;
    private String title;
    private String content;
    private String useyn;
    private String reg;
    private Timestamp regdttm;
    private String upt;
    private Timestamp uptdttm;

    // 빌드 데이터가 알파벳 순서로 자동으로 정렬된다.
    public Board createBoard(){

        Board board = new Board.Builder()
                .bcategory(bcategory)
                .content(content)
                .mcategory(mcategory)
                .no(no)
                .reg(reg)
                .regdttm(regdttm)
                .title(title)
                .upt(upt)
                .uptdttm(uptdttm)
                .useyn(useyn)
                .idx(idx)
                .build();

        return board;
    }

}
