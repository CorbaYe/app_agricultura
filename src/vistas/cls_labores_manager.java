/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cls_labores_manager {
    protected boolean sw;
    protected boolean boton_actualizar = false;
    protected boolean id_actualizar = true;
    protected int pos;
    protected String codigo;
    protected String nombre;
    protected String tiempo;
    protected LinkedList<cls_labores> labores = new LinkedList<>();
    protected DefaultTableModel rowData = new DefaultTableModel();
    
    public void fnt_init_rowData(){
        rowData.setColumnIdentifiers(new Object[]{"CODIGO","NOMBRE","TIEMPO"});
        labores.add(new cls_labores("1","Siembra","2 horas"));
        labores.add(new cls_labores("2","Cosecha","1 día"));
        labores.add(new cls_labores("3","A.Fertilizante","1 día"));
        labores.add(new cls_labores("4","A. Matamalezas","1 día"));
        for(int i = 0; i < labores.size(); i++) {
            rowData.addRow(new Object[]{labores.get(i).getCodigo_str(),labores.get(i).getNombre_str(),labores.get(i).getTiempo_str()});
        }
    }
    
    public void fnt_sub_consulta(String codigo){
        for(int i = 0; i < labores.size(); i++){
            if (labores.get(i).getCodigo_str().equals(codigo)) {
                sw = true;
                pos = i;
            }
        }
    }
    
    public void fnt_guardar_lobor(String codigo_str, String nombre_str, String tiempo_str){
        sw = false;
        if (!codigo_str.equals("") && !nombre_str.equals("") && !tiempo_str.equals("")) {
            fnt_sub_consulta(codigo_str);
            if (!sw) {
                labores.add(new cls_labores(codigo_str, nombre_str, tiempo_str));
                rowData.addRow(new Object[]{labores.get(labores.size() - 1).getCodigo_str(),labores.get(labores.size() - 1).getNombre_str(),labores.get(labores.size() - 1).getTiempo_str()});
                JOptionPane.showMessageDialog(null, "labor registrado éxitosamente","LABORES",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Se encontro un registro existente con el mismo CÓDIGO","LABORES",JOptionPane.WARNING_MESSAGE);
            } 
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los datos solicitados","LABORES",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
        public void fnt_consultar_labor(String codigo_str){
        if (!codigo_str.equals("")) {
            fnt_sub_consulta(codigo_str);
            if (sw) {
                tiempo = (labores.get(pos).getTiempo_str());
                nombre = (labores.get(pos).getNombre_str());
                id_actualizar = false;
                boton_actualizar = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros","LABORES",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un CÓDIGO válido","LABORES",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void fnt_actualizar_labor(String nombre_str, String tiempo_str){
        if (!nombre_str.equals("") && !tiempo_str.equals("") && sw){
            labores.get(pos).setNombre_str(nombre_str);
            labores.get(pos).setTiempo_str(tiempo_str);
            rowData.removeRow(pos);
            rowData.addRow(new Object[]{labores.get(pos).getCodigo_str(),labores.get(pos).getNombre_str(),labores.get(pos).getTiempo_str()});
            JOptionPane.showMessageDialog(null, "Labor actualizada éxitosamente","LABORES",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Debe rellenar toda la información solicitada","LABORES",JOptionPane.WARNING_MESSAGE);
        }
    }

    public DefaultTableModel getRowData() {
        return rowData;
    }

    public LinkedList<cls_labores> getLabores() {
        return labores;
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

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
}
