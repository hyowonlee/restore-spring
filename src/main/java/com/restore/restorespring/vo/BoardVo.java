package com.restore.restorespring.vo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardVo {
    private int id;
    private String title;
//    private String content;
    private int count;
    private int userId; // fk
    private Timestamp createDate;
    private Timestamp updateDate;
}
