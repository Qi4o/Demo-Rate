package com.example.demorate.dao;

import com.example.demorate.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author Qiao
 * @Create 2022/10/12 09:05
 */
public interface CommentDao extends JpaRepository<Comment, Integer> {

    List<Comment> findAllByForeignId(Integer foreignId);
}
