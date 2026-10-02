/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import main.AtualizarPersonagem.*;

public class Interface extends javax.swing.JFrame {
    public Interface() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        h1 = new javax.swing.JLabel();
        Formulario = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        habilidade = new javax.swing.JLabel();
        txtHabilidade = new javax.swing.JTextField();
        txtFraqueza = new javax.swing.JTextField();
        fraqueza = new javax.swing.JLabel();
        lblCaminho = new javax.swing.JTextField();
        foto = new javax.swing.JLabel();
        cadastroBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        lerPersonagens = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();
        atualizarPersonagens = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        h1.setBackground(new java.awt.Color(255, 255, 255));
        h1.setFont(new java.awt.Font("Swis721 LtCn BT", 3, 48)); // NOI18N
        h1.setText("LIGA DE HEROIS");

        nome.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        nome.setText("NOME");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        habilidade.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        habilidade.setText("HABILIDADE");

        txtHabilidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFraqueza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        fraqueza.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        fraqueza.setText("FRAQUEZA");

        lblCaminho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        foto.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        foto.setText("FOTO");

        cadastroBtn.setText("Cadastrar");
        cadastroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Deletar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        lerPersonagens.setText("LER PERSONAGENS");
        lerPersonagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerPersonagensActionPerformed(evt);
            }
        });

        aviso.setText("Só precisa do nome");

        atualizarPersonagens.setText("ATUALIZAR PERSONAGENS");
        atualizarPersonagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarPersonagensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(foto)
                            .addComponent(lblCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fraqueza)
                            .addComponent(txtFraqueza, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lerPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aviso)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(cadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(242, 242, 242))
            .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioLayout.createSequentialGroup()
                    .addContainerGap(438, Short.MAX_VALUE)
                    .addComponent(atualizarPersonagens)
                    .addGap(80, 80, 80)))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(habilidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lerPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(fraqueza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFraqueza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviso)
                .addGap(28, 28, 28))
            .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioLayout.createSequentialGroup()
                    .addContainerGap(222, Short.MAX_VALUE)
                    .addComponent(atualizarPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(131, 131, 131)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(h1)
                        .addGap(238, 238, 238))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cadastroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBtnActionPerformed
        try {
            Heroi heroi = new Heroi();
            heroi.setNome(txtNome.getText());
            heroi.setHabilidade(txtHabilidade.getText());
            heroi.setFraqueza(txtFraqueza.getText());
            heroi.setFoto(lblCaminho.getText());
            
            HeroiDAO dao = new HeroiDAO();
            dao.cadastrar(heroi);
            JOptionPane.showMessageDialog(this, "Herói cadastrado com sucesso!");
            txtNome.setText(""); txtHabilidade.setText("");
            txtFraqueza.setText(""); lblCaminho.setText("");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Falha: " + e.getMessage(), "Erro",
        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastroBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try{
            HeroiDAO dao = new HeroiDAO();
            dao.excluirPorNome(txtNome.getText());
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            txtNome.setText(""); txtHabilidade.setText("");
            txtFraqueza.setText(""); lblCaminho.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Falha: " + e.getMessage(), "Erro",
   JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void lerPersonagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerPersonagensActionPerformed
        
    }//GEN-LAST:event_lerPersonagensActionPerformed

    private void atualizarPersonagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarPersonagensActionPerformed
        AtualizarPersonagem atualizar = new AtualizarPersonagem();
        atualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atualizarPersonagensActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulario;
    private javax.swing.JButton atualizarPersonagens;
    private javax.swing.JLabel aviso;
    private javax.swing.JButton cadastroBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel fraqueza;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel habilidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblCaminho;
    private javax.swing.JButton lerPersonagens;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField txtFraqueza;
    private javax.swing.JTextField txtHabilidade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
