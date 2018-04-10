<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tomcat Server Sample App</title>
</head>
<body>
<center>
  <h1>
      Available Brands
  </h1>
  <%
  List result= (List) request.getAttribute("brands");
  Iterator it = result.iterator();
  out.println("<br>We have <br><br>");
  while(it.hasNext()){
  out.println(it.next()+"<br>");
  }
  %>

  <a href="/sampleApp">Back to HOME</a>
</center>
</body>
</html>