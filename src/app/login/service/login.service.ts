import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from '../login.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }


  login(login: Login){
    return this.http.post("/usuario/autentica",login)
  }
}
