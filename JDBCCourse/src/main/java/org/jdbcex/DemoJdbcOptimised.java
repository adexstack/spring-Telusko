package org.jdbcex;

import java.sql.*;

public class DemoJdbcOptimised {
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

        int sid = 5;
        String sname = "Jack";
        int mark = 100;

        //String sqlInsert = "insert into student values (5, 'John', 48)";
        String sqlInsert = "insert into student values (?, ?, ?)";
        String sqlSelectColumn5 = "select sname from student where sid = 5";
        String sqlDelete =  "delete from student where sid = 5";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");

        PreparedStatement prSt = con.prepareStatement(sqlInsert);
        prSt.setInt(1, sid);
        prSt.setString(2, sname);
        prSt.setInt(3, mark);
        prSt.execute();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sqlSelectColumn5);
        rs.next();
        String name = rs.getString("sname");
        System.out.println("---Jack should be printed for name---");
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