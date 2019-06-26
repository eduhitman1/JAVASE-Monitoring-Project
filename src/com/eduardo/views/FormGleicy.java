package com.eduardo.views;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import com.eduardo.domain.Hora;
import com.eduardo.domain.ModeloTabela;
import com.eduardo.connection.ConexaoBD;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import com.eduardo.domain.BeansGleicy;
import com.eduardo.controllers.DaoGleicy;

/**
 * @author EDUARDO HENRIQUE GONÇALVES MATIAS
 */
public class FormGleicy extends javax.swing.JFrame {

    BeansGleicy mod = new BeansGleicy();
    DaoGleicy control = new DaoGleicy();

    ConexaoBD conex = new ConexaoBD();
    String dtHoje;
    String status;
    int flag = 0;

    public FormGleicy(String usuario) {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_login.png")).getImage());
        conex.conexao();
        preencherTabela("select *from gleicy order by cod_c asc");
        jLabelUsuario.setText(usuario);
        Calendar data = Calendar.getInstance();  // instacis da calendario
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(d);
        dtHoje = dateFormat.format(d);
        jLabelData.setText(dtHoje);
        Hora mostra_hora = new Hora();  // a linha baixo exive a hora atual no sismtea
        mostra_hora.ler_hora();
        timer1.start();
        jTextFieldDataEmail.setEnabled(false);

    }

    private FormGleicy() {
    }

