package io.mohkeita.springreddit.mapper;

import io.mohkeita.springreddit.dto.PostRequest;
import io.mohkeita.springreddit.dto.PostResponse;
import io.mohkeita.springreddit.model.Post;
import io.mohkeita.springreddit.model.Subreddit;
import io.mohkeita.springreddit.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "description", source = "postRequest.description")
    Post map(PostRequest postRequest, Subreddit subreddit, User user);

    @Mapping(target = "id", source = "postId")
    @Mapping(target = "subredditName", source = "subreddit.name")
    @Mapping(target = "userName", source = "user.username")
    PostResponse mapToDto(Post post);
}
