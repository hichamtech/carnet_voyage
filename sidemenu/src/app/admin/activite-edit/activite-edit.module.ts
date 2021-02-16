import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ActiviteEditPageRoutingModule } from './activite-edit-routing.module';

import { ActiviteEditPage } from './activite-edit.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ActiviteEditPageRoutingModule
  ],
  declarations: [ActiviteEditPage]
})
export class ActiviteEditPageModule {}
