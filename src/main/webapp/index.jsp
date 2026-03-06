<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="org.example.esocialsystem.model.Employe" %>

<!DOCTYPE html>
<html>
<head>
    <title>Gestion des Employés</title>

    <style>

        body{
            font-family: Arial;
            background:#f4f6f9;
            padding:40px;
        }

        h1{
            text-align:center;
            color:#333;
        }

        .container{
            width:70%;
            margin:auto;
        }

        form{
            background:white;
            padding:20px;
            border-radius:6px;
            margin-bottom:30px;
        }

        input{
            width:100%;
            padding:10px;
            margin:10px 0;
            border:1px solid #ccc;
            border-radius:4px;
        }

        button{
            padding:10px 20px;
            background:#007BFF;
            color:white;
            border:none;
            border-radius:4px;
            cursor:pointer;
        }

        button:hover{
            background:#0056b3;
        }

        table{
            width:100%;
            border-collapse:collapse;
            background:white;
        }

        th,td{
            padding:12px;
            border:1px solid #ddd;
            text-align:center;
        }

        th{
            background:#007BFF;
            color:white;
        }

        tr:hover{
            background:#f1f1f1;
        }

    </style>

</head>

<body>

<div class="container">

    <h1>Gestion des Employés</h1>

    <!-- FORMULAIRE AJOUT EMPLOYE -->

    <form action="EmployeServlet" method="post">

        <h3>Ajouter un Employé</h3>

        <input type="text" name="nom" placeholder="Nom de l'employé" required>

        <input type="number" step="0.01" name="salaireMensuel" placeholder="Salaire Mensuel" required>

        <input type="number" name="EmployeurId" placeholder="ID Employeur" required>

        <button type="submit" name="action" value="ajouter">Ajouter</button>

    </form>


    <!-- TABLEAU DES EMPLOYES -->

    <h3>Liste des Employés</h3>

    <table>

        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Salaire Mensuel</th>
            <th>Employeur ID</th>
        </tr>

        <%

            List<Employe> employes = (List<Employe>) request.getAttribute("employes");

            if(employes != null){

                for(Employe e : employes){

        %>

        <tr>
            <td><%= e.getId() %></td>
            <td><%= e.getNom() %></td>
            <td><%= e.getSalaireMensuel() %></td>
            <td><%= e.getEmployeurId() %></td>
        </tr>

        <%

                }

            }

        %>

    </table>

</div>

</body>
</html>