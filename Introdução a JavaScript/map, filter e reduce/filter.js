/* Método utilizando o callback (function) fora da function principal
function filtraPares(array){
    return array.filter(callback);
}
function callback(item){
    return item % 2 === 0;
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(filtraPares(arr));
*/

function filtraPares(array) {
    return array.filter(function (par) {
        return par % 2 === 0;
    })
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(filtraPares(arr));