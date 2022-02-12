<%-- 
    Document   : viewnote.jsp
    Created on : 11-Feb-2022, 1:43:13 AM
    Author     : Honeylene Insular
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div name="title">
            <h1>Simple Note Keeper</h1>
        </div>
        <div name="content">
            <h3>Title: </h3>
            <p>${note.title}</p>
            <h3>Contents:</h3>
            <p>${note.content}</p>

        </div>  
      
            <a href="note?edit"></a>
    </body>
    
  
</html>
