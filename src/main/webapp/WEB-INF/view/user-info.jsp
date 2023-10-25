<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<<html>

    <body>
        <h2>Users Info</h2>
        <form:form action="saveUser" modelAttribute="user">
            <form:hidden path="id"/>
            Name <form:input path="name"/>
            Surname <form:input path="surname"/>
            Email <form:input path="email"/>
            Password <form:input path="password"/>
            <input type="submit" value="OK">
        </form:form>
    </body>
</html>


