//Scrivere un programma che calcoli il massimo in un vettore di dimensione 10 (valori presi da input)
//E.S 
// Input A = [ 1 9 200 9 1 9 0 50]
// Output : 200

let numeri:number[] = []
let numeroMaggiore:number=Number.MIN_SAFE_INTEGER;
for (let i=1;i<11;i++){
    let numero:number = +prompt("inserisci il primo numero");
    numeri[i]= numero;
    if (numero >= numeroMaggiore){
        numeroMaggiore=numero
    }else{
        numeroMaggiore = numeroMaggiore
    }
    
}
console.log(numeroMaggiore)