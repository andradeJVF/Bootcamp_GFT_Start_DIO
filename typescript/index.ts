// // // interfaces utilizadas para definir contratos de estruturas de dados
// // interface IAnimal{
// //     nome: string,
// //     tipo: 'terrestre' | 'aquático'
// // }

// // types para fazer junções, merges das interfaces para serem utilizadas da melhor forma 
// type IAnimal = {
//     nome: string,
//     tipo: 'terrestre' | 'aquático',
//     domestico: boolean
// }

// interface IFelinos extends IAnimal {
//     visaoNoturna: boolean,
//     executarRugido(alturaDecibeis: number): void
// }

// const animal: IAnimal = {

//     nome: 'Elefante',
//     tipo: 'terrestre',
//     domestico: false
// }

// const felino: IFelinos = {

//     nome: 'Leão',
//     tipo: 'terrestre',
//     visaoNoturna: true,
//     executarRugido: (alturaDecibeis) => (`${alturaDecibeis}db`),
//     domestico: false
// }

// interface ICanino extends IAnimal {
//     porte: 'pequeno' | 'medio' | 'grande'
// }

// type IDomestico = IFelinos | ICanino;

// const animal2: IDomestico = {
//     domestico: true,
//     nome: 'cachorro',
//     tipo: 'terrestre',
//     porte: 'medio'
// }

// const input = document.getElementById('input') as HTMLInputElement;

// input.addEventListener('input', (event) => {
//     const i = event.currentTarget as HTMLInputElement;
//     console.log(i.value);
// });

// Generic Types não definimos qual é o valor que estamos esperando number, string, etc
// function adicionarItemLista<T>(array: T[], valor: T){
//     return array.map(() =>valor);
// }

// adicionarItemLista(['1', '2', '3'], '1');

// interface IUsario {
//     id: string,
//     email: string,
//     cargo?: 'operario' | 'gerente' | 'coordenador' | 'supervisor'
// }


// function redirecionar(usuario: IUsario){
//     if(usuario.cargo){

//     }    

// }

// interface Cachorro {
//     nome: string,
//     idade: number,
//     parqueFavorito?: string
// }

// type CachorroLeitura = {
//     +readonly[K in keyof Cachorro]-?: Cachorro[K]; //definindo todos os itens no Cachorro para somente leitura / -? remove os valores opcionais
// }

// class meuCachorro implements CachorroLeitura {
//     nome;
//     idade;
//     parqueFavorito;

//     constructor(nome, idade){
//         this.nome = nome;
//         this.idade = idade;
//     }
// }

// const cao = new meuCachorro('Apolo', 13);
// cao.idade = 5;

