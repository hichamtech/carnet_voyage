import { Component, OnInit } from '@angular/core';
import { ApiActiviteService } from 'src/app/services/api-activite.service';

@Component({
  selector: 'app-activite-list',
  templateUrl: './activite-list.page.html',
  styleUrls: ['./activite-list.page.scss'],
})
export class ActiviteListPage implements OnInit {

  domaineData: any;

  constructor(
    public apiService: ApiActiviteService) {
    this.domaineData = [];
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


  delete(item) {
    //Delete item in Student data
    this.apiService.deleteItem(item.codeDomaine).subscribe(Response => {
      //Update list after delete is successful
      this.getAllActivites();
    });
  }

}
