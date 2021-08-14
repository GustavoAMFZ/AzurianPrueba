import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import { Employee } from '../Model/Employee';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
 
  constructor(private http:HttpClient) { }

  //Es la url desde donde extrae los datos de los empleados
  url = 'http://localhost:8080/backend/api/employees';

  //Método que mediante la url permite obtener los datos y convertirlos a la clase Employee.
  getAllEmployees() {
    return this.http.get<Employee[]>(this.url);
  }
}
