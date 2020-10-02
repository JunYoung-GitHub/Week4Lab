<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br>
        <h2>Edit Note</h2><br>
        <form method="post" action="hello">
            Title: <input type="text" name="title" value="${title}"><br>
            Contents: <input type="text" name="content" value="${content}"><br>
            <input type="submit" value="Save">
        </form>
        
    </body>
</html>
