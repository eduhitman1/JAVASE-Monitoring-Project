package com.eduardo.controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.eduardo.domain.BeansMonique;
import com.eduardo.connection.ConexaoBD;

/**
 *
 * @author t7240049
 */
public class DaoMonique {

    ConexaoBD conex = new ConexaoBD();
    BeansMonique mod = new BeansMonique();

    public void salvar(BeansMonique mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into monique( num_c, tipofer_c, tipo_c, status_c, grupo_c, sumario_c, data_l , esc_1, esc_2, esc_3, esc_4, esc_5, data_s,tipofor_c, tipoana_c, hora)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNum_c());
            pst.setString(2, mod.getTipofer_c());
            pst.setString(3, mod.getTipo_c());
            pst.setString(4, mod.getStatus_c());
            pst.setString(5, mod.getGrupo_c());
            pst.setString(6, mod.getSumario_c());
            pst.setString(7, mod.getData_l());
            pst.setString(8, mod.getEsc_1());
            pst.setString(9, mod.getEsc_2());
            pst.setString(10, mod.getEsc_3());
            pst.setString(11, mod.getEsc_4());
            pst.setString(12, mod.getEsc_5());
            pst.setString(13, mod.getData_s());
            pst.setString(14, mod.getTipofor_c());
            pst.setString(15, mod.getTipoAna_c());
            pst.setString(16, mod.getHora());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Chamado inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados" + ex);
        }
        // conex.desconecta();
    }

    public void editar(BeansMonique mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update monique set num_c=?, tipofer_c=?,tipo_c=?, status_c=?,  grupo_c=?, sumario_c=?, data_l=?, esc_1=?, esc_2=?, esc_3=?, esc_4=?, esc_5=?, data_s=?, tipofor_c=?, tipoana_c=? where cod_c=?");
            pst.setString(1, mod.getNum_c());
            pst.setString(2, mod.getTipofer_c());
            pst.setString(3, mod.getTipo_c());
            pst.setString(4, mod.getStatus_c());
            pst.setString(5, mod.getGrupo_c());
            pst.setString(6, mod.getSumario_c());
            pst.setString(7, mod.getData_l());
            pst.setString(8, mod.getEsc_1());
            pst.setString(9, mod.getEsc_2());
            pst.setString(10, mod.getEsc_3());
            pst.setString(11, mod.getEsc_4());
            pst.setString(12, mod.getEsc_5());
            pst.setString(13, mod.getData_s());
            pst.setString(14, mod.getTipofor_c());
            pst.setString(15, mod.getTipoAna_c());
            pst.setInt(16, mod.getCod_c());
            JOptionPane.showMessageDialog(null, "Chamado editado com sucesso");
            pst.executeQuery();
        } catch (SQLException ex) {
            //   JOptionPane.showMessageDialog(null,"Erro na alteração de dados\n Erro:"+ex);
        }
        // conex.desconecta();
    }

    public BeansMonique buscaChamado(BeansMonique mod) {
        conex.conexao();
        conex.executaSql("select *from monique where num_c like'%" + mod.getPesquisa() + "%'"); // passand string sql
        try {
            conex.rs.first();
            mod.setCod_c(conex.rs.getInt("cod_c"));
            mod.setNum_c(conex.rs.getString("num_c"));
            mod.setTipofer_c(conex.rs.getString("tipofer_c"));
            mod.setTipo_c(conex.rs.getString("tipo_c"));
            mod.setStatus_c(conex.rs.getString("status_c"));
            mod.setGrupo_c(conex.rs.getString("grupo_c"));
            mod.setSumario_c(conex.rs.getString("sumario_c"));
            mod.setData_l(conex.rs.getString("data_l"));
            mod.setEsc_1(conex.rs.getString("esc_1"));
            mod.setEsc_2(conex.rs.getString("esc_2"));
            mod.setEsc_3(conex.rs.getString("esc_3"));
            mod.setEsc_4(conex.rs.getString("esc_4"));
            mod.setEsc_5(conex.rs.getString("esc_5"));
            mod.setData_s(conex.rs.getString("data_s"));
            mod.setTipofor_c(conex.rs.getString("tipofor_c"));
            mod.setTipofor_c(conex.rs.getString("tipoana_c"));
        } catch (SQLException ex) {
            //  JOptionPane.showMessageDialog(null, "Erro no filtro de dados"+ex.getMessage());
        }
        // conex.desconecta();
        return mod;
    }

    public void excluir(BeansMonique mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from monique where cod_c=?");
            pst.setInt(1, mod.getCod_c());
            JOptionPane.showMessageDialog(null, "Chamado Deletado com sucesso");
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deleta \nErro:" + ex);
        }
        //   conex.desconecta();
    }

}
