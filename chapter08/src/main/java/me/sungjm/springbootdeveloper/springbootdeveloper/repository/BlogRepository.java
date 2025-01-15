package me.sungjm.springbootdeveloper.springbootdeveloper.repository;

import me.sungjm.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}