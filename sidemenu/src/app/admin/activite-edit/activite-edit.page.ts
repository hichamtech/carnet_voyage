import { ActivatedRoute, Router } from '@angular/router';
import { Activite } from './../../models/activite';
import { Component, OnInit } from '@angular/core';
import { ApiActiviteService } from 'src/app/services/api-activite.service';

@Component({
  selector: 'app-activite-edit',
  templateUrl: './activite-edit.page.html',
  styleUrls: ['./activite-edit.page.scss'],
})
export class ActiviteEditPage implements OnInit {

  id: String;
  data: Activite;

  constructor(
    public activatedRoute: ActivatedRoute,
    public router: Router,
    public apiService: ApiActiviteService
  ) {
    this.data = new Activite();
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
      this.router.navigate(['activite-list']);
    })

}
}