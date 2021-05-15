package bank.system.manager.account.domain.model;

import bank.system.manager.contact.domain.model.BaseEntity;

public class Account extends BaseEntity {
    private long accId;
    private double sum;
    private long ownerId;
    private double year;
private double degree;
    public Account() {
    }

    public Account(long accId, double sum, long ownerId, double year, double degree) {
        this.accId = accId;
        this.sum = sum;
        this.ownerId = ownerId;
        this.year = year;
        this.degree = degree;
    }

    public long getAccId() {
        return accId;
    }

    public void setAccId(long accId) {
        this.accId = accId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
