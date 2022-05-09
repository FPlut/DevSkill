import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { Uva100Page } from './uva100.page';

const routes: Routes = [
  {
    path: '',
    component: Uva100Page
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class Uva100PageRoutingModule {}
