
package Gpassword;

import com.mysql.jdbc.Connection;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Generador extends javax.swing.JFrame {
    
    Emetodos e = new Emetodos();
    
    Fondo F = new Fondo();
    
    private boolean mostrar = true;
    
    Conexion conexion = new Conexion();
    Connection conect;
    
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public Generador() {
	this.setContentPane(F);
	initComponents();
	passV.setVisible(false);
	passC.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        random = new javax.swing.JButton();
        manual = new javax.swing.JButton();
        passV = new javax.swing.JTextField();
        passC = new javax.swing.JPasswordField();
        ocultar = new javax.swing.JCheckBox();
        salir = new javax.swing.JButton();
        registro = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

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
        getContentPane().add(random, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 140, 40));

        manual.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        manual.setText("Avanzado");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });
        getContentPane().add(manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));
        getContentPane().add(passV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 260, 40));
        getContentPane().add(passC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 260, 40));

        ocultar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        ocultar.setForeground(new java.awt.Color(255, 255, 255));
        ocultar.setText("Visible");
        ocultar.setMinimumSize(new java.awt.Dimension(24, 64));
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });
        getContentPane().add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        salir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        salir.setText("Exit");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        registro.setText("Tabla de registro");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 30));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 40, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
	int digit = (int)(Math.random()*10+6);

	Gmetodos g = new Gmetodos(digit);

	g.generar();
	
	pass.setText(g.getPass());
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

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
       tabla abrir = new tabla();
	
	
	abrir.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_registroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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

	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Generador().setVisible(true);
	    }
	});
    }
    
    void agregar() {
	e.setCifrado(pass.getText());
	
	byte[] cifrado = e.getCifrado();
	
	String user = JOptionPane.showInputDialog("Ingresa el usuario para esta contraseña");
	String contra = pass.getText();
	byte[] encript = cifrado;
	
	try {
	    String sql = "insert into registro (usuario, pass, encriptada) values ('"+user+"','"+contra+"','"+encript+"')";
	    conect = conexion.getConexion();
	    st = conect.createStatement();
	    st.executeUpdate(sql);
	    JOptionPane.showMessageDialog(null, "Agregado");
	    
	} catch (Exception e) {
	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton manual;
    private javax.swing.JCheckBox ocultar;
    private javax.swing.JTextField pass;
    private javax.swing.JPasswordField passC;
    private javax.swing.JTextField passV;
    private javax.swing.JButton random;
    private javax.swing.JButton registro;
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
