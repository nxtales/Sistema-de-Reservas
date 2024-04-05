<%-- 
    Document   : exibirReservas
    Created on : 5 de abr. de 2024, 02:23:15
    Author     : nzxtt
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Exibir Reservas</title>
    <style>
        /* Estilos para a tabela */
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #03edc6;
            color: white;
        }
        /* Estilos para os botões */
        .btn-remove {
            background-color: #6327b3;
            color: white;
            border: none;
            padding: 5px 10px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            cursor: pointer;
        }
        .btn-remove:hover {
            background-color: #401b7a;
        }
    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap"
        rel="stylesheet">

    <title>ReservaTales - Sistema de Reservas</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-space-dynamic.css">
    <link rel="stylesheet" href="assets/css/animated.css">
    <link rel="stylesheet" href="assets/css/owl.css">
    <!--
</head>
<body>
        <!-- ***** Header Area Start ***** -->
        <header class="header-area header-sticky wow slideInDown" data-wow-duration="0.75s" data-wow-delay="0s">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav class="main-nav">
                            <!-- ***** Logo Start ***** -->
                            <a href="index.html" class="logo">
                                <h4>Reserva<span>Tales</span></h4>
                            </a>
                            <!-- ***** Logo End ***** -->
                            <!-- ***** Menu Start ***** -->
                            <ul class="nav">
                                <li class="scroll-to-section"><a href="./index.html" class="active">Home</a></li>
                                <li class="scroll-to-section"><a href="#about">Sobre Nós</a></li>
                                <li class="scroll-to-section"><a href="CarregarReservasServlet">Ver Reservas</a></li>
                                <li class="scroll-to-section"><div class="main-red-button"><form action="CarregarSalasServlet" method="get">
                                    <button type="submit">Reservar Agora</button>
                                </form></div></li>
                            </ul>
                            <a class='menu-trigger'>
                                <span>Menu</span>
                            </a>
                            <!-- ***** Menu End ***** -->
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- ***** Header Area End ***** -->
    <h2>Reservas</h2>
    <table>
        <thead>
            <tr>
                <th>Data de Início</th>
                <th>Data de Fim</th>
                <th>Sala de Reunião</th>
                <th>Reservado Por</th>
                <th>Quantidade de Pessoas</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="reserva" items="${listaReservas}">
                <tr>
                    <td id="inicio" name="inicio">${reserva.inicio}</td>
                    <td id="fim" name="fim">${reserva.fim}</td>
                    <td id="salareuniao" name="salareuniao">${reserva.salareuniao.nome}</td>
                    <td id="reservadoPor" name="reservadoPor">${reserva.reservadoPor}</td>
                    <td id="quantasPessoas" name="quantasPessoas">${reserva.quantasPessoas}</td>
                    <td><a href="RemoverReservaServlet?reserva=${reserva}" class="btn-remove">Remover</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

