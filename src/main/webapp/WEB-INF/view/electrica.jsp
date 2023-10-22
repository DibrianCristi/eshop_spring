<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
        <p><a href="/magazin/">Home</a></p>
        <h2>Toata Electrica</h2>
        <br>
        <table>
            <tr>
                <th>Denumire</th>
                <th>Model</th>
                <th>Pret</th>
                <th>Operatii</th>
            </tr>
            <c:forEach var ="prd" items="${allPrd}">
                <c:url var="updateButton" value="/electrica/updateInfo">
                    <c:param name="prdId" value="${prd.id}"/>
                </c:url>
                 <c:url var="deleteButton" value="/electrica/deleteElectrica">
                    <c:param name="prdId" value="${prd.id}"/>
                </c:url>
                <tr>
                    <td>${prd.name}</td>
                    <td>${prd.model}</td>
                    <td>${prd.price}</td>
                    <td>
                        <input type="button" value="Update" onClick="window.location.href='${updateButton}'"/>
                        <input type="button" value="Delete" onClick="window.location.href='${deleteButton}'"/>
                    </td>
                    
                </tr>
            </c:forEach>
        </table>
        <br> 
        <input type="button" value="Adauga" onclick="window.location.href = 'addNewElectrica'"/>
        
    </body>
</html>
