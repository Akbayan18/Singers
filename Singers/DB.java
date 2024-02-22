package kz.baibalaeva.javaEE;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DB {

   private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shop", "postgres", "qwerty123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean addSingers(Singers singers){
        int rows=0;
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into singers (name, surname, birthdate, city) values (?, ?, ?, ?)");
            stmt.setString(1, singers.getName());
            stmt.setString(2, singers.getSurname());
            stmt.setString(3, singers.getBirthdate());
            stmt.setString(4, singers.getCity());
            rows= stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rows>0;
    }

    public static ArrayList<Singers> getAllSingers(){
        ArrayList<Singers> list = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from singers");
            ResultSet resultSet=stmt.executeQuery();
            while (resultSet.next()){
                Singers singers = new Singers();
                singers.setId(resultSet.getLong("id"));
                singers.setName(resultSet.getString("name"));
                singers.setSurname(resultSet.getString("surname"));
                singers.setBirthdate(resultSet.getString("birthdate"));
                singers.setCity(resultSet.getString("city"));
                list.add(singers);

            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

        public static Singers getSinger(Long id){
        Singers singers=null;
            try {
                PreparedStatement stmt = connection.prepareStatement("select * from singers where id=?");
            stmt.setLong(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()){
                singers = new Singers();
                singers.setId(resultSet.getLong("id"));
                singers.setName(resultSet.getString("name"));
                singers.setSurname(resultSet.getString("surname"));
                singers.setBirthdate(resultSet.getString("birthdate"));
                singers.setCity(resultSet.getString("city"));

            }
            stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return singers;
        }

}
