package io.menglibay.springboot.postcoreapi.model;

import jakarta.validation.constraints.NotNull;

public class PostModel {


    @NotNull(message = "Post id can not be empty")
    private String postId;

    @NotNull(message = "Client id can not be empty")
    private String clientId;

    @NotNull(message = "Client id can not be empty")
    private String postRecipientId;
    private String postItem;
    private String status;

    public PostModel(String postId, String clientId, String postRecipientId, String postItem, String status) {
        this.postId = postId;
        this.clientId = clientId;
        this.postRecipientId = postRecipientId;
        this.postItem = postItem;
        this.status = status;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPostRecipientId() {
        return postRecipientId;
    }

    public void setPostRecipientId(String postRecipientId) {
        this.postRecipientId = postRecipientId;
    }

    public String getPostItem() {
        return postItem;
    }

    public void setPostItem(String postItem) {
        this.postItem = postItem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
