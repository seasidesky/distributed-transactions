package com.slisenko.examples.xa.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface WorkUnit {

    void doInTransaction(Connection c1, Connection c2) throws SQLException;
}