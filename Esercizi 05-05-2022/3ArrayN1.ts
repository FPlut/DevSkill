/*
Scrivere un programma che popoli due array A , B di dimensione N identica ed arbitraria ( min 5 , Max 10 ) i cui valori sono presi in input.
Successivamente creare un terzo array C di dimensione N dove nelle posizioni pari verranno inseriti i valori dell'array A e in quelle dispari
i valori dell'array B
Considerare 0 come pari
Input: 5
// popolare il vettore
A = [ 1, 3, 4,  5, 6];
B = [ 7, 8, 9, 10,11];
Output: C = [ 1, 8, 4 ,10 ,6];
 */
let A:number[]=[];
let B:number[]=[];
let C:number[]=[];

let lenghtArr:number=+prompt("Inserisci la lunghezza dell'array. Min 5 , Max 10 ")
if (lenghtArr>=5 && lenghtArr<=10){
    for (let i=0; i<lenghtArr;i++){
        let num:number=+prompt("Inserisci numero per l'array A");
        A[i] = num
        
    }
    for (let i=0; i<lenghtArr;i++){
            let num:number=+prompt("Inserisci numero per l'array B");
            B[i] = num
    }
    for (let i=0; i<lenghtArr;i++){
        C[i]=A[i]
        i++
    }
    for (let i=1; i<lenghtArr;i++){
        C[i]=B[i]
        i++
    }
    console.log(C)
}else{
    alert("Lunghezza array non valida")
}