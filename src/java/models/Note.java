package models;
import java.io.*;

public class Note {
    private String content;
    private String title;
    
    public Note() {
        String title = " ";
        String content = " ";
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
