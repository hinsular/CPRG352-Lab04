<%-- 
    Document   : editnote.jsp
    Created on : 11-Feb-2022, 1:43:43 AM
    Author     : Honeylene Insular
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <form action="note" method="POST">
            <div name="title">
                <h1>Simple Note Keeper</h1>
                <h2>Edit Note</h2>
            </div>
            
            <div>
                <label>Title:</label>
                <input type="text" name="title_edit" value="${note.title}">
                <br>
                <label>Contents:</label>
                <input type="text" name="content_edit" value="${note.content}">
                <br>
                <input type="submit" value="Save">
            </div>
        </form>
    </body>
</html>
