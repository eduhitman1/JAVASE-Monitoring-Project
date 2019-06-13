package com.eduardo.views;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import com.eduardo.domain.BeansUsuario;
import com.eduardo.domain.ModeloTabela;
import com.eduardo.connection.ConexaoBD;
import com.eduardo.controllers.DaoUsuario;

/**
 *
 * @author Eduardo
 */
public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario mod = new BeansUsuario();
    DaoUsuario dao = new DaoUsuario();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    public FormUsuario() {
        initComponents();
        preencherTabela("select *from usuarios order by usu_nome");
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png")).getImage());

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmSenha = new javax.swing.JPasswordField();
        jComboBoxTipo = new javax.swing.JComboBox();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jtCOD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerênciamento de Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Usuario:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Confirma senha:");

        jLabel6.setText("Tipo:");

        jTextFieldUsuario.setEnabled(false);

        jPasswordFieldSenha.setEnabled(false);

        jPasswordFieldConfirmSenha.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "administrador", "usuario" }));
        jComboBoxTipo.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuario);

        jtCOD.setEnabled(false);

        jLabel2.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jPasswordFieldConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cadastro de Login");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chamado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmSenha.setEnabled(true);

        jtCOD.setText("");
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmSenha.setText("");

        jTextFieldPesquisa.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (jTextFieldUsuario.getText().isEmpty()) {   // campo não pode está vazio
            JOptionPane.showMessageDialog(null, "preenchar o Usuario para continuar:");
            jTextFieldUsuario.requestFocus(); //foca na variavel
        } else if (jPasswordFieldConfirmSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "preemchar o confirma senha: ");
            jPasswordFieldConfirmSenha.requestFocus(); //foca na variavel
        } else if (jPasswordFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "preemchar a senha para continuar: ");
            jPasswordFieldSenha.requestFocus();
        } else if (jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmSenha.getText())) {

            if (flag == 1) {     // flag de altenando entre salva e editar
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                dao.salvar(mod);
                //limpar campos
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmSenha.setText("");
                //bloqueando campos
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jPasswordFieldConfirmSenha.setEnabled(false);
                jComboBoxTipo.setEnabled(false);

                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);

                preencherTabela("select *from usuarios order by usu_nome");
            } else {
                mod.setUsuCod(Integer.parseInt(jtCOD.getText()));
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                dao.alterar(mod);

                jtCOD.setText("");
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmSenha.setText("");
                // DESABILITANDO
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jPasswordFieldConfirmSenha.setEnabled(false);

                jButtonSalvar.setEnabled(false);
                jTextFieldPesquisa.setEnabled(true);
                jButtonBuscar.setEnabled(true);

                jButtonNovo.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonAlterar.setEnabled(false);

                preencherTabela("select *from usuarios order by usu_nome");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os campos de senha não são iguais");

            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jPasswordFieldConfirmSenha.requestFocus();
            jButtonNovo.setEnabled(false);

        }
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        mod.setPesquisa(jTextFieldPesquisa.getText());  // setagem de do campo pesquisa
        BeansUsuario model = dao.buscaUsuario(mod); // vai fazeer a pesquisa e vai volta um modelo

        jtCOD.setText(String.valueOf(model.getUsuCod()));
        jTextFieldUsuario.setText(model.getUsuNome()); //
        jPasswordFieldSenha.setText(String.valueOf(model.getUsuSenha()));
        jPasswordFieldConfirmSenha.setText(String.valueOf(model.getUsuSenha()));
        jComboBoxTipo.setSelectedItem(model.getUsuTipo());

        jButtonAlterar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);

        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);

        preencherTabela("select *from medicos where nome_medico like'%" + mod.getPesquisa() + "%'");


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        flag = 2;
        jTextFieldUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldConfirmSenha.setEnabled(true);
        jButtonCancelar.setEnabled(true);

        jButtonAlterar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);


    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setUsuCod(Integer.parseInt(jtCOD.getText()));
            dao.excluir(mod);

            jtCOD.setText("");
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmSenha.setText("");
            // DESABILITANDO
            jTextFieldUsuario.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jPasswordFieldConfirmSenha.setEnabled(false);
            jComboBoxTipo.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preencherTabela("select *from usuarios order by usu_nome");
        }


    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        String usu_nome = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);   //o que for selecionado na table 
        conex.conexao();
        conex.executaSql("select *from usuarios where usu_nome='" + usu_nome + "'");
        try {
            conex.rs.first();                                                                      // primeiro do banco    
            jtCOD.setText(String.valueOf(conex.rs.getInt("usu_cod")));
            jTextFieldUsuario.setText(conex.rs.getString("usu_nome"));
            jPasswordFieldSenha.setText(conex.rs.getString("usu_senha"));
            jPasswordFieldConfirmSenha.setText(conex.rs.getString("usu_senha"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("usu_tipo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados\n Erro:  " + ex);
        }
        //    conex.desconecta();
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(true);

        jTextFieldUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmSenha.setEnabled(false);
        jComboBoxTipo.setEnabled(false);

        jTextFieldPesquisa.setEnabled(true);
        jButtonBuscar.setEnabled(true);
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmSenha.setEnabled(false);

        jTextFieldPesquisa.setEnabled(true);
        jButtonBuscar.setEnabled(true);

        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmSenha.setText("");

        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonNovo.setEnabled(true);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();   // instancia da arraylist
        String[] colunas = new String[]{"ID", "Usuário", "Senha", "Tipo"};   // recebe o nomes das colunas
        conex.conexao();
        conex.executaSql(Sql);
        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("usu_cod"),
                    conex.rs.getString("usu_nome"),
                    conex.rs.getString("usu_senha"),
                    conex.rs.getString("usu_tipo")});
            } while (conex.rs.next());  // quanto houve dados na base será exibido
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque por outro usuario");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);  // quantidade de linhas e colunas
        jTableUsuario.setModel(modelo);                                 // passando modelo da tabela
        jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(23);   //tamanha da tabela, começa do zero, espaço da coluna
        jTableUsuario.getColumnModel().getColumn(0).setResizable(false);     // desabilidado para redimensionar
        jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableUsuario.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableUsuario.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuario.getTableHeader().setReorderingAllowed(false); // desabilitado para reodenar
        jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF); // desabilidata para redimensionar a tabela
        jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // apenas seleciona um dado por vez
        //   conex.desconecta();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jtCOD;
    // End of variables declaration//GEN-END:variables
}
