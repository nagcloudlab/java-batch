// ----------------------------------------------------------------
// using DOM Api
// ----------------------------------------------------------------
const card = document.querySelector(".card");
const cardBody = document.querySelector(".card-body");
const gudEveBtn = document.querySelector(".btn-primary");
const hideBtn = document.querySelector(".btn-danger");
const showBtn = document.querySelector(".btn-success");

gudEveBtn.addEventListener("click", function (e) {
  cardBody.innerText = "Good evening"; // element's inner content
});
hideBtn.addEventListener("click", function (e) {
  card.style.display = "none"; // element's style
});
showBtn.addEventListener("click", function (e) {
  card.style.display = "";
});

// ----------------------------------------------------------------
// Using DOM & Timer Api
// ----------------------------------------------------------------
const startBtn = document.querySelector("#start");
const stopBtn = document.querySelector("#stop");
stopBtn.disabled = true;
const imgEle = document.querySelector("img");
const images = ["images/1.webp"];
startBtn.addEventListener("click", function (e) {
  stopBtn.disabled = false;
  startBtn.disabled = true;
  let i = 0;
  let interval = setInterval(function () {
    imgEle.src = images[i]; // element's attribute's
    i++;
    if (i === images.length) {
      i = 0;
    }
  }, 1000);
  stopBtn.addEventListener("click", function (e) {
    clearInterval(interval);
    stopBtn.disabled = true;
    startBtn.disabled = false;
  });
});

// ----------------------------------------------------------------
// Using DOM
// ----------------------------------------------------------------

const top5TodosBtn = document.querySelector("#top-5-todos-btn");
const todosBody = document.querySelector("#todos");
top5TodosBtn.addEventListener("click", function (e) {
  fetchAndRenderTodos(5);
});
function fetchAndRenderTodos(limit) {
  let url = `https://jsonplaceholder.typicode.com/todos?_limit=${limit}`;
  const promise = fetch(url);
  promise
    .then((response) => response.json())
    .then((todos) => {
      const todoRows = todos.map((todo) => {
        return `
          <tr>
            <td>${todo.id}</td>
            <td>${todo.title}</td>
            <td>${todo.completed}</td>
          </tr>
        `;
      });
      todosBody.innerHTML = todoRows.join("");
    });
}
