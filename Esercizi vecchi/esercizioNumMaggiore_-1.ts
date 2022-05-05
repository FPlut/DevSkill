//Scrivere un programma che prenda in input una sequenza di numeri, e quando l'utente inserisce -1 termini
//restituendo il valore piu` grande inserito
//E.S 
// Input : 1 9 19 9 1 9 0 -1
// Output : 19

function nMassimo(numero:number,max:number):number{
    if (numero > max){
        max = numero;
    }
    return max
}
function stampa():void{
console.log(nMassimo(numero,numeroMassimo))
}
let numero:number = +prompt("Inserisci un numero");
let numeroMassimo:number=Number.MIN_SAFE_INTEGER;
while (numero != -1){
    numeroMassimo = nMassimo(numero,numeroMassimo)
    numero = +prompt("Inserisci un numero");
}

stampa()