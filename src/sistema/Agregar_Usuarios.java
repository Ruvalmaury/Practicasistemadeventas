/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maury
 */
public class Agregar_Usuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agregar_Usuarios
     */
    public Agregar_Usuarios() {
        initComponents();
        this.cargarDatosBD();
    }
    private void cargarDatosBD(){
        
        
        try {
            String user = "administrador";
            String url = "jdbc:mysql://localhost:3306/";
            String password = "root";
            String bd = "requerimientos_2";
            String conector = "com.mysql.cj.jdbc.Driver";
            Class.forName(conector);
            Connection conexion = DriverManager.getConnection(url+bd,user,password);
            System.out.println("onexion exitosa");
            
            String query = "SELECT * FROM tipo_usuarios ";
            Statement sql = conexion.createStatement();
            ResultSet respuesta = sql.executeQuery(query);
            
            while(respuesta.next()){
                this.cbATipo.addItem(respuesta.getString(2));
            }
            conexion.close();
            
        } catch(ClassNotFoundException | SQLException message){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, message);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAUsuario = new javax.swing.JTextField();
        txtAPassword = new javax.swing.JTextField();
        txtACPassword = new javax.swing.JTextField();
        btnAGuardar = new javax.swing.JButton();
        btnABorrar = new javax.swing.JButton();
        cbATipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtANombre = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Agregar Usuarios");

        jLabel1.setText("Agregar Usuarios");

        jLabel2.setText("Usuario :");

        jLabel3.setText("Tipo :");

        jLabel4.setText("Password :");

        jLabel5.setText("Confirm Password");

        btnAGuardar.setText("Guardar");
        btnAGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGuardarActionPerformed(evt);
            }
        });

        btnABorrar.setText("Cerrar");

        jLabel6.setText("Nombre :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbATipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 396, Short.MAX_VALUE)
                            .addComponent(txtAUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtACPassword)
                            .addComponent(txtANombre, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnAGuardar)
                        .addGap(117, 117, 117)
                        .addComponent(btnABorrar)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtANombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbATipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtACPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAGuardar)
                    .addComponent(btnABorrar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGuardarActionPerformed
        try{    
        String user = "root";
            String url = "jdbc:mysql://localhost:3306/";
            String password = "root";
            String bd = "requerimientos_2";
            String conector = "com.mysql.cj.jdbc.Driver";
            Class.forName(conector);
            Connection conexion = DriverManager.getConnection(url+bd,user,password);
            System.out.println("conexion exitosa");
            
            if(this.txtAPassword.equals(this.txtACPassword)){
                int idTipoUsuarios = 0;
                String sql = "SELECT * FROM tipo_usuarios WHERE nombre = " + this.cbATipo.toString();
                Statement consulta = conexion.createStatement();
                ResultSet respuesta = consulta.executeQuery(sql);
                
                while(respuesta.next()){
                     idTipoUsuarios = respuesta.getInt(1);
                }
                
                sql = "INSERT INTO usuarios(id,id_tipo_usuarios,usuario,nombre,contrasena) VALUES(null," +
                        idTipoUsuarios + "," + "'" + this.txtAUsuario.getText() + "'," + "'" + this.txtANombre.getText() + "'," +
                        "'" + this.txtAPassword + "');";
                respuesta = consulta.executeQuery(sql);
                if(respuesta.next()){
                    JOptionPane.showMessageDialog(null,"Usuario" + this.txtANombre + " creado exitosamente");
                }
            }
        }catch(ClassNotFoundException | SQLException message){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, message);
        } 
    }//GEN-LAST:event_btnAGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABorrar;
    private javax.swing.JButton btnAGuardar;
    private javax.swing.JComboBox<String> cbATipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtACPassword;
    private javax.swing.JTextField txtANombre;
    private javax.swing.JTextField txtAPassword;
    private javax.swing.JTextField txtAUsuario;
    // End of variables declaration//GEN-END:variables
}
