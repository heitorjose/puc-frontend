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
    if (this.form.valid) {
      let value = this.form.value;
      this.service.login(value).subscribe(value=>{
        localStorage.setItem('token',value.token!)
      })
      
    }
  }
 
}
