import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DomaineCreatePageRoutingModule } from './domaine-create-routing.module';

import { DomaineCreatePage } from './domaine-create.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DomaineCreatePageRoutingModule
  ],
  declarations: [DomaineCreatePage]
})
export class DomaineCreatePageModule {}
