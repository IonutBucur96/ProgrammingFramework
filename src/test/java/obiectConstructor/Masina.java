package obiectConstructor;

public class Masina {
    public String marca;
    public String model;
    public Integer an;
    public Boolean esteNoua;
    public Character cutie;
    public Boolean discount;


    public Masina(String marca, String model, Integer an, Boolean esteNoua, Character cutie){
        this.marca=marca;
        this.model=model;
        this.an=an;
        this.esteNoua=esteNoua;
        this.cutie=cutie;
    }

    public Masina(String marca, String model, Integer an, Boolean esteNoua, Character cutie, Boolean discount) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.esteNoua = esteNoua;
        this.cutie = cutie;
        this.discount = discount;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii: "+marca);
        System.out.println("Modelul masinii: "+model);
        System.out.println("Anul fabricatiei: "+an);
        System.out.println("Este noua masina? "+esteNoua);
        System.out.println("Cutia de viteze: "+cutie);
        if(discount!=null && discount){
            System.out.println("Masina este redusa cu 20% fata de luna trecuta!  ");
        }
    }

    public void inmatricularea(){
        if (esteNoua){
            System.out.println("Masina nu este inmatriculata");
        }
        else {
            System.out.println("Masina este inmatriculata si gata de drum");

        }
}
}
