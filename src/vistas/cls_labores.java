/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

public class cls_labores {
    private String codigo_str;
    private String nombre_str;
    private String tiempo_str;

    public cls_labores(String codigo_str, String nombre_str, String tiempo_str) {
        this.codigo_str = codigo_str;
        this.nombre_str = nombre_str;
        this.tiempo_str = tiempo_str;
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

    public String getTiempo_str() {
        return tiempo_str;
    }

    public void setTiempo_str(String tiempo_str) {
        this.tiempo_str = tiempo_str;
    }
}
