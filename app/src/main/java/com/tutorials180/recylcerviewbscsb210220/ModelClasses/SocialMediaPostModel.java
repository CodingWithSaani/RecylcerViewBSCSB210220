package com.tutorials180.recylcerviewbscsb210220.ModelClasses;

public class SocialMediaPostModel {

    private String user;
    private int picReference;

    public SocialMediaPostModel(String user, int picReference) {
        this.user = user;
        this.picReference = picReference;
    }

    public String getUser() {
        return user;
    }

    public int getPicReference() {
        return picReference;
    }
}
