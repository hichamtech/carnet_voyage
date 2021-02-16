import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DomaineDetailPageRoutingModule } from './domaine-detail-routing.module';

import { DomaineDetailPage } from './domaine-detail.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DomaineDetailPageRoutingModule
  ],
  declarations: [DomaineDetailPage]
})
export class DomaineDetailPageModule {}
