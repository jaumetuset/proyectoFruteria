<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ include file="../jspf/header.jspf"%>
<%@ include file="../jspf/menuPrincipal.jspf"%>

<div class="container">
    <h1>Compra:</h1>
    <table class="table table-striped">
        <thead>
            <th>ID</th>
            <th>Nombre</th>
            <th>Tipo</th>
            <th>Precio</th>
            <th>Cantidad</th>
            <th></th>
        </thead>
        <tbody>
            <c:forEach items="${carritoList}" var="carrito">
                <tr>
                    <td>${carrito.id}</td>
                    <td>${carrito.nombre}</td>
                    <td>${carrito.tipo}</td>
                    <td>${carrito.precio}</td>
                    <td>${carrito.cantidad}</td>
                    <td>
                        <a class="btn btn-primary" href="del-carrito?id=${carrito.id}">
                            Eliminar
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <hr>
</div>

<%@include file="../jspf/footer.jspf"%>
