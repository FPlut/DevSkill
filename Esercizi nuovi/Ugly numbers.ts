let count = 0;
let chosen =+prompt("Enter the position of your favourite ugly number");
//let chosen:number=1500;//ci mette un po' ma funziona.
let i = 1;

function stampaR(n:number):void{
    while (count < n) {
        if (isAnUglyN(i)) {
            count++;
            if (count === n) {
                alert("The " + n + "'th ugly number is " + i);
            }
        }

        i++;
    }
}
function isAnUglyN(n: number): boolean {
  while (n !== 1) {
    if (n % 2 === 0){
        n = n / 2;
    }else if (n % 3 === 0){
        n = n / 3;
    }else if (n % 5 === 0){
        n = n / 5;
    } 
    else{
        return false;
    } 
  }
  return true;
}
stampaR(chosen)