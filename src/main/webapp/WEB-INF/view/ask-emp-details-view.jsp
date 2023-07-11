<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<body>

<h2>Dear Employee, Please enter your name</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
<form:options items="${employee.departments}"/>
<%-- Хардкод вариант   --%>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resoursec" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
</form:select>
    <br><br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
<%--  Хардкод вариант  --%>
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="AUDI"/>--%>
<%--    MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <br><br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.langs}"/>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    RU <form:checkbox path="languages" value="Russian"/>--%>
<%--    FR <form:checkbox path="languages" value="Franch"/>--%>
    <br><br>



    <input type="submit" value="OK">

</form:form>


</body>
</html>