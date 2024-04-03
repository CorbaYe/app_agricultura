/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Temporal
 */
public class cls_agricultor_manager {
    protected LinkedList<cls_agricultor> agricultor = new LinkedList<>();
    protected boolean sw;
    protected boolean boton_actualizar = false;
    protected boolean id_actualizar = true;
    protected int pos;
    protected String id_agricultor;
    protected String contacto;
    protected String nombre;
    protected String ubicacion;
    
    public void fnt_guardar_agricultor(String id_str, String nombre_str, String contacto_str, String ubicacion_str){
        sw = false;
        if (!id_str.equals("") && !nombre_str.equals("") 
                && !contacto_str.equals("") && !ubicacion_str.equals("")) {
            fnt_sub_consulta(id_str);
            if (!sw) {
                agricultor.add(new cls_agricultor(id_str, nombre_str, contacto_str, ubicacion_str));
                JOptionPane.showMessageDialog(null, "Agricultor registrado éxitosamente","AGRICULTOR",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Se encontro un registro existente con el mismo ID","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
            } 
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los datos solicitados","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
        } 
    }
    public void fnt_sub_consulta(String id_str){
        for(int i = 0; i < agricultor.size(); i++){
            if (agricultor.get(i).getId_str().equals(id_str)) {
                sw = true;
                pos = i;
            }
        }
    }
    public void fnt_consultar_agricultor(String id_str){
        if (!id_str.equals("")) {
            fnt_sub_consulta(id_str);
            if (sw) {
                contacto = (agricultor.get(pos).getContacto_str());
                nombre = (agricultor.get(pos).getNombre_str());
                ubicacion = (agricultor.get(pos).getUbicacion_str());
                id_actualizar = false;
                boton_actualizar = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros","AGRICULTOR",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID válido","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void fnt_actualizar_agricultor(String nombre_a, String contacto_a, String ubicacion_a){
        if (!nombre_a.equals("") && !contacto_a.equals("") 
                && !ubicacion_a.equals("") && sw){
            agricultor.get(pos).setContacto_str(contacto_a);
            agricultor.get(pos).setNombre_str(nombre_a);
            agricultor.get(pos).setUbicacion_str(ubicacion_a);
            JOptionPane.showMessageDialog(null, "Agricultor actualizado éxitosamente","AGRICULTOR",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Debe rellenar toda la información solicitada","AGRICULTOR",JOptionPane.WARNING_MESSAGE);
        }
    }

    public String getId_agricultor() {
        return id_agricultor;
    }

    public void setId_agricultor(String id_agricultor) {
        this.id_agricultor = id_agricultor;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isBoton_actualizar() {
        return boton_actualizar;
    }

    public void setBoton_actualizar(boolean boton_actualizar) {
        this.boton_actualizar = boton_actualizar;
    }

    public boolean isId_actualizar() {
        return id_actualizar;
    }

    public void setId_actualizar(boolean id_actualizar) {
        this.id_actualizar = id_actualizar;
    }

    public boolean isSw() {
        return sw;
    }

    public void setSw(boolean sw) {
        this.sw = sw;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
}
