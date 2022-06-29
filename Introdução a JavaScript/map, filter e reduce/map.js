//Método usando thisArg
const maca = { value: 2, }
const laranja = { value: 3, }

function mapThis(array, thisArg) {
    return array.map(function (item) {
        return item * this.value;
    }, thisArg);
}

const nums1 = [1, 2, 3];
console.log("This -> maçã", mapThis(nums1, maca));
console.log("This -> laranja", mapThis(nums1, laranja));

//Método sem thisArg
function mapSemThis(array) {
    return array.map(function (item) {
        return item * 3;
    });
}

const nums2 = [2, 4, 6, 8, 10, 12];
console.log(mapSemThis(nums2));