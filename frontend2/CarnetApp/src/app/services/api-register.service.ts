import { Register } from './../models/register';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class ApiRegisterService {

  // API path
  register_path = 'http://localhost:8080/users';
  

 token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoaWNoYW1AZ21haWwuY29tIiwiaWQiOiJtVGlPWGM3ckF1dGJKeFA2azZHMFFNRXRhY1NpQjRPOCIsIm5hbWUiOiJoaWNoYW0gaGFzc2FuaSIsImV4cCI6MTYxNDM1NTQ4MX0._hfGcBnU0fHSYHH_XTGKmAGJJeAFiPDKi0sZHSNxMNIlXcne8bp7UkMTi9S8JYFyc94nNPudXMyiP8kybbP-TA";
  constructor(private http: HttpClient) { }

  // Http Options
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + this.token

    })
  }


  // Handle API errors
  handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  };


  // Create a new item
  register(item): Observable<Register> {
    return this.http
      .post<Register>(this.register_path, JSON.stringify(item), this.httpOptions)
      .pipe(
        retry(2),
        catchError(this.handleError)
      )
  }

  
}
