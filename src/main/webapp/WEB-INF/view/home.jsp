<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<body>
    <p><a href="/magazin/electrica/">Electrica</a></p>
    <p><a href="/magazin/angajat/">Angajat</a></p>
    <p><a href="/magazin/user/">Users</a></p>

    <sec:authorize access="isAuthenticated()">
        <p><a href="/magazin/logout">Logout</a></p>
    </sec:authorize>
</body>
</html>