/*
Scrivere un programma che popoli due array A , B di dimensione N,M arbitraria ( min 5 , Max 10 ) i cui valori sono presi in input.
Successivamente creare un terzo array C di dimensione N+M dove nelle posizioni da 0 a N inserite i valori A e nelle posizioni da N+1
a M inserite i valori di B al contrario
Considerare 0 come pari
Input: 5
// popolare il vettore
A = [ 1, 3, 4,  5, 6];
B = [ 7, 8, 9, 10,11];
Output: C = [ 1, 3, 4 ,5, 6, 11,10, 9, 8, 7];
 */

let A:number[]=[];
let B:number[]=[];
let C:number[]=[];


let aLength:number=+prompt("Inserisci la lunghezza dell'array. Min 5 , Max 10 ");
if (aLength>=5 && aLength<=10){
    for (let i=0; i<aLength;i++){
        let num:number=+prompt("Inserisci numero per l'array A");
        A[i] = num;
        
    }
    for (let i=0; i<aLength;i++){
            let num:number=+prompt("Inserisci numero per l'array B");
            B[i] = num;
    }
    for(let i=0; i<aLength;i++){
        C[i]=A[i];
    }
    for(let i=aLength; i<10;i++){
        
        C[i]=B[aLength-1];
        aLength=aLength-1;
    }
    console.log(C)
}else{
    alert("Lunghezza array non valida");
}