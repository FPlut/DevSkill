import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'uva100',
    pathMatch: 'full'
  },
  {
    path: 'uva100',
    loadChildren: () => import('./pages/uva100/uva100.module').then( m => m.Uva100PageModule)
  },
  {
    path: 'curriculum-vitae',
    loadChildren: () => import('./pages/curriculum-vitae/curriculum-vitae.module').then( m => m.CurriculumVitaePageModule)
  },
  {
    path: 'uva136',
    loadChildren: () => import('./pages/uva136/uva136.module').then( m => m.Uva136PageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
