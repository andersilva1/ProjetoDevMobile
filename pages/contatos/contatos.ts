import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { ContatoProvider, Contato } from '../../providers/contato/contato';
import { EditarContatosPage } from '../editar-contatos/editar-contatos';

@Component({
  selector: 'page-contatos',
  templateUrl: 'contatos.html',
})
export class ContatosPage {
  // Declarando as variáveis
  contatos: any[] = [];
  busca: String = null;

  constructor(public navCtrl: NavController, private toast: ToastController,public navParams: NavParams, private contatoProvider: ContatoProvider) {  }

  // O metodo recuperaContatos será iniciado assim que o aplicativo for iniciado
  ionViewDidEnter(){
   this.recuperaContatos();
  }

  // Criação do metodo que recupera todos os contatos salvos
  recuperaContatos(){
    this.contatoProvider.getAll(this.busca)
      .then((result: any[]) => {
        this.contatos = result;
      })
  }

  // Metodo de adição de contatos chamará a tela EditarContatosPage
  addContatos(){
    this.navCtrl.push(EditarContatosPage);
  }

  // Metodo de edição, chamará a tela EditarContatosPage
  editaContatos(id: number){
    this.navCtrl.push(EditarContatosPage);
  }

  // Removendo os contatos salvos
  removeContatos(contatos: Contato){
    this.contatoProvider.remove(contatos.id)
    .then(( ) => {
      // Removendo do array de contatos
      var index = this.contatos.indexOf(contatos);
      this.contatos.splice(index,1);
      this.toast.create({message: 'Contato Excluido!', duration: 3000, position: 'botton'}).present();
    })
  }

  // Metodo que faz o filtro dos contatos
  filtroContatos(){
    this.recuperaContatos();
  }

}
