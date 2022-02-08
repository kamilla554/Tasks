package com.company;

public class Safe {
    int bestPrice=0;
    int value;
    Items[] bestItems = null;
    Items[] items;

    public Safe(int value) {
        this.value = value;
    }

    public int getPrice() {
        return bestPrice;
    }

    public Items[] getItems() {
        return items;
    }

    private int calcValue(Items[] items) {
        int sumValue = 0;
        for (Items a : items) {
            sumValue += a.getValue();
        }
        return sumValue;
    }

    private int calcPrice(Items[] items) {
        int sumPrice = 0;
        for (Items a : items) {
            sumPrice += a.getPrice();
        }
        return sumPrice;
    }

    private void check(Items[] items) {
        if (bestItems == null) {
            if (calcValue(items) <= value) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        } else {
            if ((calcValue(items) < value) & (calcPrice(items) > bestPrice)) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    public void enumeration(Items[] items) {
        if (items.length > 0) {
            check(items);
        }
        for (int i = 0; i < items.length; i++) {
            Items[] newItems = new Items[items.length - 1];
            int temp=0;
            for (int j = 0; j < items.length; j++) {
                if (j!=i){
                    newItems[temp]=items[j];
                    temp=temp+1;
                }
            }
            enumeration(newItems);
        }
    }

    public void solution()
    {
        for (Items a:
                bestItems) {
            System.out.println(a.getName());
        }
    }
}
