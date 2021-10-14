<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List News</title>

<!-- reference our style sheet -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>

<body>

	<nav class="navbar navbar-light" style="background-color: #0275d8;">
      <div class="container-fluid">
          <span class="navbar-brand mb-0 h1">Breaking News</span>
      </div>
    </nav>

	<div id="container">

		<div id="content">

			<!-- put new button: Add Customer -->
            <button type="button" style="margin: 10px" class="btn btn-outline-primary" 
            onclick="window.location.href='showFormForAdd'; return false;">Add News</button>

				<!-- loop over and print our customers -->
				<c:forEach var="tempNews" items="${news}">

					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/news/showFormForUpdate">
						<c:param name="newsId" value="${tempNews.id}" />
					</c:url>

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/news/delete">
						<c:param name="newsId" value="${tempNews.id}" />
					</c:url>
					
					<!-- construct an "delete" link with customer id -->
					<c:url var="getNewsLink" value="/news/showOneNews">
						<c:param name="newsId" value="${tempNews.id}" />
					</c:url>

					<div class="card" style=" margin:10px 20px">
                       <h3 class="card-header">${tempNews.title}</h3>
                        <div class="card-body">
                          <p class="card-text">${tempNews.brief}</p>
                          <a href="${getNewsLink}" class="link-primary" style="display: inline; margin-right:5px">Read</a>
                          <a href="${updateLink}" class="link-primary" style="display: inline; margin-right:5px">Update</a>
                          <a href="${deleteLink}"  onclick="if (!(confirm('Are you sure you want to delete this News?'))) return false" class="link-primary" >Delete</a>
                     </div>
                    </div>
                    				
				</c:forEach>
		</div>
	</div>
  
</body>

</html>









