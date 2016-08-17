<%--
  Created by IntelliJ IDEA.
  User: rmiao
  Date: 8/16/2016
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ex" uri="/WEB-INF/hello.tld" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  $END$
  <br/>-----------------------------------------------<br/>
  <ex:hello/>
  <br/>-----------------------------------------------<br/>
  <ex:body>
    This is message body.
  </ex:body>
  <br/>-----------------------------------------------<br/>
  <ex:msg message="show message from para">
  </ex:msg>
  ---------------
  <ex:msg>
    if message==null , then show body.
  </ex:msg>
  <br/>-----------------------------------------------<br/>
  ${ex:welcome('Leslie')}
  <br/>-----------------------------------------------<br/>
  ${ex:isHotelIn('759')}
  <br/>-----------------------------------------------<br/>
  <br/>-----------------------------------------------<br/>




  </body>
</html>
