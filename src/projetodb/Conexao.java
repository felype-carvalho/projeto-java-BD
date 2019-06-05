package projetodb;

import java.sql.*;

public class Conexao {

    public static Connection openConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "";
            url += "jdbc:mysql://127.0.0.1/estacionamento?";
            url += "user=root&password=";

            con = DriverManager.getConnection(url);

            System.out.println("Conexão aberta.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static void closeConnection(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
