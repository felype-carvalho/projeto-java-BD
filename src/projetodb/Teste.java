package projetodb;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Connection con = Conexao.openConnection();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

       /* cb.setPlaca("KJJ0000");
        cb.setCor("Azul");
        cb.setDescricao("Carro Usado");
        System.out.println(cd.inserir(cb));*/

        //Método alterar
        /*cb.setPlaca("JKL2897");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 3");
        System.out.println(cd.alterar(cb));*/
        
        //Método excluir
        /*cb.setPlaca("JKL2897");
        System.out.println(cd.excluir(cb));*/
        
        List<CarroBean> lista = cd.listarTodos();
        if (lista != null) {
            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição:" + carro.getDescricao());
            }
        }

       Conexao.closeConnection(con);
    }
}
