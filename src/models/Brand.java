package models;


public class Brand {
    private String brandName;
    private CarModel[] models;

    // Constructor, getters y setters omitidos por brevedad

     public Brand(String brandName, CarModel[] models) {
        this.brandName = brandName;
        this.models = models;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public CarModel[] getModels() {
        return models;
    }

    public void setModels(CarModel[] models) {
        this.models = models;
    }  
     
    /**
     * Calcula el total de años válidos de todos los modelos de esta marca
     * @return número total de años con isValid = true
     */

    
    public int getTotalValidYears() {
        int total = 0;
        if (models != null) {
            for (CarModel model : models) {
                if (model != null && model.getYears() != null) {
                    for (CarYear year : model.getYears()) {
                        if (year != null && year.isValid()) {
                            total++;
                        }
                    }
                }
            }
        }
        return total;
    }

}
