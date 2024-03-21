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
    
    private void fnt_sub_consulta(String codigo){
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

}
