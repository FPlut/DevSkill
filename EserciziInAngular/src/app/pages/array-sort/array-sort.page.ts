import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
    selector: 'app-array-sort',
    templateUrl: './array-sort.page.html',
    styleUrls: ['./array-sort.page.scss'],
})
export class ArraySortPage implements OnInit {
    num: number;
    arrayN: number[] = [];
    mioForm: FormGroup
    arrayOrd:number[] = [];

    popolaArray() {
        this.arrayN.push(this.num);
        console.log(this.arrayN)
    }
    
    ordinaArray(array: number[]): number[] {
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
    sceltaOrdinamento(array: number[], decOCres: boolean):void {
        if (decOCres) {
            this.arrayOrd=this.ordinaArray(array)

        } else {
            for (let i = 0; i < array.length - 1; i++) {
                for (let j = i + 1; j < array.length; j++)
                    if (array[i] < array[j]) {
                        const temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
            }
           this.arrayOrd=array;
        }
    }


    constructor(private fb: FormBuilder) {
        this.mioForm = this.fb.group({
            numero: ['',Validators.required]
        })
     }

    ngOnInit() {
    }

}
