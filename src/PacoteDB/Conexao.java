package PacoteDB;

import java.sql.*;

public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://127.0.0.1/estacionamento?"
                    + "user=root&password=";

            con = DriverManager.getConnection(url);

            System.out.println("Conexão aberta!!");

        } catch (SQLException e) {
            System.out.println();
        } catch (ClassNotFoundException e) {
            System.out.println();
        } catch (Exception e) {
            System.out.println();
        }
        return con;
    }

    public void fecharConexao(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {

        } catch (Exception e) {

        }
    }
}
