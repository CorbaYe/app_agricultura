/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class cls_cultivos_manager {
    protected LinkedList<cls_cultivos> cultivos = new LinkedList<>();
    protected boolean sw;
    protected boolean boton_actualizar = false;
    protected boolean id_actualizar = true;
    protected int pos;
    protected String codigo;
    protected String nombre;
    protected String area;
    
    public void fnt_sub_consulta(String codigo){
        for(int i = 0; i < cultivos.size(); i++){
            if (cultivos.get(i).getCodigo_str().equals(codigo)) {
                sw = true;
                pos = i;
            }
        }
    }
    public void fnt_guardar_cultivo(String codigo_str, String nombre_str, String area_str){
        sw = false;
        if (!codigo_str.equals("") && !nombre_str.equals("") && !area_str.equals("")) {
            fnt_sub_consulta(codigo_str);
            if (!sw) {
                cultivos.add(new cls_cultivos(codigo_str, nombre_str, area_str));
                JOptionPane.showMessageDialog(null, "Cultivo registrado éxitosamente","CULTIVOS",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Se encontro un registro existente con el mismo CÓDIGO","CULTIVOS",JOptionPane.WARNING_MESSAGE);
            } 
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los datos solicitados","CULTIVOS",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public void fnt_consultar_cultivo(String codigo_str){
        if (!codigo_str.equals("")) {
            fnt_sub_consulta(codigo_str);
            if (sw) {
                area = (cultivos.get(pos).getArea_metros_str());
                nombre = (cultivos.get(pos).getNombre_str());
                id_actualizar = false;
                boton_actualizar = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros","CULTIVOS",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un CÓDIGO válido","CULTIVOS",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void fnt_actualizar_cultivos(String nombre_str, String area_str){
        if (!nombre_str.equals("") && !area_str.equals("") && sw){
            cultivos.get(pos).setNombre_str(nombre_str);
            cultivos.get(pos).setArea_metros_str(area_str);
            JOptionPane.showMessageDialog(null, "Cultivo actualizado éxitosamente","CULTIVOS",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Debe rellenar toda la información solicitada","CULTIVOS",JOptionPane.WARNING_MESSAGE);
        }
    }

    public boolean isSw() {
        return sw;
    }

    public void setSw(boolean sw) {
        this.sw = sw;
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

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    

}
