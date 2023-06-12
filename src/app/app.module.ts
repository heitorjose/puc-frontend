import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './login/login.component';
import { ProdutoComponent } from './produto/produto.component';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatTableModule} from '@angular/material/table';
import {MatIconModule} from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import { LoginService } from './login/service/login.service';
import { ProdutoService } from './produto/service/produto.service';
import { InterceptorModule } from './interceptors/interceptor.module';
import {MatDialog, MatDialogModule} from '@angular/material/dialog';
import { ProdutoDialogComponent } from './dialog/produto.dialog/produto.dialog.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProdutoComponent,
    ProdutoDialogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSidenavModule,
    MatCardModule,
    MatInputModule,
    MatButtonModule,
    MatTableModule,
    MatIconModule,
    MatDividerModule,
    InterceptorModule,
    HttpClientModule,
    MatDialogModule
  ],
  providers: [LoginService, ProdutoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
