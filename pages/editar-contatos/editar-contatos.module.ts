import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { EditarContatosPage } from './editar-contatos';

@NgModule({
  declarations: [
    EditarContatosPage,
  ],
  imports: [
    IonicPageModule.forChild(EditarContatosPage),
  ],
})
export class EditarContatosPageModule {}
