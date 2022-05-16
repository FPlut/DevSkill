import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { Uva100PageRoutingModule } from './uva100-routing.module';

import { Uva100Page } from './uva100.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    Uva100PageRoutingModule
  ],
  declarations: [Uva100Page]
})
export class Uva100PageModule {}
