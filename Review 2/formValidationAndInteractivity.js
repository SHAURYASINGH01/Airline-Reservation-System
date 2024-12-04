document.addEventListener("DOMContentLoaded", function () {
    // User Registration Validation
    const registrationForm = document.getElementById("registrationForm");
    if (registrationForm) {
        registrationForm.addEventListener("submit", function (event) {
            const password = document.getElementById("password").value;
            const confirmPassword = document.getElementById("confirmPassword").value;

            if (password !== confirmPassword) {
                event.preventDefault();
                alert("Passwords do not match!");
            }
        });
    }

    // Login Form Validation
    const loginForm = document.getElementById("loginForm");
    if (loginForm) {
        loginForm.addEventListener("submit", function (event) {
            const username = document.getElementById("username").value;
            const password = document.getElementById("password").value;

            if (username === "" || password === "") {
                event.preventDefault();
                alert("Both username and password are required!");
            }
        });
    }

    // Flight Reservation Validation
    const reservationForm = document.getElementById("reservationForm");
    if (reservationForm) {
        reservationForm.addEventListener("submit", function (event) {
            const departure = document.getElementById("departure").value;
            const destination = document.getElementById("destination").value;
            const date = document.getElementById("date").value;

            if (departure === "" || destination === "" || date === "") {
                event.preventDefault();
                alert("Please fill all fields to proceed with the reservation.");
            }
        });
    }
});
