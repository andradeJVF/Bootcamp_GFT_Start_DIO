const myArray = [3, 4, 2, 6, 7, 4, 5, 2, 1, 9, 80];

function valoresUnicos(array){
    const mySet = new Set(array);

    return [...mySet];
}

console.log(valoresUnicos(myArray));