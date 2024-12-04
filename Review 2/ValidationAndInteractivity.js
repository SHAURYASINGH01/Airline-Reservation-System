// Form validation and interactivity
document.getElementById('searchForm').addEventListener('submit', function (e) {
  // Prevent form submission
  e.preventDefault();

  // Get form values
  let from = document.getElementById('from').value.trim();
  let to = document.getElementById('to').value.trim();
  let date = document.getElementById('date').value;

  // Validate form inputs
  if (from === '' || to === '' || date === '') {
    // Show error message if validation fails
    document.getElementById('error-message').classList.remove('d-none');
  } else {
    // Hide error message if all fields are filled
    document.getElementById('error-message').classList.add('d-none');
    // Simulate flight search success
    alert('Flights found! Proceeding with booking...');
    // Here you can make a request to a server or show the available flights dynamically
  }
});

// Book Flight function
function bookFlight(flight) {
  // Display a confirmation alert when a user tries to book a flight
  alert('You have selected ' + flight + '. Proceeding to booking...');
}
