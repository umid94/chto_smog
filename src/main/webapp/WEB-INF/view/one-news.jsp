<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One News</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
   <nav class="navbar navbar-light" style="background-color: #0275d8;">
      <div class="container-fluid">
          <span class="navbar-brand mb-0 h1">Breaking News</span>
      </div>
    </nav>
   <h1>${news.title}</h1>
   <p>${news.content}</p>
   <p>
	 <a href="list">Back to List</a>
   </p>
</body>
</html>