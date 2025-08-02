<%@page import="dao.AdminDao"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    AdminDao adminDao = new AdminDao();
    int i = adminDao.adminLogin(email, password);
    if(i==1){
        session.setAttribute("email", email);
%>
        <script>alert("Admin Login Successfull");</script>
        <jsp:include page="adminHome.jsp"></jsp:include>
<%}else{%>
        <script>alert("Error while Admin Login");</script>
        <jsp:include page="adminLogin.jsp"></jsp:include>
<%}%>