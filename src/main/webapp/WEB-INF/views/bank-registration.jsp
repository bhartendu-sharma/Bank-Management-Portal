<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bank Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Bank Registration</h2>
        <form action="${pageContext.request.contextPath}/register-bank" method="post">
            <div class="form-group">
                <label for="bankName">Bank Name:</label>
                <input type="text" class="form-control" id="bankName" name="bankName">
            </div>
            <div class="form-group">
                <label for="bankCode">Bank Code:</label>
                <input type="text" class="form-control" id="bankCode" name="bankCode">
            </div>
            <div class="form-group">
                <label for="bankManager">Bank Manager:</label>
                <!-- Populate Bank Managers dynamically from backend -->
                <select class="form-control" id="bankManager" name="bankManager.id">
                    <!-- Options will be populated dynamically -->
                    <%-- Example: <option value="1">John Doe</option> --%>
                </select>
            </div>
            <div class="form-group">
                <label for="website">Website:</label>
                <input type="text" class="form-control" id="website" name="website">
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
                <label for="bankAddress">Bank Address:</label>
                <input type="text" class="form-control" id="bankAddress" name="bankAddress">
            </div>
            <div class="form-group">
                <label for="bankEmail">Bank Email:</label>
                <input type="email" class="form-control" id="bankEmail" name="bankEmail">
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
            // Populate countries options
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
