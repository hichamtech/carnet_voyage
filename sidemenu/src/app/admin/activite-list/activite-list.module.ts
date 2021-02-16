import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ActiviteListPageRoutingModule } from './activite-list-routing.module';

import { ActiviteListPage } from './activite-list.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ActiviteListPageRoutingModule
  ],
  declarations: [ActiviteListPage]
})
export class ActiviteListPageModule {}
