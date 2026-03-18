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

// 5
document.querySelector("#btnDestacarPrimeiro").addEventListener("click", function() {
    primeiro_pokemon = document.querySelector("li");
    primeiro_pokemon.classList.add('destaque');
});

// 6
document.querySelector("#btnRemoverUltimo").addEventListener("click", function() {
    ultimo_pokemon = document.querySelector("ul").lastElementChild;
    ultimo_pokemon.remove();
});

// 7 e 8
lista_pokemon = document.querySelector("#listaPokemons").addEventListener("click", function(e) {
  document.querySelector("#infoPokemon").textContent = "Pokémon selecionado: " + e.target.textContent;
  lista_pokemon.classList.remove('destaque');
});