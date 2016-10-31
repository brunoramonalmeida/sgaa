package br.com.TelaInternal;

import br.com.TelasPrincipais.TPrincipal;
import br.com.DAO.PessoaDAO;
import br.com.Tests.PessoaTeste;

public class JIBuscaPessoa extends javax.swing.JInternalFrame {

    public JIBuscaPessoa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPesquisar = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ftfMatricula = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Buscar Pessoas");
        setPreferredSize(new java.awt.Dimension(753, 349));

        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/add-usuario.gif"))); // NOI18N
        btInserir.setText("INSERIR");
        btInserir.setPreferredSize(new java.awt.Dimension(149, 60));
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/buscar-usuario.gif"))); // NOI18N
        btBuscar.setText("CONSULTAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/cancel.gif"))); // NOI18N
        btCancel.setText("CANCELAR");
        btCancel.setMaximumSize(new java.awt.Dimension(144, 36));
        btCancel.setPreferredSize(new java.awt.Dimension(149, 60));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/borracha-limpar.gif"))); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.setPreferredSize(new java.awt.Dimension(149, 60));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Matrícula: ");

        try {
            ftfMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##.#.#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ftfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(ftfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfPesquisar.setText("");
        ftfMatricula.setText("");

    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        PessoaDAO dao = new PessoaDAO();
        int mat = Integer.parseInt(ftfMatricula.getText().replace(".", "").replace(" ", ""));
        dao.consultarPorId(mat);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        TPrincipal tp1 = new TPrincipal();
        tp1.acessarCad();
        dispose();

    }//GEN-LAST:event_btInserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancel;
    public javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JFormattedTextField ftfMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables

}
