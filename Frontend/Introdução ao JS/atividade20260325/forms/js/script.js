const form = document.querySelector("#forminscricao");

let daora = "daora";

console.log(daora);

form.addEventListener("submit", function (event) {
    event.preventDefault();
    const nome = document.querySelector('#nome_completo');
    const email = document.querySelector('#email');
    const senha = document.querySelector('#senha');
    const dataNascimento = document.querySelector('#dataNascimento');
    const idade = (new Date().getFullYear() - new Date(dataNascimento.value).getFullYear());
    const urlPortifolio = document.querySelector('#url').value;
    const curso = document.querySelector('#curso');
    const turno_manha = document.querySelector('#manha');
    const turno_noite = document.querySelector('#noite');
    const motivacao = document.querySelector('#motivacao');
    const aceiteTermos = document.querySelector('#aceiteTermos');

    console.log("Nome: ", nome.value, "\nEmail: ", email.value, "\n Idade: ", idade);

    if(nome.value == null || email.value == null) {
        alert("Preencha o nome e email.");
    };

    if(!urlPortifolio.startsWith('https://')) {
        alert("url invalido");
    };

    if(curso.value == null){
        alert("Preencha o curso");
    };

    if(turno_manha && turno_noite == null){
        alert("Preencha o turno de estudo");
    };

    if(length(motivacao.value) < 20) {
        alert('Motivação deve conter no minimo 20 caracteres');
    }

    if(aceiteTermos.value == null){
        alert('Aceite os Termos');
    }

});