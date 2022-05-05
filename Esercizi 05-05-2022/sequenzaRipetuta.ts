/*
Prendere in input una sequenza di numeri terminata da -1 e stampare a schermo la lunghezza della sequenza ripetuta piu` lunga.
Una sequenza e` la successione di numeri uguali e consecutiva senza interruzioni di almeno lunghezza 2
Se esistono piu` sequenze con lo stesso valore, stampare la prima di esse
Es.
Input: 0 1 3 4 5 5 5 8 4 3 2 1 1 1 0 9 3 2 1 9 9 9 9 9 -1
Output : 9 con lunghezza 5
Input: 0 1 3 4 5 8 4 3 2 1 0 9 3 2 1 9 -1
Output : Non esiste una sequenza valida
Input: 0 1 3 4 5 5 5 5 5 8 4 3 2 1 1 1 0 9 3 2 1 9 9 9 9 9 -1
Output : 5 con lunghezza 5*/

function inputN(): number {
    return +prompt("Inserisci un numero,-1 per terminare");
}

let arrS: number[] = [];
let input = inputN();

while (input != -1) {
	arrS.push(input);
	input = inputN();

}

let k:number=0
let j:number=k+1
let max:number=0
let n:number= 0;
let occ:number=1;

for (let i=0; i< arrS.length;i++){

    if(arrS[k]==arrS[j]){
        occ++
    }else{
        occ=1;
    }
    if(occ > max){
        max=occ;
        n= arrS[k];
    }
k++
j++
}
function stampa():void{
    console.log(+n +" con lunghezza " +max)
}

stampa()