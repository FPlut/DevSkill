// Scrivere un programma che:
// prende in input un numero a  
// prende in input un numero b
// Output:
// somma di a con b
// sottrazione di a con b
// moltiplicazione di a con b 
// divisione di a con b
let num1:string = prompt("Inserisci un numero");
const primNum:number = +num1;
let num2:string = prompt("Inserisci un altro numero");
const secNum:number = +num2;
const somma:number= primNum + secNum
const sottrazione:number = primNum - secNum
const moltiplicazione:number = primNum * secNum
const divisione:number = primNum / secNum;

console.log("Il risultato dell'addizione dei numeri è " +somma,"Della sottrazione è "+sottrazione,"Della moltiplicazione è " +moltiplicazione,"Della divisione è " +divisione);