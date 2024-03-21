/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class cls_labores_manager {
    protected LinkedList<cls_labores> labores = new LinkedList<>();
    protected DefaultTableModel rowData = new DefaultTableModel();
    
    public void fnt_labores_predefinidas(){
        labores.add(new cls_labores("1","Siembra","2 horas"));
        labores.add(new cls_labores("2","Cosecha","1 día"));
        labores.add(new cls_labores("3","A.Fertilizante","1 día"));
        labores.add(new cls_labores("4","A. Matamalezas","1 día"));
    }

    public DefaultTableModel getRowData() {
        return rowData;
    }

    public LinkedList<cls_labores> getLabores() {
        return labores;
    }
    
}