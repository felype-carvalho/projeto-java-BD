package projetodb;

import java.sql.*;
import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Connection con = Conexao.openConnection();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        cb.setPlaca("JJJ9999");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro SEMI-NOVO");
        System.out.println(cd.inserir(cb));
        
     Conexao.closeConection(con);   
    }
}
