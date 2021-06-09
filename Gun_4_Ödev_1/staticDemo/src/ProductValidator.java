// todo Urun guncellerken kurallara uygun mu?

public class ProductValidator {

    static {
        System.out.println("static block calisti");
    }

    public ProductValidator() {
        System.out.println("Yapici block calisti");
    }

    public static boolean isValid(Product product){

        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }


    }
}
