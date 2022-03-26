/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author vaio
 */
public class Venta {
    private String cod_compra;
    private String rutd;
    private String folio;
    private String nserie;
    private String rutt;

    public Venta() {
    }

    public Venta(String cod_compra, String rutd, String folio, String nserie, String rutt) {
        this.cod_compra = cod_compra;
        this.rutd = rutd;
        this.folio = folio;
        this.nserie = nserie;
        this.rutt = rutt;
    }

    public String getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(String cod_compra) {
        this.cod_compra = cod_compra;
    }

    public String getRutd() {
        return rutd;
    }

    public void setRutd(String rutd) {
        this.rutd = rutd;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public String getRutt() {
        return rutt;
    }

    public void setRutt(String rutt) {
        this.rutt = rutt;
    }

    @Override
    public String toString() {
        return "Venta{" + "cod_compra=" + cod_compra + ", rutd=" + rutd + ", folio=" + folio + ", nserie=" + nserie + ", rutt=" + rutt + '}';
    }
     
    
}

