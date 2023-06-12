import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProdutoComponent } from './produto/produto.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'produto', component: ProdutoComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
