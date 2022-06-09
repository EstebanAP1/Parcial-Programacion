/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpassword;
import Gpassword.Conexion;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Einner
 */
public class tabla extends javax.swing.JFrame {

    
    Conexion conexion = new Conexion();
    Connection conect;
    
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    /**
     * Creates new form usuarios
     */
    public tabla() {
	initComponents();
	setLocationRelativeTo(null);
	consulta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        manual = new javax.swing.JButton();
        automatico = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(474, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Usuario", "Contraseña", "Cifrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 220));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        btnEliminarTodo.setText("Eliminar Todo");
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        btnEditar1.setText("Editar");
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        manual.setText("Avanzado");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });
        getContentPane().add(manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        automatico.setText("Auto");
        automatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automaticoActionPerformed(evt);
            }
        });
        getContentPane().add(automatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
	eliminar();
	int fila = tabla.getRowCount();
	for (int i = fila - 1; i >= 0; i--) {
	    modelo.removeRow(i);
	}
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
//	int fila =tabla.getSelectedRow();
//	if (fila>=0) {
//	    
//	   id.setText(tabla.getValueAt(fila, 0).toString());
//	   prueba.setText(tabla.getValueAt(fila, 1).toString());
//	   txtEncriptado.setText(tabla.getValueAt(fila, 2).toString());
//	   modelo.removeRow(fila);
//	   
//	}else{
//	    JOptionPane.showMessageDialog(null, "fila no seleccionada");
//	}
//	 
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
	System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
       Manual abrir = new Manual();
	
	
	abrir.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_manualActionPerformed

    private void automaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticoActionPerformed
         Generador abrir = new Generador();
	
	
	abrir.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_automaticoActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        consulta();
    }//GEN-LAST:event_actualizarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
	int fila = tabla.getSelectedRow();
	if (fila == -1) {
	    JOptionPane.showMessageDialog(null, "No se seleccionó ninguna fila");
	} else {
	    idc = Integer.parseInt((String) tabla.getValueAt(fila, 0) .toString());
	}
    }//GEN-LAST:event_tablaMouseClicked

    public static void main(String args[]) {

	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}

	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new tabla().setVisible(true);
	    }
	});
    }
    
    void consulta() {
	String sql = "select * from registro";
	
	try {
	    conect = conexion.getConexion();
	    st = conect.createStatement();
	    rs = st.executeQuery(sql);
	    Object[] registro = new Object[4];
	    modelo = (DefaultTableModel) tabla.getModel();
	    while (rs.next()) {
		registro[0] = rs.getString("usuario");
		registro[1] = rs.getString("pass");
		registro[2] = rs.getBytes("encriptada");
		
		modelo.addRow(registro);
	    }
	    tabla.setModel(modelo);
	} catch (Exception e) {
	}
    }
    
    void eliminar () {
	int fila = tabla.getSelectedRow();
	try {
	    if (fila<0) {
		JOptionPane.showMessageDialog(null, "Registro no seleccionado");
	    } else {
		String sql = "delete from registro where encriptada="+idc;
		conect = conexion.getConexion();
		st = conect.createStatement();
		st.executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "Datos eliminados");
	    }
	} catch (Exception e) {
	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton automatico;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manual;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
