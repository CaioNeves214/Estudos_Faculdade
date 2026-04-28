function getPokemonByName(nome) {
    fetch(`https://pokeapi.co/api/v2/pokemon/${nome}`)
    .then(response => response.json()
        .then(data => {
            console.log(data)
        })
    )
};

function getPokemonById(id) {
    fetch(`https://pokeapi.co/api/v2/pokemon/${id}`)
    .then(response => {
        response.json()
        console.log(response)
    }
    )
}

function getAbilitiesById(id) {
    fetch(`https://pokeapi.co/api/v2/pokemon/${id}`)
    .then(response => response.json()
        .then(data => {
            console.log(data.abilities)
        })
    )
}

function getListPokemon() {
    fetch(`https://pokeapi.co/api/v2/pokemon?limit=20&offset=0`)
    .then(response => response.json()
        .then(data => {
            var lista = []
            var cont = 0
            for (var pokemon of data.results) {
                lista.push(pokemon)
                cont++
            }
            console.log('Numero de pokemons: ' + cont)
            console.log(lista)
        })
    )
}

function getTypes() {
    fetch(`https://pokeapi.co/api/v2/type/fire`)
    .then(response => response.json()
        .then(data => {
            console.log(data.pokemon)
        })
    )
}

function getClima() {
    fetch(`https://api.open-meteo.com/v1/forecasthttps://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&current_weather=true`)
    .then(response => response.json()
        .then(data => {
            console.log('temperatura atual: '+data.current_weather.temperature)
            console.log('velocidade do vendo: '+data.current_weather.windspeed)
            console.log('codigo do clima: '+data.current_weather.weathercode)
        })
    )
}

function previsaoProx24h() {
    fetch(`https://api.open-meteo.com/v1/forecasthttps://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&current_weather=true`)
    .then(response => response.json()
        .then(data => {
            data.hourly.time
            data.hourly.temperature_2m
        })
    )
}

function getPrecipitacao() {
    fetch(`https://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&daily=precipitation_sum&timezone=America%2FSao_Paulo://api.open-meteo.com/v1/forecasthttps://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&current_weather=true`)
    .then(response => response.json()
        .then(data => {
            data.daily.time
            data.daily.precipitation_sum  

        })
    )
}

function getVariaveis() {
    fetch(`https://api.open-meteo.com/v1/forecast?https://api.open-meteo.com/v1/forecast?latitude=-22.21&longitude=-45.91&daily=precipitation_sum&timezone=America%2FSao_Paulo`)
    .then(response => response.json()
        .then(data => {
            data.hourly.temperature_2m      // temperatura (°C)
            data.hourly.relativehumidity_2m // umidade relativa (%)
            data.hourly.windspeed_10m       // vento a 10m de altura (km/h)

        })
    )
}

// Variaveis
const nomePokemon = "pikachu"
const id = 1

// Exercicio 01
getPokemonByName(nomePokemon);

// Exercicio 02
getPokemonById(id)

// Exercicio 03
getAbilitiesById(id)

// Exercicio 04
getListPokemon()

// Exercicio 05
getTypes()

// Exercicio 06
getClima()

// Exercicio 07
getClima()

// Exercicio 08
getPrecipitacao()

// Exercicio 09
getVariaveis()
