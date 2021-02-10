package service;

import java.sql.Connection;

public class DatabaseConnection {
    String hostName = "holynamesacademy.database.windows.net";
    String dbName = "BuildersBiome";
    String user = "hna-admin";
    String password = "HolyNames123";
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
}
