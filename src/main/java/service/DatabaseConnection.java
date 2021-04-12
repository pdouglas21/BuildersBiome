package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {
    String hostName = "holynamesacademy.database.windows.net";
    String dbName = "BuildersBiome";
    String user = "hna-admin";
    String password = "HolyNames123";
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;


    //save data from form to database
    public void saveData(Scratch post) {
        try {
            connection = DriverManager.getConnection(url);
            String u;
            if(post.getUsername() == null){ u = null;}
                else {u = String.format("%s", post.getUsername());}
            String i;
            if (post.getImage() == null){i = "final bb logo (white).png";}
                else{ i = String.format("%s", post.getImage());}
            String t = String.format("%s", post.getTitle());
            String d = String.format("%s", post.getDescription());
            String c = String.format("%s", post.getCategory());
            String query = "INSERT INTO post_database(username, picture, title, post_description, post_category) VALUES ('"+u+"','"+i+"','"+t+"','"+d+"','"+c+"')";
            Statement st = connection.createStatement();
            st.execute(query);
        }
        catch  (Exception e) {
            System.err.println("Got an error! ");
            System.err.println(e.getMessage());
        }
    }
}



    //pull data from database


