package com.koreait.springbootboard;

import com.koreait.springbootboard.board.model.BoardCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired private HomeMapper mapper;

    public List<BoardCategoryEntity> selMenuCategoryList() {
        return mapper.selMenuCategoryList();
    }
}
