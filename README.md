## PRUEBAS BENCHMARK RESULTADOS

![image](https://github.com/LucasCesarCanello/ucse-prog2-2023-U2-Canello/assets/130618082/79dbea32-1e29-4094-b5ff-6de29e7d4439)
El "Score" representa el número de operaciones por segundo, por lo que un número más alto es mejor. El "Error"
representa la incertidumbre estadística del benchmark.

Según estos resultados, los streams paralelos (`StreamBenchmark.paralelismo`) tienen un rendimiento superior a los
streams secuenciales (`StreamBenchmark.concurrencia`) en este contexto, ya que pueden realizar más operaciones por
segundo.
Sin embargo, es importante tener en cuenta que el rendimiento de los streams paralelos y secuenciales puede variar
dependiendo del número de núcleos de CPU disponibles y del tamaño de los datos.
En general, los streams paralelos pueden ser más rápidos para grandes cantidades de datos y en sistemas con muchos
núcleos de CPU, pero también pueden tener un mayor costo de inicialización y pueden no ser la opción más rápida para
pequeñas cantidades de datos o tareas simples.

## COBERTURA TEST

![image](https://github.com/LucasCesarCanello/ucse-prog2-2023-U2-Canello/assets/130618082/bf65a670-2a63-4c21-96a4-ae53060ec42e)

# Correcciones - Estado: A CORREGIR

## Necesarias para aprobar:

- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- Ejercicio 3: Hace un .get() por cada tarea, debería de utilizar otro método de CompletableFuture para poder esperar a
  todas las tareas juntas. Al hacer un .get() por cada tarea, éstas se ejecutan secuencialmente, incrementando en N el
  tiempo de ejecución dependiendo del tamaño N del input recibido. Ejecutarlas paralelamente.
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Al hacer esto, sus conclusiones serán más precisas y sólidas.

## Adicionales:

- Deberían de actualizar el .gitignore y actualizar el repositorio remoto para no incluir los archivos generados al
  compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.
- Los tests siempre deberían de ir en el mismo package y tener la misma estructura de carpetas que en main, por lo tanto
  en vez de ir en test/java deberían de ir dentro de test/java/org/example
- En ésta misma línea, les sugiero que sigan buenas prácticas al realizar commits, tales como utilizar verbos en
  imperativo y emplear prefijos para aportar claridad semántica. Les recomiendo leer éste artículo sobre un
  desarrollador español que aborda estos aspectos y otros puntos relevantes. [1]
- Además, he notado que los archivos no han sido formateados adecuadamente y no se ha respetado el número máximo de
  caracteres por línea (la línea gris vertical que tienen en Intellij marca justamente ésto). Un ejemplo es en el
  archivo `README.md`, donde las líneas largas dificultan la lectura al exceder los límites visibles de la pantalla. En
  IntelliJ, pueden formatear el código utilizando el atajo de teclado Ctrl + Alt + L [2]. Con otros shortcuts pueden
  optimizar los imports, y muchas cosas más, aunque esto puede variar según el caso si han cambiado la configuración por
  default.

### Bibliografía:

- \[1]: https://midu.dev/buenas-practicas-escribir-commits-git/
- \[2]: https://www.jetbrains.com/guide/java/tutorials/reading-code/formatting/#:~:text=If%20we%20encounter%20code%20that,L%20(Windows%2FLinux).

