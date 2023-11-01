<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
        <p><a href="/magazin/">Home</a></p>
        <h2>Toati Users</h2>
        <br>
        <table>
            <tr>
                <th>Name</th>
                <th>Password</th>
                <th>IS ADMIN</th>
                <th>Operatii</th>
            </tr>
            <c:forEach var ="user" items="${allUser}">
                <c:url var="updateButton" value="/user/updateInfo">
                    <c:param name="userId" value="${user.id}"/>
                </c:url>
                 <c:url var="deleteButton" value="/user/deleteUser">
                    <c:param name="userId" value="${user.id}"/>
                </c:url>
                <tr>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.is_admin}</td>
                    <td>
                        <input type="button" value="Update" onClick="window.location.href='${updateButton}'"/>
                        <input type="button" value="Delete" onClick="window.location.href='${deleteButton}'"/>
                    </td>
                    
                </tr>
            </c:forEach>
        </table>
        <br> 
        <input type="button" value="Adauga" onclick="window.location.href = 'addNewUser'"/>
        
    </body>
</html>
