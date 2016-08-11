/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author luis
 */
public class EncapsulamientoProducto {
int ID;
int CodigoBarras;
String Nombre;
String Descripcion;
String Proovedor;
int Piezas;
String Estatus;

    
    public EncapsulamientoProducto() {}
    public EncapsulamientoProducto(int ID, int CodigoBarras, String Nombre, String Descripcion, String Proovedor, int Piezas, String Estatus)
    {
        this.ID = ID;
        this.CodigoBarras = CodigoBarras;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Proovedor = Proovedor;
        this.Piezas = Piezas;
        this.Estatus = Estatus;



    }
    
public void ID(int ID ) { this.ID = ID; }  public int ID( ) { return this.ID; } 
public void CodigoBarras(int CodigoBarras ) { this.CodigoBarras = CodigoBarras; }  public int CodigoBarras( ) { return this.CodigoBarras; } 
public void Nombre(String Nombre ) { this.Nombre = Nombre; }  public String Nombre( ) { return this.Nombre; } 
public void Descripcion(String Descripcion ) { this.Descripcion = Descripcion; }  public String Descripcion( ) { return this.Descripcion; } 
public void Proovedor(String Proovedor ) { this.Proovedor = Proovedor; }  public String Proovedor( ) { return this.Proovedor; } 
public void Piezas(int Piezas ) { this.Piezas = Piezas; }  public int Piezas( ) { return this.Piezas; } 
public void Estatus(String Estatus ) { this.Estatus = Estatus; }  public String Estatus( ) { return this.Estatus; } 

    
}
