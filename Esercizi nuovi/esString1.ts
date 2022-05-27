// Verificare se una parola e` palindroma .
// Una parola si dice palindroma se letta al contrario ha lo stesso valore
// es. otto anna ossesso
// Creare un programma che letta in input una parola,
// restituisca true se la parola e` palindroma
// falso se non lo e`.

let input:string= prompt("inserisci una parola");

function reverse(input:string){
    let reversed:string;
    let arr:string[];
    arr=input.split("")
    arr =arr.reverse()
    console.log(arr)
    reversed=arr.join("")
    return reversed
}
function isPalindroma(parola:string, reversed:string):string{
    
    if (parola=== reversed){
        return "true"
    }
    
    return "false"
}

console.log(isPalindroma(input,reverse(input)))

