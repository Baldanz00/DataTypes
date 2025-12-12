
Java ha 8 tipi di dati primitivi:
char, boolean, byte, short, int, long, float e double. 
Per questo esercizio, lavoreremo con i primitivi utilizzati per contenere valori interi (byte, short, int e long):
Un byte è un numero intero firmato a 8 bit.
Un short è un numero intero firmato a 16 bit.
Un int è un numero intero firmato a 32 bit.
Un long è un numero intero firmato a 64 bit.

Dato un numero intero di input, devi determinare quali tipi di dati primitivi sono in grado di memorizzare correttamente quell'input.
Per iniziare, una parte della soluzione ti viene fornita nell'editor.
Riferimento: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

** Formato di input: **
La prima riga contiene un numero intero, T, che denota il numero di casi di test.
Ogni caso di prova,T , è composto da una singola riga con un numero intero, n, che può essere arbitrariamente grande o piccolo.

** Formato di output: **
Per ogni variabile di input n appropriato, devi determinare se i primitivi sono in grado di memorizzarla. Se sì, allora stampa:

N può essere montato in:
* Tipo di dati

Se c'è più di un tipo di dati appropriato, stampa ciascuno sulla propria linea e ordinali per dimensione (ad esempio:byte < short < int < long ).
Se il numero non può essere memorizzato in una delle quattro primitive di cui sopra, stampa la riga:

N non può essere montato da nessuna parte.
