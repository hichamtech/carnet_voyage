import { AuthenticationService } from './../services/authentication.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { AlertController } from '@ionic/angular';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  credentials = {
    email: 'saimon@devdactic.com',
    pw: '123'
  };
 
  constructor(
    private auth: AuthenticationService,
    private router: Router,
    private alertCtrl: AlertController
  ) {}
 
  ngOnInit() {}
 
  login() {
    this.auth.login(this.credentials).subscribe(async res => {
      if (res) {
        this.router.navigateByUrl('/activite-list');
      } else {
        const alert = await this.alertCtrl.create({
          header: 'Login Failed',
          message: 'Wrong credentials.',
          buttons: ['OK']
        });
        await alert.present();
      }
    });
  }

}
