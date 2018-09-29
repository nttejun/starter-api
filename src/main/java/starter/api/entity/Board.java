package starter.api.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "board")
@Getter
@Entity
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_idx")
    private Long idx;

    @Column(name = "board_no")
    private Long no;

    @Column(name = "board_bcategory")
    private String bcategory;

    @Column(name = "board_mcategory")
    private String mcategory;

    @Column(name = "board_title")
    private String title;

    @Column(name = "board_content")
    private String content;

    @Column(name = "board_reg")
    private String reg;

    public static class Builder {

        private Long no;
        private String bcategory;
        private String mcategory;
        private String title;
        private String content;
        private String reg;

        public Builder no(Long val) {
            no = val;
            return this;
        }

        public Builder bcategory(String val) {
            bcategory = val;
            return this;
        }

        public Builder mcategory(String val) {
            mcategory = val;
            return this;
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder content(String val) {
            content = val;
            return this;
        }

        public Builder reg(String val) {
            reg = val;
            return this;
        }

        public Board build() {
            return new Board(this);
        }

    }

    @lombok.Builder
    private Board(Builder builder) {
        no = builder.no;
        bcategory = builder.bcategory;
        mcategory = builder.mcategory;
        title = builder.title;
        content = builder.content;
        reg = builder.reg;
    }

}
