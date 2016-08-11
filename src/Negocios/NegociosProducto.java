/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import java.sql.Connection;
import Encapsulamiento.EncapsulamientoProducto;
import Conexion.Conexion;
import Datos.DatosProducto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class NegociosProducto extends Conexion {
    
    public static String ingresarProductos(EncapsulamientoProducto Productos) throws Exception
    {
        String Resultado = null;
        
        Connection conexion = Conexion();
        
        try
        {
            // Seguridad en las consultas de tablas que estan relacionadas con otras
            conexion.setAutoCommit(false);
            
            Resultado = DatosProducto.ingresarProductos(conexion, Productos);
            
            // Si la ejecucion fue exitosa, cerramos la conexion
            conexion.commit();
        }
        catch (Exception e)
        {
            // Si existe algun error, regresamos los cambios, si esque lo hizo en la BD (Cancela la consulta)
            conexion.rollback();
            // Retorna excepcion a la capa de presentacion
            throw new Exception("Error en la Capa de Negocios " + e.getMessage());
        }
        
        return Resultado;
            
    }
    
    public static List<EncapsulamientoProducto> mostrarProductos() throws Exception
    {
        List<EncapsulamientoProducto> listaProductoss = new ArrayList<>();
        Connection conexion = Conexion();
        
        try
        {
            conexion.setAutoCommit(false);
            
            listaProductoss = DatosProducto.mostrarProductos(conexion);
            
            conexion.commit();
        }
        catch (Exception e)
        {
            conexion.rollback();
            throw new Exception("Error en la Capa de Negocios " + e.getMessage());
        }
        
        return listaProductoss;
    }
    
    public static boolean elimarProductos(EncapsulamientoProducto productos) throws Exception
    {
        boolean estado = false;
        Connection conexion = Conexion();
        
        try {
            DatosProducto.eliminarProductos(conexion, productos.ID());
            estado = true;
        } catch (Exception e) {
            throw new Exception("Error en la Capa de Negocios " + e.getMessage());
        }
        
        return estado;
    }
    
    public static boolean actualizarProductos(EncapsulamientoProducto productos) throws Exception
    {
        boolean estado = false;
        Connection conexion = Conexion();
        
        try {
            DatosProducto.actualizarProductos(conexion, productos);
            estado = true;
        } catch (Exception e) {
            throw new Exception("Error en la Capa de Negocios " + e.getMessage());
        }
        
        return estado;
    }
    
    
    
    public static List<EncapsulamientoProducto> buscarProductos(String buscar) throws Exception
    {
        List<EncapsulamientoProducto> listaproductos = new ArrayList<>();
        Connection conexion = Conexion();
        
        try
        {
            conexion.setAutoCommit(false);
            
            listaproductos = DatosProducto.buscarProductos(conexion,buscar);
            
            conexion.commit();
        }
        catch (Exception e)
        {
            conexion.rollback();
            throw new Exception("Error en la Capa de Negocios " + e.getMessage());
        }
        
        return listaproductos;
    }
    
}
