// Creare un convertitore di misurazioni, deve permettere la conversione di una misurazione da un unita` di misura ad un altra.
// Il programma dovra` chiedere all'utente quale tipo di misurazione vorrebbe convertire.
// le unita` di misura supportate sono riportate in tabella:
// Gradi    (1)    | centigradi (C) | fahrenheit (F)  |
// Distanza (2)    | kilometri (KM) | miglia (MI)     |
// L'utente puo` specificare il tipo di misurazione che vuole convertire usando 1 per gradi e 2 per distanza e successivamente
// fornire i seguenti valori : 
//      il valore misurato
//      l'unita` di misura originale
// Il programma dovra` restituire in output la conversione corretta .

// Esempio :
// Output: "Che tipo di misurazione vuoi convertire ? "
// Input: 1 
// Output: "Inserisci i seguenti valori:"
// Input: "Misurazione originale" 32
// Input: "Unita` di misura originale" C
// Output: "Il valore convertito e`: 89,6 F"

// Esempio :
// Output: "Che tipo di misurazione vuoi convertire ? "
// Input: 2
// Output: "Inserisci i seguenti valori:"
// Input: "Misurazione originale" 100
// Input: "Unita` di misura originale" KM
// Output: "Il valore convertito e`: 62,13 MI"


//convertitoreDistanzaGradi v1 

function convertitoreInKm(miglia:number):number{
    let migliaKm:number= miglia * 1.609;
    return migliaKm
}
function convertitoreInMi(chilometri:number):number{
    let kmMiglia:number= chilometri * 0.62;
    return kmMiglia
}
function convertitoreInF(centigradi:number):number{
    let cF:number= (1.8 * centigradi) +32;
    return cF
}
function convertitoreInC(fahrenheit:number):number{
   
    let fC:number= (fahrenheit - 32 ) /1.8;
    return fC
}


function whichM(risposta:number):void{

    let unitM:string=prompt("Inserisci l'unita` di misura originale");
    let misurazioneO:number=prompt("Inserisci la misurazione originale")*1;
    
    if (risposta == 1){
        
        if (unitM == "c" ||unitM == "C"){
            
        
           console.log("Il valore convertito e`" + convertitoreInF(misurazioneO) + " F")

        }else if (unitM == "f" ||unitM == "F"){

            console.log("Il valore convertito e`" + convertitoreInC(misurazioneO) + " C")

        }else{
            console.log("Riprova")
        }

    }else if(risposta == 2){
        if (unitM == "km" ||unitM == "Km" ||unitM == "KM" ||unitM == "kM"){

           console.log("Il valore convertito e`" + convertitoreInMi(misurazioneO) + " MI")

        }else if (unitM == "mi" ||unitM == "Mi" ||unitM == "MI" ||unitM == "mI"){

           console.log("Il valore convertito e`" + convertitoreInKm(misurazioneO) + " KM")

        }else{
            console.log("Riprova")
        }
    }else{
        console.log("Riprova")
    }
}

let misure:number = prompt("Che tipo di misurazione vuoi convertire? [1 per Gradi/ 2 per Distanza]");
whichM(misure)
