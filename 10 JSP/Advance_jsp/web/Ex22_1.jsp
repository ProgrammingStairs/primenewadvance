

<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    if(email.equals("admin@gmail.com") && password.equals("admin@123")){
      //  session.setAttribute("email", email);
      pageContext.setAttribute("email", email, PageContext.SESSION_SCOPE);
      response.sendRedirect("Ex33_1.jsp");
    }else{
        response.sendRedirect("Ex11_1.jsp");
    }
%>