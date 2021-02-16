import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DomaineListPage } from './domaine-list.page';

const routes: Routes = [
  {
    path: '',
    component: DomaineListPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DomaineListPageRoutingModule {}
