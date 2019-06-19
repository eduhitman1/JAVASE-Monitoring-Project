package com.eduardo.views;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.eduardo.domain.BeansEscalonamento;
import com.eduardo.domain.Hora;
import com.eduardo.connection.ConexaoBD;
import com.eduardo.controllers.DaoEscalonamento;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Eduardo henrique
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();

    String dtHoje;
    String status;

    public TelaPrincipal(String usuario) {
        initComponents();
        conecta.conexao();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png")).getImage());
        jLabelUsuario.setText(usuario);
        Calendar data = Calendar.getInstance();  // instacis da calendario
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(d);
        dtHoje = dateFormat.format(d);
        jLabelData.setText(dtHoje);
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        jLabelHora.setText("Horário de Brasilia: " + mostra_hora.hora);
        timer1.start();

        jButtonAtualizarDados.doClick(); // QUANTIDADE DE LIGAÇÕES CONTADOR
    }

    TelaPrincipal() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelServiceDesk = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonGerlaine = new javax.swing.JButton();
        jButtonDanileia = new javax.swing.JButton();
        jButtonGuilherme = new javax.swing.JButton();
        jButtonBruno = new javax.swing.JButton();
        jButtonMonique = new javax.swing.JButton();
        jButtonDenise = new javax.swing.JButton();
        jButtonAlan = new javax.swing.JButton();
        jButtonGleicy = new javax.swing.JButton();
        jButtonJohnata = new javax.swing.JButton();
        jButtonEduardo = new javax.swing.JButton();
        jButtonEdson = new javax.swing.JButton();
        jButtonJohnata1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanelEscalonamento = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButtonIncidente = new javax.swing.JRadioButton();
        jRadioButtonSolicitacao = new javax.swing.JRadioButton();
        jTextFieldEsc_1 = new javax.swing.JTextField();
        jTextFieldEsc_2 = new javax.swing.JTextField();
        jTextFieldEsc_3 = new javax.swing.JTextField();
        jTextFieldEsc_4 = new javax.swing.JTextField();
        jTextFieldEsc_5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldEsc_6 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldComen = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldGrupo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanelEstatistica = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jButtonAtualizarDados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanelCommunicated = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel72 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItemSair1 = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBenvindo = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItemRelGerlaine = new javax.swing.JMenuItem();
        jMenuItemEnfermeira3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemEnfermeira2 = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kisspng-computer-icons-internally-displaced-person-desloca-walking-5ad993b5142fb6.1075307315242085650827.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelData.setText("##/");

        jLabelHora.setText("Horário de brasilia");

        jLabel4.setText("Data:");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelServiceDesk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelServiceDesk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setText("jLabel3");
        jPanelServiceDesk.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Usuário logado: ");
        jPanelServiceDesk.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gerenciamento Ciclo de Vida");
        jPanelServiceDesk.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png"))); // NOI18N
        jPanelServiceDesk.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Analyst Control -");
        jPanelServiceDesk.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonGerlaine.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGerlaine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonGerlaine.setText("Gerlaine Ferreira");
        jButtonGerlaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerlaineActionPerformed(evt);
            }
        });
        jButtonGerlaine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGerlaineKeyPressed(evt);
            }
        });

        jButtonDanileia.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDanileia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonDanileia.setText("Daniléia Santiago");
        jButtonDanileia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDanileiaActionPerformed(evt);
            }
        });
        jButtonDanileia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonDanileiaKeyPressed(evt);
            }
        });

        jButtonGuilherme.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuilherme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonGuilherme.setText("Guilherme Dantas");
        jButtonGuilherme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuilhermeActionPerformed(evt);
            }
        });
        jButtonGuilherme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGuilhermeKeyPressed(evt);
            }
        });

        jButtonBruno.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBruno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonBruno.setText("Bruno Rodrigues");
        jButtonBruno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrunoActionPerformed(evt);
            }
        });
        jButtonBruno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonBrunoKeyPressed(evt);
            }
        });

        jButtonMonique.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMonique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonMonique.setText("Monique G. Clark");
        jButtonMonique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoniqueActionPerformed(evt);
            }
        });
        jButtonMonique.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMoniqueKeyPressed(evt);
            }
        });

        jButtonDenise.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDenise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonDenise.setText("Denise Ferminio");
        jButtonDenise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeniseActionPerformed(evt);
            }
        });
        jButtonDenise.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonDeniseKeyPressed(evt);
            }
        });

        jButtonAlan.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonAlan.setText("Alan D. S. Oliveira");
        jButtonAlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlanActionPerformed(evt);
            }
        });
        jButtonAlan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAlanKeyPressed(evt);
            }
        });

        jButtonGleicy.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGleicy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonGleicy.setText("Gleicy de Vilaça");
        jButtonGleicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGleicyActionPerformed(evt);
            }
        });
        jButtonGleicy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGleicyKeyPressed(evt);
            }
        });

        jButtonJohnata.setBackground(new java.awt.Color(255, 255, 255));
        jButtonJohnata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonJohnata.setText("Johnata Dias");
        jButtonJohnata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJohnataActionPerformed(evt);
            }
        });
        jButtonJohnata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonJohnataKeyPressed(evt);
            }
        });

        jButtonEduardo.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEduardo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonEduardo.setText("Eduardo Henrique");
        jButtonEduardo.setPreferredSize(new java.awt.Dimension(101, 23));
        jButtonEduardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEduardoActionPerformed(evt);
            }
        });
        jButtonEduardo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEduardoKeyPressed(evt);
            }
        });

        jButtonEdson.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEdson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonEdson.setText("Edson Douglas");
        jButtonEdson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdsonActionPerformed(evt);
            }
        });

        jButtonJohnata1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonJohnata1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButtonJohnata1.setText("Analista NET");
        jButtonJohnata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJohnata1ActionPerformed(evt);
            }
        });
        jButtonJohnata1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonJohnata1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGerlaine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEdson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDenise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEduardo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonGuilherme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(jButtonDanileia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMonique, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBruno)
                    .addComponent(jButtonJohnata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGleicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonJohnata1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBruno)
                    .addComponent(jButtonDanileia)
                    .addComponent(jButtonGerlaine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDenise)
                    .addComponent(jButtonGuilherme)
                    .addComponent(jButtonGleicy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlan)
                    .addComponent(jButtonMonique)
                    .addComponent(jButtonJohnata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEduardo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdson)
                    .addComponent(jButtonJohnata1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanelServiceDesk.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanelServiceDesk.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -160, 1030, -1));

        jTabbedPane1.addTab(" Service Desk Manager", jPanelServiceDesk);

        jPanelEscalonamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelEscalonamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jButton4.setText("Registrar Escalonamento");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelEscalonamento.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 200, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png"))); // NOI18N
        jPanelEscalonamento.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Escalonamento NET");
        jPanelEscalonamento.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jRadioButtonIncidente.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonIncidente);
        jRadioButtonIncidente.setText("Incidente");
        jRadioButtonIncidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIncidenteActionPerformed(evt);
            }
        });
        jPanelEscalonamento.add(jRadioButtonIncidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jRadioButtonSolicitacao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonSolicitacao);
        jRadioButtonSolicitacao.setText("Solicitação");
        jRadioButtonSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSolicitacaoActionPerformed(evt);
            }
        });
        jPanelEscalonamento.add(jRadioButtonSolicitacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanelEscalonamento.add(jTextFieldEsc_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 210, -1));
        jPanelEscalonamento.add(jTextFieldEsc_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 210, -1));
        jPanelEscalonamento.add(jTextFieldEsc_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 210, -1));
        jPanelEscalonamento.add(jTextFieldEsc_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 210, -1));
        jPanelEscalonamento.add(jTextFieldEsc_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Nível 5:");
        jPanelEscalonamento.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nível 4:");
        jPanelEscalonamento.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Nível 3:");
        jPanelEscalonamento.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jTextFieldEsc_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEsc_6ActionPerformed(evt);
            }
        });
        jPanelEscalonamento.add(jTextFieldEsc_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 210, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Nível 6:");
        jPanelEscalonamento.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));
        jPanelEscalonamento.add(jTextFieldComen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 320, 50));

        jLabel23.setText("Comentário:");
        jPanelEscalonamento.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nível 2:");
        jPanelEscalonamento.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, 20));

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanelEscalonamento.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nível 1:");
        jPanelEscalonamento.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jTextFieldGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGrupoActionPerformed(evt);
            }
        });
        jPanelEscalonamento.add(jTextFieldGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 250, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jLabel24.setText("jLabel13");
        jPanelEscalonamento.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -160, 1030, -1));

        jTabbedPane1.addTab("NET Scheduling ", jPanelEscalonamento);

        jPanelEstatistica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelEstatistica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("TOTAL DO DIA:");

        jLabel33.setText("jLabel33");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 140, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Bruno Caetano");

        jLabel31.setText("X");

        jLabel39.setText("Y");

        jLabel46.setText("jLabel46");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jLabel39)
                    .addComponent(jLabel46))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 410, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Danileia S.");

        jLabel28.setText("X");

        jLabel34.setText("Y");

        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel28)
                    .addComponent(jLabel34)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 410, 20));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Denise Fermino");

        jLabel41.setText("X");

        jLabel42.setText("Y");

        jLabel18.setText("jLabel18");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel18))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 410, 20));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Guilherme D.");

        jLabel47.setText("X");

        jLabel49.setText("Y");

        jLabel35.setText("jLabel35");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47)
                    .addComponent(jLabel49)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, 20));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("Gleicy Vilaça");

        jLabel53.setText("X");

        jLabel54.setText("Y");

        jLabel48.setText("jLabel48");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel48))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 410, 20));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("Alan Oliveira");

        jLabel57.setText("X");

        jLabel59.setText("Y");

        jLabel19.setText("jLabel19");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel57)
                    .addComponent(jLabel59)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, 20));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setText("Monique Clark");

        jLabel63.setText("X");

        jLabel64.setText("Y");

        jLabel38.setText("jLabel38");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 410, 20));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("Jhonata Dias");

        jLabel68.setText("X");

        jLabel69.setText("Y");

        jLabel52.setText("jLabel52");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel52))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 410, 20));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel70.setText("Edson Douglas");

        jLabel78.setText("X");

        jLabel79.setText("Y");

        jLabel56.setText("jLabel56");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(jLabel56))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 410, 20));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("Eduardo H.");

        jLabel76.setText("X");

        jLabel77.setText("Y");

        jLabel58.setText("jLabel58");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77)
                    .addComponent(jLabel58))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 410, 20));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel80.setText("Analista NET");

        jLabel83.setText("X");

        jLabel84.setText("Y");

        jLabel61.setText("jLabel61");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84)
                    .addComponent(jLabel61))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 410, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Gerlaine Ferreira");

        jLabel25.setText("X");

        jLabel37.setText("Y");

        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel25)
                    .addComponent(jLabel37)
                    .addComponent(jLabel17))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelEstatistica.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel67.setText("TOTAL DE CHAMADOS:");

        jLabel71.setText("jLabel71");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel71)))
        );

        jPanelEstatistica.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 310, 20));

        jButtonAtualizarDados.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAtualizarDados.setText("Atualizar Dados");
        jButtonAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarDadosActionPerformed(evt);
            }
        });
        jPanelEstatistica.add(jButtonAtualizarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Registro Total");
        jPanelEstatistica.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 110, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("CH. Pendentes");
        jPanelEstatistica.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 90, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Registo do Dia");
        jPanelEstatistica.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 120, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGO.png"))); // NOI18N
        jPanelEstatistica.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 220, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jLabel16.setText("jLabel13");
        jPanelEstatistica.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -160, 1030, -1));

        jLabel43.setText("jLabel43");
        jPanelEstatistica.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel44.setText("jLabel44");
        jPanelEstatistica.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jTabbedPane1.addTab("Statistic", jPanelEstatistica);

        jPanelCommunicated.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCommunicated.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCommunicated.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 230, 80));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelCommunicated.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCommunicated.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel66.setText("Assunto:");
        jPanelCommunicated.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 20));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel62.setText("Messagem:");
        jPanelCommunicated.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png"))); // NOI18N
        jPanelCommunicated.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jLabel51.setText("jLabel13");
        jPanelCommunicated.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -160, 1030, -1));
        jPanelCommunicated.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jTabbedPane1.addTab("Communicated ", jPanelCommunicated);

        jLabel72.setText("Copyright © 2019 Monitoria Claro Brasil. Todos os direitos reservados.");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/partido-menu-2.png"))); // NOI18N
        jMenuCadastro.setText("Gerenciamento de Tarefa");

        jMenuItemUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jMenuItemUsuarios.setText("Gerência Logins");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuarios);

        jMenuItem13.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon benvindo.png"))); // NOI18N
        jMenuItem13.setText("Sobre");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem13);

        jMenuItemSair1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-menu-2.png"))); // NOI18N
        jMenuItemSair1.setText("Sair");
        jMenuItemSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSair1MouseClicked(evt);
            }
        });
        jMenuItemSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSair1ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemSair1);

        jMenuBar1.add(jMenuCadastro);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBenvindo.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemTelaBenvindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chamado.png"))); // NOI18N
        jMenuItemTelaBenvindo.setText("Bem -vindos: Gerenciamento ");
        jMenuItemTelaBenvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenvindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBenvindo);

        jMenuItem10.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon CA.png"))); // NOI18N
        jMenuItem10.setText("CA - Service Desk");
        jMenuFerramentas.add(jMenuItem10);

        jMenuItem11.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jMenuItem11.setText("Escalonamento NET");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItem11);

        jMenuBar1.add(jMenuFerramentas);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Relatórios");

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem8.setText("Relatório Eduardo Henrique");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItemRelGerlaine.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelGerlaine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItemRelGerlaine.setText("Relatório Gerlaine Ferreira");
        jMenuItemRelGerlaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelGerlaineActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRelGerlaine);

        jMenuItemEnfermeira3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemEnfermeira3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItemEnfermeira3.setText("Relatório Daniléia Santiago");
        jMenuItemEnfermeira3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnfermeira3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEnfermeira3);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem1.setText("Relatório Bruno Caetano");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem2.setText("Relatório Denise Fermino");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem3.setText("Relatório Guilherme Dantas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem4.setText("Relatório Gleicy Vilaça");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem5.setText("Relatório Alan Lamborgui");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem6.setText("Relatório Monique Clack");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem7.setText("Relatório Johnata Dias");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem9.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem9.setText("Relatório Edson Douglas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem12.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jMenuItem12.setText("Relatório Analista NET");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenuSair.setText("Logout");

        jMenuItemEnfermeira2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemEnfermeira2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kisspng-computer-icons-internally-displaced-person-desloca-walking-5ad993b5142fb6.1075307315242085650827.jpg"))); // NOI18N
        jMenuItemEnfermeira2.setText("Logout");
        jMenuItemEnfermeira2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnfermeira2ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemEnfermeira2);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-menu-2.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSairMouseClicked(evt);
            }
        });
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 771, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelData)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelData)
                        .addComponent(jLabel4)
                        .addComponent(jLabelHora))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaLogin logout = new TelaLogin();
        logout.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemTelaBenvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenvindoActionPerformed

    }//GEN-LAST:event_jMenuItemTelaBenvindoActionPerformed

    private void jMenuItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairMouseClicked

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        FormUsuario telaUsu = new FormUsuario();
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (telaUsu == null) {
                    telaUsu = new FormUsuario();
                    telaUsu.setResizable(false);
                } else {
                    telaUsu.setVisible(true);
                    telaUsu.setResizable(false);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para login Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente para login Administrador, contate o administrador!\n Erro: " + ex);
        }

    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemRelGerlaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelGerlaineActionPerformed

           conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Gerlaine/RelGerlaineData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Gerlaine/RelGerlaine.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }

    }//GEN-LAST:event_jMenuItemRelGerlaineActionPerformed

    private void jMenuItemEnfermeira2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnfermeira2ActionPerformed
        TelaLogin logout = new TelaLogin();
        logout.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemEnfermeira2ActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        jLabelHora.setText("Horário de Brasilia: " + mostra_hora.hora);


    }//GEN-LAST:event_timer1OnTime

    private void jMenuItemEnfermeira3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnfermeira3ActionPerformed
         conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Danileia/RelDanileiaData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Danileia/RelDanileia.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }

    }//GEN-LAST:event_jMenuItemEnfermeira3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Bruno/RelBrunoData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Bruno/RelBruno.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Denise/RelDeniseData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Denise/RelDenise.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Guilherme/RelGuilhermeData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Guilherme/RelGuilherme.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Gleicy/RelGleicyData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Gleicy/RelGleicy.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Alan/RelAlanData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Alan/RelAlan.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Monique/RelMoniqueData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Monique/RelMonique.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Johnata/RelJohnataData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Johnata/RelJohnata.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Eduardo/RelEduardoData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Eduardo/RelEduardo.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Edson/RelEdsonData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Edson/RelEdson.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButtonEdsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdsonActionPerformed
        FormEdson eds = new FormEdson(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7416234") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (eds == null) {
                    eds = new FormEdson(jLabelUsuario.getText());
                    eds.setResizable(true);
                    dispose();
                } else {
                    eds.setVisible(true);
                    eds.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonEdsonActionPerformed

    private void jButtonEduardoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEduardoKeyPressed

    }//GEN-LAST:event_jButtonEduardoKeyPressed

    private void jButtonEduardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEduardoActionPerformed
        FormEduardo ed = new FormEduardo(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7240049") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (ed == null) {
                    ed = new FormEduardo(jLabelUsuario.getText());
                    ed.setResizable(true);
                    dispose();
                } else {
                    ed.setVisible(true);
                    ed.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonEduardoActionPerformed

    private void jButtonJohnataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonJohnataKeyPressed

    }//GEN-LAST:event_jButtonJohnataKeyPressed

    private void jButtonJohnataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJohnataActionPerformed
        FormJohnata jo = new FormJohnata(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("z030949") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (jo == null) {
                    jo = new FormJohnata(jLabelUsuario.getText());
                    jo.setResizable(true);
                    dispose();
                } else {
                    jo.setVisible(true);
                    jo.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonJohnataActionPerformed

    private void jButtonGleicyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGleicyKeyPressed

    }//GEN-LAST:event_jButtonGleicyKeyPressed

    private void jButtonGleicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGleicyActionPerformed
        FormGleicy gl = new FormGleicy(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7640380") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (gl == null) {
                    gl = new FormGleicy(jLabelUsuario.getText());
                    gl.setResizable(true);
                    dispose();
                } else {
                    gl.setVisible(true);
                    gl.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonGleicyActionPerformed

    private void jButtonAlanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAlanKeyPressed

    }//GEN-LAST:event_jButtonAlanKeyPressed

    private void jButtonAlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlanActionPerformed
        FormAlan al = new FormAlan(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("z030948") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (al == null) {
                    al = new FormAlan(jLabelUsuario.getText());
                    al.setResizable(true);
                    dispose();
                } else {
                    al.setVisible(true);
                    al.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonAlanActionPerformed

    private void jButtonDeniseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonDeniseKeyPressed

    }//GEN-LAST:event_jButtonDeniseKeyPressed

    private void jButtonDeniseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeniseActionPerformed
        FormDenise de = new FormDenise(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7293292") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (de == null) {
                    de = new FormDenise(jLabelUsuario.getText());
                    de.setResizable(true);
                    dispose();
                } else {
                    de.setVisible(true);
                    de.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonDeniseActionPerformed

    private void jButtonMoniqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMoniqueKeyPressed

    }//GEN-LAST:event_jButtonMoniqueKeyPressed

    private void jButtonMoniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoniqueActionPerformed
        FormMonique mo = new FormMonique(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7249291") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (mo == null) {
                    mo = new FormMonique(jLabelUsuario.getText());
                    mo.setResizable(true);
                    dispose();
                } else {
                    mo.setVisible(true);
                    mo.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonMoniqueActionPerformed

    private void jButtonBrunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonBrunoKeyPressed

    }//GEN-LAST:event_jButtonBrunoKeyPressed

    private void jButtonBrunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrunoActionPerformed
        FormBruno br = new FormBruno(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7240025") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (br == null) {
                    br = new FormBruno(jLabelUsuario.getText());
                    br.setResizable(true);
                    dispose();
                } else {
                    br.setVisible(true);
                    br.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonBrunoActionPerformed

    private void jButtonGuilhermeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGuilhermeKeyPressed

    }//GEN-LAST:event_jButtonGuilhermeKeyPressed

    private void jButtonGuilhermeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuilhermeActionPerformed
        FormGuilherme gu = new FormGuilherme(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7249174") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (gu == null) {
                    gu = new FormGuilherme(jLabelUsuario.getText());
                    gu.setResizable(true);
                    dispose();
                } else {
                    gu.setVisible(true);
                    gu.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonGuilhermeActionPerformed

    private void jButtonDanileiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonDanileiaKeyPressed

    }//GEN-LAST:event_jButtonDanileiaKeyPressed

    private void jButtonDanileiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDanileiaActionPerformed
        FormDanileia da = new FormDanileia(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("t7239698") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (da == null) {
                    da = new FormDanileia(jLabelUsuario.getText());
                    da.setResizable(true);
                    dispose();
                } else {
                    da.setVisible(true);
                    da.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonDanileiaActionPerformed

    private void jButtonGerlaineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGerlaineKeyPressed

    }//GEN-LAST:event_jButtonGerlaineKeyPressed

    private void jButtonGerlaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerlaineActionPerformed
        FormGerlaine ge = new FormGerlaine(jLabelUsuario.getText());
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_nome").equals("z012382") || conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (ge == null) {
                    ge = new FormGerlaine(jLabelUsuario.getText());
                    ge.setResizable(true);
                    dispose();
                } else {
                    ge.setVisible(true);
                    ge.setResizable(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonGerlaineActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        FormAcionamento esc = new FormAcionamento();
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (esc == null) {
                    esc = new FormAcionamento();
                    esc.setResizable(true);
                } else {
                    esc.setVisible(true);
                    esc.setResizable(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FormAcionamento esc = new FormAcionamento();
        try {
            conecta.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_tipo").equals("administrador")) {
                if (esc == null) {
                    esc = new FormAcionamento();
                    esc.setResizable(true);
                } else {
                    esc.setVisible(true);
                    esc.setResizable(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente para o Administrador, contate o administrador!!\n Erro: " + ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        BeansEscalonamento mod = new BeansEscalonamento();
        DaoEscalonamento control = new DaoEscalonamento();
        if (jRadioButtonIncidente.getModel().isSelected()) {
            mod.setPesquisa("Incidente - " + jTextFieldGrupo.getText());
            BeansEscalonamento model = control.buscaChamado(mod);
            jTextFieldEsc_1.setText(model.getEsc_1());
            jTextFieldEsc_2.setText(model.getEsc_2());
            jTextFieldEsc_3.setText(model.getEsc_3());
            jTextFieldEsc_4.setText(model.getEsc_4());
            jTextFieldEsc_5.setText(model.getEsc_5());
            jTextFieldEsc_6.setText(model.getEsc_6());
            jTextFieldComen.setText(model.getComen());

            jTextFieldGrupo.setEnabled(true);
            jTextFieldEsc_1.setEnabled(true);
            jTextFieldEsc_2.setEnabled(true);
            jTextFieldEsc_3.setEnabled(true);
            jTextFieldEsc_4.setEnabled(true);
            jTextFieldEsc_5.setEnabled(true);
            jTextFieldEsc_6.setEnabled(true);
            jTextFieldComen.setEnabled(true);
        } else if (jRadioButtonSolicitacao.getModel().isSelected()) {
            mod.setPesquisa("Solicitação - " + jTextFieldGrupo.getText());
            BeansEscalonamento model = control.buscaChamado(mod);
            jTextFieldEsc_1.setText(model.getEsc_1());
            jTextFieldEsc_2.setText(model.getEsc_2());
            jTextFieldEsc_3.setText(model.getEsc_3());
            jTextFieldEsc_4.setText(model.getEsc_4());
            jTextFieldEsc_5.setText(model.getEsc_5());
            jTextFieldEsc_6.setText(model.getEsc_6());
            jTextFieldComen.setText(model.getComen());

            jTextFieldGrupo.setEnabled(true);
            jTextFieldEsc_1.setEnabled(true);
            jTextFieldEsc_2.setEnabled(true);
            jTextFieldEsc_3.setEnabled(true);
            jTextFieldEsc_4.setEnabled(true);
            jTextFieldEsc_5.setEnabled(true);
            jTextFieldEsc_6.setEnabled(true);
            jTextFieldComen.setEnabled(true);
        }
        if (jTextFieldGrupo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Grupo não encontrado");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jRadioButtonIncidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIncidenteActionPerformed
        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldEsc_6.setText("");
        jTextFieldComen.setText("");
    }//GEN-LAST:event_jRadioButtonIncidenteActionPerformed

    private void jRadioButtonSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSolicitacaoActionPerformed
        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldEsc_6.setText("");
        jTextFieldComen.setText("");
    }//GEN-LAST:event_jRadioButtonSolicitacaoActionPerformed

    private void jTextFieldGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGrupoActionPerformed
        jButtonBuscar.doClick();
    }//GEN-LAST:event_jTextFieldGrupoActionPerformed

    private void jTextFieldEsc_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEsc_6ActionPerformed

    }//GEN-LAST:event_jTextFieldEsc_6ActionPerformed

    private void jButtonJohnata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJohnata1ActionPerformed
        FormNovo an = new FormNovo(jLabelUsuario.getText());
        if (an == null) {
            an = new FormNovo(jLabelUsuario.getText());
            an.setResizable(true);
            dispose();
        } else {
            an.setVisible(true);
            an.setResizable(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonJohnata1ActionPerformed

    private void jButtonJohnata1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonJohnata1KeyPressed

    }//GEN-LAST:event_jButtonJohnata1KeyPressed

    private void jButtonAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarDadosActionPerformed
        String data;
        data = String.format("" + dtHoje);
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0, cont11 = 0, cont12 = 0;
        int total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, total6 = 0, total7 = 0, total8 = 0, total9 = 0, total10 = 0, total11 = 0, total12 = 0;
         
        // COUNT(*) SQL GERLAINE TOTAL DIA  
        try {
            int gerlaine = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from gerlaine where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    gerlaine = rs.getInt(WIDTH);
                    cont1 = gerlaine;
                }
            }
            jLabel25.setText(String.valueOf(gerlaine));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GERLAINE TOTAL CHAMADOS
        try {
            int gerlaineTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM gerlaine"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    gerlaineTol = rs.getInt(WIDTH);
                    total1 = gerlaineTol;
                }
            }
            jLabel17.setText(String.valueOf(gerlaineTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GERLAINE PENDENTE 
        try {
            int gerlainePen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM gerlaine WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    gerlainePen = rs.getInt(WIDTH);
                }
            }
            jLabel37.setText(String.valueOf(gerlainePen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL DANILEIA TOTAL DIA
        try {
            int danileia = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from danileia where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    danileia = rs.getInt(WIDTH);
                    cont2 = danileia;
                }
            }
            jLabel28.setText(String.valueOf(danileia));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL DANILEIA TOTAL CHAMADOS
        try {
            int DanileiaTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM danileia"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    DanileiaTol = rs.getInt(WIDTH);
                    total2 = DanileiaTol;
                }
            }
            jLabel20.setText(String.valueOf(DanileiaTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL DANILEIA PENDENTE 
        try {
            int danileiaPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM danileia WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    danileiaPen = rs.getInt(WIDTH);
                }
            }
            jLabel34.setText(String.valueOf(danileiaPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }
        // COUNT(*) SQL BRUNO TOTAL DIA
        try {
            int bruno = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from bruno where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    bruno = rs.getInt(WIDTH);
                    cont3 = bruno;
                }
            }
            jLabel31.setText(String.valueOf(bruno));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL BRUNO TOTAL CHAMADOS
        try {
            int brunoTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM bruno"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    brunoTol = rs.getInt(WIDTH);
                    total3 = brunoTol;
                }
            }
            jLabel46.setText(String.valueOf(brunoTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL BRUNO PENDENTE 
        try {
            int brunoPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM bruno WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    brunoPen = rs.getInt(WIDTH);
                }
            }
            jLabel39.setText(String.valueOf(brunoPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL DENISE TOTAL DIA
        try {
            int denise = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from denise where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    denise = rs.getInt(WIDTH);
                    cont4 = denise;

                }
            }
            jLabel41.setText(String.valueOf(denise));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL DENISE TOTAL CHAMADOS
        try {
            int deniseTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM denise"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    deniseTol = rs.getInt(WIDTH);
                    total4 = deniseTol;
                }
            }
            jLabel18.setText(String.valueOf(deniseTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL DENISE PENDENTE 
        try {
            int denisePen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM denise WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    denisePen = rs.getInt(WIDTH);
                }
            }
            jLabel42.setText(String.valueOf(denisePen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GUILHERME TOTAL DIA
        try {
            int guilherme = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from guilherme where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    guilherme = rs.getInt(WIDTH);
                    cont5 = guilherme;
                }
            }
            jLabel47.setText(String.valueOf(guilherme));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GUILHERME TOTAL CHAMADOS
        try {
            int guilhermeTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM guilherme"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    guilhermeTol = rs.getInt(WIDTH);
                    total5 = guilhermeTol;
                }
            }
            jLabel35.setText(String.valueOf(guilhermeTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GUILHERME PENDENTE 
        try {
            int guilhermePen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM guilherme WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    guilhermePen = rs.getInt(WIDTH);
                }
            }
            jLabel49.setText(String.valueOf(guilhermePen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GLEICY TOTAL DIA
        try {
            int gleicy = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from gleicy where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    gleicy = rs.getInt(WIDTH);
                    cont6 = gleicy;
                }
            }
            jLabel53.setText(String.valueOf(gleicy));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GLEICY TOTAL CHAMADOS
        try {
            int gleicyTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM gleicy"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    gleicyTol = rs.getInt(WIDTH);
                    total6 = gleicyTol;
                }
            }
            jLabel48.setText(String.valueOf(gleicyTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL GLEICY PENDENTE 
        try {
            int gleicyPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM gleicy WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    gleicyPen = rs.getInt(WIDTH);
                }
            }
            jLabel54.setText(String.valueOf(gleicyPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL ALAN TOTAL DIA
        try {
            int alan = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from alan where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    alan = rs.getInt(WIDTH);
                    cont7 = alan;
                }
            }
            jLabel57.setText(String.valueOf(alan));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL ALAN TOTAL CHAMADOS
        try {
            int alanTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM alan"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    alanTol = rs.getInt(WIDTH);
                    total7 = alanTol;
                }
            }
            jLabel19.setText(String.valueOf(alanTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL ALAN PENDENTE 
        try {
            int alanPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM alan WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    alanPen = rs.getInt(WIDTH);
                }
            }
            jLabel59.setText(String.valueOf(alanPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }
        // COUNT(*) SQL MONIQUE TOTAL DIA
        try {
            int monique = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from monique where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    monique = rs.getInt(WIDTH);
                    cont8 = monique;
                }
            }
            jLabel63.setText(String.valueOf(monique));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL MONIQUE TOTAL CHAMADOS
        try {
            int moniqueTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM monique"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    moniqueTol = rs.getInt(WIDTH);
                    total8 = moniqueTol;
                }
            }
            jLabel38.setText(String.valueOf(moniqueTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL MONIQUE PENDENTE 
        try {
            int moniquePen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM monique WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    moniquePen = rs.getInt(WIDTH);
                }
            }
            jLabel64.setText(String.valueOf(moniquePen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }
        ///

        // COUNT(*) SQL JOHNATA TOTAL DIA
        try {
            int johnata = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from johnata where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    johnata = rs.getInt(WIDTH);
                    cont9 = johnata;
                }
            }
            jLabel68.setText(String.valueOf(johnata));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL JOHNATA TOTAL CHAMADOS
        try {
            int johnataTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM johnata"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    johnataTol = rs.getInt(WIDTH);
                    total9 = johnataTol;
                }
            }
            jLabel52.setText(String.valueOf(johnataTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL JOHNATA PENDENTE 
        try {
            int johnataPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM johnata WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    johnataPen = rs.getInt(WIDTH);
                }
            }
            jLabel69.setText(String.valueOf(johnataPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }
        ///

        // COUNT(*) SQL EDSON TOTAL DIA
        try {
            int edson = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from edson where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    edson = rs.getInt(WIDTH);
                    cont10 = edson;
                }
            }
            jLabel78.setText(String.valueOf(edson));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL  EDSON TOTAL CHAMADOS
        try {
            int edsonTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM edson"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    edsonTol = rs.getInt(WIDTH);
                    total10 = edsonTol;
                }
            }
            jLabel56.setText(String.valueOf(edsonTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL EDSON PENDENTE 
        try {
            int edsonPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM edson WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    edsonPen = rs.getInt(WIDTH);
                }
            }
            jLabel79.setText(String.valueOf(edsonPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }
        ///
        // COUNT(*) SQL NOVO TOTAL DIA
        try {
            int novo = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from novo where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    novo = rs.getInt(WIDTH);
                    cont12 = novo;
                }
            }
            jLabel83.setText(String.valueOf(novo));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL  NOVO TOTAL CHAMADOS
        try {
            int novoTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM novo"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    novoTol = rs.getInt(WIDTH);
                    total11 = novoTol;
                }
            }
            jLabel61.setText(String.valueOf(novoTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL NOVO PENDENTE 
        try {
            int novoPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM novo WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    novoPen = rs.getInt(WIDTH);
                }
            }
            jLabel84.setText(String.valueOf(novoPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

// COUNT(*) SQL EDUARDO TOTAL DIA
        try {
            int eduardo = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("select count(*) from eduardo where data_l='" + data + "'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    eduardo = rs.getInt(WIDTH);
                    cont11 = eduardo;
                }
            }
            jLabel76.setText(String.valueOf(eduardo));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL  EDUARDO TOTAL CHAMADOS
        try {
            int eduardoTol = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) as cod_c FROM eduardo"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    eduardoTol = rs.getInt(WIDTH);
                    total12 = eduardoTol;
                }
            }
            jLabel58.setText(String.valueOf(eduardoTol));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        // COUNT(*) SQL EDUARDO PENDENTE 
        try {
            int eduardoPen = 0;
            try (Connection cn = conecta.conexao() //ou de onde vier a sua conexao
                    ;
                     PreparedStatement ps = cn.prepareStatement("SELECT count(*) FROM eduardo WHERE tipofor_c='Pendente'"); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    eduardoPen = rs.getInt(WIDTH);
                }
            }
            jLabel77.setText(String.valueOf(eduardoPen));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex);
        }

        ///
        int totalDia;
        totalDia = cont1 + cont2 + cont3 + cont4 + cont5 + cont6 + cont7 + cont8 + cont9 + cont10 + cont11 + cont12;
        jLabel33.setText(String.valueOf(totalDia));
        
        double totalChamados;
        totalChamados = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10 + total11 + total12;
        jLabel71.setText(String.format("%f",totalChamados));

        /*   
        Date d2 = null;
       try {
           d2 = new SimpleDateFormat("dd/MM/yyyy").parse("10/06/2013");
       } catch (ParseException ex) {
           Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
       }
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
		System.out.println(cal.getTime()); //data atual
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.getTime());
         
         */

    }//GEN-LAST:event_jButtonAtualizarDadosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Comunicado enviado com sucesso..");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
      conecta.conexao();
        Connection con = ConexaoBD.con;
        int resposta = 0;

        UIManager.put("OptionPane.yesButtonText", "Relatório por Data");
        UIManager.put("OptionPane.noButtonText", "Relatório Total");
        resposta = JOptionPane.showConfirmDialog(null, "Qual forma deseja Imprimir o relatório:");

        if (resposta == JOptionPane.YES_OPTION) {
            // PASSAGEM COM PARAMETRO;
            try {
                HashMap params = new HashMap<>();
                params.put("data_esc", new String(JOptionPane.showInputDialog("Digite a data: ")));

                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Novo/RelNovoData.jasper", params, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório por data" + ex);
            }

        } else if (resposta == JOptionPane.NO_OPTION) {
            try {
                //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
                JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Novo/RelNovo.jasper", null, con);    //hotname da maquina 
                JasperViewer.viewReport(print, false);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
            }
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSair1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSair1MouseClicked

    private void jMenuItemSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSair1ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        /* JOptionPane.showMessageDialog(null, "Oi vocês pensaram que se livraram de mim, não\n"
                + " Gostaria de agradecer a todos, por tudo"
                + "Pelos compartilhamentos e risadas\n Somos aquilo que pensamos,  "
                + "Levamos pedacinho de imagens, para nos lembramos quem somos e quem nós deveriamos ver."); */  
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAlan;
    private javax.swing.JButton jButtonAtualizarDados;
    private javax.swing.JButton jButtonBruno;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDanileia;
    private javax.swing.JButton jButtonDenise;
    private javax.swing.JButton jButtonEdson;
    private javax.swing.JButton jButtonEduardo;
    private javax.swing.JButton jButtonGerlaine;
    private javax.swing.JButton jButtonGleicy;
    private javax.swing.JButton jButtonGuilherme;
    private javax.swing.JButton jButtonJohnata;
    private javax.swing.JButton jButtonJohnata1;
    private javax.swing.JButton jButtonMonique;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemEnfermeira2;
    private javax.swing.JMenuItem jMenuItemEnfermeira3;
    private javax.swing.JMenuItem jMenuItemRelGerlaine;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSair1;
    private javax.swing.JMenuItem jMenuItemTelaBenvindo;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelCommunicated;
    private javax.swing.JPanel jPanelEscalonamento;
    private javax.swing.JPanel jPanelEstatistica;
    private javax.swing.JPanel jPanelServiceDesk;
    private javax.swing.JRadioButton jRadioButtonIncidente;
    private javax.swing.JRadioButton jRadioButtonSolicitacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldComen;
    private javax.swing.JTextField jTextFieldEsc_1;
    private javax.swing.JTextField jTextFieldEsc_2;
    private javax.swing.JTextField jTextFieldEsc_3;
    private javax.swing.JTextField jTextFieldEsc_4;
    private javax.swing.JTextField jTextFieldEsc_5;
    private javax.swing.JTextField jTextFieldEsc_6;
    private javax.swing.JTextField jTextFieldGrupo;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
