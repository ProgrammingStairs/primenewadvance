<%@page import="dao.CandidateDao"%>
<%@page import="dto.CandidateDto"%>
<%
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String contact = request.getParameter("contact");
    String gender = request.getParameter("gender");
    String address = request.getParameter("address");
    String date = request.getParameter("date");
    String qualification = request.getParameter("qualification");
    String percentage = request.getParameter("percentage");
    String experience = request.getParameter("experience");
    String expertise = request.getParameter("expertise");
    String reallocate = request.getParameter("reallocate");
    String careerObjective = request.getParameter("careerObjective");
    
    CandidateDto candidateDto = new CandidateDto();
    candidateDto.setUsername(username);
    candidateDto.setEmail(email);
    candidateDto.setPassword(password);
    candidateDto.setContact(contact);
    candidateDto.setGender(gender);
    candidateDto.setAddress(address);
    candidateDto.setDate(date);
    candidateDto.setQualification(qualification);
    candidateDto.setPercentage(percentage);
    candidateDto.setExperience(experience);
    candidateDto.setExpertise(expertise);
    candidateDto.setReallocate(reallocate);
    candidateDto.setCareerObjective(careerObjective);
    
    CandidateDao candidateDao = new CandidateDao();
    int i = candidateDao.addCandidate(candidateDto);
    if(i==1){
%>
        <script>alert("Candidate Registration Successfull");</script>
        <jsp:include page="candidateLogin.jsp"></jsp:include>
<%}else{%>
        <script>alert("Error while Candidate Registration");</script>
        <jsp:include page="index.html"></jsp:include>
<%}%>