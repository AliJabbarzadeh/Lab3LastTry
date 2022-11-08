/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali-pc
 */
public class DroductCatalog {
    
    private List<Droduct> droductCatalog;

    public DroductCatalog() {
        droductCatalog = new ArrayList<Droduct>();
    }

    public List<Droduct> getDroductcatalog() {
        return droductCatalog;
    }

    public Droduct addDroduct() {
        Droduct d = new Droduct();
        droductCatalog.add(d);
        return d;
    }

    public void removeDroduct(Droduct d) {
        droductCatalog.remove(d);
    }

    public Droduct searchDroduct(int id) {
        for (Droduct droduct : droductCatalog) {
            if (droduct.getModelNumber() == id) {
                return droduct;
            }
        }
        return null;
    }
    
}
