import { ApiService } from './../../../services/api.service';
import { Domaine } from './../../../models/domaine';

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-domaine-create',
  templateUrl: './domaine-create.page.html',
  styleUrls: ['./domaine-create.page.scss'],
})
export class DomaineCreatePage implements OnInit {

  data: Domaine

  constructor(
    public apiService: ApiService,
    public router: Router
  ) {
    this.data = new Domaine();
  }

  ngOnInit() {
  }

  submitForm() {
    this.apiService.createItem(this.data).subscribe((response) => {
      this.router.navigate(['domaine-list']);
    });

  }

}
