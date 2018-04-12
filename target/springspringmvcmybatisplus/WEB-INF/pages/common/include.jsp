<%--
  Created by IntelliJ IDEA.
  User: 钟超
  Date: 2018/4/12
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!-- Jquery -->
<script src="${ctx}/resources/jquery/jquery-2.2.3.min.js" type="text/javascript"></script>

<!-- Bootstrap -->
<link href="${ctx}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

<script>
    function toIndex() {
        window.location.href = '${ctx}/';
    }
</script>