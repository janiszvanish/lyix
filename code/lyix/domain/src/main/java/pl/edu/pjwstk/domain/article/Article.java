package pl.edu.pjwstk.domain.article;

import pl.edu.pjwstk.domain.Comment;

import java.time.LocalDateTime;
import java.util.List;

public class Article {
    private LocalDateTime creationDate;
    private String title;
    private String text;
    private List<Comment> comments;
    private List<ArticleType> tags;
}
