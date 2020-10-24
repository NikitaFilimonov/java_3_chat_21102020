//package server;
//
//import java.sql.*;
//
//public class DataBaseAuthService implements AuthService{
//    private static Connection connection;
//    private static Statement stmt;
//
//    static void connection() {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            connection = DriverManager.getConnection("jdbc:sqlite:clients.db");
//            stmt = connection.createStatement();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void setNewUsers(String login, String password, String nickname) {
//        connection();
//        String sql = String.format("INSERT INTO clients (login, password, nickname) VALUES ('%s', '%s', '%s')", login, password, nickname);
//
//        try {
//            boolean rs = stmt.execute(sql);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    static int getIdByNick(String nickname) {
//        String idNick = String.format("SELECT id FROM client WHERE nickname = '%s'", nickname);
//        try {
//            ResultSet rs = stmt.executeQuery(idNick);
//
//            if (rs.next()) {
//                return rs.getInt(1);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//
//    static String getNickByLoginAndPassword(String login, String password) {
//        String sql = String.format("SELECT nickname FROM clients WHERE login = '%s' and password = '%s'", login, password);
//
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//
//            if (rs.next()) {
//                String str = rs.getString(1);
//                return rs.getString(1);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    static void disconnect() {
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String getNicknameByLoginAndPassword(String login, String password) {
//        return getNickByLoginAndPassword(login,password);
//    }
//
//    @Override
//    public boolean registration(Integer id, String login, String password, String nickname) {
//        return false;
//    }
//
//    @Override
//    public boolean registration(String login, String password, String nickname) {
//        return false;
//    }
//}
