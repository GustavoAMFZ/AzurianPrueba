import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/Model/Employee';
import { ServiceService } from '../../Service/service.service';
import {Subject} from 'rxjs';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit, OnDestroy {

  dtOptions: DataTables.Settings = {};
  dtTrigger: Subject<any> = new Subject<any>();

  //Arreglo de objetos Employee vacíos.
  employees : Employee[];
  //Se inicializa el servicio en el constructor de "ListComponent" 
  constructor(private service:ServiceService, private router:Router) { }

  //agregar una tabla de empleados en nuestro componente HTML:
  ngOnInit(): void {
    //Se invoca el método getAllEmployees del servicio y se reciben los empleados dentro del arreglo de empleados.
    this.service.getAllEmployees()
    .subscribe(data=>{
      this.employees=data;
      // iniciar nuestra datatables
      this.dtTrigger.next();

    })
  }
  //Se restablecerá la tabla de datos cada vez que dejamos la página adjunta al componente.
  ngOnDestroy(): void {
    this.dtTrigger.unsubscribe();
  }
}


