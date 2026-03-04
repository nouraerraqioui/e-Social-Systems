import java.sql.Date;

public class Declaration {
        private int id;
        private int mois;
        private int date;
        private Date dateDeclaration;
        public Declaration(int id, int mois, int date, Date dateDeclaration) {
            this.id = id;
            this.mois = mois;
            this.date = date;
            this.dateDeclaration = dateDeclaration;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getMois() {
            return mois;
        }
        public void setMois(int mois) {
            this.mois = mois;
        }
        public int getDate() {
            return date;
        }
        public void setDate(int date) {
            this.date = date;
        }
        public Date getDateDeclaration() {
            return dateDeclaration;
        }
        public void setDateDeclaration(Date dateDeclaration) {
            this.dateDeclaration = dateDeclaration;
        }

    }


