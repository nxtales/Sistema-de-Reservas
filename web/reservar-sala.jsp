<%-- 
    Document   : reservar-sala
    Created on : 5 de abr. de 2024, 00:39:50
    Author     : nzxtt
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="classes.SalaReuniao" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Reserva</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #03edc6;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #6327b3;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }
        input[type="text"], input[type="date"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #6327b3;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #4d1b8a;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Cadastro de Reserva</h2>
        <form action="SalvarReservaServlet" method="post">
            <label for="inicio">Data de Início:</label>
            <input type="date" id="inicio" name="inicio" required><br>

            <label for="fim">Data de Fim:</label>
            <input type="date" id="fim" name="fim" required><br>

    <label for="salareuniao">Sala de Reunião:</label>
    <select id="salareuniao" name="salareuniao" required>
        <c:forEach var="sala" items="${salas}" >
            <c:if test="${sala.disponibilidade == 1}">
                <option value="${sala.nome}">${sala.nome} , capacidade: ${sala.capacidade}</option>
            </c:if>
        </c:forEach>
</select><br><br>

<label for="reservadoPor">Reservado Por:</label>
<input type="text" id="reservadoPor" name="reservadoPor" required><br>

<label for="quantasPessoas">Quantidade de Pessoas:</label>
<input type="text" id="quantasPessoas" name="quantasPessoas" required><br>

<input type="submit" value="Cadastrar">
</form>
</div>
</body>
</html>

</body>
</html>
