function comparaNum(a, b) {
    var soma = a + b;
    var igual = ("Os números " + a + " e " + b + ", são iguais!")
    var naoIgual = ("Os números " + a + " e " + b + ", não são iguais!")
    if (a === b) {
        compara = igual;
    } else {
        compara = naoIgual;
    }

    if (soma > 10 && soma > 20) {
        var maior1 = console.log(compara, "Sua soma é " + soma + ", que é maior que 10 e maior que 20");
    } else if (soma > 10 && soma < 20) {
        var maior2 = console.log(compara, "Sua soma é " + soma + ", que é maior que 10 e menor que 20");
    } else if (soma < 10 && soma < 20) {
        var menor1 = console.log(compara, "Sua soma é " + soma + ", que é menor que 10 e menor que 20");
    } else {
        console.log("Verifique os números digitados!")
    }
}

comparaNum(2, 7);

// function comparaNumeros(num1, num2){
//     const iguais = num1 === num2;
//     const soma = num1 + num2;

//     // if sem else
//     if(iguais){
//         return "são iguais!";
//     }
//     return "não são iguais!"

//     // if ternário
//     return iguais ? "são iguais!" : "não são iguais!";
// }