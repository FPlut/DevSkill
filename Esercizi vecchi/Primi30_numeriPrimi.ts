// DIFFICILE //
// Scrivere un programma restituisca i primi 30 numeri primi.
// Un numero si dice primo se e` divisibile SOLO e soltanto per se stesso e per 1  
/*  2	3	5	7	11	13	17	19	23  29	31	37	41	43	47	53	59	61	67	71	73	79	83	89	97	101	103 107	109	113 */

function nPrimo():void{
    
    for(let i = 2;i <=113; i++){
        let perSeStesso:number = 0
        for (let i2 = 2; i2<i; i2++){
            if (i % i2 == 0 && i%i==0) {
                perSeStesso = 1;
            }
        }
        if (i > 1 && perSeStesso == 0) {
        console.log(i);
        }
    }
}

nPrimo()