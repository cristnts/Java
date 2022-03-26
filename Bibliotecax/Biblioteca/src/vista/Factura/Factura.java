/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Factura;

/**
 *
 * @author vaio
 */
public class Factura {
    private String folio;
    private String precioneto;
    private String costoiva;
    private String fechacompra;
    private String horaventa;
    private String metodopago;

    public Factura() {
    }

    public Factura(String folio, String precioneto, String costoiva, String fechacompra, String horaventa, String metodopago) {
        this.folio = folio;
        this.precioneto = precioneto;
        this.costoiva = costoiva;
        this.fechacompra = fechacompra;
        this.horaventa = horaventa;
        this.metodopago = metodopago;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getPrecioneto() {
        return precioneto;
    }

    public void setPrecioneto(String precioneto) {
        this.precioneto = precioneto;
    }

    public String getCostoiva() {
        return costoiva;
    }

    public void setCostoiva(String costoiva) {
        this.costoiva = costoiva;
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getHoraventa() {
        return horaventa;
    }

    public void setHoraventa(String horaventa) {
        this.horaventa = horaventa;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    @Override
    public String toString() {
        return "Factura{" + "folio=" + folio + ", precioneto=" + precioneto + ", costoiva=" + costoiva + ", fechacompra=" + fechacompra + ", horaventa=" + horaventa + ", metodopago=" + metodopago + '}';
    }
    
    
    
}
