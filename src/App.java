import controllerss.BrandController;
import models.Brand;
import test.TestData;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("====Configurar studente.env====");

        Brand[] brands = TestData.createBrands();

        BrandController controller = new BrandController();

        controller.sortSelectionDesc(brands);

        System.out.println("Marcas ordenadas por años válidos en descendente =");
        for (Brand b : brands) {
            System.out.println(b.getBrandName() + " = " + b.getTotalValidYears());
        }
        
        System.out.println("\n Búsqueda binaria");
        Brand resultado1 = controller.binarySearchByValidYears(brands, 8, false);
        System.out.println("Resultado búsqueda de 8 años: " + (resultado1 != null ? resultado1.getBrandName() : "No encontrado"));

        Brand resultado2 = controller.binarySearchByValidYears(brands, 17, false);
        System.out.println("Resultado búsqueda de 17 años: " + (resultado2 != null ? resultado2.getBrandName() : "No encontrado"));

    }

}
