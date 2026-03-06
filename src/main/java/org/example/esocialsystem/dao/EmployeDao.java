package org.example.esocialsystem.dao;

import org.example.esocialsystem.model.Employe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeDao {

    public void AjouterEmploye(Connection connection , Employe employe) throws SQLException {

        PreparedStatement preparedStatement= connection.prepareStatement("insert into Employe(nom,salaireMensuel) value (?,?)");
        preparedStatement.setString(1, employe.getNom());
        preparedStatement.setDouble(2, employe.getSalaireMensuel());
        preparedStatement.executeUpdate();

    }
    public void ModifierSalaire(Connection connection , int id,double salaire) throws SQLException {

        PreparedStatement preparedStatement= connection.prepareStatement(" update Employe set salaireMensuel=? where id=?");
        preparedStatement.setDouble(1,salaire );
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }
    public List<Employe> consulterEmploye(Connection connection) throws SQLException {
        List<Employe> employes = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from Employe");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
           Employe employe = new Employe();
                  employe.setId(resultSet.getInt("id"));
                  employe.setNom(resultSet.getString("nom"));
                  employe.setSalaireMensuel(resultSet.getDouble("salaireMensuelle"));
           employes.add(employe);
        }
return employes;
    }}
