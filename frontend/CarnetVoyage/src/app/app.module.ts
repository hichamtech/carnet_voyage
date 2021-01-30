import { AuthService } from './services/auth.service';
import { NavbarComponent } from './components/admin/partials/navbar/navbar.component';
import { HomePageModule } from './home/home.module';
import { PageNotFoundComponent } from './components/admin/partials/page-not-found/page-not-found.component';
import { EditDomaineComponent } from './components/admin/edit-domaine/edit-domaine.component';
import { ListDomaineComponent } from './components/admin/list-domaine/list-domaine.component';
import { LoginComponent } from './components/login/login.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent
   


  
  ],
  entryComponents: [AppComponent],
  imports: [
    BrowserModule, 
    IonicModule.forRoot(), 
    AppRoutingModule,
    
    AuthService,



  ],
  providers: [
   
   
    
    StatusBar,
    SplashScreen,
    { 
    
      provide: [RouteReuseStrategy],
      useClass: IonicRouteStrategy,


    },
    AuthService,
    AuthService, {
      provide: null,
      useClass: null,
      multi: true
    },
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
