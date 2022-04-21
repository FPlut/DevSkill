 /*
Si scriva un programma che preso in input un valore numerico, verifichi se questo sia POSITIVO o NEGATVO e stampi
a schermo :
Input: 2
Output: "Il numero e` positivo "
Input: -10
Output: "Il numero e` negativo "
*/
function posNeg(numero:number):string{
    if (numero>=0){
        return "Il numero " + numero + " è positivo";
    }
    return "Il numero " + numero + " è negativo";
}


function stampR(result:string):void{
    console.log(result)
}

let num1:number = prompt("inserisci il numero");

stampR(posNeg(num1));