package com.company.ArrayProgramm;

public class ArrayProviderSelector {

    /**
     * В зависимости от переданного типа выбирает определенный тип
     * Массив-провайдера (тот кто сгенерирует нам массив)
     */
    public ArrayProvider getArrayProvider(int type) {
        if (type == 1) {
            return new TestArrayProvider();
        } else {
            return new UserArrayProvider();
        }
    }
}
