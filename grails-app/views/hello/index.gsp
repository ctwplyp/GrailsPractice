<%--
  Created by IntelliJ IDEA.
  User: seanlaing
  Date: 12/29/17
  Time: 4:21 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="test"/>
    <title>I am a test page</title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
</head>

<body>
<p>The quick brown fox jumps over the lazy dog.</p>
<table>
    <tr>
        <td>Name</td>
        <td>Age</td>
    </tr>
    <g:each in="${list}" var="person">
        <tr>
            <td>${person.lastName}, ${person.firstName}</td>
            <td>${person.age}</td>
        </tr>
    </g:each>
</table>
</body>
</html>