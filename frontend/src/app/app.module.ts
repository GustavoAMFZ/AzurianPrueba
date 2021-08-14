import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './Employee/list/list.component';
import { HttpClientModule } from '@angular/common/http';
import {DataTablesModule} from 'angular-datatables';
import { HeaderComponent } from './Employee/header/header.component'




@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //Importando el módulo HttoClientModule para realizar peticiones web
    HttpClientModule,
    //Inportando el modulo Datatables para la paginación
    DataTablesModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
