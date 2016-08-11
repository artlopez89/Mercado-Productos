/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Encapsulamiento.EncapsulamientoProducto;
import Negocios.NegociosProducto;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devilwall
 */
public class Producto extends javax.swing.JInternalFrame {

    /**
     * Creates new form 
     */
    public Producto() {
        initComponents();
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductoTabla = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        TxtCodigoBarras = new javax.swing.JTextField();
        Label5 = new javax.swing.JLabel();
        TxtPiezas = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        TxtDescripcion = new javax.swing.JTextField();
        Label4 = new javax.swing.JLabel();
        TxtProovedor = new javax.swing.JTextField();
        CbEstatus = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        Titulo.setText("Productos:");

        Label2.setText("Nombre:");

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        ProductoTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo de Barras", "Nombre", "Descripcion", "Proovedor", "Piezas", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductoTabla);
        if (ProductoTabla.getColumnModel().getColumnCount() > 0) {
            ProductoTabla.getColumnModel().getColumn(0).setMinWidth(0);
            ProductoTabla.getColumnModel().getColumn(0).setPreferredWidth(0);
            ProductoTabla.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        MenuPrincipal.setText("Menu Principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        Label1.setText("Codigo de Barras: ");

        TxtCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoBarrasActionPerformed(evt);
            }
        });

        Label5.setText("Piezas:");

        TxtPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPiezasActionPerformed(evt);
            }
        });

        Label3.setText("Descripcion:");

        Label6.setText("Estatus:");

        TxtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripcionActionPerformed(evt);
            }
        });

        Label4.setText("Proovedor:");

        TxtProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProovedorActionPerformed(evt);
            }
        });

        CbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No Disponible" }));
        CbEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbEstatusActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MenuPrincipal)
                        .addGap(30, 30, 30)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label3)
                                .addGap(4, 4, 4)
                                .addComponent(TxtDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label1)
                                .addGap(4, 4, 4)
                                .addComponent(TxtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label2)
                                .addGap(18, 18, 18)
                                .addComponent(TxtNombre)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label5)
                                .addGap(4, 4, 4)
                                .addComponent(TxtPiezas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(MenuPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1)
                    .addComponent(Label4)
                    .addComponent(TxtProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3)
                    .addComponent(Label6)
                    .addComponent(CbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Eliminar)
                    .addComponent(Modificar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar()
    {
       DefaultTableModel ModeloTabla = (DefaultTableModel)ProductoTabla.getModel();

        for(int i = 0; i<ProductoTabla.getRowCount(); i++)
        {
            ModeloTabla.removeRow(i);
            i -=1;
        }
    }
    
    public void Mostrar()
    {
      DefaultTableModel ModeloTabla = (DefaultTableModel)ProductoTabla.getModel();
        
        List<EncapsulamientoProducto> listaProductos = null;
        
        try 
        {
            listaProductos = NegociosProducto.mostrarProductos();
        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + ex.getMessage());
        }
        
        for(EncapsulamientoProducto productos : listaProductos )
        {
            // Asignamos a un Tipo Object
                       
            Object[] DatosFila =
            {
                productos.ID( ),
                productos.CodigoBarras( ),
                productos.Nombre( ),
                productos.Descripcion( ),
                productos.Proovedor( ),
                productos.Piezas( ),
                productos.Estatus( ),

            };            
            // La propiedad .addRow(Object), requiere un objeto
            ModeloTabla.addRow(DatosFila);
        }
        
        ProductoTabla.setModel(ModeloTabla);

    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Mostrar();
    }//GEN-LAST:event_formInternalFrameOpened

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        Menu vistaPrincipal = new Menu();
                JDesktopPane desktopPane = getDesktopPane();
                desktopPane.add(vistaPrincipal);
                vistaPrincipal.setVisible(true); 
                
                this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      if(ProductoTabla.getSelectedRowCount() == 0)
        {
            JOptionPane.showMessageDialog(this, "Selecione un Registro en la Tabla");
            return;
        }
        
        
        int res = JOptionPane.showConfirmDialog(this,"Esta seguro de Eliminar el Registro?", "Eliminar", JOptionPane.YES_NO_OPTION);
        
        if(res == 0)
        {
            EncapsulamientoProducto producto = new EncapsulamientoProducto();
        
            // Obtemeos el ID, de la fila seleccionada Para las Consultas de SQL
            producto.ID((int)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 0));
        
            try {
                // Mandamos a llamar a la capa de Negocios, el Metododo Insertar
                if(NegociosProducto.elimarProductos(producto))
                {
                    JOptionPane.showMessageDialog(this, "Producto Eliminado Exitosamente");
                Limpiar();
                Mostrar();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "El producto no se ha eliminado");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ERROR: " + ex);
            }
        }

    }//GEN-LAST:event_EliminarActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoBarrasActionPerformed

    private void TxtPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPiezasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPiezasActionPerformed

    private void TxtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescripcionActionPerformed

    private void TxtProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProovedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProovedorActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        EncapsulamientoProducto producto = new EncapsulamientoProducto();
        
        int CodigoBarras = Integer.parseInt(TxtCodigoBarras.getText());
        int Piezas = Integer.parseInt(TxtPiezas.getText());

        // Al mandamos los datos al encapsulamiento
            producto.CodigoBarras(CodigoBarras);
            producto.Nombre(TxtNombre.getText());
            producto.Descripcion(TxtDescripcion.getText());
            producto.Proovedor(TxtProovedor.getText());
            producto.Piezas(Piezas);
            producto.Estatus(CbEstatus.getSelectedItem().toString());
            
            
            
            

            String Resultado = null;

            try {
                Resultado = NegociosProducto.ingresarProductos(producto);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ERROR: " + ex.getMessage());
            }

            if ( Resultado != null)
            {
                JOptionPane.showMessageDialog(this, Resultado);
                Limpiar();
                Mostrar();
            }

    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    // TODO add your handling code here:
        // TODO add your handling code here:
          if(ProductoTabla.getSelectedRowCount() == 0)
      {
          JOptionPane.showMessageDialog(this, "Selecione un Registro en la Tabla");
          return;
      }
      
      EncapsulamientoProducto producto = new EncapsulamientoProducto();
      
      // Obtenemos los datos de los txt
        producto.ID((int)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 0));
        producto.CodigoBarras ((int)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 1));
        producto.Nombre((String)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 2));
        producto.Descripcion((String)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 3));
        producto.Proovedor((String)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 4));
        producto.Piezas((int)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 5));
        producto.Estatus((String)ProductoTabla.getValueAt(ProductoTabla.getSelectedRow(), 6));
      
        
        
        
        
     try {
          // El metodo actualiar persona retorna un valor booleano
          if(NegociosProducto.actualizarProductos(producto))
          {
              JOptionPane.showMessageDialog(this, "Producto actualizado corectamente");
              
              Limpiar();
              try
              {
                  Mostrar();
              }
              catch (Exception ex)
              {
                  JOptionPane.showMessageDialog(this, "Se ha presentado un Error al Mostrar los Datos");
              }
          }
          else
          {
              JOptionPane.showMessageDialog(this,"Se ha presentado un error");
          }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this, "ERROR: " + e);
      }
    
         
    }//GEN-LAST:event_ModificarActionPerformed

    private void CbEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbEstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbEstatusActionPerformed

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> CbEstatus;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable ProductoTabla;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TxtCodigoBarras;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPiezas;
    private javax.swing.JTextField TxtProovedor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}