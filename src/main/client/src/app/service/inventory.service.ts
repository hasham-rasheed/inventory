import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class InventoryService {
  private readonly inventoryURL = environment.endpoint + 'inventory/all';
  constructor(private http: HttpClient) { }

  getAllItems(): Observable<any>{
    return this.http.get(this.inventoryURL);
  }
}
