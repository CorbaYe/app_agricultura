/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

/**
 *
 * @author Temporal
 */
public class cls_registros {
    private String id_agricultor_str;
    private String codigo_labor_str;
    private String codigo_cultivo_str;
    private String observaciones_str;

    public cls_registros(String id_agricultor_str, String codigo_labor_str, String codigo_cultivo_str, String observaciones_str) {
        this.id_agricultor_str = id_agricultor_str;
        this.codigo_labor_str = codigo_labor_str;
        this.codigo_cultivo_str = codigo_cultivo_str;
        this.observaciones_str = observaciones_str;
    }

    public String getId_agricultor_str() {
        return id_agricultor_str;
    }

    public void setId__agricultor_str(String id__agricultor_str) {
        this.id_agricultor_str = id__agricultor_str;
    }

    public String getCodigo_labor_str() {
        return codigo_labor_str;
    }

    public void setCodigo_labor_str(String codigo_labor_str) {
        this.codigo_labor_str = codigo_labor_str;
    }

    public String getCodigo_cultivo_str() {
        return codigo_cultivo_str;
    }

    public void setCodigo_cultivo_str(String codigo_cultivo_str) {
        this.codigo_cultivo_str = codigo_cultivo_str;
    }

    public String getObservaciones_str() {
        return observaciones_str;
    }

    public void setObservaciones_str(String observaciones_str) {
        this.observaciones_str = observaciones_str;
    }
    
}
