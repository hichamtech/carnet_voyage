import { Injectable } from '@angular/core';
import { environment } from './../../environments/environment';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  login(auth: {email: string, password: string}) {
    return this.http.post(`${environment.baseUrl}/users/login`, auth);
  }
}
