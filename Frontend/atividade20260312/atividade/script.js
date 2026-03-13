// 1
document.querySelector("#btnMensagem").addEventListener("click", function() {
  window.alert("Bem-vindo ao painel do treinador!");
});

// 2
document.querySelector("#btnAlterarTitulo").addEventListener("click", function() {
  const titulo = document.querySelector("#titulo");
  titulo.textContent = "Equipe Pokémon carregada!";
});

// 3
document.querySelector("#btnTema").addEventListener("click", function() {
  const body = document.querySelector("body");
  if (body.style.backgroundColor === "") {
    body.style.backgroundColor = "blanchedalmond";
  } else {
    body.style.backgroundColor = "";
  }
});

// 4
window.onload = function() {
    document.title = "Painel Pokémon - DOM";
};