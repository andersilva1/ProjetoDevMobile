import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { ContatoProvider, Contato } from '../../providers/contato/contato';

@IonicPage()
@Component({
  selector: 'page-editar-contatos',
  templateUrl: 'editar-contatos.html',
})
export class EditarContatosPage {
  // Declaração das variáveis
  modelo: Contato;
  contatos: any[];

  constructor( //Importação dos construtores
    public navCtrl: NavController
    , public navParams: NavParams
    , private toast: ToastController
    , private contatoProvider: ContatoProvider
  ) {

    this.modelo = new Contato(); //A variavel modelo vai receber os valores da classe Contato

    if(this.navParams.data.id){ //Recuperar o valor de um contato salvo
      this.contatoProvider.get(this.navParams.data.id)
      .then((result: any) => {
        this.modelo = result;
      })
    }
  }

  // Inicialização da tela, recuperando os dados de todos os contatos
  ionViewDidLoad() {
    this.contatoProvider.getAll()
      .then((result: any[]) => {
        this.contatos = result;
      })
      .catch(() => {
        this.toast.create({message: 'Erro ao Carregar os Contatos', duration: 3000, position: 'botton'}).present();
      })
  }

  // Metodo responsável por chamar o metodo de salvar ou inserir um novo contato
  salvar() {
    this.salvarContato()
      .then(() => {
        this.toast.create({ message: 'Contato salvo.', duration: 3000, position: 'botton' }).present();
        this.navCtrl.pop();
      })
      .catch(() => {
        this.toast.create({ message: 'Erro ao salvar o contato.', duration: 3000, position: 'botton' }).present();
      });
  }

  // Metodo responsável por salvar o contato
  private salvarContato() {
    if (this.modelo.id) {
      return this.contatoProvider.update(this.modelo);
    } else {
      return this.contatoProvider.insert(this.modelo);
    }
  }

}
