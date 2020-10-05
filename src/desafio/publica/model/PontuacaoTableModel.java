package desafio.publica.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PontuacaoTableModel extends AbstractTableModel {

    private ArrayList<Pontuacao> linhas = new ArrayList<>(); //ArrayList onde conterá todas as informações salvas

    private String[] colunas = {"Jogo", "Placar", "Mínimo da temporada", "Máximo da temporada", "Quebra recorde min.",
        "Quebra recorde máx."}; //índices das colunas da tabela

    @Override
    public String getColumnName(int column) { //rotina override para obter o nome da coluna (salvo no vetor 'colunas')
        return colunas[column];
    }

    @Override
    public int getRowCount() {//rotina override para obter a quantidade de linhas
        return linhas.size();
    }

    @Override
    public int getColumnCount() {//rotina override para obter a quantidade de colunas
        return colunas.length;
    }

    /*
    Referencia para cada indice de coluna um get (atributos Pontuacao) 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return linhas.get(rowIndex).getJogo();
            case 1:
                return linhas.get(rowIndex).getPontos();
            case 2:
                return linhas.get(rowIndex).getMinimo();
            case 3:
                return linhas.get(rowIndex).getMaximo();
            case 4:
                return linhas.get(rowIndex).getRecordeMinimo();
            default: //se não for coluna 0,1,2,3 ou 4, nos resta apenas a de índice 5 (sexta coluna)
                return linhas.get(rowIndex).getRecordeMaximo();
        }
    }

    public void adicionarLinha(Pontuacao pontuacao) {//o método add o objeto pontuacao no ArrayList 'linhas'
        this.linhas.add(pontuacao);
        this.fireTableDataChanged(); //é feito a atualização da adição
    }

    public void excluirLinha(int linha) {//o método deleta o objeto pontuação no ArrayList 'linhas'
        this.linhas.remove(linha);
        this.fireTableRowsDeleted(linha, linha);//é feito a atualização da exclusão
    }

}
