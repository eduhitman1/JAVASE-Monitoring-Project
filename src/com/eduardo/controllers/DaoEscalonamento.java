package com.eduardo.controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.eduardo.domain.BeansEscalonamento;
import com.eduardo.connection.ConexaoBD;

/**
 *
 * @author t7240049
 */
public class DaoEscalonamento {

    ConexaoBD conex = new ConexaoBD();
    BeansEscalonamento mod = new BeansEscalonamento();

    public void salvar(BeansEscalonamento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into escalonamento(grupo, esc_1, esc_2, esc_3, esc_4, esc_5, esc_6, comen, data_l, hora )values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getGrupo());
            pst.setString(2, mod.getEsc_1());
            pst.setString(3, mod.getEsc_2());
            pst.setString(4, mod.getEsc_3());
            pst.setString(5, mod.getEsc_4());
            pst.setString(6, mod.getEsc_5());
            pst.setString(7, mod.getEsc_6());
            pst.setString(8, mod.getComen());
            pst.setString(9, mod.getData_l());
            pst.setString(10, mod.getHora());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Escalonamento salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados" + ex);
        }
        // conex.desconecta();
    }

    public BeansEscalonamento buscaChamado(BeansEscalonamento mod) {
        conex.conexao();
        conex.executaSql("select *from escalonamento where grupo like'%" + mod.getPesquisa() + "%'"); // passand string sql
        try {
            conex.rs.first();
            mod.setCod_g(conex.rs.getInt("cod_g"));
            mod.setGrupo(conex.rs.getString("grupo"));
            mod.setEsc_1(conex.rs.getString("esc_1"));
            mod.setEsc_2(conex.rs.getString("esc_2"));
            mod.setEsc_3(conex.rs.getString("esc_3"));
            mod.setEsc_4(conex.rs.getString("esc_4"));
            mod.setEsc_5(conex.rs.getString("esc_5"));
            mod.setEsc_6(conex.rs.getString("esc_6"));
            mod.setComen(conex.rs.getString("comen"));
        } catch (SQLException ex) {
            //  JOptionPane.showMessageDialog(null, "Erro no filtro de dados"+ex.getMessage());
        }
        // conex.desconecta();
        return mod;
    }

    public void editar(BeansEscalonamento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update escalonamento set grupo=?, esc_1=?, esc_2=?, esc_3=?, esc_4=?, esc_5=?, esc_6=?, comen=?, data_l=?, hora=? where cod_g=?");
            pst.setString(1, mod.getGrupo());
            pst.setString(2, mod.getEsc_1());
            pst.setString(3, mod.getEsc_2());
            pst.setString(4, mod.getEsc_3());
            pst.setString(5, mod.getEsc_4());
            pst.setString(6, mod.getEsc_5());
            pst.setString(7, mod.getEsc_6());
            pst.setString(8, mod.getComen());
            pst.setString(9, mod.getData_l());
            pst.setString(10, mod.getHora());
            pst.setInt(11, mod.getCod_g());
            JOptionPane.showMessageDialog(null, "Escalonamento editado com sucesso");
            pst.executeQuery();
        } catch (SQLException ex) {
            //   JOptionPane.showMessageDialog(null,"Erro na alteração de dados\n Erro:"+ex);
        }
        // conex.desconecta();
    }

    public void excluir(BeansEscalonamento mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from escalonamento where cod_g=?");
            pst.setInt(1, mod.getCod_g());
            JOptionPane.showMessageDialog(null, "Escalonamento Deletado");
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deleta \nErro:" + ex);
        }
        //   conex.desconecta();
    }

}
