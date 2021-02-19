import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ActiviteDetailPageRoutingModule } from './activite-detail-routing.module';

import { ActiviteDetailPage } from './activite-detail.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ActiviteDetailPageRoutingModule
  ],
  declarations: [ActiviteDetailPage]
})
export class ActiviteDetailPageModule {}
