package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundProperties implements Property{
    protected List<Property> properties = new ArrayList<>();

    public CompoundProperties(Property... properties) {
        add(properties);
    }

    @Override
    public float getPrice() {
        float price = 0.0f;
        for (Property property: properties) {
            price += property.getPrice();
        }
        return price;
    }
    
    public void add(Property property) {
        properties.add(property);
    }

    public void remove(Property property) {
        properties.remove(property);
    }

    public void add(Property... properties) {
        this.properties.addAll(Arrays.asList(properties));
    }

    public void remove(Property... properties) {
        this.properties.removeAll(Arrays.asList(properties));
    }
}