package Model;

import Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    private static final Connection _connection = ConMySQL.connect();
    public static Integer update(User user) {
        int updatedCount = 0;

        try {
            String query = "UPDATE user SET name=?, lastName=?, middlename=?, age=?, language=? WHERE idUser=?";

            PreparedStatement statement = _connection.prepareStatement(query);
            statement.setString(1, user.getName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getMiddleName());
            statement.setInt(4, user.getAge());
            statement.setString(5, user.getLanguage());
            statement.setInt(6, user.getId());

            updatedCount = statement.executeUpdate();
        } catch (SQLException e) {
            e.getStackTrace();
        }

        return updatedCount;
    }
}