    public void CorVermelhaTra() {
        jTableChamado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasToous, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasToous, row, column);
                if (value.equals("Pendente")) {
                    setForeground(Color.RED);
                }
                return label;
            }
        });
    }

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();   // instancia da arraylist
        String[] colunas;   // recebe o nomes das colunas
        colunas = new String[]{"id", "Nº Chamado", "Tratativa do Chamado", "Ferramenta", "Tipo: Chamado", "Status: Chamado", "Grupo Solucionador", "Sumário", "Data de E-mail", "Data da ligação", "1°Escalonamento", "2ºEscalonamento", "3ºEscalonamento", "4º Escalonamento", "Observações N1", "Data de Solução", "Hora", "Analista"};
        conex.conexao();
        conex.executaSql(Sql);
        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getString("cod_c"),
                    conex.rs.getString("num_c"),
                    conex.rs.getString("tipofor_c"),
                    conex.rs.getString("tipofer_c"),
                    conex.rs.getString("tipo_c"),
                    conex.rs.getString("Status_c"),
                    conex.rs.getString("grupo_c"),
                    conex.rs.getString("sumario_c"),
                    conex.rs.getString("data_email"),
                    conex.rs.getString("data_l"),
                    conex.rs.getString("esc_1"),
                    conex.rs.getString("esc_2"),
                    conex.rs.getString("esc_3"),
                    conex.rs.getString("esc_4"),
                    conex.rs.getString("esc_5"),
                    conex.rs.getString("data_s"),
                    conex.rs.getString("hora"),
                    conex.rs.getString("tipoana_c")});
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busca por outro chamado para preencher tabela");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);  // quantidade de linhas e colunas
        jTableChamado.setModel(modelo);                                 // passando modelo da tabela
        jTableChamado.getColumnModel().getColumn(0).setPreferredWidth(20);   //tamanha da tabela, começa do zero, espaço da coluna
        jTableChamado.getColumnModel().getColumn(0).setResizable(false);     // desabilidado para redimensionar
        jTableChamado.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTableChamado.getColumnModel().getColumn(1).setResizable(false);
        jTableChamado.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTableChamado.getColumnModel().getColumn(2).setResizable(false);
        jTableChamado.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTableChamado.getColumnModel().getColumn(3).setResizable(false);
        jTableChamado.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTableChamado.getColumnModel().getColumn(4).setResizable(false);
        jTableChamado.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableChamado.getColumnModel().getColumn(5).setResizable(false);
        jTableChamado.getColumnModel().getColumn(6).setPreferredWidth(150);
        jTableChamado.getColumnModel().getColumn(6).setResizable(false);
        jTableChamado.getColumnModel().getColumn(7).setPreferredWidth(220);
        jTableChamado.getColumnModel().getColumn(7).setResizable(false);
        jTableChamado.getColumnModel().getColumn(8).setPreferredWidth(90);
        jTableChamado.getColumnModel().getColumn(8).setResizable(false);
        jTableChamado.getColumnModel().getColumn(9).setPreferredWidth(90);
        jTableChamado.getColumnModel().getColumn(9).setResizable(false);
        jTableChamado.getColumnModel().getColumn(10).setPreferredWidth(110);
        jTableChamado.getColumnModel().getColumn(10).setResizable(false);
        jTableChamado.getColumnModel().getColumn(11).setPreferredWidth(110);
        jTableChamado.getColumnModel().getColumn(11).setResizable(false);
        jTableChamado.getColumnModel().getColumn(12).setPreferredWidth(110);
        jTableChamado.getColumnModel().getColumn(12).setResizable(false);
        jTableChamado.getColumnModel().getColumn(13).setPreferredWidth(50);
        jTableChamado.getColumnModel().getColumn(13).setResizable(false);
        jTableChamado.getColumnModel().getColumn(14).setPreferredWidth(70);
        jTableChamado.getColumnModel().getColumn(14).setResizable(false);
        jTableChamado.getColumnModel().getColumn(15).setPreferredWidth(90);
        jTableChamado.getColumnModel().getColumn(15).setResizable(false);
        jTableChamado.getTableHeader().setReorderingAllowed(false); // desabilitado para reodenar
        jTableChamado.setAutoResizeMode(jTableChamado.AUTO_RESIZE_OFF); // desabilidata para redimensionar a tabela
        jTableChamado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // apenas seleciona um dado por vez
        //  CorVermelhaTra();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNumChamado = new javax.swing.JTextField();
        jTextFieldGrupoSolucionador = new javax.swing.JTextField();
        jTextFieldSumario = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jtCOD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableChamado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox();
        jComboBoxStatus = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxTipofer = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxTipoForm = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jButtonPesquisaEsc = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxTipoAnalista = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jFormattedDataLigacao = new javax.swing.JFormattedTextField();
        jTextFieldEsc_1 = new javax.swing.JTextField();
        jTextFieldEsc_2 = new javax.swing.JTextField();
        jTextFieldEsc_3 = new javax.swing.JTextField();
        jTextFieldEsc_4 = new javax.swing.JTextField();
        jTextFieldEsc_5 = new javax.swing.JTextField();
        jTextFieldData_s = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldPesquisaChamado = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButtonPesquisaEsp = new javax.swing.JButton();
        jTextFieldDataEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextHora = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBenvindo = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuSair1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemEnfermeira3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemSair1 = new javax.swing.JMenuItem();
        jMenuItemTelaBenvindo1 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemEnfermeira2 = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service Desk Manager");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldNumChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumChamadoActionPerformed(evt);
            }
        });

        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldGrupoSolucionador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGrupoSolucionadorActionPerformed(evt);
            }
        });

        jTextFieldSumario.setEnabled(false);

        jButtonSalvar.setBackground(new java.awt.Color(248, 248, 248));
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

        jButtonNovo.setBackground(new java.awt.Color(248, 248, 248));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn-novo.png"))); // NOI18N
        jButtonNovo.setText("Novo Chamado");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jtCOD.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Serial:");

        jButtonEditar.setBackground(new java.awt.Color(248, 248, 248));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        jButtonEditar.setText("Editar ");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setBackground(new java.awt.Color(248, 248, 248));
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisa Chamado");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableChamado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableChamado.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTableChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableChamadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableChamado);

        jLabel2.setText("Nº Chamado");

        jLabel3.setText("Tipo: Chamado");

        jLabel4.setText("Grupo Solucionador");

        jLabel5.setText("Sumário");

        jLabel6.setText("Data da Ligação");

        jLabel7.setText("1º Escalonamento ");

        jLabel8.setText("2º Escalonamento ");

        jLabel9.setText("3º Escalonamento ");

        jLabel10.setText("4º Escalonamento ");

        jLabel11.setText("Data da solução");

        jButtonCancelar.setBackground(new java.awt.Color(248, 248, 248));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel icon.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(248, 248, 248));
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn-excluir.png"))); // NOI18N
        jButtonExcluir.setText("Deleta Chamado");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incidente", "Solicitação", "Orientação", "Queda de Ligação", "Request", "Task", "Call" }));
        jComboBoxTipo.setEnabled(false);

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Direcionado", "Aberto", "Reaberto", "Pendente Usuário", "Pendente Fornecedor", "Em analise", "Analisado", "Agendado", "Pendende Cliente", "Aguardando Correção", "Aguardando Orçamento", "Aguardando Aprovação", "Aguardando Peças", "Rejeitada", "Em Trabalho", "Em Transito", "Encerrado", "Resolvido" }));
        jComboBoxStatus.setEnabled(false);

        jLabel13.setText("Status Chamado");

        jComboBoxTipofer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CA", "CA - Novo", "WebSan", "PA", "E-mail", "Queda De Ligação" }));
        jComboBoxTipofer.setEnabled(false);
        jComboBoxTipofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoferActionPerformed(evt);
            }
        });

        jLabel15.setText("Tipo: Ferramenta");

        jComboBoxTipoForm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Consulta", "Pendente", "Acima 4 ºEscalonamento", "Resolvido", "Transferência", "Queda de Ligação" }));
        jComboBoxTipoForm.setEnabled(false);
        jComboBoxTipoForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoFormActionPerformed(evt);
            }
        });

        jLabel16.setText("Status: Tratativa");

        jButtonPesquisaEsc.setBackground(new java.awt.Color(248, 248, 248));
        jButtonPesquisaEsc.setText("Pesquisa de Tratativa");
        jButtonPesquisaEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaEscActionPerformed(evt);
            }
        });

        jLabel17.setText("Observações");

        jComboBoxTipoAnalista.setBackground(new java.awt.Color(250, 250, 250));
        jComboBoxTipoAnalista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gleicy Vilaça" }));

        jLabel18.setText("Analista:");

        try {
            jFormattedDataLigacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedDataLigacao.setEnabled(false);

        jTextFieldEsc_1.setEnabled(false);

        jTextFieldEsc_2.setEnabled(false);

        jTextFieldEsc_3.setEnabled(false);

        jTextFieldEsc_4.setEnabled(false);

        jTextFieldEsc_5.setEnabled(false);

        jTextFieldData_s.setEnabled(false);

        jLabel21.setText("X");

        jLabel22.setText("Quantidade de chamados:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Busca por chamado:");

        jButtonPesquisaEsp.setBackground(new java.awt.Color(248, 248, 248));
        jButtonPesquisaEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/data.png"))); // NOI18N
        jButtonPesquisaEsp.setText("Pesquisa Especifica");
        jButtonPesquisaEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaEspActionPerformed(evt);
            }
        });

        jTextFieldDataEmail.setEnabled(false);

        jLabel14.setText("Data/hora do E-mail");

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jButton1.setText("Relatório de E-mails");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(248, 248, 248));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo-menu-2.png"))); // NOI18N
        jButton2.setText("Relatório CH. Acima do 4º escalonamento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelUsuario.setText("jLabelUsuario");

        jLabel25.setText("Usuário logado:");

        jRadioButton1.setBackground(new java.awt.Color(248, 248, 248));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("attendance");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(248, 248, 248));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("email");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jButtonNovo)
                                    .addComponent(jLabel2)
                                    .addComponent(jFormattedDataLigacao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextFieldEsc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jTextFieldEsc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNumChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxTipofer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel4)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel5)
                                        .addGap(146, 146, 146)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel10)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(jTextFieldEsc_4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldEsc_5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldData_s, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipoForm, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldPesquisaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonPesquisar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jButtonPesquisaEsc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTipoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldEsc_3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldGrupoSolucionador, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSumario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDataEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPesquisaEsp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonNovo)
                                    .addComponent(jLabel18)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumChamado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldSumario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldGrupoSolucionador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxTipofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldDataEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTipoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTipoForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedDataLigacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEsc_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEsc_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEsc_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEsc_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEsc_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldData_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonPesquisaEsc, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPesquisar)
                            .addComponent(jTextFieldPesquisaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jButtonPesquisaEsp)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonCancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabel25))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("CALL MANAGEMENT");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelData.setText("jLabel19");

        jLabel19.setText("Data de Hoje:");

        try {
            jFormattedTextHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextHora.setEnabled(false);

        jLabel20.setText("Horário de Brasilia:");

        jButton3.setBackground(new java.awt.Color(245, 245, 245));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kisspng-computer-icons-internally-displaced-person-desloca-walking-5ad993b5142fb6.1075307315242085650827.jpg"))); // NOI18N
        jButton3.setText("Retorna ao Menu Principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(245, 245, 245));

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/partido-menu-2.png"))); // NOI18N

        jMenuItem13.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon benvindo.png"))); // NOI18N
        jMenuItem13.setText("Sobre");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem13);

        jMenuBar1.add(jMenuCadastro);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBenvindo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItemTelaBenvindo.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItemTelaBenvindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chamado.png"))); // NOI18N
        jMenuItemTelaBenvindo.setText("Bem -vindos: Gerenciamento ");
        jMenuItemTelaBenvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenvindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBenvindo);

        jMenuItem10.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon CA.png"))); // NOI18N
        jMenuItem10.setText("CA - Service Desk");
        jMenuFerramentas.add(jMenuItem10);

        jMenuItem11.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon user.png"))); // NOI18N
        jMenuItem11.setText("Escalonamento NET");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItem11);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair1.setText("Atalhos");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/data.png"))); // NOI18N
        jMenuItem2.setText("Pesquisa Especifica");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuSair1.add(jMenuItem2);

        jMenuItemEnfermeira3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEnfermeira3.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItemEnfermeira3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn-novo.png"))); // NOI18N
        jMenuItemEnfermeira3.setText("Novo Chamado");
        jMenuItemEnfermeira3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnfermeira3ActionPerformed(evt);
            }
        });
        jMenuSair1.add(jMenuItemEnfermeira3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        jMenuItem1.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn-salvar.png"))); // NOI18N
        jMenuItem1.setText("Salvar Chamado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSair1.add(jMenuItem1);

        jMenuItemSair1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair1.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItemSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel icon.png"))); // NOI18N
        jMenuItemSair1.setText("Cancelar ação");
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
        jMenuSair1.add(jMenuItemSair1);

        jMenuItemTelaBenvindo1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItemTelaBenvindo1.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItemTelaBenvindo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chamado.png"))); // NOI18N
        jMenuItemTelaBenvindo1.setText("Retorna ao Menu");
        jMenuItemTelaBenvindo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenvindo1ActionPerformed(evt);
            }
        });
        jMenuSair1.add(jMenuItemTelaBenvindo1);

        jMenuBar1.add(jMenuSair1);

        jMenuSair.setText("Logout");

        jMenuItemEnfermeira2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEnfermeira2.setBackground(new java.awt.Color(245, 245, 245));
        jMenuItemEnfermeira2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kisspng-computer-icons-internally-displaced-person-desloca-walking-5ad993b5142fb6.1075307315242085650827.jpg"))); // NOI18N
        jMenuItemEnfermeira2.setText("Logout");
        jMenuItemEnfermeira2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnfermeira2ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemEnfermeira2);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelData)
                            .addComponent(jLabel19))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1229, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumChamadoActionPerformed

    }//GEN-LAST:event_jTextFieldNumChamadoActionPerformed

    private void jTextFieldGrupoSolucionadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGrupoSolucionadorActionPerformed

    }//GEN-LAST:event_jTextFieldGrupoSolucionadorActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNumChamado.getText().isEmpty()) {   // campo não pode está vazio
            JOptionPane.showMessageDialog(null, "Preenchar o Nºchamado para continua:");
            jTextFieldNumChamado.requestFocus(); //foca na variavel
        } else if (jTextFieldGrupoSolucionador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar grupo solucionador");
            jTextFieldGrupoSolucionador.requestFocus();
        } else if (jComboBoxTipoAnalista.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo analista");
            jComboBoxTipoAnalista.requestFocus();
        } else if (jComboBoxTipoForm.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Preemchar o campo de trativa");
            jComboBoxTipoForm.requestFocus();
        } else if (flag == 1) {
            mod.setNum_c(jTextFieldNumChamado.getText());
            mod.setTipofer_c((String) jComboBoxTipofer.getSelectedItem());
            mod.setTipo_c((String) jComboBoxTipo.getSelectedItem());
            mod.setStatus_c((String) jComboBoxStatus.getSelectedItem());
            mod.setGrupo_c(jTextFieldGrupoSolucionador.getText());
            mod.setSumario_c(jTextFieldSumario.getText());
            mod.setData_l(dtHoje.toString()); //mod.setData_l(jFormattedDataLigacao.getDate(dtHoje.toString()));

            mod.setEsc_1(jTextFieldEsc_1.getText());
            mod.setEsc_2(jTextFieldEsc_2.getText());
            mod.setEsc_3(jTextFieldEsc_3.getText());
            mod.setEsc_4(jTextFieldEsc_4.getText());
            mod.setEsc_5(jTextFieldEsc_5.getText());
            mod.setData_s(jTextFieldData_s.getText());
            mod.setTipofor_c((String) jComboBoxTipoForm.getSelectedItem());
            mod.setTipoAna_c((String) jComboBoxTipoAnalista.getSelectedItem());
            mod.setHora(jFormattedTextHora.getText());
            mod.setData_email(jTextFieldDataEmail.getText());
            control.salvar(mod);

            jTextFieldNumChamado.setText("");
            // jTextFieldTipoChamado.setText("");
            jTextFieldGrupoSolucionador.setText("");
            jTextFieldSumario.setText("");
            jFormattedDataLigacao.setText("");
            jTextFieldEsc_1.setText("");
            jTextFieldEsc_2.setText("");
            jTextFieldEsc_3.setText("");
            jTextFieldEsc_4.setText("");
            jTextFieldEsc_5.setText("");
            jTextFieldData_s.setText("");
            jTextFieldDataEmail.setText("");

            //jTextFieldTipoChamado.setEnabled(false);
            jComboBoxTipoForm.setEnabled(true);
            jComboBoxTipo.setEnabled(false);
            jComboBoxTipofer.setEnabled(false);
            jComboBoxStatus.setEnabled(false);

            jTextFieldGrupoSolucionador.setEnabled(false);
            jTextFieldSumario.setEnabled(false);
            jFormattedDataLigacao.setEnabled(false);
            jTextFieldEsc_1.setEnabled(false);
            jTextFieldEsc_2.setEnabled(false);
            jTextFieldEsc_3.setEnabled(false);
            jTextFieldEsc_4.setEnabled(false);
            jTextFieldEsc_5.setEnabled(false);
            jTextFieldData_s.setEnabled(false);
            jTextFieldDataEmail.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jComboBoxTipoForm.setEnabled(true);
            preencherTabela("select *from gleicy order by cod_c asc");
        } else {
            mod.setCod_c(Integer.parseInt(jtCOD.getText()));
            mod.setNum_c(jTextFieldNumChamado.getText());
            mod.setTipofer_c((String) jComboBoxTipofer.getSelectedItem());
            mod.setTipo_c((String) jComboBoxTipo.getSelectedItem());
            mod.setStatus_c((String) jComboBoxStatus.getSelectedItem());
            mod.setGrupo_c(jTextFieldGrupoSolucionador.getText());
            mod.setSumario_c(jTextFieldSumario.getText());
            mod.setData_l(jFormattedDataLigacao.getText());
            mod.setEsc_1(jTextFieldEsc_1.getText());
            mod.setEsc_2(jTextFieldEsc_2.getText());
            mod.setEsc_3(jTextFieldEsc_3.getText());
            mod.setEsc_4(jTextFieldEsc_4.getText());
            mod.setEsc_5(jTextFieldEsc_5.getText());
            mod.setData_s(jTextFieldData_s.getText());
            mod.setTipofor_c((String) jComboBoxTipoForm.getSelectedItem());
            mod.setTipoAna_c((String) jComboBoxTipoAnalista.getSelectedItem());
            mod.setData_email(jTextFieldDataEmail.getText());
            control.editar(mod);

            jTextFieldNumChamado.setText("");
            jTextFieldGrupoSolucionador.setText("");
            jTextFieldSumario.setText("");
            jFormattedDataLigacao.setText("");
            jTextFieldEsc_1.setText("");
            jTextFieldEsc_2.setText("");
            jTextFieldEsc_3.setText("");
            jTextFieldEsc_4.setText("");
            jTextFieldEsc_5.setText("");
            jTextFieldData_s.setText("");

            jComboBoxTipoForm.setEnabled(false);
            jComboBoxTipofer.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jComboBoxStatus.setEnabled(false);
            jTextFieldGrupoSolucionador.setEnabled(false);
            jTextFieldSumario.setEnabled(false);
            jFormattedDataLigacao.setEnabled(false);
            jTextFieldEsc_1.setEnabled(false);
            jTextFieldEsc_2.setEnabled(false);
            jTextFieldEsc_3.setEnabled(false);
            jTextFieldEsc_4.setEnabled(false);
            jTextFieldEsc_5.setEnabled(false);
            jTextFieldData_s.setEnabled(false);
            jTextFieldDataEmail.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jTextFieldNumChamado.setEnabled(true);
            preencherTabela("select *from gleicy order by cod_c asc");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldNumChamado.setEnabled(true);
        //jTextFieldTipoChamado.setEnabled(true);
        jComboBoxTipoForm.setEnabled(true);
        jComboBoxTipofer.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jComboBoxStatus.setEnabled(true);

        jTextFieldGrupoSolucionador.setEnabled(true);
        jTextFieldSumario.setEnabled(true);
        jFormattedDataLigacao.setEnabled(true);
        jTextFieldEsc_1.setEnabled(true);
        jTextFieldEsc_2.setEnabled(true);
        jTextFieldEsc_3.setEnabled(true);
        jTextFieldEsc_4.setEnabled(true);
        jTextFieldEsc_5.setEnabled(true);
        jTextFieldData_s.setEnabled(true);

        jtCOD.setText("");
        jTextFieldNumChamado.setText("");
        //jTextFieldTipoChamado.setText("");
        jTextFieldGrupoSolucionador.setText("");
        jTextFieldSumario.setText("");

        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldData_s.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisaEsc.setEnabled(false);
        jFormattedDataLigacao.setText(dtHoje.toString());
        preencherTabela("select *from gleicy order by cod_c asc");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldNumChamado.setEnabled(false);
        //jTextFieldTipoChamado.setEnabled(true);
        jComboBoxTipoForm.setEnabled(true);
        jComboBoxTipofer.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jComboBoxStatus.setEnabled(true);

        jTextFieldGrupoSolucionador.setEnabled(true);
        jTextFieldSumario.setEnabled(true);
        jFormattedDataLigacao.setEnabled(true);
        jTextFieldEsc_1.setEnabled(true);
        jTextFieldEsc_2.setEnabled(true);
        jTextFieldEsc_3.setEnabled(true);
        jTextFieldEsc_4.setEnabled(true);
        jTextFieldEsc_5.setEnabled(true);
        jTextFieldData_s.setEnabled(true);
        jTextFieldDataEmail.setEnabled(true);

        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisaChamado.getText());
        BeansGleicy model = control.buscaChamado(mod);

        jtCOD.setText(String.valueOf(model.getCod_c()));
        jTextFieldNumChamado.setText(model.getNum_c());
        //jTextFieldTipoChamado.setText(model.getTipo_c());
        jComboBoxTipofer.setSelectedItem(model.getTipofer_c());
        jComboBoxTipoForm.setSelectedItem(model.getTipofor_c());
        jComboBoxTipoAnalista.setSelectedItem(model.getTipoAna_c());
        jComboBoxTipo.setSelectedItem(model.getTipo_c());
        jComboBoxStatus.setSelectedItem(model.getStatus_c());
        jTextFieldGrupoSolucionador.setText(model.getGrupo_c());
        jTextFieldSumario.setText(model.getSumario_c());
        jFormattedDataLigacao.setText(model.getData_l());
        jTextFieldEsc_1.setText(model.getEsc_1());
        jTextFieldEsc_2.setText(model.getEsc_2());
        jTextFieldEsc_3.setText(model.getEsc_3());
        jTextFieldEsc_4.setText(model.getEsc_4());
        jTextFieldEsc_5.setText(model.getEsc_5());
        jTextFieldData_s.setText(model.getData_s());
        jTextFieldDataEmail.setText(model.getData_email());

        jTextFieldNumChamado.setEnabled(true);
        jComboBoxTipoForm.setEnabled(false);
        jComboBoxTipofer.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jComboBoxStatus.setEnabled(false);

        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldSumario.setEnabled(false);
        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldData_s.setEnabled(false);

        jButtonEditar.setEnabled(true);
        //jButtonExcluir.setEnabled(true);
        if (jTextFieldPesquisaChamado.getText().isEmpty()) {
            preencherTabela("select *from gleicy order by cod_c asc");
        } else {
            preencherTabela("select *from gleicy where num_c  like'%" + mod.getPesquisa() + "%'"); // BUSCA ESPECIFICA
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableChamadoMouseClicked
        String cod_c = "" + jTableChamado.getValueAt(jTableChamado.getSelectedRow(), 0);   //o que for selecionado na table
        conex.conexao();
        conex.executaSql("select *from gleicy where cod_c='" + cod_c + "'");
        try {
            conex.rs.first();                                                                      // primeiro do banco
            jtCOD.setText(String.valueOf(conex.rs.getInt("cod_c")));
            jTextFieldNumChamado.setText(conex.rs.getString("num_c"));
            jComboBoxTipofer.setSelectedItem(conex.rs.getString("tipofer_c"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("tipo_c"));
            jComboBoxStatus.setSelectedItem(conex.rs.getString("status_c"));
            jTextFieldGrupoSolucionador.setText(conex.rs.getString("grupo_c"));
            jTextFieldSumario.setText(conex.rs.getString("sumario_c"));
            jTextFieldDataEmail.setText(conex.rs.getString("data_email"));
            jFormattedDataLigacao.setText(conex.rs.getString("data_l"));
            jTextFieldEsc_1.setText(conex.rs.getString("esc_1"));
            jTextFieldEsc_2.setText(conex.rs.getString("esc_2"));
            jTextFieldEsc_3.setText(conex.rs.getString("esc_3"));
            jTextFieldEsc_4.setText(conex.rs.getString("esc_4"));
            jTextFieldEsc_5.setText(conex.rs.getString("esc_5"));
            jTextFieldData_s.setText(conex.rs.getString("data_s"));
            jComboBoxTipoForm.setSelectedItem(conex.rs.getString("tipofor_c"));
            jComboBoxTipoAnalista.setSelectedItem(conex.rs.getString("tipoana_c"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados\n Erro:  " + ex);
        }
        jButtonEditar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jComboBoxTipoForm.setEnabled(true);
        jButtonPesquisaEsc.setEnabled(true);

        jTextFieldNumChamado.setEnabled(true);
        jComboBoxTipofer.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jComboBoxStatus.setEnabled(false);
        jComboBoxTipoForm.setEnabled(true);
        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldSumario.setEnabled(false);
        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldData_s.setEnabled(false);
        jTextFieldDataEmail.setEnabled(false);

    }//GEN-LAST:event_jTableChamadoMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNumChamado.setEnabled(true);
        jComboBoxTipofer.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jComboBoxStatus.setEnabled(false);
        jComboBoxTipoForm.setEnabled(false);
        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldSumario.setEnabled(false);
        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldData_s.setEnabled(false);
        jTextFieldDataEmail.setEnabled(false);

        jtCOD.setText("");
        jTextFieldNumChamado.setText("");
        //jTextFieldTipoChamado.setText("");
        jTextFieldGrupoSolucionador.setText("");
        jTextFieldSumario.setText("");
        jFormattedDataLigacao.setText("");
        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldData_s.setText("");

        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        //jButtonExcluir.setEnabled(false);
        jButtonPesquisaEsc.setEnabled(true);
        jComboBoxTipoForm.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        try {
            conex.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conex.rs.first();
            if (conex.rs.getString("usu_tipo").equals("administrador")) {

                resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir");
                if (resposta == JOptionPane.YES_OPTION) {
                    mod.setCod_c(Integer.parseInt(jtCOD.getText()));
                    control.excluir(mod);

                    jtCOD.setText("");
                    jTextFieldNumChamado.setText("");
                    jTextFieldGrupoSolucionador.setText("");
                    jTextFieldSumario.setText("");
                    jFormattedDataLigacao.setText("");
                    jTextFieldEsc_1.setText("");
                    jTextFieldEsc_2.setText("");
                    jTextFieldEsc_3.setText("");
                    jTextFieldEsc_4.setText("");
                    jTextFieldEsc_5.setText("");
                    jTextFieldData_s.setText("");

                    jTextFieldNumChamado.setEnabled(true);
                    jComboBoxTipofer.setEnabled(false);
                    jComboBoxTipo.setEnabled(false);
                    jComboBoxStatus.setEnabled(false);
                    jComboBoxTipoForm.setEnabled(false);
                    jTextFieldGrupoSolucionador.setEnabled(false);
                    jTextFieldSumario.setEnabled(false);
                    jFormattedDataLigacao.setEnabled(false);
                    jTextFieldEsc_1.setEnabled(false);
                    jTextFieldEsc_2.setEnabled(false);
                    jTextFieldEsc_3.setEnabled(false);
                    jTextFieldEsc_4.setEnabled(false);
                    jTextFieldEsc_5.setEnabled(false);
                    jTextFieldData_s.setEnabled(false);

                    jButtonSalvar.setEnabled(false);
                    jButtonNovo.setEnabled(true);
                    jButtonCancelar.setEnabled(false);
                    jButtonEditar.setEnabled(false);
                    jButtonExcluir.setEnabled(false);
                    preencherTabela("select *from gleicy order by cod_c asc");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Acesso somente para o Titular ou Administrador, contate o administrador!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Acesso somente o Titular ou o Administrador, contate o administrador!!\n Erro: " + ex);
        }
        jtCOD.setText("");
        jTextFieldNumChamado.setText("");
        jTextFieldGrupoSolucionador.setText("");
        jTextFieldSumario.setText("");
        jFormattedDataLigacao.setText("");
        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldData_s.setText("");

        jTextFieldNumChamado.setEnabled(true);
        jComboBoxTipofer.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jComboBoxStatus.setEnabled(false);
        jComboBoxTipoForm.setEnabled(false);
        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldSumario.setEnabled(false);
        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldData_s.setEnabled(false);

        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        preencherTabela("select *from gleicy order by cod_c asc");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jComboBoxTipoFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoFormActionPerformed

    }//GEN-LAST:event_jComboBoxTipoFormActionPerformed

    private void jButtonPesquisaEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaEscActionPerformed
        mod.setPesquisa(jComboBoxTipoForm.getSelectedItem().toString());
        BeansGleicy model = control.buscaChamado(mod);

        jtCOD.setText(String.valueOf(model.getCod_c()));
        jTextFieldNumChamado.setText(model.getNum_c());
        jComboBoxTipofer.setSelectedItem(model.getTipofer_c());
        jComboBoxTipoForm.setSelectedItem(model.getTipofor_c());
        jComboBoxTipoAnalista.setSelectedItem(model.getTipoAna_c());
        jComboBoxTipo.setSelectedItem(model.getTipo_c());
        jComboBoxStatus.setSelectedItem(model.getStatus_c());
        jTextFieldGrupoSolucionador.setText(model.getGrupo_c());
        jTextFieldSumario.setText(model.getSumario_c());
        jFormattedDataLigacao.setText(model.getData_l());
        jTextFieldEsc_1.setText(model.getEsc_1());
        jTextFieldEsc_2.setText(model.getEsc_2());
        jTextFieldEsc_3.setText(model.getEsc_3());
        jTextFieldEsc_4.setText(model.getEsc_4());
        jTextFieldEsc_5.setText(model.getEsc_5());
        jTextFieldData_s.setText(model.getData_s());

        jTextFieldNumChamado.setEnabled(true);
        jComboBoxTipoForm.setEnabled(true);
        jComboBoxTipofer.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jComboBoxStatus.setEnabled(false);
        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldSumario.setEnabled(false);
        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldData_s.setEnabled(false);

        jtCOD.setText("");
        jTextFieldNumChamado.setText("");
        jTextFieldGrupoSolucionador.setText("");
        jTextFieldSumario.setText("");
        jFormattedDataLigacao.setText("");
        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldData_s.setText("");
        jButtonEditar.setEnabled(true);
        //jButtonExcluir.setEnabled(true);
        jComboBoxTipoAnalista.setEnabled(true);
        preencherTabela("select *from gleicy where tipofor_c like'%" + mod.getPesquisa() + "%'"); //preencherTabela("select *from gleicy order by cod_c asc");
    }//GEN-LAST:event_jButtonPesquisaEscActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        jFormattedTextHora.setText(mostra_hora.hora);
        int cont = 0;     // CONTADOR DE LINHAS
        for (int i = 0; i < jTableChamado.getRowCount(); i++) {
            cont++;
        }
        jLabel21.setText("" + cont);
    }//GEN-LAST:event_timer1OnTime

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        conex.conexao();
        Connection con = ConexaoBD.con;
        try {
            //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
            JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/Acima4/Gleicy/RelGleicy.jasper", null, con);    //hotname da maquina 
            JasperViewer.viewReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSalvarKeyPressed
        jButtonSalvar.doClick();
    }//GEN-LAST:event_jButtonSalvarKeyPressed

    private void jButtonPesquisaEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaEspActionPerformed
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog(null, "ESCOLHA O METÓDO DE BUSCA:\n\n1 - Pesquisa por Tipo de Ferramenta\n2 - Pesquisa Tipo de Chamado\n3 - Pesquisa por Status de Chamado\n4 - Pesquisa por Grupo Solucionador\n5 - Pesquisa por Data de Ligação\n\n\nDigite a opção: "));
        switch (op) {
            case 1:
                String tipofer;  //mod.setPesquisa(jComboBoxTipofer.getSelectedItem().toString());
                tipofer = JOptionPane.showInputDialog(null, "Digite o tipo de Ferramenta: ");
                mod.setPesquisa(tipofer);
                break;
            case 2:
                String tipo; //mod.setPesquisa(jComboBoxTipo.getSelectedItem().toString());
                tipo = JOptionPane.showInputDialog(null, "Digite o tipo de Chamado: ");
                mod.setPesquisa(tipo);
                break;
            case 3:
                String status;  //mod.setPesquisa(jComboBoxStatus.getSelectedItem().toString());
                status = JOptionPane.showInputDialog(null, "Digite o Status do Chamado: ");
                mod.setPesquisa(status);
                break;
            case 4:
                String grupo; //mod.setPesquisa(jTextFieldGrupoSolucionador.getText());  
                grupo = JOptionPane.showInputDialog(null, "Digite o Grupo Solucionador: ");
                mod.setPesquisa(grupo);
                break;
            case 5:
                String data;
                data = JOptionPane.showInputDialog(null, "Digite a data desejada: ");
                mod.setPesquisa(data);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Nenhuma opção selecionada!");
                preencherTabela("select *from gleicy order by cod_c asc");
                break;
        }
        BeansGleicy model = control.buscaChamado(mod);

        jtCOD.setText(String.valueOf(model.getCod_c()));
        jTextFieldNumChamado.setText(model.getNum_c());
        jComboBoxTipofer.setSelectedItem(model.getTipofer_c());
        jComboBoxTipoForm.setSelectedItem(model.getTipofor_c());
        jComboBoxTipoAnalista.setSelectedItem(model.getTipoAna_c());
        jComboBoxTipo.setSelectedItem(model.getTipo_c());
        jComboBoxStatus.setSelectedItem(model.getStatus_c());
        jTextFieldGrupoSolucionador.setText(model.getGrupo_c());
        jTextFieldSumario.setText(model.getSumario_c());
        jFormattedDataLigacao.setText(model.getData_l());
        jTextFieldEsc_1.setText(model.getEsc_1());
        jTextFieldEsc_2.setText(model.getEsc_2());
        jTextFieldEsc_3.setText(model.getEsc_3());
        jTextFieldEsc_4.setText(model.getEsc_4());
        jTextFieldEsc_5.setText(model.getEsc_5());
        jTextFieldData_s.setText(model.getData_s());
        jTextFieldDataEmail.setText(model.getData_email());

        jTextFieldNumChamado.setEnabled(true);
        jComboBoxTipoForm.setEnabled(true);
        jComboBoxTipofer.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jComboBoxStatus.setEnabled(false);

        jTextFieldGrupoSolucionador.setEnabled(false);
        jTextFieldSumario.setEnabled(false);
        jFormattedDataLigacao.setEnabled(false);
        jTextFieldEsc_1.setEnabled(false);
        jTextFieldEsc_2.setEnabled(false);
        jTextFieldEsc_3.setEnabled(false);
        jTextFieldEsc_4.setEnabled(false);
        jTextFieldEsc_5.setEnabled(false);
        jTextFieldData_s.setEnabled(false);

        jtCOD.setText("");
        jTextFieldNumChamado.setText("");
        jTextFieldGrupoSolucionador.setText("");
        jTextFieldSumario.setText("");
        jFormattedDataLigacao.setText("");
        jTextFieldEsc_1.setText("");
        jTextFieldEsc_2.setText("");
        jTextFieldEsc_3.setText("");
        jTextFieldEsc_4.setText("");
        jTextFieldEsc_5.setText("");
        jTextFieldData_s.setText("");
        jButtonEditar.setEnabled(true);
        //jButtonExcluir.setEnabled(true);
        jComboBoxTipoAnalista.setEnabled(true);

        if (op == 1) {
            preencherTabela("select *from gleicy where tipofer_c like'%" + mod.getPesquisa() + "%'");
        } else if (op == 2) {
            preencherTabela("select *from gleicy where tipo_c like'%" + mod.getPesquisa() + "%'");
        } else if (op == 3) {
            preencherTabela("select *from gleicy where status_c like'%" + mod.getPesquisa() + "%'");
        } else if (op == 4) {
            preencherTabela("select *from gleicy where grupo_c like'%" + mod.getPesquisa() + "%'");
        } else if (op == 5) {
            preencherTabela("select *from gleicy where data_l like'%" + mod.getPesquisa() + "%'");
        }
    }//GEN-LAST:event_jButtonPesquisaEspActionPerformed

    private void jComboBoxTipoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoferActionPerformed

    }//GEN-LAST:event_jComboBoxTipoferActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conex.conexao();
        Connection con = ConexaoBD.con;
        try {
            //JasperPrint print = JasperFillManager.fillReport("//10.70.132.45/c$/Users/t7240049/Documents/NetBeansProjects/MonitoriaProject/Rel/Gerlaine/RelGerlaine.jasper",null,con);     // ip na rede         
            JasperPrint print = JasperFillManager.fillReport("//nsaodt5nxtfm2/c$/RelMoni/RelEmail/Gleicy/EmailGleicy.jasper", null, con);    //hotname da maquina 
            JasperViewer.viewReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatório" + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaPrincipal tela = new TelaPrincipal(jLabelUsuario.getText());
        if (tela == null) {
            tela = new TelaPrincipal(jLabelUsuario.getText());
            tela.setResizable(false);
            dispose();
        } else {
            tela.setVisible(true);
            tela.setResizable(false);
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jTextFieldDataEmail.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jTextFieldDataEmail.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItemTelaBenvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenvindoActionPerformed
        TelaPrincipal tela = new TelaPrincipal(jLabelUsuario.getText());
        if (tela == null) {
            tela = new TelaPrincipal(jLabelUsuario.getText());
            tela.setResizable(false);
            dispose();
        } else {
            tela.setVisible(true);
            tela.setResizable(false);
            dispose();
        }
    }//GEN-LAST:event_jMenuItemTelaBenvindoActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        FormAcionamento esc = new FormAcionamento();
        try {
            conex.executaSql("select *from usuarios where usu_nome='" + jLabelUsuario.getText() + "'");
            conex.rs.first();
            if (conex.rs.getString("usu_tipo").equals("administrador")) {
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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jButtonPesquisaEsp.doClick();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemEnfermeira3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnfermeira3ActionPerformed
        jButtonNovo.doClick();
    }//GEN-LAST:event_jMenuItemEnfermeira3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jButtonSalvar.doClick();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSair1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSair1MouseClicked

    private void jMenuItemSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSair1ActionPerformed
        jButtonCancelar.doClick();
    }//GEN-LAST:event_jMenuItemSair1ActionPerformed

    private void jMenuItemTelaBenvindo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenvindo1ActionPerformed
        jButton3.doClick();
    }//GEN-LAST:event_jMenuItemTelaBenvindo1ActionPerformed

    private void jMenuItemEnfermeira2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnfermeira2ActionPerformed
        TelaLogin logout = new TelaLogin();
        logout.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemEnfermeira2ActionPerformed
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
            java.util.logging.Logger.getLogger(FormGleicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGleicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGleicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGleicy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormGleicy().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaEsc;
    private javax.swing.JButton jButtonPesquisaEsp;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxStatus;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JComboBox jComboBoxTipoAnalista;
    private javax.swing.JComboBox jComboBoxTipoForm;
    private javax.swing.JComboBox jComboBoxTipofer;
    private javax.swing.JFormattedTextField jFormattedDataLigacao;
    private javax.swing.JFormattedTextField jFormattedTextHora;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemEnfermeira2;
    private javax.swing.JMenuItem jMenuItemEnfermeira3;
    private javax.swing.JMenuItem jMenuItemSair1;
    private javax.swing.JMenuItem jMenuItemTelaBenvindo;
    private javax.swing.JMenuItem jMenuItemTelaBenvindo1;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSair1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableChamado;
    private javax.swing.JTextField jTextFieldDataEmail;
    private javax.swing.JTextField jTextFieldData_s;
    private javax.swing.JTextField jTextFieldEsc_1;
    private javax.swing.JTextField jTextFieldEsc_2;
    private javax.swing.JTextField jTextFieldEsc_3;
    private javax.swing.JTextField jTextFieldEsc_4;
    private javax.swing.JTextField jTextFieldEsc_5;
    private javax.swing.JTextField jTextFieldGrupoSolucionador;
    private javax.swing.JTextField jTextFieldNumChamado;
    private javax.swing.JTextField jTextFieldPesquisaChamado;
    private javax.swing.JTextField jTextFieldSumario;
    private javax.swing.JTextField jtCOD;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
