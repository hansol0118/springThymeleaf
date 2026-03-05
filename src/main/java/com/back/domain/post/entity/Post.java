package com.back.domain.post.entity;

import com.back.global.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Post extends BaseEntity {
    private String title;
    private String content;
}
