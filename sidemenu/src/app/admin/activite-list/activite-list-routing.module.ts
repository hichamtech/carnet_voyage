import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ActiviteListPage } from './activite-list.page';

const routes: Routes = [
  {
    path: '',
    component: ActiviteListPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ActiviteListPageRoutingModule {}
