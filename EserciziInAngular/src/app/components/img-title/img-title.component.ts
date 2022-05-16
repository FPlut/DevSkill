import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-img-title',
  templateUrl: './img-title.component.html',
  styleUrls: ['./img-title.component.scss'],
})
export class ImgTitleComponent implements OnInit {
@Input() title:string;
percorsoImg:string="../../../assets/logo_devskill.png"
@Input() desc:string;
  constructor() { }

  ngOnInit() {}

}
