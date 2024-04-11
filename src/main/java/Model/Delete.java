package Model;

import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    private static final Connection _connection = ConMySQL.connect();
    static public Integer delete(User user) {
        int deletedCount = 0;

        if (user.getId() != null) {
            try {
                String query = "DELETE FROM user WHERE idUser= ? ";

                PreparedStatement statement = _connection.prepareStatement(query);
                statement.setInt(1, user.getId());

                deletedCount = statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("ID пользователя равен null");
        }

        return deletedCount;
    }
}