<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">Register Admin</div>
                <div class="card-body">
                    <!-- Display error messages if present -->
                    <c:if test="${not empty usernameError}">
                        <div class="alert alert-danger" role="alert">
                            ${usernameError}
                        </div>
                    </c:if>
                    <c:if test="${not empty emailError}">
                        <div class="alert alert-danger" role="alert">
                            ${emailError}
                        </div>
                    </c:if>

                    <!-- Registration form -->
                    <form action="/user/register" method="post">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" class="form-control" id="username" name="username" required>
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email" name="email" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" id="password" name="password" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Register</button>
                    </form>

                    <!-- Button for users who already have an account -->
                    <div class="mt-3">
                        <p>Already have an account?</p>
                        <a href="/login" class="btn btn-secondary">Login</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
