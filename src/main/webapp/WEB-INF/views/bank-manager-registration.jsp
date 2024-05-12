<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bank Manager Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Bank Manager Registration</h2>
    <form action="/manager/register" method="post" id="registrationForm">
        <div class="form-group">
            <label for="firstName">First Name:</label>
            <input type="text" class="form-control" id="firstName" name="firstName">
        </div>
        <div class="form-group">
            <label for="lastName">Last Name:</label>
            <input type="text" class="form-control" id="lastName" name="lastName">
        </div>
        <div class="form-group">
            <label for="gender">Gender:</label>
            <select class="form-control" id="gender" name="gender">
                <option value="MALE">Male</option>
                <option value="FEMALE">Female</option>
                <option value="OTHER">Other</option>
            </select>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" name="email">
        </div>
        <div class="form-group">
            <label for="phoneNumber">Phone Number:</label>
            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
        </div>
        <div class="form-group">
            <label for="pincode">Pincode:</label>
            <select class="form-control" id="pincode" name="pincode">
                <!-- Options will be populated dynamically -->
            </select>
        </div>
        <div class="form-group">
            <label for="state">State:</label>
            <select class="form-control" id="state" name="state">
                <!-- Options will be populated dynamically -->
            </select>
        </div>
        <div class="form-group">
            <label for="city">City:</label>
            <select class="form-control" id="city" name="city">
                <!-- Options will be populated dynamically -->
            </select>
        </div>
        <div class="form-group">
            <label for="street">Street:</label>
            <input type="text" class="form-control" id="street" name="street">
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" class="form-control" id="address" name="address">
        </div>
        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(document).ready(function() {

      // Populate pincode options
            $.get("/pincodes", function(data) {
                data.forEach(function(pincode) {
                    $('#pincode').append($('<option>', {
                        value: pincode.id,
                        text: pincode.pinCode
                    }));
                });
            });

            // Populate state options
            $.get("/states", function(data) {
                data.forEach(function(state) {
                    $('#state').append($('<option>', {
                        value: state.id,
                        text: state.stateName
                    }));
                });
            });

            // Populate city options
            $.get("/cities", function(data) {
                data.forEach(function(city) {
                    $('#city').append($('<option>', {
                        value: city.id,
                        text: city.cityName
                    }));
                });
            });

        $('#state').change(function() {
            var stateId = $(this).val();
            $('#city').empty();
            $('#pincode').empty();

            $.get("/cities/" + stateId, function(data) {
                data.forEach(function(city) {
                    $('#city').append($('<option>', {
                        value: city.id,
                        text: city.cityName
                    }));
                });
            });

            $.get("/pincodes/" + stateId, function(data) {
                data.forEach(function(pincode) {
                    $('#pincode').append($('<option>', {
                        value: pincode.id,
                        text: pincode.pinCode
                    }));
                });
            });
        });
    });
</script>

</body>
</html>
