<%--
  Created by IntelliJ IDEA.
  User: nidha
  Date: 10/1/2022
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>list</title>
    <style type="text/css">
        body {
            font-family: Verdana, Arial, Helvetica, sans-serif;
            font-size: 14px;
        }

        .header {
            font-family: Verdana, Arial, Helvetica, sans-serif;
            font-size: 18px;
        }

        .bottom {
            font-family: Verdana, Arial, Helvetica, sans-serif;
            font-size: 9px;
            text-align: center;
            vertical-align: middle;
            color: #8E969D;

        }
        img{
            height: 100%;
            width: 100%;
        }
    </style>
    <link type="text/css" rel="stylesheet" href="resources/css/global.css" />
</head>
<body>
<table style="border: 1px solid #CAD6E0" align="center" cellpadding="0"
       cellspacing="0" border="0" width="400">
    <tbody>

    <tr>
        <td class="header" height="42" align="center" valign="middle"
            width="100%" bgcolor="#E4EBEB">Entry Form | Catalog</td>
    </tr>
    <tr>
        <td height="1" width="100%" bgcolor="#CAD6E0"></td>
    </tr>
    <tr>
        <td><img src="resources/img/banner.jpg"  alt="banner"/></td>
    </tr>
    <tr>
        <td width="100%" colspan="2">
            <table width="100%"  align="left"
                   cellpadding="0" cellspacing="0" border="0">
                <tbody>
                <tr>
                    <th>Name</th>
                    <th>MANUFACTURE</th>
                    <th>SKU</th>
                </tr>
                <c:forEach items="${items}" var="item">
                    <tr>
                        <td >
                            <!--use it when sending output untrusted to the browser-->
                            <c:out value=" ${item.name}"/>
                        </td>
                        <td >
                                ${item.manufacturer}
                        </td>
                        <td >
                                ${item.sku}
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </td>
    </tr>

    <tr>
        <td colspan="2" valign="bottom" height="1" width="100%"
            bgcolor="#CAD6E0"></td>
    </tr>
    </tbody>
</table>
</body>

</html>
