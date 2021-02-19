import { ApiService } from './../../../services/api.service';
import { Activite } from './../../../models/activite';
import { ApiActiviteService } from 'src/app/services/api-activite.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-activite-create',
  templateUrl: './activite-create.page.html',
  styleUrls: ['./activite-create.page.scss'],
})
export class ActiviteCreatePage implements OnInit {
  domaineData: any;

  data: Activite

  idDomaine : any;
  constructor(
    public apiService: ApiActiviteService,
    public apiDomaineService:ApiService,
    public router: Router
  ) {
    this.data = new Activite();
  }

  ngOnInit() {
    this.getAllDomaine();
  }
  onChange($event){
    console.log($event);
    this.idDomaine = $event;
  }

  submitForm() {
   // this.data.domaine = "http://localhost:8080/domaine/"+this.idDomaine
    this.apiService.createItem(this.data).subscribe((response) => {
      this.router.navigate(['activite-list']);
    });

  }
  getAllDomaine() {
    //Get saved list of students
    this.apiDomaineService.getList().subscribe(response => {
      console.log(response);
      this.domaineData = response;
    })
  }

}
