package com.koreait.springbootboard.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardCategoryEntity {
    private int icategory;
    private String nm;
    private int orderby;
}
