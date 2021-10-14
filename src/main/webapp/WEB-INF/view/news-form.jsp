<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<title>Save News</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>

<body>
	
	<nav class="navbar navbar-light" style="background-color: #0275d8;">
      <div class="container-fluid">
          <span class="navbar-brand mb-0 h1">Breaking News</span>
      </div>
    </nav>

	<div id="container">
		<h3>Save News</h3>
	
		<form:form action="saveNews" modelAttribute="news" method="POST">
             
             <form:hidden path="id" />
              
             
              <div class="form-group" style="margin: 10px">
                 <label style="font-size: 25px; font-weight: bold;">Title</label>
                 <form:textarea path="title" class="form-control"  rows="1" />
                 <form:errors path="title" cssStyle="color: #ff0000;" />
              </div>
              
			  <div class="form-group" style="margin: 10px">
                 <label style="font-size: 25px; font-weight: bold;">Brief</label>
                 <form:textarea path="brief" class="form-control"  rows="3" />
                 <form:errors path="brief" cssStyle="color: #ff0000;" />
              </div>
              
               <div class="form-group" style="margin: 10px">
                 <label style="font-size: 25px; font-weight: bold;">Content</label>
                 <form:textarea path="content" class="form-control"  rows="5" />
                 <form:errors path="content" cssStyle="color: #ff0000;" />
              </div>
        
			
			  <button type="submit" class="btn btn-primary" style="margin:10px">Save</button>
		</form:form>
	
		<div style="clear; both;"></div>
		
		 <p>
		   <a href="list">Back to List</a>
		</p>
  	</div>
</body>

</html>










