package io.mohkeita.springreddit.repository;

import io.mohkeita.springreddit.model.Post;
import io.mohkeita.springreddit.model.User;
import io.mohkeita.springreddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
