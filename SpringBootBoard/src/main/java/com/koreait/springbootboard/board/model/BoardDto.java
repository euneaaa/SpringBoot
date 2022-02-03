package com.koreait.springbootboard.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
    private int iboard;
    private int icategory;
    private int recordCount;
    private int currentPage;
    private int startIdx;
}
