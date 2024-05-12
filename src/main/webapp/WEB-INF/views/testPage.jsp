<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking Management Portal</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5; /* Light gray background */
            margin: 0;
            padding: 0;
        }
        .navbar {
            background-color: #f63820; /* Red color for navbar */
            border-bottom: 3px solid #b2250d; /* Darker red border bottom */
        }
        .navbar-brand, .navbar-nav .nav-link {
            color: #fff; /* White text */
            font-weight: bold; /* Bold text */
        }
        .navbar-nav .nav-link {
            padding: 10px;
        }
        .container-fluid {
            padding: 20px;
        }
        .service-item {
            background-color: #f63820; /* Red color for service items */
            padding: 20px;
            border-radius: 10px; /* Rounded corners */
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1); /* Shadow effect */
            margin-bottom: 20px;
        }
        .service-item img {
            max-width: 100%;
            border-radius: 10px; /* Rounded corners */
        }
        .service-item h4 {
            margin-top: 20px; /* Increased top margin */
            color: #fff; /* White text */
        }
        .service-item p {
            color: #fff; /* White text */
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">Banking Portal</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownAccounts" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Accounts
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownAccounts">
                        <a class="dropdown-item" href="#">Savings Account</a>
                        <a class="dropdown-item" href="#">Checking Account</a>
                        <a class="dropdown-item" href="#">Credit Cards</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Payments</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Transfers</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Services</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Register Admin</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Login</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-4">
            <div class="service-item">
                <img src="https://via.placeholder.com/300" alt="Service 1">
                <h4>Online Banking</h4>
                <p>Manage your accounts, transfer funds, pay bills, and more, all from the comfort of your home.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="service-item">
                <img src="https://via.placeholder.com/300" alt="Service 2">
                <h4>Mobile App</h4>
                <p>Access your accounts anytime, anywhere with our secure and convenient mobile banking app.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="service-item">
                <img src="https://via.placeholder.com/300" alt="Service 3">
                <h4>Customer Support</h4>
                <p>Our dedicated customer support team is here to assist you with any inquiries or issues you may have.</p>
            </div>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
