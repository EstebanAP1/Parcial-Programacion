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

public class Manual extends javax.swing.JFrame {
    
    Emetodos e = new Emetodos();

    Fondo F = new Fondo();

    private boolean mostrar = true;

    Gmetodos g = new Gmetodos();
    
    Conexion conexion = new Conexion();
    Connection conect;
    
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    
    
    public Manual() {
	initComponents();
	passV.setVisible(false);
	passC.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        back = new javax.swing.JButton();
        random = new javax.swing.JButton();
        simb = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c12 = new javax.swing.JCheckBox();
        ocultar = new javax.swing.JCheckBox();
        passV = new javax.swing.JTextField();
        passC = new javax.swing.JPasswordField();
        c6 = new javax.swing.JCheckBox();
        mayus = new javax.swing.JCheckBox();
        minus = new javax.swing.JCheckBox();
        num = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setText("Exit");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        random.setText("Generar");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });
        getContentPane().add(random, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        simb.setText("Simbolos");
        getContentPane().add(simb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        c8.setText("8 Caracteres");
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        c12.setText("12 Caracteres");
        getContentPane().add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        ocultar.setText("Visible");
        ocultar.setMinimumSize(new java.awt.Dimension(24, 64));
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });
        getContentPane().add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));
        getContentPane().add(passV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 40));
        getContentPane().add(passC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 40));

        c6.setText("6 Caracteres");
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        mayus.setText("Mayusculas");
        getContentPane().add(mayus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        minus.setText("Minusculas");
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        num.setText("Numeros");
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel1.setText("Generaci??n Avanzada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 110, 20));

        registro.setText("Tabla de registro");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 30));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 30, 10));

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
	System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
	Generador abrir = new Generador();
	
	
	abrir.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        int digit;
	

	if (c12.isSelected()) {
	    digit = 12;
	} else if (c8.isSelected()) {
	    digit = 8;
	} else if (c6.isSelected()) {
	    digit = 6;
	}else {
	    digit = 0;
	}

	Gmetodos gm = new Gmetodos(digit);
	
	switch (digit) {
	    case 12:
		if (mayus.isSelected() & minus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generar();
		}else if (mayus.isSelected() & minus.isSelected() & num.isSelected()) {
		    gm.generarMayusMinusNum();
		}else if (mayus.isSelected() & minus.isSelected() & simb.isSelected()) {
		    gm.generarMayusMinusSimb();
		}else if (mayus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generarMayusNumSimb();
		}else if (minus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generarMinusNumSimb();
		}else if (mayus.isSelected() & minus.isSelected()) {
		    gm.generarMayusMinus();
		}else if (mayus.isSelected() & num.isSelected()) {
		    gm.generarMayusNum();
		}else if (mayus.isSelected() & simb.isSelected()) {
		    gm.generarMayusSimb();
		}else if (minus.isSelected() & num.isSelected()) {
		    gm.generarMinusNum();
		}else if (minus.isSelected() & simb.isSelected()) {
		    gm.generarMinusSimb();
		}else if (num.isSelected() & simb.isSelected()) {
		    gm.generarNumSimb();
		}else if (mayus.isSelected()) {
		    gm.generarMayus();
		}else if (minus.isSelected()) {
		    gm.generarMinus();
		}else if (num.isSelected()) {
		    gm.generarNum();
		}else if (simb.isSelected()) {
		    gm.generarSimb();
		}
		break;
	    case 8:
		if (mayus.isSelected() & minus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generar();
		}else if (mayus.isSelected() & minus.isSelected() & num.isSelected()) {
		    gm.generarMayusMinusNum();
		}else if (mayus.isSelected() & minus.isSelected() & simb.isSelected()) {
		    gm.generarMayusMinusSimb();
		}else if (mayus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generarMayusNumSimb();
		}else if (minus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generarMinusNumSimb();
		}else if (mayus.isSelected() & minus.isSelected()) {
		    gm.generarMayusMinus();
		}else if (mayus.isSelected() & num.isSelected()) {
		    gm.generarMayusNum();
		}else if (mayus.isSelected() & simb.isSelected()) {
		    gm.generarMayusSimb();
		}else if (minus.isSelected() & num.isSelected()) {
		    gm.generarMinusNum();
		}else if (minus.isSelected() & simb.isSelected()) {
		    gm.generarMinusSimb();
		}else if (num.isSelected() & simb.isSelected()) {
		    gm.generarNumSimb();
		}else if (mayus.isSelected()) {
		    gm.generarMayus();
		}else if (minus.isSelected()) {
		    gm.generarMinus();
		}else if (num.isSelected()) {
		    gm.generarNum();
		}else if (simb.isSelected()) {
		    gm.generarSimb();
		}
		break;
	    case 6:
		if (mayus.isSelected() & minus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generar();
		}else if (mayus.isSelected() & minus.isSelected() & num.isSelected()) {
		    gm.generarMayusMinusNum();
		}else if (mayus.isSelected() & minus.isSelected() & simb.isSelected()) {
		    gm.generarMayusMinusSimb();
		}else if (mayus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generarMayusNumSimb();
		}else if (minus.isSelected() & num.isSelected() & simb.isSelected()) {
		    gm.generarMinusNumSimb();
		}else if (mayus.isSelected() & minus.isSelected()) {
		    gm.generarMayusMinus();
		}else if (mayus.isSelected() & num.isSelected()) {
		    gm.generarMayusNum();
		}else if (mayus.isSelected() & simb.isSelected()) {
		    gm.generarMayusSimb();
		}else if (minus.isSelected() & num.isSelected()) {
		    gm.generarMinusNum();
		}else if (minus.isSelected() & simb.isSelected()) {
		    gm.generarMinusSimb();
		}else if (num.isSelected() & simb.isSelected()) {
		    gm.generarNumSimb();
		}else if (mayus.isSelected()) {
		    gm.generarMayus();
		}else if (minus.isSelected()) {
		    gm.generarMinus();
		}else if (num.isSelected()) {
		    gm.generarNum();
		}else if (simb.isSelected()) {
		    gm.generarSimb();
		}
		break;
	    default:
		break;
	}

	pass.setText(gm.getPass());
	passC.setText(gm.getPass());
	passV.setText(gm.getPass());
    }//GEN-LAST:event_randomActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        tabla abrir = new tabla();
	
	
	abrir.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_registroActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        agregar();
    }//GEN-LAST:event_agregarActionPerformed

    public static void main(String args[]) {

	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}

	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Manual().setVisible(true);
	    }
	});
    }
    
    void agregar() {
	Emetodos em = new Emetodos();
	
	e.setCifrado(pass.getText());
	
	byte[] cifrado = e.getCifrado();
	
	String user = JOptionPane.showInputDialog("Ingresa el usuario para esta contrase??a");
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
    private javax.swing.JButton agregar;
    private javax.swing.JButton back;
    private javax.swing.JCheckBox c12;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox mayus;
    private javax.swing.JCheckBox minus;
    private javax.swing.JCheckBox num;
    private javax.swing.JCheckBox ocultar;
    private javax.swing.JTextField pass;
    private javax.swing.JPasswordField passC;
    private javax.swing.JTextField passV;
    private javax.swing.JButton random;
    private javax.swing.JButton registro;
    private javax.swing.JButton salir;
    private javax.swing.JCheckBox simb;
    // End of variables declaration//GEN-END:variables
class Fondo extends JPanel {

	private Image imagen;

	@Override
	public void paint(Graphics g) {
	    imagen = new ImageIcon(getClass().getResource("/png/codigo-binario-1621982130311_v2_3x4.jpg")).getImage();

	    g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

	    setOpaque(false);

	    super.paint(g);
	}
    }
}
