function ordinaArray(array: number[]): number[] {
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = i + 1; j < array.length; j++)
            if (array[i] > array[j]) {
                const temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
    }
    return array;
}

function sceltaOrdinamento(array: number[], decOCres: boolean): number[] {
    if (decOCres) {
        return ordinaArray(b);
    } else {
        for (let i = 0; i < array.length - 1; i++) {
            for (let j = i + 1; j < array.length; j++)
                if (array[i] < array[j]) {
                    const temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        return array;
    }
}
function popolaArray(): void {

    if (ordinamento === 1 || ordinamento === 2) {
        let n: number = +prompt("Inserisci la lunghezza dell'array.")

        for (let i = 0; i < n; i++) {
            let valore = +prompt("Inserisci il valore dell'array in posizione " + (i + 1));
            b.push(valore);
        }
        stampaArray();
    } else {
        alert("Riprova.")
    }

}
function stampaArray(): void {
    if (ordinamento === 1) {
        alert("Il tuo array è:\n [" + b + "] " + "\nOrdinato in ordine crescente: \n [" + sceltaOrdinamento(b, true) + "]");
    } else {
        alert("Il tuo array è:\n [" + b + "] " + "\nOrdinato in ordine decrescente: \n [" + sceltaOrdinamento(b, false) + "]");
    }
}
let b: number[] = [];
let ordinamento: number = +prompt("Vuoi ordinare i tuoi numeri in maniera Crescente o Decrescente?\n 1 per Crescente o 2 per Decrescente");

popolaArray();