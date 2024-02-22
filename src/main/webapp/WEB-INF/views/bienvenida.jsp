<%@ include file="../jspf/header.jspf"%>
<%@ include file="../jspf/menuPrincipal.jspf"%>
<div class="container">
    <h1> Bienvenid@ a Fruteria TUSET</h1>
    <p> HEAL FRUIT TO YOU </p>
   <form action="/list-frutas" method="get">
        <button type="submit">Comprar</button>
    </form>
</div>
<style>
    .container {
    margin-top: 50px;
    text-align: center;
    }

    h1 {
        color: #333;
    }

    p {
        font-size: 18px;
        color: #666;
    }

    button {
        background-color: #4CAF50; /* Green */
        border: none;
        color: white;
        padding: 15px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        transition-duration: 0.4s;
        cursor: pointer;
        border-radius: 8px;
    }

    button:hover {
        background-color: #45a049;
    }
</style>
<%@ include file="../jspf/footer.jspf" %>