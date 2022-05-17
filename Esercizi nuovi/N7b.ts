function popolaArray4():number[]{
    let arr:string=prompt("Inserisci  X, N che sarebbe la lunghezza della sequenza e una sequenza di interi positivi");
    let splitted=arr.split(" ").map(x=>+x);
    return splitted;
}
let array3=popolaArray4();

function maggX():string{
    let res:string="";
    let x=array3[0];
    let n=array3[1];
    for(let i=2;i<(n+2);i++){
        if(array3[i]<x && array3[i]%2==0){
            res= res + array3[i];
            
        }
    }
    return res
}
function stamparisultato(res:string):void{
    alert(res);
}
stamparisultato(maggX());