import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ActiviteCreatePage } from './activite-create.page';

const routes: Routes = [
  {
    path: '',
    component: ActiviteCreatePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActiviteCreatePageRoutingModule {}
