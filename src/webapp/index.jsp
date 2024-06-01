<!DOCTYPE html>
<html>
<head>
    <title>Registro de Factura</title>
</head>
<body>
    <h1>Registrar Nueva Factura</h1>
    <form action="factura" method="post">
        <label for="cliente">Cliente:</label>
        <input type="text" id="cliente" name="cliente" required>
        <br>
        <label for="total">Total:</label>
        <input type="number" id="total" name="total" step="0.01" required>
        <br>
        <button type="submit">Registrar</button>
    </form>
</body>
</html>
