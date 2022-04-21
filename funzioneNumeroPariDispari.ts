/*
// Un numero si dice pari , se divisibile per 2
Si scriva un programma che preso in input un valore numerico, verifichi se questo sia PARI (EVEN) o DISPARI (ODD)
a schermo :
Input: 2
Output:  "Il numero e` pari "
Input: 3
"Il numero e` dispari "
*/		

function pariDis(numero:number):string{
    if (numero%2 == 0){
        return "Il numero " + numero + " è pari";
    }
    return "Il numero " + numero + " è dispari";
}


function stampR(result:string):void{
    console.log(result)
}

let num1:number = prompt("inserisci il numero");

stampR(pariDis(num1));