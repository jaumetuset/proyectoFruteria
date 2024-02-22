<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ include file="../jspf/header.jspf"%>
<%@ include file="../jspf/menuPrincipal.jspf"%>

<div class="container">
    <h1>Listado de Frutas:</h1>
    <form action="list-carrito" method="POST"> <!-- Formulario para enviar los checkbox seleccionados -->
        <table class="table table-striped">
            <thead>
                <th>ID</th>
                <th>Nombre</th>
                <th>Tipo</th>
                <th>Precio</th>
                <th>Cantidad</th>
            </thead>
            <tbody>
                <c:forEach items="${frutasList}" var="fruta">
                    <tr>
                        <td>${fruta.id}</td>
                        <td>${fruta.nombre}</td>
                        <td>${fruta.tipo}</td>
                        <td>${fruta.precio}</td>
                        <td>${fruta.cantidad}</td>             
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a class="btn btn-primary" href="/list-carrito">Comprar</a>
    </form>
    <%@ include file="../jspf/paginacion.jspf"%>
</div>

<%@include file="../jspf/footer.jspf"%>
