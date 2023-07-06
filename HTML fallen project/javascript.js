document.addEventListener("DOMContentLoaded", function() {
    const overlay = document.getElementById("overlay");
    const loginButton = document.querySelector(".login-button");
    const closeButton = document.getElementById("closeButton");
  
    // Open the overlay when the login button is clicked
    loginButton.addEventListener("click", function() {
      overlay.style.display = "block";
    });
  
    // Close the overlay when the close button is clicked
    closeButton.addEventListener("click", function() {
      overlay.style.display = "none";
    });
  });
  