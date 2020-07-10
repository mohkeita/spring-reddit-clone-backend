package io.mohkeita.springreddit.repository;

import io.mohkeita.springreddit.model.Post;
import io.mohkeita.springreddit.model.Subreddit;
import io.mohkeita.springreddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);
    List<Post> findByUser(User user);
}
