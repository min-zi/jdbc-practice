package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface preparedStatementSetter {
    void setter(PreparedStatement psmt) throws SQLException;
}
