package org.example.esocialsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Employeur {

        private int id;

        private String raisonSociale;


        private String secteurActivite;

        public Employeur(int id, String raisonSociale, String secteurActivite) {
            this.id = id;
            this.raisonSociale = raisonSociale;
            this.secteurActivite = secteurActivite;
        }
        public Employeur() {

        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getRaisonSociale() {
            return raisonSociale;
        }
        public void setRaisonSociale(String raisonSociale) {
            this.raisonSociale = raisonSociale;
        }
        public String getSecteurActivite() {
            return secteurActivite;
        }
        public void setSecteurActivite(String secteurActivite) {
            this.secteurActivite = secteurActivite;
        }

    }




