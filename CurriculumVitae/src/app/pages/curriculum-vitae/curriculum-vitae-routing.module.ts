import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CurriculumVitaePage } from './curriculum-vitae.page';

const routes: Routes = [
  {
    path: '',
    component: CurriculumVitaePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CurriculumVitaePageRoutingModule {}
