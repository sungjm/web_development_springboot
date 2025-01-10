package me.sungjm.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.sungjm.springbootdeveloper.dto.ArticleListViewResponse;
import me.sungjm.springbootdeveloper.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {

    private final BlogService blogService;

    @GetMapping("/articles")
    public String getArticels(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll().stream()
                .map(ArticleListViewResponse::new).toList();

        model.addAttribute("articles", articles);   // "articles"키에 articles list를 담았습니다.

        return "articleList";   // -> 우리가 이거 다음에 만들어야될 파일의 위치 및 파일명
    }


}
