package models;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Client {
    private long client_id;
    private int ss_number;
    private String first_name;
    private String last_name;
    private String address;
    private String phone_number;
    private double fee_paid;

    public Client() {
    }

    public Client(long client_id, int ss_number, String first_name, String last_name, String address, String phone_number, double fee_paid) {
        this.client_id = client_id;
        this.ss_number = ss_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.phone_number = phone_number;
        this.fee_paid = fee_paid;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public int getSs_number() {
        return ss_number;
    }

    public void setSs_number(int ss_number) {
        this.ss_number = ss_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getFee_paid() {
        return fee_paid;
    }

    public void setFee_paid(double fee_paid) {
        this.fee_paid = fee_paid;
    }

    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", ss_number=" + ss_number +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", fee_paid=" + fee_paid +
                '}';
    }


}
