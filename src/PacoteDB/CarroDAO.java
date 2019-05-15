package PacoteDB;

import java.sql.*;
import java.util.*;

public class CarroDAO {

    private Connection con = null;

    public CarroDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(CarroBean carro) {
        String sql = "insert into carro(placa,cor,descricao)value(?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!!!";
            } else {
                return "Erro ao inserir!!!";
            }

        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public String alterar(CarroBean carro) {
        String sql = "update carro set cor=?, descricao=? where placa=?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!!!";
            } else {
                return "Erro ao alterar!!!";
            }

        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public String deletar(CarroBean carro) {
        String sql = "delete from carro where placa=?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!!!";
            } else {
                return "Erro ao alterar!!!";
            }

        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public List<CarroBean> listaCarros(){
        String sql = "select * from carro";
        
        
    }

}
