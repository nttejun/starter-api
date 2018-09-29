package starter.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import starter.api.entity.Board;

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {

    private long no;
    private String bcategory;
    private String mcategory;
    private String title;
    private String content;
    private String reg;

    public Board createBoard(){

        Board board = new Board.Builder()
                .no(no)
                .bcategory(bcategory)
                .mcategory(mcategory)
                .title(title)
                .content(content)
                .reg(reg)
                .build();

        return board;
    }
}
