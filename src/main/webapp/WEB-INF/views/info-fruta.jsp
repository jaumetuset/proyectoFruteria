<%@ include file="../jspf/header.jspf"%>
<%@ include file="../jspf/menuPrincipal.jspf"%>

<div class="container">
    <h1>Detalles de la Fruta</h1>
    <dl class="row">
        <dt class="col-sm-3">ID:</dt>
        <dd class="col-sm-9">${fruta.id}</dd>
        
        <dt class="col-sm-3">Nombre:</dt>
        <dd class="col-sm-9">${fruta.nombre}</dd>
        
        <dt class="col-sm-3">Tipo:</dt>
        <dd class="col-sm-9">${fruta.tipo}</dd>
        
        <dt class="col-sm-3">Precio:</dt>
        <dd class="col-sm-9">${fruta.precio}</dd>
    </dl>
    <a class="btn btn-primary" href="<c:url value='/list-frutas/${fruta.id}/edit'/>">Editar</a>
    <a class="btn btn-danger" href="<c:url value='/list-frutas/${fruta.id}/delete'/>">Eliminar</a>
</div>

<%@include file="../jspf/footer.jspf"%>
