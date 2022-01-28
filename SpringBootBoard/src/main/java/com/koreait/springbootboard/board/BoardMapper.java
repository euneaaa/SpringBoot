package com.koreait.springbootboard.board;

import com.koreait.springbootboard.board.model.BoardDto;
import com.koreait.springbootboard.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selBoardList(BoardDto dto);
    BoardVo selBoard(BoardDto dto);
}
