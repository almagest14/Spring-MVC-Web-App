<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>ModelAndView</title>
    </head>
    <body>
        <h1>ModelAndView: List of strings</h1>
        <ul>
            <c:forEach var="item" items="${items}">
                <li>Item: ${item}</li>
            </c:forEach>
        </ul>
    </body>
</html>
