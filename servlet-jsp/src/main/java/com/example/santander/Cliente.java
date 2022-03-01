package com.example.santander;

import com.example.santander.model.ClienteModel;
import com.example.santander.model.ListaClientes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Cliente", value = "/cliente")
public class Cliente extends HttpServlet {

    ListaClientes listaClientes = new ListaClientes();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCliente = request.getParameter("nomeCliente"); // Requisição de dado "nome"
        String emailCliente = request.getParameter("emailCliente"); // Requisição de dado "e-mail"
        String dataNascCliente = request.getParameter("dataNascCliente"); // Requisição de dado "data de nascimento"

        ClienteModel cliente = new ClienteModel(); // Instanciar classe "Cliente"
        cliente.setNome(nomeCliente); // definir atributo nome da classe Cliente
        cliente.setEmail(emailCliente); // definir atributo email da classe Cliente
        cliente.setData(dataNascCliente); // definir atributo data de nascimento da classe Cliente

        listaClientes.adiciona(cliente); // Add cliente a lista de clientes

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("clienteCadastrado.jsp");
        request.setAttribute("nome", cliente.getNome()); // Definir atributo nome no jsp
        request.setAttribute("email", cliente.getEmail()); // Definir atributo email no jsp
        request.setAttribute("data", cliente.getData()); // Definir atributo data no jsp
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ClienteModel> clientes = listaClientes.buscaClientes();

        request.setAttribute("clientes", clientes);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaClientes.jsp");
        requestDispatcher.forward(request, response);

    }

}
