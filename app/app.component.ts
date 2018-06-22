import { Component, ViewChild } from '@angular/core';
import { Nav, Platform } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

//Importando as principais páginas do aplicativo

import { HomePage } from '../pages/home/home';
import { ListPage } from '../pages/list/list';
import { CalculadoraPage } from '../pages/calculadora/calculadora';
import { NavegadorPage } from '../pages/navegador/navegador';
import { MapaPage } from '../pages/mapa/mapa';
import { ContatosPage } from '../pages/contatos/contatos';
import { DatabaseProvider } from '../providers/database/database';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  @ViewChild(Nav) nav: Nav;

  rootPage: any = null;

  pages: Array<{title: string, component: any}>;

  constructor(public platform: Platform, public statusBar: StatusBar, public splashScreen: SplashScreen, public dbProvider: DatabaseProvider) {
    this.initializeApp();

    // São as páginas de inicialização do aplicativo
    this.pages = [
      { title: 'Home', component: HomePage },
      { title: 'List', component: ListPage },
      { title: 'Calculadora', component: CalculadoraPage },
      { title: 'Navegador', component: NavegadorPage },
      { title: 'Mapa', component: MapaPage },
      { title: 'Contatos', component: ContatosPage },
    ];

  }
// A inicialização do aplicativo se dará pelo código abaixo
  initializeApp() {
    this.platform.ready().then(() => {
      this.statusBar.styleDefault();
      this.splashScreen.hide();

      this.dbProvider.estruturaBD() //Aqui o banco de dados, será inicializado junto com o aplicativo
      //Se a inicialização do banco acontecer com sucesso, a pagina inicial será carregada
        .then(() => {
          this.paginaPrincipal(this.splashScreen);
        })
        //Se falhar, a pagina inicial também será iniciada
        .catch(() => {
          this.paginaPrincipal(this.splashScreen);
        })
    });
  }

  openPage(page) {
    this.nav.setRoot(page.component);
  }

  private paginaPrincipal(splashScreen: SplashScreen){
    splashScreen.hide();
    this. rootPage = HomePage;

  }
}
