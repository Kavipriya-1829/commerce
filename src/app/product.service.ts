import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Product } from './common/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private prodURL="http://localhost:8080/api/product";
  constructor(private httpClient:HttpClient) 
  {

   }
   getAllProducts():Observable<Product[]>
  {
return this.httpClient.get<getProductResponse>(this.prodURL).pipe(map(response=>response. _embedded.products))
  }
SaveProduct(product:Product):Observable<Product>
  {
    const httpOptions={
      headers:new HttpHeaders({
        'Content-type':'application/json',
        'Authorization':'auth-token',
        'Access-control-Allow-Origin':'*'
      })
    };
  return this.httpClient.post<Product>(this.prodURL,product,httpOptions);
    
  }
  getProductById(prodId:number):Observable<Product>
   {
    const prodIDURl=this.prodURL+"/"+prodId;
   return this.httpClient.get<Product>(prodIDURl);
   }
   updateProduct(product:Product):Observable<Product>{
    const httpOptions = {
      headers : new HttpHeaders({
          'Content-Type' : 'application/json',
          'Authorization' : 'auth-token',
          'Access-Control-Allow-Origin' : '*'
      })
    };
    return this.httpClient.put<Product>(this.prodURL+`/${product.elproduct_id}`,product,httpOptions);
  }
  deleteProduct(elproduct_id: Number) {
   
    const httpOptions = {
      headers : new HttpHeaders({
          'Content-Type' : 'application/json',
          'Authorization' : 'auth-token',
          'Access-Control-Allow-Origin' : '*'
      })
    };
    return  this.httpClient.delete<Product>(this.prodURL+`/${elproduct_id}`,httpOptions);
  }
  getAllProductsSearchByProductName(pname : string) : Observable<Product[]> {
    const searchURL = "http://localhost:8080/api/product/search/findByPnameIgnoreCase?pname=" + pname;
    return this.httpClient.get<GetSearchByProductName>(searchURL).pipe(map(response => response._embedded.products));
  }
}
interface getProductResponse
{
  _embedded:
  {
    products:Product[]
  }
}
interface GetSearchByProductName{
  _embedded : {
    products : Product[]
  }
}