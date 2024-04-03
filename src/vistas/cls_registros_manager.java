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
public class cls_registros_manager {
    protected LinkedList<cls_registros> registros = new LinkedList<>();
    protected cls_labores_manager labores = new cls_labores_manager();
    protected boolean sw;
    protected int pos;
    
    private void fnt_sub_consulta(String id_agricultor, String codigo_labor, String codigo_cultivo, String fecha){
        for(int i = 0; i < registros.size(); i++){
            if (registros.get(i).getId_agricultor_str().equals(id_agricultor)
                && registros.get(i).getCodigo_cultivo_str().equals(codigo_cultivo)
                && registros.get(i).getCodigo_labor_str().equals(codigo_labor)
                && registros.get(i).getFecha_str().equals(fecha)
                ) {
                sw = true;
                pos = i;
            }
        }
    }
    public void fnt_guardar_registro(String id_agricultor_str, String codigo_labor_str, String codigo_cultivo_str, String observaciones_str, String fecha_str){
        sw = false;
        if (!id_agricultor_str.equals("") && !codigo_labor_str.equals("") && !codigo_cultivo_str.equals("") 
                && !observaciones_str.equals("") && !fecha_str.equals("")) {
            fnt_sub_consulta(id_agricultor_str, codigo_labor_str, codigo_cultivo_str, fecha_str);
            if (!sw) {
                registros.add(new cls_registros(id_agricultor_str, codigo_labor_str, codigo_cultivo_str, observaciones_str, fecha_str));
                JOptionPane.showMessageDialog(null, "Registro almacenado éxitosamente","REGISTROS",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Se encontro un registro existente del mismo día","REGISTROS",JOptionPane.WARNING_MESSAGE);
            } 
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los datos solicitados","REGISTROS",JOptionPane.WARNING_MESSAGE);
        } 
    }

    public LinkedList<cls_registros> getRegistros() {
        return registros;
    }

    public void setRegistros(LinkedList<cls_registros> registros) {
        this.registros = registros;
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
