
// Prese in input due parole
// Creare una terza parola, composta dalla prima e dall'inverso della seconda.
// input  : ciao
// input  : pizza
// output : ciaoazzip

function concatInput():string {
    let parola1: string = prompt("Inserisci una parola");
    let parola2: string = prompt("Inserisci un'altra parola");
    let reversed:string=rev((parola2));
    let parola3:string= parola1+reversed;
    return parola3
}
function rev(input: string) {
    let reversed: string;
    let arr: string[];
    arr = input.split("")
    arr = arr.reverse()
    console.log(arr)
    reversed = arr.join("")
    return reversed
}

console.log(concatInput())
