<%@page import="dto.StateDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.StateDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script>
            function getCities(){
                var stateId = document.getElementById("state").value;
                console.log("stateId : ",stateId);
                var method = 'GET';
                var url = 'city_ajax.jsp?stateId='+stateId;
                var async_status = true;
                
                var xhttp = new XMLHttpRequest();
                xhttp.open(method,url,async_status);
                xhttp.send();
                
                xhttp.onreadystatechange = function(){
                    if(xhttp.readyState==4 && xhttp.status==200){
                        document.getElementById("city").innerHTML=xhttp.responseText;
                    }
                }
            }
        </script>
    </head>
    <body>
    <center><h2>Ajax Example</h2></center>
    <center>
        <%
            StateDAO state = new StateDAO();
            ArrayList<StateDTO>list =  state.getStateList();
        %>
        Select State : 
        <select id="state" name="state"  onchange="getCities()">
            <option value="">Select State</option>
            <% for(StateDTO stateData : list){ %>
            <option value="<%=stateData.getStateId() %>"><%=stateData.getStateName()%></option>
            <%}%>
        </select>
        <br><br>
        Select City : 
        <select id="city" name="city" >
            <option value="">Select City</option>
        </select>

    </center>
    </body>
</html>
