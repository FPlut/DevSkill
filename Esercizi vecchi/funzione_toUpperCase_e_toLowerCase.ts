//Scrivere un programma che preso in input Il nome e cognome di una persona e li restituisca tutto in maiuscolo
// Cercare sul web come rendere una stringa "uppercase"
// La logica che trasforma il testo, deve essere impletementa dentro una funzione che si chiama : maiuscolo
// Input : Marco Anastasio
// Ouput : MARCO ANASTASIO
function maiuscolo(nome:string, cognome:string,):string{
    let maiusc = nome + " " + cognome;
    let result = maiusc.toUpperCase();
    return result
}

let nomeCognome:string[]=[];
nomeCognome[0] = prompt("inserisci il tuo nome");
nomeCognome[1] = prompt("inserisci il tuo cognome");

console.log(maiuscolo(nomeCognome[0], nomeCognome[1]))



//Scrivere un programma che preso in input Il nome e cognome in maiuscolo li restituisca in minuscolo
// Cercare sul web come rendere una stringa "lowecase"
// La logica che trasforma il testo, deve essere impletementa dentro una funzione che si chiama : minuscolo
// Input : MARCO ANASTASIO
// Ouput : marco anastasio

function minuscolo(nome:string, cognome:string,):string{
    let maiusc:string = nome + " " + cognome;
    let result:string = maiusc.toLowerCase();
    return result
}

let nomeCognomeM:string[]=[];
nomeCognomeM[0] = prompt("inserisci il tuo nome in maiuscolo");
nomeCognomeM[1] = prompt("inserisci il tuo cognome maiuscolo");

console.log(minuscolo(nomeCognomeM[0], nomeCognomeM[1]))