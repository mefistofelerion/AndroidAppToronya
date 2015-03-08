package webservice;

import java.lang.String;

public class PostNew{

    private String name;
    private String title;
    private String content;
    private String urlImage;

    public PostNew(String name, String title, String content, String urlImage){
        this.name = name;
        this.title = title;
        this.content = content;
        this.urlImage = urlImage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}