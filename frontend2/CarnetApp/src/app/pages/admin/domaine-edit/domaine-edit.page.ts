import { Domaine } from './../../../models/domaine';
import { ApiService } from './../../../services/api.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-domaine-edit',
  templateUrl: './domaine-edit.page.html',
  styleUrls: ['./domaine-edit.page.scss'],
})
export class DomaineEditPage implements OnInit {

  id: String;
  data: Domaine;

  constructor(
    public activatedRoute: ActivatedRoute,
    public router: Router,
    public apiService: ApiService
  ) {
    this.data = new Domaine();
  }

  ngOnInit() {
    this.id = this.activatedRoute.snapshot.params["id"];
    //get item details using id
    this.apiService.getItem(this.id).subscribe(response => {
      console.log(response);
      this.data = response;
    })
  }

  update() {
    //Update item by taking id and updated data object
    this.apiService.updateItem(this.id, this.data).subscribe(response => {
      this.router.navigate(['domaine-list']);
    })
  }

}
