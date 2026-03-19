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

// 7, 8 e 9
const listaPokemons = document.querySelector("#listaPokemons");

listaPokemons.addEventListener("click", function(event) {
    // (questao 8) Identificar qual elemento foi clicado
    const pokemonClicado = event.target;

    // (questao 8) Verificar se clicamos em um <li> (para não clicar no meio da <ul> vazia)
    if (pokemonClicado.tagName === "LI") {
        
        // (questao 8) Remover a classe 'selecionado' de quem quer que a tenha atualmente
        const pokemonSelecionadoAnterior = document.querySelector(".selecionado");
        if (pokemonSelecionadoAnterior) {
            pokemonSelecionadoAnterior.classList.remove("selecionado");
        }

        // (questao 8) Adicionar a classe 'selecionado' ao novo item clicado
        pokemonClicado.classList.add("selecionado");

        // (questao 7) Atualizar o texto de informações
        document.querySelector("#infoPokemon").textContent = "Pokémon selecionado: " + pokemonClicado.textContent;

        // (questao 9) Ler o atributo 'data-tipo'
        tipo = pokemonClicado.getAttribute('data-tipo');
        document.querySelector("#infoPokemon").textContent += " - Tipo: " + tipo;

        // 23
        if (tipo === "fogo") {
            document.querySelector("#imagemPokemon").src = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png";
        } else if (tipo === "água") {
            document.querySelector("#imagemPokemon").src = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png";
        } else if (tipo === "elétrico") {
            document.querySelector("#imagemPokemon").src = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png";
        }
    };
});

// questão 10
document.querySelector("#btnAdicionar").addEventListener("click", function() {
 novoNomePokemon = document.querySelector("#inputPokemon").value;
 novoTipoPokemon = document.querySelector("#inputTipo").value;
 novoPokemon = document.createElement('li');

 // 24
 contador = document.querySelector('#listaPokemons').children.length;
 console.log(contador);

 // 22
 if (novoNomePokemon === "") {
    alert("Nome do Pokémon é obrigatório!");
 } else {
    novoPokemon.textContent = novoNomePokemon;
    novoPokemon.setAttribute('data-tipo', novoTipoPokemon);
 }
 
 // 11 e 13 - Inserir o novo Pokémon ao final da lista
 listaPokemons.insertAdjacentHTML('beforeend', novoPokemon.outerHTML);

 // 12 - Limpar os campos do formulário
 document.querySelector("#inputPokemon").value = "";
 document.querySelector("#inputTipo").value = "";
})

// questão 14
document.querySelector('#areaMouse').addEventListener('mouseenter', function() {
  document.querySelector('#areaMouse').textContent = 'Mouse dentro da área!';
});

document.querySelector('#areaMouse').addEventListener('mouseleave', function() {
  document.querySelector('#areaMouse').textContent = 'Passe o mouse aqui';
});

// questão 15
// O addEventListener está direto no document para poder capturar a tecla indepedente de onde esteja o foco
// A tag <p> não recebe o foco por padrão mesmo colocando o addEventListener
document.addEventListener('keydown', function(event) {
  document.querySelector('#textoTeclado').textContent = 'top' + event.key;
});

// questão 16
document.querySelector('#btnAlterarTitulo').addEventListener('click', function() {
  titulo = document.querySelector('#titulo');
  titulo.textContent = 'Pokemon Fire Red'
  titulo.style.color = 'red';
  titulo.style.fontSize = '3em';
  titulo.style.textAlign = 'center';
});

// questão 17
document.querySelector('#linkPokedex').setAttribute('href', 'https://youtu.be/wJWksPWDKOc?si=5DQLaHwesQOSOWe8');
document.querySelector('#linkPokedex').textContent = 'Youtube';

// questão 18
source_image = document.querySelector('#imagemPokemon').getAttribute('src');
alt_image = document.querySelector('#imagemPokemon').getAttribute('alt');
link_image = document.querySelector('#imagemPokemon').getAttribute('href');

console.log(source_image);
console.log(alt_image);
console.log(link_image);

// questão 19
const botaoOcultar = document.createElement('button');
botaoOcultar.textContent = 'Ocultar descrição';
document.querySelector('#secao-detalhes').appendChild(botaoOcultar);

botaoOcultar.addEventListener('click', function() {
  const descricao = document.querySelector('#infoPokemon');
  if (descricao.style.display === 'none') {
    descricao.style.display = 'block';
  } else {
    descricao.style.display = 'none';
  }
});

// questão 20
console.log(listaPokemons.children.length);
console.log(listaPokemons.firstElementChild);
console.log(listaPokemons.lastElementChild);

// questão 21
const botaoRemoverSelecionado = document.createElement('button');
botaoRemoverSelecionado.textContent = 'Remover selecionado';
document.querySelector('#secao-lista').appendChild(botaoRemoverSelecionado);

botaoRemoverSelecionado.addEventListener('click', function() {
  const pokemonSelecionado = document.querySelector('.selecionado');
  if (pokemonSelecionado) {
    pokemonSelecionado.remove();
  }
});

// 
