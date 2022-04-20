 /*
Si scriva un programma che preso in input un valore numerico, verifichi se questo sia POSITIVO o NEGATVO e stampi
a schermo :
Input: 2
Output: "Il numero e` positivo "
Input: -10
Output: "Il numero e` negativo "
*/
let num1:number = prompt("inserisci il numero");
if (num1>=0){
    console.log("Il numero " +num1+ " è positivo");
}else{
    console.log("Il numero " +num1+ " è negativo");
};


//con switch
let num1:number = prompt("inserisci il primo numero");
let pos = num1 >=0;

switch(pos){
    case true:
    console.log("Il numero " +num1+ " è positivo");
    break;
    case false:
    console.log("Il numero " +num1+ " è negativo");
    break;
};



-------------------------------------------------------------------------------------------------------------------



/*
// Un numero si dice pari , se divisibile per 2
Si scriva un programma che preso in input un valore numerico, verifichi se questo sia PARI (EVEN) o DISPARI (ODD)
a schermo :
Input: 2
Output:  "Il numero e` pari "
Input: 3
"Il numero e` dispari "
*/		

let num1:number = prompt("inserisci il numero");
if (num1%2 == 0){
    console.log("Il numero " +num1+ " è pari");
};
let num2:number = prompt("inserisci il secondo numero");
if (num2%2 !== 0){
    console.log("Il numero " +num2 +" è dispari");
};


//con switch

let num1:number = prompt("inserisci il numero");
let pari = num1 % 2 == 0;

switch(pari){
    case true:
    console.log("Il numero " +num1+ " è pari");
    break;
    case false:
    console.log("Il numero " +num1+ " è dispari");
    break;
};




-------------------------------------------------------------------------------------------------------------------




/*
Si scriva un programma che presi in input 3 valori, verifichi e stampi a schermo quali tra questi e` il piu` grande
a schermo :
E.S
Input: 3 54 12
Output: Il valore piu` grande e` : 54
*/
let num1:number = prompt("inserisci un numero");
let num2:number = prompt("inserisci un numero");
let num3:number = prompt("inserisci un numero");
let numeroMaggiore:number;
if (num1>num2){
    numeroMaggiore=num1;
}else{
    numeroMaggiore=num2;
};
if (num3>numeroMaggiore){
    numeroMaggiore=num3
};
console.log(numeroMaggiore);

//con switch(non sono sicuro sia il modo più efficiente o che sia il modo giusto di usare switch ma funziona

let num1:number = prompt("inserisci un numero");
let num2:number = prompt("inserisci un numero");
let num3:number = prompt("inserisci un numero");


switch(num1>num2 && num1>num3){
    case true:
        console.log("il numero maggiore è " +num1);
        break;
    case false:
        switch(num2>num1 && num2>num3){
            case true:
                console.log("il numero "+num2 +" è il maggiore");
              break;
            case false:
                break;
              }
        switch(num3>num1 && num3>num2){
            case true:
                console.log("il numero "+num3 +" è il maggiore");
              break;
            case false:
                break;
              }
              
        break;

}


-------------------------------------------------------------------------------------------------------------------


/*
Si scriva un programma che preso in input l'anno di nascita, stampi a schermo l'eta`:
Input : 1992
Output : "Hai 30 anni";
Input : 2010
Otuput: "Hai 12 anni";
*/
let anno:number = prompt("inserisci il tuo anno di nascita");
let anni:number = 2022 - anno;
console.log("hai " +anni +" anni")

-------------------------------------------------------------------------------------------------------------------
/*
Si scriva un programma che preso in input un anno, stampi a se questo e` bisestile o meno.
Un anno si dice bisestile SE e SOLO SE :
    E` divisibile per 400
    E` divisibile per 4 ma non per 100
Input : 1600
Output : "l'anno e` bisestile";
Input : 1601
Otuput: "L'anno non e` bisestile";
Input : 1696
Otuput: "L'anno e` bisestile";
*/

let anno:number = prompt("inserisci un anno");
if(anno%400==0){
    console.log("L'anno e` bisestile");
}else if(anno%4==0){
    console.log("L'anno e` bisestile");
}else if(anno%100==0){
    console.log("L'anno e` bisestile");
}else{
    console.log("L'anno non e` bisestile")
};

//con switch

let anno:number = prompt("inserisci un anno");



switch(anno%400==0 && anno%4==0 && anno%100==0){
    case true:
        console.log("l'anno e` bisestile");
        break;
    case false:
        console.log("L'anno non e` bisestile")
        break;
}
-------------------------------------------------------------------------------------------------------------------