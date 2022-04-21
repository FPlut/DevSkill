
/*
Si scriva un programma che presi in input 3 valori, verifichi e stampi a schermo quali tra questi e` il piu` grande
a schermo :
E.S
Input: 3 54 12
Output: Il valore piu` grande e` : 54
*/


function maggiore(numero:number,numero2:number,numero3:number):number{
    let numeroMaggiore:number;
    if (numero>numero2){
    numeroMaggiore=numero;
    }else{
    numeroMaggiore=numero2;
    }
    if (numero3>numeroMaggiore){
    numeroMaggiore=numero3
    }
    return numeroMaggiore
}
function stampR(result:number):void{
    console.log("Il numero maggiore è " + result)
}

let num1:number = prompt("inserisci il primo numero");
let num2:number = prompt("inserisci il secondo numero");
let num3:number = prompt("inserisci il terzo numero");

stampR(maggiore(num1,num2,num3));