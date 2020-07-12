package io.mohkeita.springreddit.repository;

import io.mohkeita.springreddit.model.Comment;
import io.mohkeita.springreddit.model.Post;
import io.mohkeita.springreddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
