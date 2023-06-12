import { Produto } from './produto.model';
import { Component } from '@angular/core';

const ELEMENT_DATA: Produto[] = [
  {id: 1, marca: 'Hydrogen', valor: 1.0079, descricao: 'H'},
  {id: 2, marca: 'Helium', valor: 4.0026, descricao: 'He'},
  {id: 3, marca: 'Lithium', valor: 6.941, descricao: 'Li'},
  {id: 4, marca: 'Beryllium', valor: 9.0122, descricao: 'Be'},
  {id: 5, marca: 'Boron', valor: 10.811, descricao: 'B'},
  {id: 6, marca: 'Carbon', valor: 12.0107, descricao: 'C'},
  {id: 7, marca: 'Nitrogen', valor: 14.0067, descricao: 'N'},
  {id: 8, marca: 'Oxygen', valor: 15.9994, descricao: 'O'},
  {id: 9, marca: 'Fluorine', valor: 18.9984, descricao: 'F'},
  {id: 10, marca: 'Neon', valor: 20.1797, descricao: 'Ne'},
];


@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent {
  displayedColumns: string[] = ['id', 'marca', 'valor', 'descricao', 'Ação'];
  dataSource = ELEMENT_DATA;
}
