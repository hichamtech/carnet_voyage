import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DomaineEditPage } from './domaine-edit.page';

const routes: Routes = [
  {
    path: '',
    component: DomaineEditPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DomaineEditPageRoutingModule {}
