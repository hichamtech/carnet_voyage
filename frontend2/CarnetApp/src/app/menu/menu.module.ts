import { Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { MenuPageRoutingModule } from './menu-routing.module';

import { MenuPage } from './menu.page';

const routes: Routes = [
  {
    path: 'menu',
    component: MenuPage,
    children: [
      {
        path: 'domaine-create',
        loadChildren: () => import('../pages/admin/domaine-create/domaine-create.module').then( m => m.DomaineCreatePageModule)
      },
      {
        path: 'domaine-edit/:id',
        loadChildren: () => import('../pages/admin/domaine-edit/domaine-edit.module').then( m => m.DomaineEditPageModule)
      },
      {
        path: 'domaine-list',
        loadChildren: () => import('../pages/admin/domaine-list/domaine-list.module').then( m => m.DomaineListPageModule)
      },
      {
        path: 'domaine-detail',
        loadChildren: () => import('../pages/admin/domaine-detail/domaine-detail.module').then( m => m.DomaineDetailPageModule)
      },
      {
        path: 'activite-list',
        loadChildren: () => import('../pages/admin/activite-list/activite-list.module').then( m => m.ActiviteListPageModule)
      },
      {
        path: 'activite-edit/:id',
        loadChildren: () => import('../pages/admin/activite-edit/activite-edit.module').then( m => m.ActiviteEditPageModule)
      },
      {
        path: 'activite-delete',
        loadChildren: () => import('../pages/admin/activite-delete/activite-delete.module').then( m => m.ActiviteDeletePageModule)
      },
      {
        path: 'activite-detail',
        loadChildren: () => import('../pages/admin/activite-detail/activite-detail.module').then( m => m.ActiviteDetailPageModule)
      },
      {
        path: 'activite-create',
        loadChildren: () => import('../pages/admin/activite-create/activite-create.module').then( m => m.ActiviteCreatePageModule)
      },
      
    ]

    
  },
 
]


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    MenuPageRoutingModule
  ],
  declarations: [MenuPage]
})
export class MenuPageModule {}
