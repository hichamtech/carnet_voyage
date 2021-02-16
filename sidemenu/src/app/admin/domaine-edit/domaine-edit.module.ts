import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DomaineEditPageRoutingModule } from './domaine-edit-routing.module';

import { DomaineEditPage } from './domaine-edit.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DomaineEditPageRoutingModule
  ],
  declarations: [DomaineEditPage]
})
export class DomaineEditPageModule {}
