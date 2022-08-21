// Get the modal
var modals = document.getElementByClassName("myModal");

// Get buttons that opens the modal
var btns = document.getElementByClassName("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal
for(var i = 0; i < btns.length; i++) {
    btns[i].onclick = function () {
        modals[i].style.display = "block";
    }
}

// When the user clicks on <span> (x), close the modal
for(var i = 0; i < modals.length; i++) {
span.onclick = function() {
  modals[i].style.display = "none";
}
}

// When the user clicks anywhere outside of the modal, close it
for(var i = 0; i < btns.length; i++) {
    window.onclick = function(event) {
  if (event.target == modal[i]) {
    modal[i].style.display = "none";
  }
    }
}