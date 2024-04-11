package Model;

import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {
    private static final Connection _connection = ConMySQL.connect();

    static public Integer add(User user) {
        int addCount = 0;

        try {
            String query = "INSERT INTO user (name, lastName, middleName, age, language) values (?,?,?,?,?)";
            PreparedStatement statement = _connection.prepareStatement(query);
            statement.setString(1, user.getName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getMiddleName());
            statement.setInt(4, user.getAge());
            statement.setString(5, user.getLanguage());
            addCount = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Вывести стек вызовов исключения на консоль
        }

        return addCount;
    }
}
