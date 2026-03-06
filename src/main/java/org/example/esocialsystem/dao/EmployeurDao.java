package org.example.esocialsystem.dao;

import org.example.esocialsystem.model.Employeur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeurDao {

    public void ajouterEmployeur(Connection connection, Employeur e) throws SQLException {

        String sql = "INSERT INTO employeur (id, raison_sociale, secteur_activite) VALUES (?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, e.getId());
        ps.setString(2, e.getRaisonSociale());
        ps.setString(3, e.getSecteurActivite());

        ps.executeUpdate();
        ps.close();
    }


    public List<Employeur> getAllEmployeurs(Connection connection) throws SQLException {

        List<Employeur> employeurs = new ArrayList<>();

        String sql = "SELECT * FROM employeur";

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {

            Employeur e = new Employeur();

            e.setId(rs.getInt("id"));
            e.setRaisonSociale(rs.getString("raison_sociale"));
            e.setSecteurActivite(rs.getString("secteur_activite"));

            employeurs.add(e);
        }

        rs.close();
        stmt.close();

        return employeurs;
    }


    public Employeur getEmployeurById(Connection connection, int id) throws SQLException {

        String sql = "SELECT * FROM employeur WHERE id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        Employeur e =  new Employeur();

        if (rs.next()) {



            e.setId(rs.getInt("id"));
            e.setRaisonSociale(rs.getString("raison_sociale"));
            e.setSecteurActivite(rs.getString("secteur_activite"));
        }

        rs.close();
        ps.close();

        return e;
    }

}