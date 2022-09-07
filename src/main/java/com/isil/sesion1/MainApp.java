package com.isil.sesion1;

import java.sql.*;

public class MainApp {
    public static void main(String[] args) throws Exception {

        // 1. Cargar driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Crear conexion
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "123456"
        );

        // 3. Crear statement
//        PreparedStatement preparedStatement =
//                con.prepareStatement("select * from Users where name=? and city=?");
//        preparedStatement.setString(1, "Cueva");
//        preparedStatement.setString(2, "Lima");

        // 4. Ejecutar query
//        ResultSet resultSet2 = preparedStatement.executeQuery();

//        Statement stCreate = con.createStatement();
//        int filasAfectadas = stCreate.executeUpdate("UPDATE users SET NAME='Luis' where iduser=5");

//        System.out.println("Filas afectadas: " + filasAfectadas);

        PreparedStatement preparedStatement = con.prepareStatement("UPDATE users SET name=? where iduser=?");

        preparedStatement.setString(1, "Nicolas");
        preparedStatement.setInt(2, 5);
        preparedStatement.executeUpdate();

//        ResultSet resultSet2 = preparedStatement.executeQuery();

        // 5. Recorrer resultados
//        while (resultSet2.next()) {
//            System.out.println(resultSet2.getString("name") + "\n" +
//                    resultSet2.getString("phone") + "\n" +
//                    resultSet2.getString("city"));
//        }

        // 6. Cerrar conexion
        con.close();
    }
}
