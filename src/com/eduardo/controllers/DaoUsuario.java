package com.eduardo.controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import com.eduardo.domain.BeansUsuario;
import com.eduardo.connection.ConexaoBD;

public class DaoUsuario {

    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();    // instancia do pacote modelo da class BeansMedico

    public void salvar(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(usu_nome, usu_senha, usu_tipo)values(?,?,?)");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuário" + ex.getMessage());
        }
        //  conex.desconecta();
    }

    public BeansUsuario buscaUsuario(BeansUsuario mod) {
        conex.conexao();
        conex.executaSql("select *from usuarios where usu_nome like'%" + mod.getPesquisa() + "%'"); // passand string sql
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
        }
        //  conex.desconecta();
        return mod;
    }

    public void alterar(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set usu_nome=?, usu_senha=?,  usu_tipo=?  where usu_cod=? ");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.setInt(4, mod.getUsuCod());
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso");
            pst.executeQuery();
        } catch (SQLException ex) {
            //  JOptionPane.showMessageDialog(null,"Erro na alteração de dados\n Erro:"+ex);
        }
        // conex.desconecta();
    }

    public void excluir(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_cod=?");
            pst.setInt(1, mod.getUsuCod());
            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso");
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deleta \nErro:" + ex);
        }
        //  conex.desconecta();
    }

}
