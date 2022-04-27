//Scrivere un programma che calcoli il massimo in un vettore di dimensione 10 ( valori scelti a piacimento)
//E.S 
// let A:number = [1,5,20,15,500,230];
// Output : 500

let numeri:number[] = [1,5,20,15,500,230,8,52,10,999];
    function numeromaggiore():number{
        let numeroMaggiore=Number.MIN_SAFE_INTEGER
        for (let i=1;i < numeri.length; i++){
            if(numeri[i] >= numeroMaggiore){
                numeroMaggiore = numeri[i]
            }
        } return numeroMaggiore
    }


console.log("Il numero maggiore è: " + numeromaggiore() );