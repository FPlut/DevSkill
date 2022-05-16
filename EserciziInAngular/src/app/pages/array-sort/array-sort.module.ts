import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ArraySortPageRoutingModule } from './array-sort-routing.module';

import { ArraySortPage } from './array-sort.page';
import { ImgTitleComponent } from 'src/app/components/img-title/img-title.component';
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ArraySortPageRoutingModule,
    ReactiveFormsModule
  ],
  declarations: [ArraySortPage,ImgTitleComponent]
})
export class ArraySortPageModule {}
