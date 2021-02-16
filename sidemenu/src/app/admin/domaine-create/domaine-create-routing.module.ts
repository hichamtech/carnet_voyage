import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DomaineCreatePage } from './domaine-create.page';

const routes: Routes = [
  {
    path: '',
    component: DomaineCreatePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DomaineCreatePageRoutingModule {}
