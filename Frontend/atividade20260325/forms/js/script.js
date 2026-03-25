const form = document.querySelector("#forminscricao");

form.addEventListener("submit", function (event) {
    event.preventDefault();
    const nome = document.querySelector('#nome_completo');
    const email = document.querySelector('#email');
    const senha = document.querySelector('#senha');
    const dataNascimento = document.querySelector('#dataNascimento').value;
    const idade = (new Date().getFullYear() - new Date(dataNascimento).getFullYear());

    console.log("Nome: ", nome.value, "\nEmail: ", email.value, "\n Idade: ", idade);

    if(nome.value == null || email.value == null) {
        alert("Preencha o nome e email.");
    };

    


});