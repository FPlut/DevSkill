import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-uva136',
  templateUrl: './uva136.page.html',
  styleUrls: ['./uva136.page.scss'],
})
export class Uva136Page implements OnInit {
  count:number = 0;
  chosen:number;
  i:number = 1;
  result:number=0;
  stampaR(n:number):void{
      while (this.count < n) {
          if (this.isAnUglyN(this.i)) {
              this.count++;
          }
  
          this.i++;
      }
      this.result=this.i-1;
  }
  
  isAnUglyN(n: number): boolean {
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
  
  constructor() { }

  ngOnInit() {
  }

}
