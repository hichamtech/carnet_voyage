import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ActiviteCreatePageRoutingModule } from './activite-create-routing.module';

import { ActiviteCreatePage } from './activite-create.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ActiviteCreatePageRoutingModule
  ],
  declarations: [ActiviteCreatePage]
})
export class ActiviteCreatePageModule {}
