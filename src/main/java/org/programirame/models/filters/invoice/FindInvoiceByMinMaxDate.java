package org.programirame.models.filters.invoice;

public class FindInvoiceByMinMaxDate {

    private double minDays;
    private double maxDays;

    public double getMinDays() {
        return minDays;
    }

    public void setMinDays(double minDays) {
        this.minDays = minDays;
    }

    public double getMaxDays() {
        return maxDays;
    }

    public void setMaxDays(double maxDays) {
        this.maxDays = maxDays;
    }
}
