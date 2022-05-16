import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ArraySortPage } from './array-sort.page';

const routes: Routes = [
  {
    path: '',
    component: ArraySortPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ArraySortPageRoutingModule {}
