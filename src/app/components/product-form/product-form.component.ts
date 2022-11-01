import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from 'src/app/common/product';
import { ProductService } from 'src/app/product.service';
@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {
  product:Product=new Product(0,"Table","Excellent weight carrying",1400,'jjj',1,4500,new Date(),new Date(),5);
  isEditable: boolean;
  constructor(public productService:ProductService,public router:Router,public activateRoute :ActivatedRoute) { }

  ngOnInit(): void {
    this.activateRoute.paramMap.subscribe(()=>this.product);
     this.getProductById();
  }

  onSubmit():void
  {
    if(this.isEditable)
    {
      this.productService.updateProduct(this.product).subscribe(data=>
        this.router.navigateByUrl("/product"));

    }
    else{

    
    console.log("hello");
    console.log(this.product);
    this.productService.SaveProduct(this.product).
    subscribe(data=>console.log(data));
    this.router.navigateByUrl("/product");
    }

  }

  getProductById(){
    const prodId  = parseFloat(this.activateRoute.snapshot.paramMap.get("elproduct_id"));
  
  console.log(prodId)
  if(prodId> 0){
    this.isEditable = true;
    this.productService.getProductById(prodId).subscribe(data=>{
      this.product = data;
      console.log(this.product)
    });
  }
  }
}