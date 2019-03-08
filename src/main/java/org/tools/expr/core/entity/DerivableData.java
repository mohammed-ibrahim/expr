package org.tools.expr.core.entity;

import lombok.AllArgsConstructor;

public class DerivableData {

    private String data;

    public DerivableData(String input) {
        this.data = input;
    }

    public String stringValue() {
        return this.data;
    }

    public Double doubleValue() {
        return this.dval("double");
    }

    public Long longValue() {
        return new Long(this.dval("long").longValue());
    }

    public Integer intValue() {
        return new Integer(this.dval("int").intValue());
    }

    private Double dval(String destinationFormat) {
        try {
            Double dval = Double.parseDouble(this.data);
            return dval.doubleValue();
        } catch (Exception e) {
            throw new RuntimeException("There was a problem parsing: " + this.data + " into " + destinationFormat);
        }
    }

}
