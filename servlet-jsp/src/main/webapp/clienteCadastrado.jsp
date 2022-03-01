<%
   String nomeCliente = (String)request.getAttribute("nome");
   String emailCliente = (String)request.getAttribute("email");
%>
<html>
<head>
    <title>Cliente Cadastrado</title>
</head>
<body>
    <h1> <%=nomeCliente%> (<%=emailCliente%>) Cadastrado com sucesso</h1>
</body>
</html>
