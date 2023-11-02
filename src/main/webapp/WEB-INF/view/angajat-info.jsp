<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<<html>

    <body>
        <h2>Angajat Info</h2>
            <p><a href="/magazin/angajat/">Back</a></p>
        <form:form action="saveAngajat" modelAttribute="angajat">
            <form:hidden path="id"/>
            Nume <form:input path="name"/>
            Prenume <form:input path="surname"/>
            Salariu <form:input path="salary"/>
            <input type="submit" value="OK">
        </form:form>
    </body>
</html>

