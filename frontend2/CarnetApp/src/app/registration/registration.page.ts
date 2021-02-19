import { ApiRegisterService } from './../services/api-register.service';
import { Router } from '@angular/router';
import { Register } from './../models/register';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.page.html',
  styleUrls: ['./registration.page.scss'],
})
export class RegistrationPage implements OnInit {
  data: Register

  constructor(
    public apiService: ApiRegisterService,
    public router: Router
  ) {
    this.data = new Register();
  }

  ngOnInit() {
  }

  submitForm() {
    this.apiService.register(this.data).subscribe((response) => {
      this.router.navigate(['login']);
    });

  }

}
