export class Product {
    constructor(public elproduct_id:number, public pname:String , public elproduct_description:String, public unit_price:number,
        public  elproduct_image:String, public active:number,public available_stock:number,public date_created:Date,public last_updated:Date,
        public elcategory_id:number)
        {

        }
}
