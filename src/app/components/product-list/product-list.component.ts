import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from 'src/app/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})

export class ProductListComponent implements OnInit 
{
  products : Product[]
  hasSearchName: any;
  searchName:string;
  constructor(private productservice:ProductService, public router:Router, public activateRoute: ActivatedRoute) 
  { 


  }

  ngOnInit(): void 
  {
    this.getAllProduct();
  }
  getAllProduct():void {
 
    this.hasSearchName = this.activateRoute.snapshot.paramMap.has("pname");
    console.log(this.hasSearchName)
    if(this.hasSearchName)
    {
     
      this.searchName  = this.activateRoute.snapshot.paramMap.get("pname");
      console.log(this.searchName)
    this.productservice.getAllProductsSearchByProductName(this.searchName).subscribe(data=>{
      console.log(data);
      this.products= data;
    });

    }
    else{
      this.productservice.getAllProducts().subscribe(data=>{
      console.log(data);
      this.products=data;
    });
  } 
    
  }
  updateProduct(elproduct_id : Number){
    this.router.navigateByUrl("/updateProduct/" +elproduct_id);
  }
  addProd():void
  {
    this.router.navigateByUrl("/productform")
  }
  deleteProduct(elproduct_id : Number){
    console.log(elproduct_id);
    if(confirm("Do you want to delete ?")){
      this.productservice.deleteProduct(elproduct_id).subscribe(data=>{
        console.log(data);
        this.getAllProduct();
      })
    };
  
    
  }
}

