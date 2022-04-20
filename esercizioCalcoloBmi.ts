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



let heightFt:number = prompt("inserisci la tua altezza in piedi")*1;
let weightLbr:number = prompt("inserisci il tuo peso in libre")*1;
let heightCm:number= (heightFt * 0.30);
let weightKg:number= (weightLbr / 2.2046);
let bmi:number = weightKg / (heightCm * heightCm);

if (bmi<16.5){
    console.log("Sottopeso severo")
}else if (bmi >= 16.5 && bmi <= 18.4){
    console.log("Sottopeso")
}else if (bmi>=18.5 && bmi <=24.9){
    console.log("Normale")
}else if (bmi>=25 && bmi <=30){
    console.log("Sovrappeso")
}else if (bmi>=30.1 && bmi <=34.9){
    console.log("Obesità primo grado")
}else if (bmi>=35 && bmi <=40){
    console.log("Obesità secondo grado")
}else if (bmi>40){
    console.log("gskianto")
}

let furtherM:string = prompt("Vuoi effettuare una misurazione precisa? Rispondi con un si o un no");

if (furtherM == "si" || furtherM =="SI"|| furtherM =="Si" || furtherM =="sI"){
    let sesso:string=prompt("inserisci il tuo sesso, U per uomo o D per donna");
    let cPolso:number=prompt("inserisci la conferenza del polso in cm")*1;
    if (sesso == "D" ||sesso == "d" ||sesso == "U"||sesso == "u"){
        if (cPolso<15 && sesso == "D"){
                console.log("La tua costituzione é: Esile")
        }else if (cPolso == 15 && sesso == "D" || cPolso == 16 && sesso == "D"){
            console.log("La tua costituzione é: Normale")
        }else if (cPolso>16 && sesso == "D"){
            console.log("Robusta")
        }

        if (cPolso<17 && sesso == "U"){
        console.log("La tua costituzione è: Esile")
        }else if (cPolso == 17 && sesso == "U" || cPolso == 18 && sesso == "U"){
        console.log("La tua costituzione é: Normale")
        }else if (cPolso>18 && sesso == "U"){
        console.log("La tua costituzione é: Robusta")
        }
    }else{
        console.log("Riprova")
    }

}else if(furtherM == "NO" || furtherM =="No"|| furtherM =="nO" || furtherM =="no"){
    
    console.log("Arrivederci")
}else{
    console.log("Riprova")
}


