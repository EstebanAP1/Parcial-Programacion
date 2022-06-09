/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpassword;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author Einner
 */
public class Generador extends javax.swing.JFrame {

    Fondo F = new Fondo();
    
    private boolean mostrar = true;

    public Generador() {
	this.setContentPane(F);
	initComponents();
	passV.setVisible(false);
	passC.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        random = new javax.swing.JButton();
        manual = new javax.swing.JButton();
        c12 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        passV = new javax.swing.JTextField();
        passC = new javax.swing.JPasswordField();
        ocultar = new javax.swing.JCheckBox();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(550, 450));
        setPreferredSize(new java.awt.Dimension(550, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        random.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        random.setText("Auto");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });
        getContentPane().add(random, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        manual.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        manual.setText("Manual");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });
        getContentPane().add(manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        c12.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        c12.setForeground(new java.awt.Color(255, 255, 255));
        c12.setText("12 Caracteres");
        getContentPane().add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        c8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        c8.setForeground(new java.awt.Color(255, 255, 255));
        c8.setText("8 Caracteres");
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        c6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setText("6 Caracteres");
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Encriptar");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        getContentPane().add(passV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 210, 30));
        getContentPane().add(passC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 210, 30));

        ocultar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ocultar.setForeground(new java.awt.Color(255, 255, 255));
        ocultar.setText("visible");
        ocultar.setMinimumSize(new java.awt.Dimension(24, 64));
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });
        getContentPane().add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        salir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        salir.setText("Exit");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
	int digit;

	if (c12.isSelected()) {
	    digit = 12;
	} else if (c8.isSelected()) {
	    digit = 8;
	} else if (c6.isSelected()) {
	    digit = 6;
	} else {
	    digit = 0;
	}

	Gmetodos g = new Gmetodos(digit);

	g.generar();

	passC.setText(g.getPass());
	passV.setText(g.getPass());

    }//GEN-LAST:event_randomActionPerformed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
	if (mostrar) {
	    passV.setVisible(true);
	    passC.setVisible(false);
	    passV.setText(passC.getText());
	    mostrar = false;

	} else {
	    passV.setVisible(false);
	    passC.setVisible(true);
	    passC.setText(passV.getText());
	    mostrar = true;

	}

    }//GEN-LAST:event_ocultarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
	System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
	Manual abrir = new Manual();

	abrir.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_manualActionPerformed

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
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Generador().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c12;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JButton manual;
    private javax.swing.JCheckBox ocultar;
    private javax.swing.JPasswordField passC;
    private javax.swing.JTextField passV;
    private javax.swing.JButton random;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
class Fondo extends JPanel{

	private Image imagen;

	@Override
	public void paint(Graphics g){
	    imagen = new ImageIcon(getClass().getResource("/png/codigo-binario-1621982130311_v2_3x4.jpg")).getImage();
	    
	  g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
	  
	  setOpaque(false);
	  
	  super.paint(g);
	}
    }

}
