
<%
        String driverName = config.getInitParameter("driver");
        out.print("DriverName : "+driverName);
    
        String projectName = application.getInitParameter("project");
        out.print("<br>ProjectName : "+projectName);
    
%>