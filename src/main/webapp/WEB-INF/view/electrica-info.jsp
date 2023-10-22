<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<<html>

    <body>
        <h2>Electrica Info</h2>
        <form:form action="saveElectrica" modelAttribute="electrica">
            <form:hidden path="id"/>
            Denumire <form:input path="name"/>
            Model <form:input path="model"/>
            Pret <form:input path="price"/>
            <input type="submit" value="OK">
        </form:form>
    </body>
</html>

