import { BrowserModule } from "@angular/platform-browser";
import { ErrorHandler, NgModule, LOCALE_ID } from "@angular/core";
import { IonicApp, IonicErrorHandler, IonicModule } from "ionic-angular";
import { InAppBrowser } from "@ionic-native/in-app-browser";
import { Geolocation } from "@ionic-native/geolocation";

// Importanto as páginas principais da aplicação

import { MyApp } from "./app.component";
import { HomePage } from "../pages/home/home";
import { ListPage } from "../pages/list/list";
import { CalculadoraPage } from "./../pages/calculadora/calculadora";
import { NavegadorPage } from './../pages/navegador/navegador';

// Importando as principais classes e banco de dados

import { StatusBar } from "@ionic-native/status-bar";
import { SplashScreen } from "@ionic-native/splash-screen";
import { MapaPage } from '../pages/mapa/mapa';
import { ContatosPage } from '../pages/contatos/contatos';
import { SQLite } from '@ionic-native/sqlite';
import { DatabaseProvider } from '../providers/database/database';
import { ContatoProvider } from '../providers/contato/contato';
import { EditarContatosPage } from '../pages/editar-contatos/editar-contatos';

@NgModule({
  declarations: [MyApp, HomePage, ListPage, CalculadoraPage, NavegadorPage, MapaPage, ContatosPage, EditarContatosPage],
  imports: [BrowserModule, IonicModule.forRoot(MyApp)],
  bootstrap: [IonicApp],
  entryComponents: [MyApp, HomePage, ListPage, CalculadoraPage, NavegadorPage, MapaPage, ContatosPage, EditarContatosPage],

  providers: [ //Principais componentes/fornecedores da aplicação
    StatusBar,
    SplashScreen,
    InAppBrowser,
    Geolocation,
    { provide: LOCALE_ID, useValue: 'pt-BR' },
    { provide: ErrorHandler, useClass: IonicErrorHandler },
    SQLite,
    DatabaseProvider,
    ContatoProvider
  ]
})
export class AppModule {}
