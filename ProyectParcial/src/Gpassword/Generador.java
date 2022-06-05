/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpassword;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;
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
	passE.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        random = new javax.swing.JButton();
        manual = new javax.swing.JButton();
        encriptar = new javax.swing.JCheckBox();
        passV = new javax.swing.JTextField();
        passC = new javax.swing.JPasswordField();
        passE = new javax.swing.JTextField();
        ocultar = new javax.swing.JCheckBox();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(550, 450));
        setPreferredSize(new java.awt.Dimension(550, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        random.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        random.setText("Generar Auto");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });
        getContentPane().add(random, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, 40));

        manual.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        manual.setText("Manual");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });
        getContentPane().add(manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        encriptar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        encriptar.setForeground(new java.awt.Color(255, 255, 255));
        encriptar.setText("Encriptar");
        encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarActionPerformed(evt);
            }
        });
        getContentPane().add(encriptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(passV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, 40));
        getContentPane().add(passC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, 40));
        getContentPane().add(passE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, 40));

        ocultar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ocultar.setForeground(new java.awt.Color(255, 255, 255));
        ocultar.setText("visible");
        ocultar.setMinimumSize(new java.awt.Dimension(24, 64));
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });
        getContentPane().add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        salir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        salir.setText("Exit");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
	int digit = (int)(Math.random()*12+8);

	Gmetodos g = new Gmetodos(digit);
	Emetodos e = new Emetodos();

	g.generar();
	
	String key = g.getPass();
	
	e.setCifrado(key);
	
	passC.setText(g.getPass());
	passV.setText(g.getPass());

    }//GEN-LAST:event_randomActionPerformed

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
	if (mostrar) {
	    passE.setVisible(false);
	    passV.setVisible(true);
	    passC.setVisible(false);
	    passV.setText(passC.getText());
	    mostrar = false;
	} else {
	    passE.setVisible(false);
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

    private void encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarActionPerformed
	Emetodos e = new Emetodos();
	
	if (ocultar.isSelected() & encriptar.isSelected()) {
	    passE.setVisible(true);
	    passV.setVisible(false);
	    passC.setVisible(false);
	    passE.setText(Arrays.toString(e.getCifrado()));
	}
    }//GEN-LAST:event_encriptarActionPerformed

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
    private javax.swing.JCheckBox encriptar;
    private javax.swing.JButton manual;
    private javax.swing.JCheckBox ocultar;
    private javax.swing.JPasswordField passC;
    private javax.swing.JTextField passE;
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
