<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mvc.controller.studentDAOImplementation"%>

<%
    String username = request.getParameter("uname");

    studentDAOImplementation imp = new studentDAOImplementation();
    imp.deleteStudent(username);
%>
<script>
    alert("Student account deleted succesfully");
</script>