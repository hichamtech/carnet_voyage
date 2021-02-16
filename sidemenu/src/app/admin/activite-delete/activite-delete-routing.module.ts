import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ActiviteDeletePage } from './activite-delete.page';

const routes: Routes = [
  {
    path: '',
    component: ActiviteDeletePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActiviteDeletePageRoutingModule {}
