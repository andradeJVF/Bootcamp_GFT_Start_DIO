/*
Dados Primitivos - number, string, boolean (null, undefined)
Dados Não-Primitivos - object, array

*/

let firstName = "João";
let lastName = "Andrade";
let fullName = `Nome completo: ${firstName} ${lastName}`

console.log(fullName)

//Métodos para string: variável.algumaCoisa
//Métodos funcionam da mesma forma para outros tipos de dados

let obj = {}
obj.name = "julia";
obj.age = 20;

console.log(Object.keys(obj));

let person = {
    name: "João",
    age: 23,
    adress: "Rua 7"
}

person["numberOfSiblings"] = 3;
console.log(person.numberOfSiblings);

person["mom"] = "Maria"
console.log(person.mom)

console.log(person);