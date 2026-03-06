package org.example.esocialsystem.controller;
import jakarta.servlet.annotation.WebServlet;
import org.example.esocialsystem.dao.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.esocialsystem.model.Employe;
import util.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/EmployeServlet")
public class EmployeServlet extends HttpServlet {
    EmployeDao employeDao =new EmployeDao();
    Employe employe = new Employe();


    public EmployeServlet() throws SQLException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        try {
            Connection connection = DatabaseConnection.getConnection();
        if("ajouter".equals(action)){


        String nom = req.getParameter("nom");
        Double salaireMensuelle = Double.valueOf(req.getParameter("salaireMensuelle"));
        int EmployeurId = Integer.parseInt(req.getParameter("EmployeurId"));


        employe.setNom(nom);
        employe.setSalaireMensuel(salaireMensuelle);
        employe.setEmployeur(EmployeurId);


      employeDao.AjouterEmploye(connection,employe);
        }
        if("modifier".equals(action)){
            int id = Integer.parseInt(req.getParameter("id"));
            Double salaireMensuelle = Double.valueOf(req.getParameter("salaireMensuelle"));
            employeDao.ModifierSalaire(connection,id,salaireMensuelle);
        }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

    Connection connection = null;
    try {
        connection = DatabaseConnection.getConnection();
        if(action.equals("consulter")){
            List<Employe> employes=new ArrayList<>();
            employes= employeDao.consulterEmploye(connection);}
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }}}





