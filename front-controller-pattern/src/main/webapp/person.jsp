<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
</head>
<body style="background-color: #F4EAD5;">
<br><br>
<h1 style="color: #243763; text-align: center">Person</h1>

<table style="font-weight: bold;
    font-size: 25px; color: #243763; text-align: center; border: 6px solid; margin-left: 40%; margin-top: 5%">
  <tr >
    <th style="padding-left: 30px; padding-right: 30px; padding: 10px" >Person ID:</th>
    <td style="padding-left: 30px; padding-right: 30px; padding: 10px">${personDetail.id}</td>
  </tr>
  
  <tr>
    <th style="padding-left: 30px; padding-right: 30px; padding: 10px">First name:</th>
    <td style="padding-left: 30px; padding-right: 30px; padding: 10px"> ${personDetail.name}</td>
  </tr>
  <tr>
    <th style="padding-left: 30px; padding-right: 30px; padding: 10px">Last name:</th>
    <td style="padding-left: 30px; padding-right: 30px; padding: 10px;"> ${personDetail.surname}</td>
  </tr>
</table>

</body>
</html>