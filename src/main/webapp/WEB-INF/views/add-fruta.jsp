<%@ include file="../jspf/header.jspf"%>
<%@ include file="../jspf/menuPrincipal.jspf"%>

<div class="container">
    <h1>Agregar Nueva Fruta</h1>
    <form action="<c:url value='/add-frutas'/>" method="POST" class="form-horizontal">
        <div class="form-group">
            <label for="nombre" class="col-sm-2 control-label">Nombre:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
        </div>
        <div class="form-group">
            <label for="tipo" class="col-sm-2 control-label">Tipo:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="tipo" name="tipo" required>
            </div>
        </div>
        <div class="form-group">
            <label for="precio" class="col-sm-2 control-label">Precio:</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="precio" name="precio" required>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Agregar Fruta</button>
            </div>
        </div>
    </form>
</div>

<%@include file="../jspf/footer.jspf"%>
