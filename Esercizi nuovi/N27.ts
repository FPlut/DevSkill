function popolaArray2():number[]{
    let arr:string=prompt("Inserisci una sequenza di interi positivi terminata dal tappo -1");
    let splitted=arr.split(" ").map(x=>+x);
    return splitted;
}
let array=popolaArray2();

function consecNum(){
    let numN:number=+prompt("Inserisci il numero N")
    let count:number=0;
    for(let j=0;j<array.length-1;j++){
        if(array[j]<numN || array[j]==numN){
            count++;
        }else{
            j=(array.length);
        }
    }
    if(count<numN-1||count==numN-1){
        alert("NO")
    }else{
        alert("OK")
    }

}
consecNum()