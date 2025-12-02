package controllerss;

import models.Brand;

public class BrandController {

    public Brand[] sortSelectionDesc(Brand[] brands){
        for (int i = 0; i < brands.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < brands.length; j++) {
                if (brands[j].getTotalValidYears() > brands[maxIndex].getTotalValidYears()) { 
                    maxIndex = j;
                }            
            }
            Brand temp = brands[i];
            brands[i] = brands[maxIndex];
            brands[maxIndex] = temp;
        }
        return brands;
    }

    public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
        int left = 0;
        int right = brands.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = brands[mid].getTotalValidYears();

            if (midValue == validYears) {
                return brands[mid];
            }
            if (isAscending) {
                if (validYears < midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { 
                if (validYears > midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return null;
    }
}
