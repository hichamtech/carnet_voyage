import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ActiviteEditPage } from './activite-edit.page';

const routes: Routes = [
  {
    path: '',
    component: ActiviteEditPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActiviteEditPageRoutingModule {}
