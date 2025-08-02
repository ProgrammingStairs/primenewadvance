<%@page import="dao.CandidateDao"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    CandidateDao candidateDao = new CandidateDao();
    int i = candidateDao.candidateLogin(email, password);
    if(i==1){
        session.setAttribute("email", email);
%>
        <script>alert("Candidate Login Successfull");</script>
        <jsp:include page="candidateHome.jsp"></jsp:include>
<%}else{%>
        <script>alert("Error while Candidate Login");</script>
        <jsp:include page="candidateLogin.jsp"></jsp:include>
<%}%>