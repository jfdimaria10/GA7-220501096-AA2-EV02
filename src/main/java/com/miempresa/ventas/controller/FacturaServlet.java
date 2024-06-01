package com.miempresa.ventas.controller;

import com.miempresa.ventas.model.Factura;
import com.miempresa.ventas.dao.FacturaDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet("/factura")
public class FacturaServlet extends HttpServlet {
    private FacturaDAO facturaDAO;

    public void init() {
        facturaDAO = new FacturaDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Factura> facturas = facturaDAO.obtenerTodas();
        request.setAttribute("facturas", facturas);
        request.getRequestDispatcher("views/factura.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cliente = request.getParameter("cliente");
        double total = Double.parseDouble(request.getParameter("total"));

        Factura nuevaFactura = new Factura();
        nuevaFactura.setCliente(cliente);
        nuevaFactura.setFecha(new Date());
        nuevaFactura.setTotal(total);

        facturaDAO.agregarFactura(nuevaFactura);

        response.sendRedirect("factura");
    }
}
