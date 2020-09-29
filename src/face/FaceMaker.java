
package face;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


public class FaceMaker extends javax.swing.JFrame {

   Face f;
    public FaceMaker() {
        initComponents();
        f = new Face(facePanel.getGraphics(),100,100);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_move = new javax.swing.JButton();
        btn_resize = new javax.swing.JButton();
        btn_color = new javax.swing.JButton();
        btn_mood = new javax.swing.JButton();
        facePanel = new javax.swing.JPanel();
        btn_initial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_move.setText("Move Face");
        btn_move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moveActionPerformed(evt);
            }
        });

        btn_resize.setText("Resize Face");
        btn_resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resizeActionPerformed(evt);
            }
        });

        btn_color.setText("Change Color");
        btn_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colorActionPerformed(evt);
            }
        });

        btn_mood.setText("Toggle Mood");

        facePanel.setBackground(new java.awt.Color(255, 255, 255));
        facePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout facePanelLayout = new javax.swing.GroupLayout(facePanel);
        facePanel.setLayout(facePanelLayout);
        facePanelLayout.setHorizontalGroup(
            facePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        facePanelLayout.setVerticalGroup(
            facePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        btn_initial.setText("Set Initial Face");
        btn_initial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_initialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_move, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_resize, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_color, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btn_mood, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(btn_initial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_move)
                    .addComponent(btn_mood)
                    .addComponent(btn_color)
                    .addComponent(btn_resize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_initial)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resizeActionPerformed
        
    }//GEN-LAST:event_btn_resizeActionPerformed

    private void btn_initialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_initialActionPerformed
        btn_color.setEnabled(true);
        btn_mood.setEnabled(true);
        btn_resize.setEnabled(true);
        btn_move.setEnabled(true);
        f.erase();
        f = new Face(facePanel.getGraphics(),50,50);
        f.draw();
    }//GEN-LAST:event_btn_initialActionPerformed

    private void btn_moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moveActionPerformed
        int newx = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New X"));
        int newy = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New Y"));
        f.erase();
        f.move(newx,newy);
        f.draw();
    }//GEN-LAST:event_btn_moveActionPerformed

    private void btn_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colorActionPerformed
        Color newColor = JColorChooser.showDialog(this,"Pick new dice color",Color.red);
        f.newColor(newColor);
        f.erase();
        f.draw();
    }//GEN-LAST:event_btn_colorActionPerformed

    
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
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaceMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaceMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_color;
    private javax.swing.JButton btn_initial;
    private javax.swing.JButton btn_mood;
    private javax.swing.JButton btn_move;
    private javax.swing.JButton btn_resize;
    private javax.swing.JPanel facePanel;
    // End of variables declaration//GEN-END:variables
}
