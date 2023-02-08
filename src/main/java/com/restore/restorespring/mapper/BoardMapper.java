package com.restore.restorespring.mapper;

import com.restore.restorespring.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardVo> listBoard();
}
