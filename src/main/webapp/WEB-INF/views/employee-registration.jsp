<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Registration</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h2 class="mt-4">Employee Registration Form</h2>
    <form action="${pageContext.request.contextPath}/employee/register" method="post" modelAttribute="employee">
        <div class="form-group">
            <label>First Name:</label>
            <input type="text" class="form-control" name="firstName" required>
        </div>

        <div class="form-group">
            <label>Last Name:</label>
            <input type="text" class="form-control" name="lastName" required>
        </div>

        <div class="form-group">
            <label>Gender:</label>
            <select class="form-control" name="gender" required>
                <option value="MALE">Male</option>
                <option value="FEMALE">Female</option>
                <option value="OTHER">Other</option>
            </select>
        </div>

        <div class="form-group">
            <label>Email:</label>
            <input type="email" class="form-control" name="email" required>
        </div>

        <div class="form-group">
            <label>Date of Birth:</label>
            <input type="date" class="form-control" name="dateOfBirth" required>
        </div>

        <div class="form-group">
            <label>Phone Number:</label>
            <input type="tel" class="form-control" name="phoneNumber" required minlength="10" maxlength="10">
        </div>

        <div class="form-group">
            <label>Pincode:</label>
            <input type="text" class="form-control" name="pincode" required>
        </div>

        <div class="form-group">
            <label>State:</label>
            <input type="text" class="form-control" name="state" required>
        </div>

        <div class="form-group">
            <label>City:</label>
            <input type="text" class="form-control" name="city" required>
        </div>

        <div class="form-group">
            <label>Street:</label>
            <input type="text" class="form-control" name="street" required>
        </div>

        <div class="form-group">
            <label>Address:</label>
            <input type="text" class="form-control" name="address" required>
        </div>

        <div class="form-group">
            <label>Job Title:</label>
            <input type="text" class="form-control" name="jobTitle">
        </div>

        <div class="form-group">
            <label>Department:</label>
            <input type="text" class="form-control" name="department">
        </div>

        <div class="form-group">
            <label>Hire Date:</label>
            <input type="date" class="form-control" name="hireDate">
        </div>

        <div class="form-group">
            <label>Salary:</label>
            <input type="number" class="form-control" name="salary">
        </div>

        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" name="isActive">
            <label class="form-check-label">Active</label>
        </div>

        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>
</body>
</html>
