/*
 * NIM : 10117060
 * NAMA : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS : IF-2
 */
package edu.IrfanFaisalHutamaTanjung.latihanmvc.controller;

import edu.IrfanFaisalHutamaTanjung.latihanmvc.model.PelangganModel;
import edu.IrfanFaisalHutamaTanjung.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;


public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }


    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")) {
            
        } else {
            model.reseForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih kosong");
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No telp masih kosong");
        } else {
            model.simpanForm();
        }
    }
}
