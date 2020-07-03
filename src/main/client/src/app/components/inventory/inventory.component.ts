import { Component, OnDestroy, OnInit } from '@angular/core';
import { InventoryService } from '../../service/inventory.service';
import { Subscription } from 'rxjs';
import { Item } from '../../model/item';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit, OnDestroy {
  items: Item[];
  itemsSubscription: Subscription;
  displayedColumns: string[] = ['sku', 'name', 'count'];
  error: boolean = false;

  constructor(private inventoryService: InventoryService, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.itemsSubscription = this.inventoryService.getAllItems().subscribe(items => {
      this.items = items;
      this.error = false;
    }, error => {
      this.error = true;
      this.triggerSnackBar('Communication error occurred!', 'Close');
    });
  }

  triggerSnackBar(message: string, action: string): void {
    this._snackBar.open(message, action, {
      duration: 10000,
    });
  }

  ngOnDestroy(): void {
    if (this.itemsSubscription) {
      this.itemsSubscription.unsubscribe();
    }
  }


}
