<%@page import="dto.CityDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CityDAO"%>
<%
    int stateId = Integer.parseInt(request.getParameter("stateId"));
    CityDAO cityDao = new CityDAO();
    ArrayList<CityDTO> list = cityDao.getCityList(stateId);
%>
<option value="">Select City</option>
<% for(CityDTO city : list) {%>
<option value="<%=city.getCityId() %>"><%= city.getCityName() %></option>
<%}%>