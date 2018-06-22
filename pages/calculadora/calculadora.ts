import { Component } from "@angular/core";
import { IonicPage, NavController, NavParams } from "ionic-angular";
import { AlertController } from "ionic-angular";
import { Title } from "@angular/platform-browser";

@IonicPage()
@Component({
  selector: "page-calculadora",
  templateUrl: "calculadora.html"
})
export class CalculadoraPage {
  //Declarando as variaveis da página
  valor1 = "0";
  valor2 = "0";
  resultado = "0";

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    public alertCtrl: AlertController
  ) {}

  // Método para carregar a tela CalculadoraPage
  ionViewDidLoad() {
    console.log("ionViewDidLoad CalculadoraPage");
  }

  // Metódo responsavel pela soma dos valores
  somar(event) {
    this.resultado = (parseFloat(this.valor1) + parseFloat(this.valor2)).toString();
    console.log(this.resultado);
  }

  // Metódo responsavel pela subtração dos valores
  subtrair(event) {
    this.resultado = (parseFloat(this.valor1) - parseFloat(this.valor2)).toString();
    console.log(this.resultado);
  }

  // Metódo responsavel pela multiplicação dos valores
  multiplicar(event) {
    this.resultado = (parseFloat(this.valor1) * parseFloat(this.valor2)).toString();
    console.log(this.resultado);
  }

  // Metódo responsavel pela divisão dos valores
  dividir(event) {
    if (parseFloat(this.valor2) == 0) { //verificando se o segundo valor é 0
      this.alertar("Erro ao dividir", "Um número não pode ser dividido por 0.");
      this.valor1 = "0";
      this.valor2 = "0";
      this.resultado = "0";
    } else {
      this.resultado = (parseFloat(this.valor1) / parseFloat(this.valor2)).toString();
      console.log(this.resultado);
    }
  }

  // Metódo responsavel por fazer a porcentagem dos valores
  porcentagem(event) {
    this.resultado = ((parseFloat(this.valor1) * parseFloat(this.valor2) / 100)).toString() + "%";
    console.log(this.resultado);
  }

  // Metódo responsavel pela mensagem de alerta
  alertar(titulo, mensagem) {
    const alert = this.alertCtrl.create({
      title: titulo,
      subTitle:
      mensagem,
      buttons: ["OK"]
    });
    alert.present();
  }
}
