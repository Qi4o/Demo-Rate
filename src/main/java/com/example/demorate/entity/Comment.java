package com.example.demorate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author Qiao
 * @Create 2022/10/12 08:59
 */

@Data
@Table(name = "comment")
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private String username;
    private Integer userId;
    private BigDecimal rate;
    private Integer foreignId;
    private Integer pid;
    private String target;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createtime;

    @Transient
    private List<Comment> children;
}
