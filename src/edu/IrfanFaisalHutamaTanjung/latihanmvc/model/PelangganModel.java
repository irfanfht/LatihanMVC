/*
 * NIM : 10117060
 * NAMA : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS : IF-2
 */
package edu.IrfanFaisalHutamaTanjung.latihanmvc.model;

import edu.IrfanFaisalHutamaTanjung.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;


public class PelangganModel {

    private String nama;
    private String email;
    private String noTelp;

    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener!=null) {
            pelangganListener.onChange(this);
            
        }
        
    }
    
    public void reseForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        reseForm();
    }
    

    
}
