import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';



import { ActivatedRouteSnapshot, CanActivate, Router } from '@angular/router';
import { take, map } from 'rxjs/operators';
import { AlertController } from '@ionic/angular'
import { AuthenticationService } from '../services/authentication.service';
@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private router: Router, private auth: AuthenticationService, private alertCtrl: AlertController) { }
 
  canActivate(route: ActivatedRouteSnapshot): Observable<boolean> {
    return this.auth.user.pipe(
      take(1),
      map(user => {
        if (!user) {
          this.alertCtrl.create({
            header: 'Unauthorized',
            message: 'You are not allowed to access that page.',
            buttons: ['OK']
          }).then(alert => alert.present());
 
          this.router.navigateByUrl('/');
          return false;
        } else {
          return true;
        }
      })
    )
  }
}
