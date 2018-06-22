import { Component } from "@angular/core";
import { IonicPage, NavController, NavParams } from "ionic-angular";
import { Geolocation } from "@ionic-native/geolocation";
import { //Importando as bibliotecas do Google
  GoogleMaps,
  GoogleMap,
  GoogleMapsEvent,
  GoogleMapOptions,
  CameraPosition,
  MarkerOptions,
  Marker
} from "@ionic-native/google-maps";

@IonicPage()
@Component({
  selector: "page-mapa",
  templateUrl: "mapa.html"
})
export class MapaPage {
  // Declarando as variaveis
  latitude: any;
  longitude: any;
  map: GoogleMap;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    private geolocation: Geolocation
  ) {
    this.geolocation
      .getCurrentPosition() // O metodo getCurrentPosition será chamado para buscar a posição atual do usuário
      .then(resp => {
        this.latitude = resp.coords.latitude; // se for verdadeiro vai passar as coordenadas do usuário
        this.longitude = resp.coords.longitude;
      })
      .catch(error => {
        console.log("Error getting location", error); // se for falso, vai retornar o erro
      });
  }

  // Metodo que carrega o mapa, de acordo com as variaveis longitude e latitude
  loadMap() {
    let mapOptions: GoogleMapOptions = {
      camera: {
        target: {
          lat: this.latitude,
          lng: this.longitude
        },
        zoom: 18,
        tilt: 30
      }
    };

    this.map = GoogleMaps.create("mapa", mapOptions);

    let marker: Marker = this.map.addMarkerSync({
      //Criando a vairavel chamada marker que será utilizada no metodo addMarkerSync,
      // que sincroniza os dados da Google
      title: "Eu",
      icon: "blue",
      animation: "DROP",
      position: {
        lat: this.latitude,
        lng: this.longitude
      }
    });
  }

  // carrega a tela do mapa
  ionViewDidLoad() {
    console.log("ionViewDidLoad MapaPage");
    this.loadMap();
  }
}
