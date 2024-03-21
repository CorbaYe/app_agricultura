/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

/**
 *
 * @author Temporal
 */
public class cls_agricultor {
    private String id_str;
    private String nombre_str;
    private String contacto_str;
    private String ubicacion_str;

    public cls_agricultor(String id_str, String nombre_str, String contacto_str, String ubicacion_str) {
        this.id_str = id_str;
        this.nombre_str = nombre_str;
        this.contacto_str = contacto_str;
        this.ubicacion_str = ubicacion_str;
    }

    public String getId_str() {
        return id_str;
    }
    
    public String getNombre_str() {
        return nombre_str;
    }

    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }

    public String getContacto_str() {
        return contacto_str;
    }

    public void setContacto_str(String contacto_str) {
        this.contacto_str = contacto_str;
    }

    public String getUbicacion_str() {
        return ubicacion_str;
    }

    public void setUbicacion_str(String ubicacion_str) {
        this.ubicacion_str = ubicacion_str;
    }
}
