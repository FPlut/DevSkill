let rangeFrom:number;
let rangeTo:number;

let rangeString:string=prompt("Inserisci 2 numeri")
let splitted=rangeString.split(" ",2);
rangeFrom=+splitted[0]
rangeTo=+splitted[1]
function cycles(n: number) {
    let cycleCounter: number = 0;
    while (n !== 1) {
        if (n % 2 === 0) {                                      
            n = n / 2; 
            cycleCounter++;
        } else if (n % 2 !== 0) {
            n = (n * 3) + 1;
            cycleCounter++;
        }
    }
    return cycleCounter;
}


if (rangeFrom <0 || rangeFrom>10000 || isNaN(rangeFrom)){
    alert("Primo numero non valido ")
}else if (rangeTo<0 || rangeTo>10000|| isNaN(rangeTo)||rangeTo===1){
    alert("Secondo numero non valido ")
}else{
    let arr:number[]=[]
    let maxCycleLength:number=1;
    for(let i = rangeFrom; i<=rangeTo;i++){
       arr.push(i);
       if( maxCycleLength<cycles(i)){
           maxCycleLength=cycles(i)+1
       }
    }
    
    console.log(rangeFrom+" "+rangeTo+" "+maxCycleLength)
}