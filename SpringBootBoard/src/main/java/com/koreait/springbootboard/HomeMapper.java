package com.koreait.springbootboard;

import com.koreait.springbootboard.board.model.BoardCategoryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeMapper {
    List<BoardCategoryEntity> selMenuCategoryList();
}
