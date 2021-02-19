import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

import { AuthGuard } from './guards/auth.guard';
import { IntroGuard } from './guards/intro.guard';
import { AutoLoginGuard } from './guards/auto-login.guard';
/*const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./tabs/tabs.module').then(m => m.TabsPageModule)
  },
  {
    path: 'intro',
    loadChildren: () => import('./pages/intro/intro.module').then( m => m.IntroPageModule)
  },
  {
    path: 'login',
    loadChildren: () => import('./pages/login/login.module').then( m => m.LoginPageModule)
  }
];*/
const routes: Routes = [
  {
    path: 'login',
    loadChildren: () => import('./pages/login/login.module').then( m => m.LoginPageModule),
    canLoad: [IntroGuard, AutoLoginGuard] // Check if we should show the introduction or forward to inside
  },
  {
    path: 'intro',
    loadChildren: () => import('./pages/intro/intro.module').then( m => m.IntroPageModule)
  },
  {
    path: 'tabs',
    loadChildren: () => import('./tabs/tabs.module').then(m => m.TabsPageModule),
  //  canLoad: [AuthGuard] // Secure all child pages
  },
  {
    path: 'domaine-create',
    loadChildren: () => import('./pages/admin/domaine-create/domaine-create.module').then( m => m.DomaineCreatePageModule)
  },
  {
    path: 'domaine-edit/:id',
    loadChildren: () => import('./pages/admin/domaine-edit/domaine-edit.module').then( m => m.DomaineEditPageModule)
  },
  {
    path: 'domaine-list',
    loadChildren: () => import('./pages/admin/domaine-list/domaine-list.module').then( m => m.DomaineListPageModule)
  },
  {
    path: 'domaine-detail',
    loadChildren: () => import('./pages/admin/domaine-detail/domaine-detail.module').then( m => m.DomaineDetailPageModule)
  },
  {
    path: 'activite-list',
    loadChildren: () => import('./pages/admin/activite-list/activite-list.module').then( m => m.ActiviteListPageModule)
  },
  {
    path: 'activite-edit/:id',
    loadChildren: () => import('./pages/admin/activite-edit/activite-edit.module').then( m => m.ActiviteEditPageModule)
  },
  {
    path: 'activite-delete',
    loadChildren: () => import('./pages/admin/activite-delete/activite-delete.module').then( m => m.ActiviteDeletePageModule)
  },
  {
    path: 'activite-detail',
    loadChildren: () => import('./pages/admin/activite-detail/activite-detail.module').then( m => m.ActiviteDetailPageModule)
  },
  {
    path: 'activite-create',
    loadChildren: () => import('./pages/admin/activite-create/activite-create.module').then( m => m.ActiviteCreatePageModule)
  },
  {
    path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  },
  {
    path: 'members',
    loadChildren: () =>
      import('./tabs/tabs.module').then(m => m.TabsPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'registration',
    loadChildren: () => import('./registration/registration.module').then( m => m.RegistrationPageModule)
  },
  


];
/*const routes: Routes = [
  {
    path: 'members',
    loadChildren: () =>
      import('./tabs/tabs.module').then(m => m.TabsPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: '',
    loadChildren: () =>
      import('./pages/login/login.module').then(m => m.LoginPageModule)
  },
  
];*/
@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
