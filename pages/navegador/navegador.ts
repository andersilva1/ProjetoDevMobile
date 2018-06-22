import { Component } from "@angular/core";
import { IonicPage, NavController, NavParams } from "ionic-angular";
import { InAppBrowser } from "@ionic-native/in-app-browser";
import { DomSanitizer } from '@angular/platform-browser';

@IonicPage()
@Component({
  selector: "page-navegador",
  templateUrl: "navegador.html"
})
export class NavegadorPage {
  // Declarando a variavel de ambiente
  urlNavigator: any;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    private iab: InAppBrowser,
    private sanitize: DomSanitizer
  ) { // A variavel receberá a url https://www.google.com.br
    this.urlNavigator = this.sanitize.bypassSecurityTrustResourceUrl("https://www.google.com.br");
  }

  // A tela de navegação será chamada a seguir
  ionViewDidLoad() {
    console.log("ionViewDidLoad NavegadorPage");
  }

  urlpaste(event){
    return this.sanitize.bypassSecurityTrustResourceUrl(this.urlNavigator);
  }

  ngOnInit() {
  }
}
