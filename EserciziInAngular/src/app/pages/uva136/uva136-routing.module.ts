import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { Uva136Page } from './uva136.page';

const routes: Routes = [
  {
    path: '',
    component: Uva136Page
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class Uva136PageRoutingModule {}
