package com.eduardo.views;

import java.sql.SQLException;
import com.eduardo.connection.ConexaoBD;

public class TelaLogin extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();

    public TelaLogin() {
        initComponents();
        con.conexao();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonAcessar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitoria Claro Brasil");
        setResizable(false);
        getContentPane().setLayout(null);

        jPasswordFieldSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldSenhaMouseClicked(evt);
            }
        });
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(200, 210, 170, 20);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(200, 180, 170, 20);

        jButtonAcessar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAcessar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAcessar.setText("Logon");
        jButtonAcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAcessarMouseClicked(evt);
            }
        });
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        jButtonAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAcessarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(300, 240, 70, 20);

        jLabelUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("User Name:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(120, 180, 70, 14);

        jLabelSenha.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Password:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(130, 210, 70, 14);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/terra.png"))); // NOI18N
        jLabelFundoLogin.setToolTipText("");
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(-150, -210, 750, 740);

        setSize(new java.awt.Dimension(584, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        //   if(jTextFieldUsuario.getText().isEmpty()){   // campo não pode está vazio
        //    JOptionPane.showMessageDialog(null,"Campo do login vázio");
        //    jTextFieldUsuario.requestFocus(); //foca na variavel
        // } else if(jPasswordFieldSenha.getText().isEmpty()){
        //      JOptionPane.showMessageDialog(null,"Campo senha vázio");
        //       jPasswordFieldSenha.requestFocus();
        //   } else {
        try {
            con.executaSql("select *from usuarios where usu_nome='" + jTextFieldUsuario.getText() + "'");
            con.rs.first();
            if (con.rs.getString("usu_senha").equals(jPasswordFieldSenha.getText())) {
                TelaPrincipal tela = new TelaPrincipal(jTextFieldUsuario.getText());
                tela.setVisible(true);
                tela.setResizable(false);
                dispose();
            } else {
                //  JOptionPane.showMessageDialog(this, "Usuário ou senha inválido");
            }
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(this, "Usuário ou senha inválida");
        }
        //VALIDAÇÃO DE USUARIO SIMPLES
        /*    if(jTextFieldUsuario.getText().equals("admin")&&jPasswordFieldSenha.getText().equals("admin")){
            TelaPrincipal  tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
            } else {
            JOptionPane.showMessageDialog(null,"Acesso negado");
            }   */
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonAcessarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAcessarMouseClicked

    }//GEN-LAST:event_jButtonAcessarMouseClicked

    private void jButtonAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAcessarKeyPressed
        jButtonAcessar.doClick();
    }//GEN-LAST:event_jButtonAcessarKeyPressed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed


    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jPasswordFieldSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyReleased

    }//GEN-LAST:event_jPasswordFieldSenhaKeyReleased

    private void jPasswordFieldSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaMouseClicked
        jButtonAcessar.doClick();
    }//GEN-LAST:event_jPasswordFieldSenhaMouseClicked

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        jButtonAcessar.doClick();
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

}
