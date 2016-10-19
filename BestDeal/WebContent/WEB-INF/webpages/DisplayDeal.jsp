<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Display Deal</title>
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
    
    
    
  </head>
  <body>
  <%@ page isELIgnored="false" %>
  <div>
  <h1 class="header">HOT Deal</h1>
  {List}
 </div> 
 
<table>
   <tr>
      <th>DealID</th>
      <th>Deal URL</th>
      <!-- rest of you columns -->
      
   </tr>

	

   <c:forEach var="list" items="${List}">
     <tr>
         <td>${list.dealId}</td>
         <td>${list.dealUrl}</td> 
         <!-- rest of you columns data-->
     </tr>
   </c:forEach>

 </table>   
	
	
	<!-- custom js files-->
	<script src="<c:url value="resources/js/custom.js" />"></script>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="<c:url value="resources/js/jquery.min.js" />"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
  </body>
</html> --%>
<html>
<title>Display DEal</title>
<head>
     
<link rel="stylesheet" type="text/css" href="<c:url value="resources/DisplayDealStyles.css" />">   
</head>

<body>
<div class="header">
<ul class="">
<li><a href="" >ALL</a></li>
<li><a href="" >DEALS</a></li>    
<li><a href="" >VOUCHERS</a></li>    
<li><a href="" >FREEBIES</a></li>    
<li><a href="" >MORE</a></li>    
</ul>
    
</div>    
<div class="submitblock">
<ul>
<li style="margin-left:10px;">    
<a style="background-color: #888885;
 color: azure;" href=""> HIGHLIGHTS </a>
</li>
<li style="margin-left:10px;">    
<a  style="background-color:#888885;
 color: azure;" href=""> HOT </a>
</li>
<li style="margin-left:10px;">    
<a style="background-color:#888885;
 color: azure;" href=""> NEW </a>
</li>

<li style="margin-left:10px;">    
<a  style="background-color:#888885;
 color: azure;" href=""> DISCUSSED </a>
</li>
    
</ul>    
<a  class="Abutton" style="background-color: #b91f00;
float: right;
 color: azure;" href=""> SUBMIT + </a>
    
</div>
   
     
<div class="dealclass">
    
     <div class="dealdetail" style="diplay:inline">
    <div class="column textstylehits" style="diplay:inline;width=20px;">3071</div>    
    <div class="column textstyledeal">
    <h3>Dealname </h3>    
    <p>Perfect deal amazon provides this deal with great discount.
    The deal is prime verified  </p>    

    <p class="dealcreator">BY -HARI PILLAI&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2016-06-06 </p>    
    </div>
    
    <div class="column" style="diplay:inline">
    <img class="dealimage" src="Nexus_5X.png">  
    <a  class="Abutton" style="background-color: #6e8800;
    background-color: #6e8800;
    color: azure;
    position: absolute;
    margin-left: 190px;
    margin-top: 60px;  " href=""> Get Deal </a>
    
    
    </div>
    </div>

    <div class="dealdetail" style="diplay:inline">
    <div class="column textstylehits" style="diplay:inline;width=20px;">3070</div>    
    <div class="column textstyledeal">
    <h3>Dealname </h3>    
    <p>Perfect deal amazon provides this deal with great discount.
    The deal is prime verified  </p>    

    <p class="dealcreator">BY -HARI PILLAI&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2016-06-06 </p>    
    </div>
    
    <div class="column" style="diplay:inline">
    <img class="dealimage" src="Nexus_5X.png">     
    <a  class="Abutton" style="background-color: #6e8800;
    background-color: #6e8800;
    color: azure;
    position: absolute;
    margin-left: 190px;
    margin-top: 60px;  " href=""> Get Deal </a>

    </div>
    </div>

    



  


    
    </div>    
    
     
    
    
</body>    




</html>