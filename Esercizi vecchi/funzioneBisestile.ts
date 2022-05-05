/*Si scriva un programma che preso in input un anno, stampi a se questo e` bisestile o meno.
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
function bisestile(anno:number):string{
    let bis:string;
    if(anno%400==0||anno%4==0 && anno%100!=0){
        bis="L'anno e` bisestile";
    }else
        bis="L'anno non e` bisestile";
    return bis
}
let anno:number = prompt("inserisci un anno");
console.log(bisestile(anno))