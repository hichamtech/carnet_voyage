import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full'
  },
  
  {
    path: 'domaine-create',
    loadChildren: () => import('./admin/domaine-create/domaine-create.module').then( m => m.DomaineCreatePageModule)
  },
  {
    path: 'domaine-edit/:id',
    loadChildren: () => import('./admin/domaine-edit/domaine-edit.module').then( m => m.DomaineEditPageModule)
  },
  {
    path: 'domaine-list',
    loadChildren: () => import('./admin/domaine-list/domaine-list.module').then( m => m.DomaineListPageModule)
  },
  {
    path: 'domaine-detail',
    loadChildren: () => import('./admin/domaine-detail/domaine-detail.module').then( m => m.DomaineDetailPageModule)
  },
  {
    path: 'activite-list',
    loadChildren: () => import('./admin/activite-list/activite-list.module').then( m => m.ActiviteListPageModule)
  },
  {
    path: 'activite-edit/:id',
    loadChildren: () => import('./admin/activite-edit/activite-edit.module').then( m => m.ActiviteEditPageModule)
  },
  {
    path: 'activite-delete',
    loadChildren: () => import('./admin/activite-delete/activite-delete.module').then( m => m.ActiviteDeletePageModule)
  },
  {
    path: 'activite-detail',
    loadChildren: () => import('./admin/activite-detail/activite-detail.module').then( m => m.ActiviteDetailPageModule)
  },
  {
    path: 'activite-create',
    loadChildren: () => import('./admin/activite-create/activite-create.module').then( m => m.ActiviteCreatePageModule)
  },
  {
    path: 'login',
    loadChildren: () => import('./login/login.module').then( m => m.LoginPageModule)
  },
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
