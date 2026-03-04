import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeDao {

    public void AjouterEmploye(Connection connection ,Employe employe) throws SQLException {

        PreparedStatement preparedStatement= connection.prepareStatement("insert into Employe(nom,salaireMensuel) value (?,?)");
        preparedStatement.setString(1, employe.getNom());
        preparedStatement.setDouble(2, employe.getSalaireMensuel());
        preparedStatement.executeUpdate();
    }
    public void ModifierSalaire(Connection connection ,Employe employe) throws SQLException {

        PreparedStatement preparedStatement= connection.prepareStatement(" update Employe set salaireMensuel=? where id=?");
        preparedStatement.setDouble(1,employe.getSalaireMensuel() );
        preparedStatement.executeUpdate();
    }
    public void consulterEmploye(Connection connection) throws SQLException {
        List<Employe> employe = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from Employe");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("=======list des Employe=======");
            System.out.println("ID :" +
                    resultSet.getInt("id") + " nom : " +
                    resultSet.getString("nom") + "salaire mensuelle : " +
                    resultSet.getDouble("salaireMensuelle") + "ID d'employeur : "

            );
        }

    }}
