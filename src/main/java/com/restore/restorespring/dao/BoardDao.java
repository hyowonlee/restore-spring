package com.restore.restorespring.dao;

import com.restore.restorespring.vo.BoardVo;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    public List<BoardVo> listBoard();
}
