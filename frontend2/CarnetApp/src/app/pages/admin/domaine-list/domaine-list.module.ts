import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DomaineListPageRoutingModule } from './domaine-list-routing.module';

import { DomaineListPage } from './domaine-list.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DomaineListPageRoutingModule
  ],
  declarations: [DomaineListPage]
})
export class DomaineListPageModule {}
