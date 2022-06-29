function validaArray(array, num) {
    try {
        if (!array && !num) throw new ReferenceError("Parâmetros ausentes!");

        if (typeof array !== "object")
            throw new TypeError("O array precisa ser do tipo object!");

        if (typeof num !== "number")
            throw new TypeError("O num precisa ser do tipo number!");

        if (array.length !== num)
            throw new RangeError("Tamanho inválido!");

        return array;
    }
    catch (e) {
        if (e instanceof ReferenceError) {
            console.log("Se trata de um ReferenceError")
            console.log(e.message)
        } else if (e instanceof TypeError) {
            console.log("Se trata de um TypeError")
            console.log(e.message)
        } else if (e instanceof RangeError) {
            console.log("Se trata de um RangeError")
            console.log(e.message)
        } else {
            console.log("Tipo de erro não especificado:", e)
        }
    }
}

console.log(validaArray()) //ReferenceError
console.log("\n")
console.log(validaArray(5, 3)) //TypeError
console.log("\n")
console.log(validaArray([], "a")) //TypeError
console.log("\n")
console.log(validaArray([], 5)) //RangeError
