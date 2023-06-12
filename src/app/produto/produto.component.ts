import { Produto } from './produto.model';
import { Component, OnInit } from '@angular/core';
import { ProdutoService } from './service/produto.service';
import {MatDialog} from '@angular/material/dialog';
import { ProdutoDialogComponent } from '../dialog/produto.dialog/produto.dialog.component';



@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit{
   
  displayedColumns: string[] = ['nmProduto', 'fornecedor', 'validade', 'Ação'];
  dataSource: Produto[] = []

  constructor(private service: ProdutoService,
    private dialog: MatDialog){

  }

  
  ngOnInit(): void {
    this.getProdutos()
  }

  getProdutos(){
    this.service.getProdutos().subscribe((data: Produto[])=>{
    this.dataSource = data
    }, (err: any)=>{
      console.log(err)
    })
  }

  
  openDialog() {
    this.dialog.open(ProdutoDialogComponent);
  }

  delete(id: Number){
    this.service.delete(id).subscribe((data: Produto[])=>{
      this.getProdutos()
      }, (err: any)=>{
        alert("Ocorreu um erro ao tentar deletar")
      })
  }
 

  
}

