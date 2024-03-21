/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

/**
 *
 * @author Temporal
 */
public class cls_cultivos {
    private String codigo_str;
    private String nombre_str;
    private String area_metros_str;

    public cls_cultivos(String codigo_str, String nombre_str, String area_metros_str) {
        this.codigo_str = codigo_str;
        this.nombre_str = nombre_str;
        this.area_metros_str = area_metros_str;
    }
  
    public String getCodigo_str() {
        return codigo_str;
    }

    public String getNombre_str() {
        return nombre_str;
    }

    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }

    public String getArea_metros_str() {
        return area_metros_str;
    }

    public void setArea_metros_str(String area_metros_str) {
        this.area_metros_str = area_metros_str;
    }
}
