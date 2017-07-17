<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title></title>
<script>
 function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}
</script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="myForm" action = "simpleform" onsubmit="return validateForm();" method = "GET">
         First Name: <input type = "text" name = "name" pattern="[A-Za-z]{1,15}" required title="John"><br><br>
         Last Name: <input type = "text" name = "surname" pattern="[A-Za-z]{1,15}" required title="Hayes"><br><br>       
         Gender: <input type="radio" name="gender" required value="male" />Male
         <input type="radio" name="gender" required value="female" />Female<br><br>
         Email: <input type = "text" name="email" required><br><br>
         Request:
 		<input type="checkbox" name="choice" value="Newsletter" />Newsletter
 		<input type="checkbox" name="choice" value="Brochure" />Brochure
 		<input type="checkbox" name="choice" value="Test drive" />Test drive<br><br>
 		
 		<input type = "submit" value = "Submit" />     
      
      </form>
 </body>
</html>