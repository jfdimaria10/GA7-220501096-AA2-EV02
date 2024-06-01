package com.miempresa.ventas.dao;

import java.util.ArrayList;
import java.util.List;
import com.miempresa.ventas.model.Factura;

public class FacturaDAO {
    private List<Factura> facturas = new ArrayList<>();

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> obtenerTodas() {
        return facturas;
    }
}
