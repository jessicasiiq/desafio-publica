package desafio.publica.view;

import desafio.publica.model.Pontuacao;
import desafio.publica.model.PontuacaoTableModel;
import desafio.publica.model.ValorNaoValidoException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfaceUser extends javax.swing.JFrame {

    PontuacaoTableModel pontuacaoTableModel = new PontuacaoTableModel();

    public InterfaceUser() {
        initComponents();
        jTablePontuacao.setModel(pontuacaoTableModel);
        setLocationRelativeTo(null);//janela sempre aparece no centro da tela
        setResizable(false);//o tam da janela não pode ser alterado pelo user
        //setUndecorated(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo1 = new desafio.publica.view.JPanelFundo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePontuacao = new javax.swing.JTable();
        jTextPontos = new javax.swing.JTextField();
        BotaoAdicionar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFundo1.setFundo(new ImageIcon("src\\desafio\\publica\\imagens\\fundo.png"));
        jPanelFundo1.setPreferredSize(new java.awt.Dimension(1175, 526));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafio/publica/imagens/logo-publica.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de pontuações");

        jTablePontuacao.setAutoCreateRowSorter(true);
        jTablePontuacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTablePontuacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePontuacao.setFocusTraversalPolicyProvider(true);
        jTablePontuacao.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePontuacao.setInheritsPopupMenu(true);
        jTablePontuacao.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTablePontuacao);

        jTextPontos.setForeground(new java.awt.Color(153, 153, 153));
        jTextPontos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPontos.setText("Digite aqui a nova pontuação");

        BotaoAdicionar.setText("Adicionar nova pontuação");
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir linha");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundo1Layout = new javax.swing.GroupLayout(jPanelFundo1);
        jPanelFundo1.setLayout(jPanelFundo1Layout);
        jPanelFundo1Layout.setHorizontalGroup(
            jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo1Layout.createSequentialGroup()
                .addGroup(jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFundo1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoExcluir)
                            .addGap(39, 39, 39)
                            .addComponent(BotaoSair))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFundo1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFundo1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)
                        .addGroup(jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFundo1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jTextPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundo1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(BotaoAdicionar)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanelFundo1Layout.setVerticalGroup(
            jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundo1Layout.createSequentialGroup()
                .addGroup(jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundo1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFundo1Layout.createSequentialGroup()
                                .addComponent(jTextPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoAdicionar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundo1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSair)
                    .addComponent(BotaoExcluir))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarActionPerformed
        Pontuacao pontuacao = new Pontuacao();
        boolean valorValido = false; //se valor não for válido, chama o catch
        try {
            int pontos = Integer.parseInt(jTextPontos.getText());//Valor(String) passado pelo TextField
            if (pontos >= 0 && pontos < 1000) { //'pontos' precisa ser um número positivo e menor que 1000
                valorValido = true;//se entrar no if, valor passado é válido e a flag se torna true, não cai no catch
                pontuacao.setContador(pontuacao.getJogo() + 1);//incrementa contador;
                pontuacao.setPontos(pontos);//atribui pontos
                pontuacao.ordenarContarRecorde(pontos);//método para controlar mínimo/máximo placar e quebras de recordes
                pontuacaoTableModel.adicionarLinha(pontuacao);//chama método para adicionar linha
            }
            if (!valorValido) {
                throw new ValorNaoValidoException(pontos);//se pontos não for válido, entra no catch
            }
        } catch (ValorNaoValidoException e) {//primeiro Exception especifica
            JOptionPane.showMessageDialog(null, e.getMessage());//abre uma janela popup informando a exception
        } catch (Exception e) {//exceção geral por último
            JOptionPane.showMessageDialog(null, "Tipo de valor inválido, favor informar novamente."); //abre uma janela
            //popup informando a exception
        }
    }//GEN-LAST:event_BotaoAdicionarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        System.exit(0);//para de executar o programa
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        /*se nenhuma linha estiver selecionada, retorna -1*/
        boolean flag = false;
        try {
            if (jTablePontuacao.getSelectedRow() != -1) {
                pontuacaoTableModel.excluirLinha((jTablePontuacao.getSelectedRow()));//então deleta linha
                flag = true;
            }
            if (!flag) {
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para poder deletá-la.");
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private desafio.publica.view.JPanelFundo jPanelFundo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePontuacao;
    private javax.swing.JTextField jTextPontos;
    // End of variables declaration//GEN-END:variables
}
