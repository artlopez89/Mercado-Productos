/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Encapsulamiento.EncapsulamientoProducto;
import java.util.ArrayList;
import java.util.List;


public class DatosProducto {
    
    public static String ingresarProductos(Connection conexion, EncapsulamientoProducto Productos) throws Exception
    {
        String Resultado = null;
        
        try
        {
            CallableStatement statement = conexion.prepareCall("{call sp_Ingresar_Producto(?,?,?,?,?,?)}");
           
 
        statement.setInt(1, Productos.CodigoBarras());
        statement.setString(2, Productos.Nombre());
        statement.setString(3, Productos.Descripcion());
        statement.setString(4, Productos.Proovedor());
        statement.setInt(5, Productos.Piezas());
        statement.setString(6, Productos.Estatus());



            
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            
            Resultado = resultSet.getString("mensaje");
        }
        catch(Exception e)
        {
            // Retorna excepcion a la capa de negocios
            throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
        
        return Resultado;
    }
    
    public static List<EncapsulamientoProducto> mostrarProductos(Connection conexion) throws Exception
    {
        List<EncapsulamientoProducto> listaProductos = new ArrayList<>();
        
        try
        {
            CallableStatement statement = (CallableStatement) conexion.prepareCall("{call `sp_Mostrar_Producto`()}");
            
            // Este metodo pone un puntor en la primera fila y con el metodo next, se mueve a la siguiente fila
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                    EncapsulamientoProducto productos = new EncapsulamientoProducto
                        (
                    resultSet.getInt("ID") ,
                    resultSet.getInt("CodigoBarras") ,
                    resultSet.getString("Nombre") ,
                    resultSet.getString("Descripcion") ,
                    resultSet.getString("Proovedor") ,
                    resultSet.getInt("Piezas") ,
                    resultSet.getString("Estatus")

                        );
                
                listaProductos.add(productos);
            }
            
        }
        catch (Exception e)
        {
            throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
        
        return listaProductos;
    }
    
    public static void eliminarProductos(Connection conexion, int ID) throws Exception
    {
        try {
            
            CallableStatement statement = conexion.prepareCall("{call `sp_Borrar_Producto`(?)}");
            statement.setInt(1, ID);
            
            statement.executeQuery();
            
        } catch (Exception e) {
            throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
    }
    
    
    
    
    
    
    public static void actualizarProductos(Connection conexion, EncapsulamientoProducto Productos) throws Exception
    {
        try {
            CallableStatement statement = (CallableStatement) conexion.prepareCall("{call sp_Actualizar_Producto(?,?,?,?,?,?,?)}");

            statement.setInt(1, Productos.ID());
            statement.setInt(2, Productos.CodigoBarras());
            statement.setString(3, Productos.Nombre());
            statement.setString(4, Productos.Descripcion());
            statement.setString(5, Productos.Proovedor());
            statement.setInt(6, Productos.Piezas());
            statement.setString(7, Productos.Estatus());




            
            statement.executeQuery();
            
        } catch (Exception e) {
             throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
        
    }
    
    public static List<EncapsulamientoProducto> buscarProductos(Connection conexion,String buscar) throws Exception
    {
        List<EncapsulamientoProducto> listaproductos = new ArrayList<>();
        
        try
        {
            CallableStatement statement = (CallableStatement) conexion.prepareCall("{call `sp_Buscar_Producto`(?)}");
            statement.setString(1, buscar);
            // Este metodo pone un puntor en la primera fila y con el metodo next, se mueve a la siguiente fila
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next())
            {
                        EncapsulamientoProducto producto = new EncapsulamientoProducto
                        (
                    resultSet.getInt("ID") ,
                    resultSet.getInt("CodigoBarras") ,
                    resultSet.getString("Nombre") ,
                    resultSet.getString("Descripcion") ,
                    resultSet.getString("Proovedor") ,
                    resultSet.getInt("Piezas") ,
                    resultSet.getString("Estatus")
                        );
                
                listaproductos.add(producto);
            }
            
        }
        catch (Exception e)
        {
            throw new Exception("Error en la Capa de Datos " + e.getMessage());
        }
        
        return listaproductos;
    }
    
    

}
