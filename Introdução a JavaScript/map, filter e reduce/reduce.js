//Atividade 01
function somaNumeros(array) {
    return array.reduce(function (prev, current) {
        return prev + current;
    });
}

const arr = [1, 2];
console.log(somaNumeros(arr));

//Atividade 02
const lista = [
    {
        name: "Sabão em pó",
        preco: 15
    },
    {
        name: "Amaciante",
        preco: 18
    },
    {
        name: "Papel",
        preco: 10
    }
];

const saldo = 100;

function listaPrecos(saldo, lista) {
    return lista.reduce(function (prev, current, index) {
        console.log("rodada", index + 1)
        console.log({ prev })
        console.log({ current })
        return prev - current.preco;
    }, saldo);
}

console.log("Saldo disponível após compra: R$" + listaPrecos(saldo, lista));