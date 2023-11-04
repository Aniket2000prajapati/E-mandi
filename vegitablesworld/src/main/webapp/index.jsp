<%-- 
    Document   : index
    Created on : Nov 7, 2022, 9:28:18 PM
    Author     : hp
--%>

<%@page import="com.learn.vegitablesworld.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VEGETABLESWORLD</title>
        <%@include file="components/common-css-js.jsp" %>
         
    </head>
    <body>
        
        
        <%@include file="components/nevbar.jsp" %>
        
        <h1>Hello World!</h1>
        <h1>Hello nnWorld!</h1>
        <h1> Creating session factory</h1>
        <%  
              out.println(FactoryProvider.getFactory()+"<br>");
              out.println(FactoryProvider.getFactory()+"<br>");
              out.println(FactoryProvider.getFactory());
        %>
            </body>
</html>
