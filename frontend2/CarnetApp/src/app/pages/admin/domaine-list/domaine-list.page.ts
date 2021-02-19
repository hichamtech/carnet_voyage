import { ApiService } from './../../../services/api.service';

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-domaine-list',
  templateUrl: './domaine-list.page.html',
  styleUrls: ['./domaine-list.page.scss'],
})
export class DomaineListPage implements OnInit {
  domaineData: any;

  constructor(
    public apiService: ApiService
  ) {
    this.domaineData = [];
  }

  ngOnInit() {
    // this.getAllStudents();
  }

  ionViewWillEnter() {
    // Used ionViewWillEnter as ngOnInit is not 
    // called due to view persistence in Ionic
    this.getAllDomaine();
  }

  getAllDomaine() {
    //Get saved list of students
    this.apiService.getList().subscribe(response => {
      console.log(response);
      this.domaineData = response;
    })
  }


  delete(item) {
    //Delete item in Student data
    this.apiService.deleteItem(item.codeDomaine).subscribe(Response => {
      //Update list after delete is successful
      this.getAllDomaine();
    });
  }

}
