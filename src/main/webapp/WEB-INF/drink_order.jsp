<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Drink Order</title>
</head>
<body>
 <div>
 <fieldset>
 	<legend> Hava cup of Drink</legend>
 	飲料:${drinkOrder.type }<br/>
 	容量:${drinkOrder.size}<br/>
 	含冰:${drinkOrder.ice}<br/>
 	     ${drinkOrder.info}
 </fieldset>
 </div>
</body>
</html>