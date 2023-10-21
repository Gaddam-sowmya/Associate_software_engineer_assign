const userInput = prompt("Enter numbers separated by spaces:");
const inputArray = userInput.split(" ").map(Number);


if (inputArray.some(isNaN)) {
  console.log("Invalid input. Please enter valid numbers separated by spaces.");
} else {

  inputArray.sort((a, b) => b - a);

  console.log("Sorted array in descending order: " + inputArray);
}