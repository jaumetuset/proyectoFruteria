<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ include file="../jspf/header.jspf"%>
<%@ include file="../jspf/menuPrincipal.jspf"%>

<div class="container">
    <h1>Editar Fruta</h1>
    <mvc:form modelAttribute="fruta" method="POST">
        <div class="form-group">
            <label for="nombre">Nombre:</label>
            <mvc:input path="nombre" id="nombre" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="tipo">Tipo:</label>
            <mvc:input path="tipo" id="tipo" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="precio">Precio:</label>
            <mvc:input path="precio" id="precio" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">Guardar Cambios</button>
    </mvc:form>
</div>

<%@include file="../jspf/footer.jspf"%>
