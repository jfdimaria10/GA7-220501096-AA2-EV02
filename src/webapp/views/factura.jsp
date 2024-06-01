<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Facturas</title>
</head>
<body>
    <h1>Lista de Facturas</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Cliente</th>
            <th>Fecha</th>
            <th>Total</th>
        </tr>
        <%
            List<Factura> facturas = (List<Factura>) request.getAttribute("facturas");
            if (facturas != null) {
                for (Factura factura : facturas) {
        %>
        <tr>
            <td><%= factura.getId() %></td>
            <td><%= factura.getCliente() %></td>
            <td><%= factura.getFecha() %></td>
            <td><%= factura.getTotal() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>
