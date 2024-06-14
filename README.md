## PRUEBAS BENCHMARK RESULTADOS
![image](https://github.com/LucasCesarCanello/ucse-prog2-2023-U2-Canello/assets/130618082/79dbea32-1e29-4094-b5ff-6de29e7d4439)
El "Score" representa el número de operaciones por segundo, por lo que un número más alto es mejor. El "Error" representa la incertidumbre estadística del benchmark.

Según estos resultados, los streams paralelos (`StreamBenchmark.paralelismo`) tienen un rendimiento superior a los streams secuenciales (`StreamBenchmark.concurrencia`) en este contexto, ya que pueden realizar más operaciones por segundo.
Sin embargo, es importante tener en cuenta que el rendimiento de los streams paralelos y secuenciales puede variar dependiendo del número de núcleos de CPU disponibles y del tamaño de los datos. 
En general, los streams paralelos pueden ser más rápidos para grandes cantidades de datos y en sistemas con muchos núcleos de CPU, pero también pueden tener un mayor costo de inicialización y pueden no ser la opción más rápida para pequeñas cantidades de datos o tareas simples.
