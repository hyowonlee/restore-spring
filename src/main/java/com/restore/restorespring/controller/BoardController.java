package com.restore.restorespring.controller;

import com.restore.restorespring.mapper.BoardMapper;
import com.restore.restorespring.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardMapper boardMapper;

    @GetMapping("/board")
    public @ResponseBody Map<String, Object> board()
    {
        Map<String, Object> returnMap = new HashMap<>();

        List<BoardVo> boardList = boardMapper.listBoard();

        returnMap.put("board_list", boardList);

        return returnMap;
    }
}
