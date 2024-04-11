package org.jdbcex;

import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws SQLException {
        /**
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close connection
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "1111";
        String sqlSelectColumn = "select sname from student where sid = 1";
        String sqlSelectAllColumn = "select * from student";
        String sqlInsert = "insert into student values (5, 'John', 48)";
        String sqlSelectColumn5 = "select sname from student where sid = 5";
        String sqlUpdate = "update student set sname = 'max' where sid = 5";
        String sqlDelete =  "delete from student where sid = 5";

        //Class.forName("org.postgresql.Driver"); //Not mandatory to load this class anymore
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sqlSelectColumn);
        rs.next();
        String name = rs.getString("sname");
        System.out.println("---Navin should be printed for name---");
        System.out.println("Student name : " + name);

        rs = st.executeQuery(sqlSelectAllColumn);

        System.out.println("4 rows data should be printed");
        while(rs.next()){
            System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
        }

        st.execute(sqlInsert);
        rs = st.executeQuery(sqlSelectColumn5);
        rs.next();
        name = rs.getString("sname");
        System.out.println("---John should be printed for name---");
        System.out.println("Student name : " + name);

        st.execute(sqlUpdate);
        rs = st.executeQuery(sqlSelectColumn5);
        rs.next();
        name = rs.getString("sname");
        System.out.println("---max should be printed for name---");
        System.out.println("Student name : " + name);

        st.execute(sqlDelete);
        rs = st.executeQuery(sqlSelectColumn5);
        System.out.println("---No name should be printed as id5 should have been deleted above---");
        while(rs.next()){
            name = rs.getString("sname");
            System.out.println("Student name : " + name);
        }

        con.close();
        System.out.println(con.isClosed());

    }
}