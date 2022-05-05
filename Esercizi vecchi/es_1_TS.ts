// Scrivere un programma che:
// prende in input un numero a rappresentante la base di un rettangolo  
// prende in input un numero b rappresentante l'altezza di un rettangolo
// Output:
// calcolare e restituire l'area del rettangolo
// calcolare il perimetro del rettangolo
let base:string = prompt("inserisci la base di un rettangolo");
const cBase:number = +base;
let altezza:string = prompt("inserisci l'altezza di un rettangolo");
const cAltezza:number = +altezza;
const areaRett:number = cBase * cAltezza;
const perimRett:number = 2*(cBase + cAltezza);
console.log("L'area del rettangolo è "+areaRett, "Il perimetro del rettangolo è "+perimRett);