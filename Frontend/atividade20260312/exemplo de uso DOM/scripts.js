document.addEventListener('DOMContentLoaded', function() {
    const nodeH1 = this.querySelector('h1');
    nodeH1.addEventListener("click", alteraConteudoTitulo());
});

function alteraConteudoTitulo() {
    const nodeH1 = document.querySelectorAll("h1")
    for(let node of nodeH1) {
        node.textContent = "titulo alterado!"
    }
};
