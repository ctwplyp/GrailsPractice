<%--
  Created by IntelliJ IDEA.
  User: seanlaing
  Date: 12/29/17
  Time: 4:21 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>

<body>
Last Name:<g:fieldValue bean="${person}" field="lastName"/><br/>
First Name: <g:fieldValue bean="${person}" field="firstName"/><br/>
Age: <g:fieldValue bean="${person}" field="age"/><br/>

Another way to do this
Last Name of Hardcoded Person: ${person.lastName} <br/>
First Name of Hardcoded Person: ${person.firstName} <br/>
Age of Person of Hardcoded Person: ${person.age} <br/>
</body>
</html>