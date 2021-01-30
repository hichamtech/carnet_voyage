import { EditDomaineComponent } from './components/admin/edit-domaine/edit-domaine.component';
import { AddDomaineComponent } from './components/admin/add-domaine/add-domaine.component';
import { ListDomaineComponent } from './components/admin/list-domaine/list-domaine.component';
import { PageNotFoundComponent } from './components/admin/partials/page-not-found/page-not-found.component';
import { LoginComponent } from './components/login/login.component';
import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  
 /* {
    path: 'domaine',
    loadChildren: () => import('./components/admin/list-domaine/list-domaine.component').then(m =>m.ListDomaineComponent)
  },
  {
    path: '',
    redirectTo: 'domaine',
    pathMatch: 'full'
  },*/
  { path: "admin/domaine", children: [
    { path:"", component: ListDomaineComponent },
    { path:"create", component: AddDomaineComponent },
    { path:"edit/:id", component: EditDomaineComponent },
  
   ], 
 },

  { path: "login", component: LoginComponent },
  { path: "**", component: PageNotFoundComponent}

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
