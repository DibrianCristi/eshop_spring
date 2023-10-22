<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
        <p><a href="/magazin/">Home</a></p>
        <h2>Toti angajati</h2>
        <br>
        <table>
            <tr>
                <th>Nume</th>
                <th>Familie</th>
                <th>Salariu</th>
                <th>Operatii</th>
            </tr>
            <c:forEach var ="ang" items="${allAng}">
                <c:url var="updateButton" value="/angajat/updateInfo">
                    <c:param name="angId" value="${ang.id}"/>
                </c:url>
                 <c:url var="deleteButton" value="/angajat/deleteAngajat">
                    <c:param name="angId" value="${ang.id}"/>
                </c:url>
                <tr>
                    <td>${ang.name}</td>
                    <td>${ang.surname}</td>
                    <td>${ang.salary}</td>
                    <td>
                        <input type="button" value="Update" onClick="window.location.href='${updateButton}'"/>
                        <input type="button" value="Delete" onClick="window.location.href='${deleteButton}'"/>
                    </td>
                    
                </tr>
            </c:forEach>
        </table>
        <br> 
        <input type="button" value="Adauga" onclick="window.location.href = 'addNewAngajat'"/>
        
    </body>
</html>
