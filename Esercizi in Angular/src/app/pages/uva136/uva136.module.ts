import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { Uva136PageRoutingModule } from './uva136-routing.module';

import { Uva136Page } from './uva136.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    Uva136PageRoutingModule
  ],
  declarations: [Uva136Page]
})
export class Uva136PageModule {}
