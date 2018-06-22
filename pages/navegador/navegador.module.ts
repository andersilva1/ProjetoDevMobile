import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { NavegadorPage } from './navegador';

@NgModule({
  declarations: [
    NavegadorPage,
  ],
  imports: [
    IonicPageModule.forChild(NavegadorPage),
  ],
})
export class NavegadorPageModule {}
