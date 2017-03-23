package com.pojo;

public class Orders {
    private String company;

    private Integer orderNumber;

    private String id_o;

    private String id_p;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getId_o() {
        return id_o;
    }

    public void setId_o(String id_o) {
        this.id_o = id_o == null ? null : id_o.trim();
    }

    public String getId_p() {
        return id_p;
    }

    public void setId_p(String id_p) {
        this.id_p = id_p == null ? null : id_p.trim();
    }
}