import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ActiviteDeletePageRoutingModule } from './activite-delete-routing.module';

import { ActiviteDeletePage } from './activite-delete.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ActiviteDeletePageRoutingModule
  ],
  declarations: [ActiviteDeletePage]
})
export class ActiviteDeletePageModule {}
