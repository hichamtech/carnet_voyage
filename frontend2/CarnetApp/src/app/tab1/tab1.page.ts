import { ApiActiviteService } from 'src/app/services/api-activite.service';
import { AuthenticationService } from './../services/authentication.service';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
 
@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page {
 
  domaineData: any;

  constructor(private authService: AuthenticationService, private router: Router, public apiService: ApiActiviteService) {
    this.domaineData = [];
  }
 

  async logout() {
    await this.authService.logout();
    this.router.navigateByUrl('/', { replaceUrl: true });
  }


 

  ngOnInit() {
    // this.getAllStudents();
  }

  ionViewWillEnter() {
    // Used ionViewWillEnter as ngOnInit is not 
    // called due to view persistence in Ionic
    this.getAllActivites();
  }

  getAllActivites() {
    //Get saved list of students
    this.apiService.getList().subscribe(response => {
      console.log(response);
      this.domaineData = response;
    })
  }
  async filterList(evt) {
    this.domaineData = await this.getAllActivites();
    const searchTerm = evt.srcElement.value;
  
    if (!searchTerm) {
      return;
    }
    
  this.domaineData = this.domaineData.filter(currentFood => {
    if (currentFood.name && searchTerm) {
      return (currentFood.name.toLowerCase().indexOf(searchTerm.toLowerCase()) > -1);
    }
  });

  }
}