import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TestElMasGrande {

    @Test
    public void testElMasGrandeAlInicio() {
        ElMasGrande elMasGrande = new ElMasGrande();
        int[] arreglo = {5, 2, 3, 4, 1};
        int resultado = elMasGrande.elMasGrande(arreglo);
        assertEquals(5, resultado);
    }

    @Test
    public void testElMasGrandeEnMedio() {
        ElMasGrande elMasGrande = new ElMasGrande();
        int[] arreglo = {3, 2, 5, 4, 1};
        int resultado = elMasGrande.elMasGrande(arreglo);
        assertEquals(5, resultado);
    }

    @Test
    public void testElMasGrandeAlFinal() {
        ElMasGrande elMasGrande = new ElMasGrande();
        int[] arreglo = {1, 2, 3, 4, 5};
        int resultado = elMasGrande.elMasGrande(arreglo);
        assertEquals(5, resultado);
    }

    //Ceros
    @Test
    public void testElMasGrandeCeros() {
        ElMasGrande elMasGrande = new ElMasGrande();
        int[] arreglo = {0, 0, 0, 0, 0};
        int resultado = elMasGrande.elMasGrande(arreglo);
        assertEquals(0, resultado);
    }

    //Negativos 
    @Test
    public void testElMasGrandeNegativos() {
        ElMasGrande elMasGrande = new ElMasGrande();
        int[] arreglo = {-1, -2, -3, -4, -5};
        int resultado = elMasGrande.elMasGrande(arreglo);
        assertEquals(-1, resultado);
    }

    //Negativos y positivos
    @Test
    public void testElMasGrandeNegativosPositivos() {
        ElMasGrande elMasGrande = new ElMasGrande();
        int[] arreglo = {-1, 2, -3, 4, -5};
        int resultado = elMasGrande.elMasGrande(arreglo);
        assertEquals(4, resultado);
    }

    //Solo un valor en el arreglo   
    @Test
    public void testElMasGrandeUnValor() {
        ElMasGrande elMasGrande = new ElMasGrande();
        int[] arreglo = {1};
        int resultado = elMasGrande.elMasGrande(arreglo);
        assertEquals(1, resultado);
    }

    //Arreglo vacio
    @Test
    public void testElMasGrandeArregloVacio() {
        try{
            ElMasGrande elMasGrande = new ElMasGrande();
            int[] arreglo = {};
            elMasGrande.elMasGrande(arreglo);
            //Si no lanza excepcion, falla la prueba
            fail("Deberia lanzar una excepcion");
        } catch (IllegalArgumentException e){
            assertEquals("El arreglo no puede estar vacio", e.getMessage());
        }
    }
    
}
