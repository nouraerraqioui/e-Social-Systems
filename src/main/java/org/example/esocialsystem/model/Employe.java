package org.example.esocialsystem.model;



public class Employe {


    private int id;


    private String nom;


    private double salaireMensuel;


    private int EmployeurId;



    public Employe(int id, String nom, double salaireMensuel, int EmployeurId) {
        this.nom = nom;
        this.salaireMensuel = salaireMensuel;
        this.EmployeurId=EmployeurId;

    }

    public Employe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public int getEmployeurId() {
        return EmployeurId;
    }

    public void setEmployeur(int EmployeurId) {
        this.EmployeurId = EmployeurId;
    }
}