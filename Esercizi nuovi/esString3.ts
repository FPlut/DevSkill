
// Prese in input due parole
// Creare una terza parola, composta dalle lettere della prima e della seconda in maniera alternata.
// input  : ciaop
// input  : pizza
// output : ciazp

function trdWord():string {
    let parola1: string = prompt("Inserisci una parola");
    let parola2: string = prompt("Inserisci un'altra parola");
    let parola3:string="";
    for(let i=0;i<parola1.length;i++){
        let temp=parola1.charAt(i)+parola2.charAt(i+1)
        parola3=parola3+temp
        i++
    }
    return parola3
}
console.log(trdWord())