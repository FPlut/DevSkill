// Creare un software che calcoli il BMI di una persona dato : altezza ( piedi = 30,48cm ) , peso ( libre = 0.45kg)
// BMI = peso in kg / (statura in metri * statura in metri)
// E stampi in output la corrispettiva costituzione in base alla tabella :
//Sottopeso severo  < 16,5
//Sottopeso da 16,5 a 18,4
//Normale   da 18,5 a 24,9
//Sovrappeso    da 25 a 30
//Obesità primo grado   da 30,1 a 34,9
//Obesità secondo grado da 35 a 40
//gskianto  > 40



// Dopo aver mostrato a schermo il risulato , verra` chiesto all'utente se vuole effettuare una misurazione
// piu` precisa. Se la risposta e` affermativa,
// viene chiesto un parametro aggiuntivo : circonferenza polso ( cm ) e il sesso . Venga stampata la
// rispettiva costituzione seguendo la seguente tabella :
// Donna    Costituzione    Uomo
// < 15     Esile           < 17
// 15-16    Normale         17-18
// > 16     Robusta         > 18


//Input : 5.4 170
//Output: Sovrappeso
//Output: Vuoi effettuare una misurazione precisa ?
//Input: si
//Output : Inserisci la circonferenza del polso e il tuo sesso
//Input: 17 M
//Output: La tua costituzione e` : NORMALE
//Input : 5.4 170
//Output: Sovrappeso


//Output: Vuoi effettuare una misurazione precisa ?
//Input: No
//Output : Arrivederci





function cAndC(altezzaFt:number,pesoLbr:number):number{
    let heightCm:number= (altezzaFt * 0.30);
    let weightKg:number= (pesoLbr / 2.2046);
    let bmi:number = weightKg / (heightCm * heightCm);
    return bmi
}

function cBmi(bmi:number):string{
    let bmiC:string="non si sa";

        if (bmi<16.5){
        bmiC="Sottopeso severo";
    }else if (bmi >= 16.5 && bmi <= 18.4){
        bmiC="Sottopeso";
    }else if (bmi>=18.5 && bmi <=24.9){
        bmiC="Normale";
    }else if (bmi>=25 && bmi <=30){
        bmiC="Sovrappeso";
    }else if (bmi>=30.1 && bmi <=34.9){
        bmiC="Obesità primo grado";
    }else if (bmi>=35 && bmi <=40){
        bmiC="Obesità secondo grado";
    }else if (bmi>40){
        bmiC="gskianto";
    }
    return bmiC
}
function fM(risposta:string):string{
    let costituzione:string="Alla prossima";
    if (risposta == "si" || risposta =="SI"|| risposta =="Si" || risposta =="sI"){
        let sesso:string=prompt("inserisci il tuo sesso, U per uomo o D per donna");
        let cPolso:number=prompt("inserisci la conferenza del polso in cm")*1;
        if (sesso == "D" ||sesso == "d" ||sesso == "U"||sesso == "u"){
            if (cPolso<15 && sesso == "D"){
                costituzione="La tua costituzione é: Esile";
            }else if (cPolso == 15 && sesso == "D" || cPolso == 16 && sesso == "D"){
                costituzione="La tua costituzione é: Normale";
            }else if (cPolso>16 && sesso == "D"){
                costituzione="Robusta";
            }

            if (cPolso<17 && sesso == "U"){
            costituzione= "La tua costituzione è: Esile";
            }else if (cPolso == 17 && sesso == "U" || cPolso == 18 && sesso == "U"){
            costituzione="La tua costituzione é: Normale";
            }else if (cPolso>18 && sesso == "U"){
            costituzione="La tua costituzione é: Robusta";
            }
        }else{
            console.log("Riprova")
        }

    }else if(risposta == "NO" || risposta =="No"|| risposta =="nO" || risposta =="no"){
        
        console.log("Arrivederci")
    }else{
        console.log("Riprova")
    }
    return costituzione
}
let altPesFu:any[]=[]
altPesFu[0]=prompt("Inserisci la tua altezza in ft");
altPesFu[1] = prompt("Inserisci il tuo peso in Lbr");
altPesFu[3] = prompt("Vuoi effettuare una misurazione precisa? Rispondi con un si o un no");

console.log(cBmi(cAndC(altPesFu[0],altPesFu[1])));
console.log(fM(altPesFu[3]));
