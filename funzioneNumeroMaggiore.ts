
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
let numeri:number[] = []
numeri[0] = prompt("inserisci il primo numero")*1;
numeri[1]= prompt("inserisci il secondo numero")*1;
numeri[2] = prompt("inserisci il terzo numero")*1;

stampR(maggiore(numeri[0],numeri[1],numeri[2]));