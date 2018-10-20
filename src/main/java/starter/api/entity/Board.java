package starter.api.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

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

    @Column(name = "board_use_yn")
    private String useyn;

    @Column(name = "board_reg")
    private String reg;

    @Column(name = "board_regdttm")
    @CreationTimestamp
    private Timestamp regdttm;

    @Column(name = "board_upt")
    private String upt;

    @Column(name = "board_uptdttm")
    @UpdateTimestamp
    private Timestamp uptdttm;
    
    public static class Builder {

        private Long idx;
        private Long no;
        private String bcategory;
        private String mcategory;
        private String title;
        private String content;
        private String useyn;
        private String reg;
        private Timestamp regdttm;
        private String upt;
        private Timestamp uptdttm;

        public Builder idx(Long val) {
            idx = val;
            return this;
        }

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

        public Builder useyn(String val){
            useyn = val;
            return this;
        }

        public Builder reg(String val) {
            reg = val;
            return this;
        }

        public Builder regdttm(Timestamp val) {
            regdttm = val;
            return this;
        }

        public Builder upt(String val) {
            upt = val;
            return this;
        }

        public Builder uptdttm(Timestamp val) {
            uptdttm = val;
            return this;
        }

        public Board build() {
            return new Board(this);
        }

    }

    @lombok.Builder
    private Board(Builder builder) {
        bcategory = builder.bcategory;
        content = builder.content;
        mcategory = builder.mcategory;
        no = builder.no;
        reg = builder.reg;
        regdttm = builder.regdttm;
        title = builder.title;
        upt = builder.upt;
        uptdttm = builder.uptdttm;
        useyn = builder.useyn;
        idx = builder.idx;
    }

}
