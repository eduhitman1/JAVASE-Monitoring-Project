package com.eduardo.domain;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

    private ArrayList linhas = null;    // arraylist armazenamento de dados
    private String[] colunas = null;   // vetor

    public ModeloTabela(ArrayList lin, String[] col) {    // contrutor recebendo uma arraylist  
        setLinhas(lin);
        setColunas(col);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    public int getColumnCount() {    // metodo de conta o numero de colunas
        return colunas.length;

    }

    public int getRowCount() {    // metodo de conta numero de linhas
        return linhas.size();
    }

    public String getColumnName(int numCol) {   // metodo para pega o valor do nome da coluna
        return colunas[numCol];
    }

    public Object getValueAt(int numLin, int numCol) {    // metodo que vai monta a tabela, adicionando as linhas da tabela
        Object[] linha = (Object[]) getLinhas().get(numLin);
        return linha[numCol];
    }

}
