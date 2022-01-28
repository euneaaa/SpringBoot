package com.koreait.springbootboard.board;

import com.koreait.springbootboard.board.model.BoardDto;
import com.koreait.springbootboard.board.model.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ajax/board")
public class BoardRestController {

    @Autowired
    private BoardService service;

    @GetMapping("/{icategory}")
    public List<BoardVo> selBoardList(@PathVariable int icategory, BoardDto dto) {
        dto.setIcategory(icategory);
        return service.selBoardList(dto);
    }

    @GetMapping("/detail/{iboard}")
    public BoardVo selBoard(@PathVariable int iboard, BoardDto dto) {
        dto.setIboard(iboard);
        return service.selBoard(dto);
    }
}
