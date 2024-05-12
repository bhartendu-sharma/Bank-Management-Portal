<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking Management Portal</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">Banking Portal</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active" id="aboutLink">
                    <a class="nav-link" href="#">About Us</a>
                </li>
                <li class="nav-item dropdown" id="accountsLink">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownAccounts" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Accounts
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownAccounts">
                        <a class="dropdown-item" href="#">Savings Account</a>
                        <a class="dropdown-item" href="#">Checking Account</a>
                        <a class="dropdown-item" href="#">Credit Cards</a>
                    </div>
                </li>
                <li class="nav-item" id="paymentsLink">
                    <a class="nav-link" href="#">Payments</a>
                </li>
                <li class="nav-item" id="transfersLink">
                    <a class="nav-link" href="#">Transfers</a>
                </li>
                <li class="nav-item" id="servicesLink">
                    <a class="nav-link" href="#">Services</a>
                </li>
                <li class="nav-item" id="contactLink">
                    <a class="nav-link" href="#">Contact</a>
                </li>
            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/manager/register">Register Bank Manager</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/employee/register">Register Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/bank-branch/register">Register Bank Branch</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/user/register">Register Admin</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="user/login">Login</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script>
    // Function to hide navigation links
    function hideNavigationLinks() {
        document.getElementById("aboutLink").style.display = "none";
        document.getElementById("accountsLink").style.display = "none";
        document.getElementById("paymentsLink").style.display = "none";
        document.getElementById("transfersLink").style.display = "none";
        document.getElementById("servicesLink").style.display = "none";
        document.getElementById("contactLink").style.display = "none";
    }

    // Call the function to hide navigation links

       hideNavigationLinks();

</script>