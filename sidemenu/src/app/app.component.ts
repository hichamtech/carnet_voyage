import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss'],
})
export class AppComponent {
  public appPages = [
    { title: 'Activites', url: '/activite-list', icon: 'mail' },
    { title: 'Domaine', url: '/domaine-list', icon: 'paper-plane' },
    { title: 'Connexion', url: '/login', icon: 'heart' },
    { title: 'Inscription', url: '/inscription', icon: 'archive' },

  ];
  constructor() {}
}
