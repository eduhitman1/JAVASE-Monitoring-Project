package com.eduardo.views;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import com.eduardo.domain.BeansEscalonamento;
import com.eduardo.domain.Hora;
import com.eduardo.domain.ModeloTabela;
import com.eduardo.connection.ConexaoBD;

import com.eduardo.controllers.DaoEscalonamento;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class FormAcionamento extends javax.swing.JFrame {

    BeansEscalonamento mod = new BeansEscalonamento();
    DaoEscalonamento control = new DaoEscalonamento();
    ConexaoBD conex = new ConexaoBD();

    String dtHoje;
    String status;

    //String CLASS =""; 
    int flag = 0;

    public FormAcionamento() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png")).getImage());
        conex.conexao();
        preencherTabela("select * from escalonamento order by cod_g asc");
        Calendar data = Calendar.getInstance();  // instacis da calendario
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(d);
        dtHoje = dateFormat.format(d);
        //Date data = new Date();
        //DateFormat formatadoD = DateFormat.getDateInstance(DateFormat.LONG);
        //jLabelData.setText(formatadoD.format(data));

        // a linha baixo exive a hora atual no sismtea
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();

        timer1.start();

    }

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();   // instancia da arraylist
        String[] colunas = new String[]{"ID", "Grupo Solucionador", "1ºAcionamento", "2ºAcionamento", "3ºAcionamento", "4ºAcionamento", "5ºAcionamento", "6ºAcionamento", "Comentário", "Data de modificação", "hora"};   // recebe o nomes das colunas
        conex.conexao();
        conex.executaSql(Sql);
        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("cod_g"),
                    conex.rs.getString("grupo"),
                    conex.rs.getString("esc_1"),
                    conex.rs.getString("esc_2"),
                    conex.rs.getString("esc_3"),
                    conex.rs.getString("esc_4"),
                    conex.rs.getString("esc_5"),
                    conex.rs.getString("esc_6"),
                    conex.rs.getString("comen"),
                    conex.rs.getString("data_l"),
                    conex.rs.getString("hora")});
            } while (conex.rs.next());  // quanto houve dados na base será exibido
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "não há escalonamento");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);  // quantidade de linhas e colunas
        jTableEscalonamento.setModel(modelo);                                 // passando modelo da tabela
        jTableEscalonamento.getColumnModel().getColumn(0).setPreferredWidth(23);   //tamanha da tabela, começa do zero, espaço da coluna
        jTableEscalonamento.getColumnModel().getColumn(0).setResizable(false);     // desabilidado para redimensionar
        //jTableEscalonamento.

        jTableEscalonamento.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableEscalonamento.getColumnModel().getColumn(1).setResizable(false);
        jTableEscalonamento.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTableEscalonamento.getColumnModel().getColumn(2).setResizable(false);
        jTableEscalonamento.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(3).setResizable(false);
        jTableEscalonamento.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(4).setResizable(false);
        jTableEscalonamento.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(5).setResizable(false);
        jTableEscalonamento.getColumnModel().getColumn(6).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(6).setResizable(false);

        jTableEscalonamento.getColumnModel().getColumn(7).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(7).setResizable(false);
        jTableEscalonamento.getColumnModel().getColumn(8).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(8).setResizable(false);

        jTableEscalonamento.getColumnModel().getColumn(9).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(9).setResizable(false);

        jTableEscalonamento.getColumnModel().getColumn(10).setPreferredWidth(150);
        jTableEscalonamento.getColumnModel().getColumn(10).setResizable(false);

        jTableEscalonamento.getTableHeader().setReorderingAllowed(false); // desabilitado para reodenar
        jTableEscalonamento.setAutoResizeMode(jTableEscalonamento.AUTO_RESIZE_OFF); // desabilidata para redimensionar a tabela
        jTableEscalonamento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // apenas seleciona um dado por vez
        //   conex.desconecta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldGrupoSolucionador = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jtCOD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEscalonamento = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEsc_1 = new javax.swing.JTextField();
        jTextFieldEsc_2 = new javax.swing.JTextField();
        jTextFieldEsc_3 = new javax.swing.JTextField();
        jTextFieldEsc_4 = new javax.swing.JTextField();
        jTextFieldEsc_5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldPesquisaChamado = new javax.swing.JTextField();
        jButtonPesquisar1 = new javax.swing.JButton();
        jTextFieldEsc_6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldComen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jFormattedTextHora = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedDataLigacao = new javax.swing.JFormattedTextField();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerênciamento de Escalonamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldGrupoSolucionador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGrupoSolucionadorActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn-salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jButtonSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSalvarKeyPressed(evt);
            }
        });

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn-novo.png"))); // NOI18N
        jButtonNovo.setText("Novo Acionamento");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jtCOD.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Serial:");

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        jButtonEditar.setText("Editar ");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jTableEscalonamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEscalonamento.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTableEscalonamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEscalonamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEscalonamento);

        jLabel4.setText("Grupo Solucionador");

        jLabel7.setText("1º Acionamento:");

        jLabel8.setText("2ºAcionamento:");

        jLabel9.setText("3º Acionamento:");

        jLabel10.setText("4º Acionamento: ");

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel icon.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn-excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir Chamado");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel17.setText("5ºAcionamento:");

        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEsc_1ActionPerformed(evt);
            }
        });

        jTextFieldEsc_2.setEnabled(false);

        jTextFieldEsc_3.setEnabled(false);

        jTextFieldEsc_4.setEnabled(false);

        jTextFieldEsc_5.setEnabled(false);

        jLabel22.setText("Quantidade grupos:");

        jLabel21.setText("X");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Busca por grupo");

        jButtonPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButtonPesquisar1.setText("Pesquisa ");
        jButtonPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisar1ActionPerformed(evt);
            }
        });

        jTextFieldEsc_6.setEnabled(false);

        jLabel2.setText("6ºAcionamento:");

        jTextFieldComen.setEnabled(false);

        jLabel3.setText("Comentário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21))
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldGrupoSolucionador, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(501, 501, 501)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldEsc_5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldEsc_6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonEditar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonExcluir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonCancelar)
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldPesquisaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldEsc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jTextFieldEsc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(123, 123, 123)
                                            .addComponent(jTextFieldEsc_4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextFieldEsc_3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPesquisar1)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldComen, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonNovo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldGrupoSolucionador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldEsc_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEsc_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldEsc_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEsc_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldEsc_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEsc_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonCancelar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPesquisar1)
                            .addComponent(jTextFieldPesquisaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Registro de Escalonamento NET");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jButton2.setText("Relatório de Escalonamento NET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextHora.setEnabled(false);

        jLabel20.setText("Horário de Brasilia:");

        jLabel6.setText("Data de Hoje:");

        try {
            jFormattedDataLigacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedDataLigacao.setEnabled(false);
        jFormattedDataLigacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedDataLigacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedDataLigacao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedDataLigacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFormattedTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1229, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGrupoSolucionadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGrupoSolucionadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGrupoSolucionadorActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (flag == 1) {

            mod.setGrupo(jTextFieldGrupoSolucionador.getText());

            mod.setEsc_1(jTextFieldEsc_1.getText());
            mod.setEsc_2(jTextFieldEsc_2.getText());
            mod.setEsc_3(jTextFieldEsc_3.getText());
            mod.setEsc_4(jTextFieldEsc_4.getText());
            mod.setEsc_5(jTextFieldEsc_5.getText());
            mod.setEsc_6(jTextFieldEsc_6.getText());
            mod.setComen(jTextFieldComen.getText());
            mod.setData_l(dtHoje);
            mod.setHora(jFormattedTextHora.getText());
            control.salvar(mod);

            // jTextFieldTipoChamado.setText("");
            jTextFieldGrupoSolucionador.setText("");
            jFormattedDataLigacao.setText("");
            jTextFieldEsc_1.setText("");
            jTextFieldEsc_2.setText("");
            jTextFieldEsc_3.setText("");
            jTextFieldEsc_4.setText("");
            jTextFieldEsc_5.setText("");

            // jTextFieldTipoChamado.setEnabled(false);
            jTextFieldGrupoSolucionador.setEnabled(false);
            jFormattedDataLigacao.setEnabled(false);
            jTextFieldEsc_1.setEnabled(false);
            jTextFieldEsc_2.setEnabled(false);
            jTextFieldEsc_3.setEnabled(false);
            jTextFieldEsc_4.setEnabled(false);
            jTextFieldEsc_5.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            //   jButtonExcluir.setEnabled(false);
            jButtonNovo.setEnabled(true);

            preencherTabela("select *from escalonamento order by cod_g asc");

        } else {
            mod.setCod_g(Integer.parseInt(jtCOD.getText()));
            mod.setGrupo(jTextFieldGrupoSolucionador.getText());

            mod.setEsc_1(jTextFieldEsc_1.getText());
            mod.setEsc_2(jTextFieldEsc_2.getText());
            mod.setEsc_3(jTextFieldEsc_3.getText());
            mod.setEsc_4(jTextFieldEsc_4.getText());
            mod.setEsc_5(jTextFieldEsc_5.getText());
            mod.setEsc_6(jTextFieldEsc_6.getText());
            mod.setComen(jTextFieldComen.getText());
            mod.setData_l(jFormattedDataLigacao.getText());
            mod.setHora(jFormattedTextHora.getText());
            control.editar(mod);

            jTextFieldGrupoSolucionador.setText("");
            jFormattedDataLigacao.setText("");
            jTextFieldEsc_1.setText("");
            jTextFieldEsc_2.setText("");
            jTextFieldEsc_3.setText("");
            jTextFieldEsc_4.setText("");
            jTextFieldEsc_5.setText("");
            jTextFieldEsc_6.setText("");
            jTextFieldComen.setText("");

            jTextFieldGrupoSolucionador.setEnabled(false);

            jFormattedDataLigacao.setEnabled(false);
            jTextFieldEsc_1.setEnabled(false);
            jTextFieldEsc_2.setEnabled(false);
            jTextFieldEsc_3.setEnabled(false);
            jTextFieldEsc_4.setEnabled(false);
            jTextFieldEsc_5.setEnabled(false);
            jTextFieldEsc_6.setEnabled(true);
            jTextFieldComen.setEnabled(true);

            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);

            preencherTabela("select *from escalonamento order by cod_g asc");

        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;

        jTextFieldGrupoSolucionador.setEnabled(true);

        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(true);
        jTextFieldEsc_2.setEnabled(true);
        jTextFieldEsc_3.setEnabled(true);
        jTextFieldEsc_4.setEnabled(true);
        jTextFieldEsc_5.setEnabled(true);
        jTextFieldEsc_6.setEnabled(true);
        jTextFieldComen.setEnabled(true);
        jtCOD.setText("");

        //jTextFieldTipoChamado.setText("");
        jTextFieldGrupoSolucionador.setText("");

        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldEsc_6.setText("");
        jTextFieldComen.setText("");
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        jFormattedDataLigacao.setText(dtHoje);

        preencherTabela("select *from escalonamento order by cod_g asc");

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;

        jTextFieldGrupoSolucionador.setEnabled(true);

        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(true);
        jTextFieldEsc_2.setEnabled(true);
        jTextFieldEsc_3.setEnabled(true);
        jTextFieldEsc_4.setEnabled(true);
        jTextFieldEsc_5.setEnabled(true);
        jTextFieldEsc_6.setEnabled(true);

        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        //  jButtonExcluir.setEnabled(false);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTableEscalonamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEscalonamentoMouseClicked

        String cod_g = "" + jTableEscalonamento.getValueAt(jTableEscalonamento.getSelectedRow(), 0);   //o que for selecionado na table
        conex.conexao();
        conex.executaSql("select *from escalonamento where cod_g='" + cod_g + "'");
        try {
            conex.rs.first();                                                                      // primeiro do banco
            jtCOD.setText(String.valueOf(conex.rs.getInt("cod_g")));
            jTextFieldGrupoSolucionador.setText(conex.rs.getString("grupo"));
            jTextFieldEsc_1.setText(conex.rs.getString("esc_1"));
            jTextFieldEsc_2.setText(conex.rs.getString("esc_2"));
            jTextFieldEsc_3.setText(conex.rs.getString("esc_3"));
            jTextFieldEsc_4.setText(conex.rs.getString("esc_4"));
            jTextFieldEsc_5.setText(conex.rs.getString("esc_5"));
            jTextFieldEsc_6.setText(conex.rs.getString("esc_6"));
            jTextFieldEsc_6.setText(conex.rs.getString("comen"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados\n Erro:  " + ex);
        }
        //   conex.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(true);


    }//GEN-LAST:event_jTableEscalonamentoMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        jTextFieldGrupoSolucionador.setEnabled(false);

        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldEsc_6.setEnabled(false);
        jTextFieldComen.setEnabled(false);

        jtCOD.setText("");

        //    jTextFieldTipoChamado.setText("");
        jTextFieldGrupoSolucionador.setText("");

        jFormattedDataLigacao.setText("");
        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldEsc_6.setText("");
        jTextFieldComen.setText("");

        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        //   jButtonExcluir.setEnabled(false);


    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCod_g(Integer.parseInt(jtCOD.getText()));
            control.excluir(mod);

            jtCOD.setText("");

            jTextFieldGrupoSolucionador.setText("");

            jFormattedDataLigacao.setText("");
            jTextFieldEsc_1.setText("");
            jTextFieldEsc_2.setText("");
            jTextFieldEsc_3.setText("");
            jTextFieldEsc_4.setText("");
            jTextFieldEsc_5.setText("");
            jTextFieldEsc_6.setText("");
            jTextFieldComen.setText("");

            jTextFieldGrupoSolucionador.setEnabled(false);
            jFormattedDataLigacao.setEnabled(false);
            jTextFieldEsc_1.setEnabled(false);
            jTextFieldEsc_2.setEnabled(false);
            jTextFieldEsc_3.setEnabled(false);
            jTextFieldEsc_4.setEnabled(false);
            jTextFieldEsc_5.setEnabled(false);
            jTextFieldEsc_6.setEnabled(false);
            jTextFieldComen.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            //  jButtonExcluir.setEnabled(false);
            preencherTabela("select *from escalonamento order by cod_g asc");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        jFormattedDataLigacao.setText(dtHoje);
        jFormattedTextHora.setText(mostra_hora.hora);

        // CONTADOR DE LINHAS
        int cont = 0;
        for (int i = 0; i < jTableEscalonamento.getRowCount(); i++) {
            cont++;
        }
        jLabel21.setText("" + cont);

    }//GEN-LAST:event_timer1OnTime

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        conex.conexao();
        Connection con = ConexaoBD.con;
        try {
            // JasperPrint print = JasperFillManager.fillReport("Rel/Gerlaine/RelGerlaine.jasper",null,con);

            //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
            JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Escalonamento/RelEscalonamento.jasper", null, con);    //hotname da maquina 

            JasperViewer.viewReport(print, false);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSalvarKeyPressed
        jButtonSalvar.doClick();
    }//GEN-LAST:event_jButtonSalvarKeyPressed

    private void jButtonPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisar1ActionPerformed
        mod.setPesquisa(jTextFieldPesquisaChamado.getText());

        BeansEscalonamento model = control.buscaChamado(mod);

        jtCOD.setText(String.valueOf(model.getCod_g()));
        jTextFieldGrupoSolucionador.setText(model.getGrupo());
        jFormattedDataLigacao.setText(model.getData_l());
        jTextFieldEsc_1.setText(model.getEsc_1());
        jTextFieldEsc_2.setText(model.getEsc_2());
        jTextFieldEsc_3.setText(model.getEsc_3());
        jTextFieldEsc_4.setText(model.getEsc_4());
        jTextFieldEsc_5.setText(model.getEsc_5());
        jTextFieldEsc_6.setText(model.getEsc_5());
        jTextFieldComen.setText(model.getEsc_5());

        jTextFieldGrupoSolucionador.setEnabled(false);
        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldEsc_6.setEnabled(false);
        jTextFieldComen.setEnabled(false);

        jButtonEditar.setEnabled(true);
        //  jButtonExcluir.setEnabled(true);

        if (jTextFieldPesquisaChamado.getText().isEmpty()) {
            preencherTabela("select *from escalonamento order by cod_g asc");
        } else {
            preencherTabela("select *from escalonamento where grupo like'%" + mod.getPesquisa() + "%'"); // BUSCA ESPECIFICA
        }
    }//GEN-LAST:event_jButtonPesquisar1ActionPerformed

    private void jTextFieldEsc_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEsc_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEsc_1ActionPerformed

    private void jFormattedDataLigacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedDataLigacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedDataLigacaoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAcionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormAcionamento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedDataLigacao;
    private javax.swing.JFormattedTextField jFormattedTextHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEscalonamento;
    private javax.swing.JTextField jTextFieldComen;
    private javax.swing.JTextField jTextFieldEsc_1;
    private javax.swing.JTextField jTextFieldEsc_2;
    private javax.swing.JTextField jTextFieldEsc_3;
    private javax.swing.JTextField jTextFieldEsc_4;
    private javax.swing.JTextField jTextFieldEsc_5;
    private javax.swing.JTextField jTextFieldEsc_6;
    private javax.swing.JTextField jTextFieldGrupoSolucionador;
    private javax.swing.JTextField jTextFieldPesquisaChamado;
    private javax.swing.JTextField jtCOD;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
