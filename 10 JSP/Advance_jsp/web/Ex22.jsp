

<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    if(email.equals("admin@gmail.com") && password.equals("admin@123")){
        session.setAttribute("email", email);
        response.sendRedirect("Ex33.jsp");
    }else{
        response.sendRedirect("Ex11.jsp");
    }
%>