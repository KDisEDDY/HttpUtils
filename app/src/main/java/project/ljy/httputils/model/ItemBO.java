package project.ljy.httputils.model;

import java.io.Serializable;

/**
 * Title: ItemBO
 * Description:
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/11/25
 * Version: 1.0
 */
public class ItemBO implements Serializable {

    private String name = null;

    private double rate = 0;

    private double turnover = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }
}
