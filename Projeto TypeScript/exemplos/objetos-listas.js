"use strict";
const pessoa = {
    nome: 'Mariana',
    idade: 28,
    profissao: 'Desenvolvedora'
};
pessoa.idade = 29;
const andre = {
    nome: 'Andre',
    idade: 25,
    profissao: 'pintor'
};
const paula = {
    nome: 'Paula',
    idade: 23,
    profissao: 'Adm'
};
var Profissao;
(function (Profissao) {
    Profissao[Profissao["Professora"] = 0] = "Professora";
    Profissao[Profissao["Atriz"] = 1] = "Atriz";
    Profissao[Profissao["Desenvolvedora"] = 2] = "Desenvolvedora";
    Profissao[Profissao["Jogadora"] = 3] = "Jogadora";
    Profissao[Profissao["Estudante"] = 4] = "Estudante";
})(Profissao || (Profissao = {}));
const vanessa = {
    nome: 'Vanessa Silva',
    idade: 27,
    profissao: Profissao.Desenvolvedora
};
const aluno = {
    nome: 'Jessica',
    idade: 18,
    materias: ["Matematica", 'Historia', 'Programação'],
    profissao: Profissao.Estudante
};
const Joao = {
    nome: 'João Vitor',
    idade: 23,
    materias: ['TypeScript', 'JavaScript']
};
function listar(lista) {
    for (const item of lista)
        console.log('- ', item);
}
listar(Joao.materias);
