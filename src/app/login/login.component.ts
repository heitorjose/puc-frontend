import { Component } from '@angular/core';
import { LoginService } from './service/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(  private service: LoginService){

  }

  onSubmit(): void {

      
    }
  
 
}
