function inputNumeri(){
    let numeri:string=prompt("Una sequenza di interi terminata da -1");
    let arrNum=numeri.split(" ").map(x=>+x);
    if(arrNum[0]==-1){
        return arrNum;
    }else{
        arrNum.pop();
        return arrNum;
    }
    
}
let nInv= inputNumeri();
function controlloArray():boolean{
    
    
    for(let i=0;i<nInv.length;i++){
        if(nInv[0]==-1){
            alert("VUOTO")
            i=nInv.length;
            return false
        }
        if(nInv[i]>9 || nInv[i]<0){
            alert("ERRORE")
            i=nInv.length;
            return false
        }
    }
    return true
}

function stampaRis(){
    if (controlloArray()==true){
        console.log(nInv)
        let joined=nInv.join("");
        let risposta:string="";
            if(+joined%3==0){
                risposta="SI";
            }else {
               risposta="NO";
            }
        alert(joined+ "\n" + risposta)
    }
}
stampaRis()