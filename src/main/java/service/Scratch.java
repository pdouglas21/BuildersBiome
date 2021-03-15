package service;//package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
public class Scratch {
    private String title;
    private String description;
    private String category;
    private String image;

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t) {this.title = t;}

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String d) {this.description = d;}

    public String getCategory()
    {
        return category;
    }
    public void setCategory(String c)  {this.category = c;}

    public String getImage()
    {
        return image;
    }
    public void setImage(String i) {this.image = i;}
}