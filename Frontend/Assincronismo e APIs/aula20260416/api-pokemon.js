// function getAbillities(nome)

function getPokemon(nome) {
    fetch(`https://pokeapi.co/api/v2/pokemon/${nome}`)
    .then(response => response.json()
        .then(data => {
            console.log(data)
        })
    )
};

function getPokemonId(id) {
    fetch(`https://pokeapi.co/api/v2/pokemon/${id}`)
    .then(response => {
        response.json()
        console.log(response)
    }
    )
}

// Variaveis
const nomePokemon = "pikachu"

// Exercicio 01
getPokemon(nomePokemon);

// Exercicio 02
// getPokemonId(id)