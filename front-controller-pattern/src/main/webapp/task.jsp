<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task</title>
</head>
<body style="background-color: #F4EAD5;">
<br><br>
<h1 style="color: #243763; text-align: center">Task</h1>

<table style="font-weight: bold; font-size: 23px; color: #243763; text-align: center; border: 6px solid; margin-left: 35%; margin-top: 5%">
  <tr >
    <th style="padding-left: 30px; padding-right: 30px; padding: 10px">Task ID:</th>
    <td style="padding-left: 30px; padding-right: 30px; padding: 10px">${taskDetail.id}</td>
  </tr>
  
  <tr>
    <th style="padding-left: 30px; padding-right: 30px; padding: 10px">Description:</th>
    <td style="padding-left: 30px; padding-right: 30px; padding: 10px";"> ${taskDetail.description}</td>
  </tr>
</table>


</body>
</html>