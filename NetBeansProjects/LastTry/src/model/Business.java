/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aghan
 */
public class Business {
    MasterOrderList masterOrderList;
    SupplierDirectory supplierDirectory;
    ZupplierDirectory zupplierDirectory;

    public Business() {
        
        masterOrderList = new MasterOrderList();
       supplierDirectory = new SupplierDirectory();
       zupplierDirectory = new ZupplierDirectory();
       
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public ZupplierDirectory getZupplierDirectory() {
        return zupplierDirectory;
    }

    public void setZupplierDirectory(ZupplierDirectory zupplierDirectory) {
        this.zupplierDirectory = zupplierDirectory;
    }
    
      
    
    
    
}
