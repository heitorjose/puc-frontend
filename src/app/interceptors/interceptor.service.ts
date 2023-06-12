import { Injectable } from '@angular/core';
import { 
  HttpEvent,
  HttpInterceptor,
  HttpHandler,
  HttpRequest }
from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
@Injectable()
export class Interceptor implements HttpInterceptor {
 intercept( request: HttpRequest<any>, next: HttpHandler ): Observable<HttpEvent<any>> {

  request = request.clone({
    setHeaders: {
      Authorization: 'Bearer '+localStorage.getItem('token')
    }
   });
  return next.handle(request);
 }
}