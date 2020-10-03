package models;
import java.io.*;

public class Note {
    private String title;
    private String content;
    
    public Note() {
        String title = "test";
        String content = "test2";
    }
    
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Note(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
