package com.back.domain.post.post.dto;

import com.back.domain.post.post.entity.Post;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class PostDto {
    private int id;
    private String subject;
    private String body;
    private LocalDateTime createdDate;
    private LocalDateTime modifyDate;

    public PostDto(Post post) {
        this.id = post.getId();
        this.body = post.getContent();
        this.subject = post.getTitle();
        this.createdDate = post.getCreateDate();
        this.modifyDate = post.getModifyDate();
    }
}
