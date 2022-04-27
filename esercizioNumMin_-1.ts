//Scrivere un programma che prenda in input una sequenza di numeri, e quando l'utente inserisce -1 termini
//restituendo il valore piu` piccolo inserito
//E.S 
// Input : 1 9 19 9 1 9 0 -1
// Output : 0


function nMinimo(numero:number,min:number):number{
    if (numero < min && numero !=-1){
        min = numero;
    }
    return min
}
function stampa():void{
console.log(nMinimo(numero,numeroMinimo))
}
let numero:number = +prompt("Inserisci un numero");
let numeroMinimo:number=Number.MAX_SAFE_INTEGER;
while (numero != -1){
    numeroMinimo = nMinimo(numero,numeroMinimo)
    numero = +prompt("Inserisci un numero");
}

stampa()