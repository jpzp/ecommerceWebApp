import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {EcommerceComponent} from './ecommerce';
import {LoginComponent} from './login';
import {RegisterComponent} from './register';


const routes: Routes = [
	{ path: '', component: EcommerceComponent },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },

    // otherwise redirect to home
    { path: '**', redirectTo: '' }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
