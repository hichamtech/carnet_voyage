import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ActiviteDetailPage } from './activite-detail.page';

const routes: Routes = [
  {
    path: '',
    component: ActiviteDetailPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActiviteDetailPageRoutingModule {}
