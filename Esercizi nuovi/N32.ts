function popolaArray5():number[]{
    let arr:string=prompt("Inserisci una serie di numeri con tappo 0");
    let splitted=arr.split(" ",arr.length-1).map(x=>+x);
    return splitted;
}

let arr=popolaArray5();
function controllo():void{
    let magg:number = 0
    let min:number = 0
    if(arr[0]<=arr[1]){
        for(let i =0;i<(arr.length-1);i++){

            if (arr[i+1]>arr[i]){
                magg++
                if (arr[i+1]==0){
                    
                }
            }
            else{
                min++
                if (arr[i+1]==0){
                    min--
                }
            }
        }
        if (magg+min==(arr.length-1)){
        alert("SI");
        }else{
        alert("NO");
        }   
    }else{
        alert("NO");
    }
    
}
controllo();