import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-uva100',
  templateUrl: './uva100.page.html',
  styleUrls: ['./uva100.page.scss'],
})
export class Uva100Page implements OnInit {
  i:number;
  j:number;
  max:number;
  

  

  constructor() { 
    this.max=1
  }


  calcola3n():void{
    this.max=1;

    for(let k =this.i; k <= this.j; k++){
      let cl:number = 1;
      let numeroCorrente = k;

      while(numeroCorrente!=1){

        if(numeroCorrente%2!=0){
          numeroCorrente = (3*numeroCorrente) +1;
        }else{
          numeroCorrente = numeroCorrente/2;
        }

        cl++
      }
      this.max = this.calcolaMassimo(cl);
    }
  }

  calcolaMassimo(cl:number){
    return cl >this.max ? cl: this.max;
  }
  ngOnInit() {
  }

}
