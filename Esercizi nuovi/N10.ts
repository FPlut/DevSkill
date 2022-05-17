function reverseString(numbers:string){
    let preReverse=numbers.split("");
    let spacesReversed=preReverse.reverse();
    let reversed=spacesReversed.join("");
    return reversed
}
function funzioneStampa(){
    let num:string=prompt("Inserisci un numero intero");
    let nInv= +reverseString(num);
    alert(+num-nInv);
    /* Se il secondo esempio e corretto bisogna commentare l'alert sopra e decommentare questo
    if (+num>nInv){
        alert(+num-nInv);
    }else{
        alert(nInv - (+num));
    }*/

}

funzioneStampa();