// DIFFICILE //
// Scrivere un programma prenda una sequenza di numeri, terminata -1.
// Restituisca il numero con il piu` alto numero di occorrenze .

// Input : 2 3 4 2 3 1 0 1 4 4 4 0 9 19 5 -1
// Ouput : Il numero con piu` occorrenze e` 4 

function stampa():void{
    console.log("Il numero con la massima ricorrenza e' "+num +" con N. " +occM +" occorrenza")
}
function inputN():number{
    return +prompt("inserisci un numero.\n Inserisci -1 per terminare")
}

let arr:number[]= []
let input = inputN();

while(input != -1){
    arr.push(input);
    input=inputN();
}

let occM=0;
let num=0
for(let i =0;i<arr.length;i++){
    let occ =1;
    for(let j=i+1;j<arr.length; j++){
        if (arr[i] === arr[j]){
            occ++
        }
    }
    if(occ>=occM){
        occM=occ;
        num=arr[i];
    }
}
stampa()

