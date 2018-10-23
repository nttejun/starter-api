package starter.api.entity;

import lombok.AccessLevel;
import lombok.Builder;
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

    @lombok.Builder
    public Board(Long idx, Long no, String bcategory, String mcategory, String title, String content, String useyn, String reg, Timestamp regdttm, String upt, Timestamp uptdttm) {
        this.idx = idx;
        this.no = no;
        this.bcategory = bcategory;
        this.mcategory = mcategory;
        this.title = title;
        this.content = content;
        this.useyn = useyn;
        this.reg = reg;
        this.regdttm = regdttm;
        this.upt = upt;
        this.uptdttm = uptdttm;
    }
}



