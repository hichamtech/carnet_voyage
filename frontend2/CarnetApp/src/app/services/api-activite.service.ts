import { retry, catchError } from 'rxjs/operators';
import { Activite } from './../models/activite';
import { throwError, Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiActiviteService {

   // API path
   list_path = 'http://localhost:8080/admin/activite/list';
   create_path = 'http://localhost:8080/admin/activite/create';
   delete_path = 'http://localhost:8080/admin/activite/delete';
   update_path = 'http://localhost:8080/admin/activite/update';
   element_path = 'http://localhost:8080/admin/activite';
 
 
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
   createItem(item): Observable<Activite> {
     return this.http
       .post<Activite>(this.create_path, JSON.stringify(item), this.httpOptions)
       .pipe(
         retry(2),
         catchError(this.handleError)
       )
   }
 
   // Get single student data by ID
   getItem(id): Observable<Activite> {
     return this.http
       .get<Activite>(this.element_path + '/' + id)
       .pipe(
         retry(2),
         catchError(this.handleError)
       )
   }
 
   // Get students data
   getList(): Observable<Activite> {
     return this.http
       .get<Activite>(this.list_path)
       .pipe(
         retry(2),
         catchError(this.handleError)
       )
   }
 
   // Update item by id
   updateItem(id, item): Observable<Activite> {
     return this.http
       .put<Activite>(this.update_path + '/' + id, JSON.stringify(item), this.httpOptions)
       .pipe(
         retry(2),
         catchError(this.handleError)
       )
   }
 
   // Delete item by id
   deleteItem(id) {
     return this.http
       .delete<Activite>(this.delete_path + '/' + id, this.httpOptions)
       .pipe(
         retry(2),
         catchError(this.handleError)
       )
   }
}
