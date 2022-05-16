function popolaArray3():number[]{
    let arr:string=prompt("Inserisci 10 numeri interi");
    let numeri=arr.split(" ",10).map(x=>+x);
    return numeri;
}
let x:number=+prompt("Inserisci il divisore")
let numeri=popolaArray3();
let count:number=0;
numeri.forEach(function (value):void{
    
    if(!(value%x==0)){
        count++;
    }
});
function stampaR():void{
    if (count==10){
        alert("OK")
    }else{
        alert("NO")
    }
}
stampaR();