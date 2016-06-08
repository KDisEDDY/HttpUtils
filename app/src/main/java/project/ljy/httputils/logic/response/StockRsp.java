package project.ljy.httputils.logic.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by liujy006 on 2016/6/3.
 */
public class StockRsp extends BaseRsp {

    /**
     * errNum : 0
     * errMsg : success
     * retData : {"stockinfo":[{"name":"青岛啤酒","code":"00168","date":"2016/06/08 11:34","openningPrice":28.6,"closingPrice":28.6,"hPrice":29,"lPrice":28.25,"currentPrice":29,"growth":0.4,"growthPercent":1.399,"dealnumber":336000,"turnover":9640850,"52hPrice":50.95,"52lPrice":26.1}],"market":{"shanghai":{"name":"上证指数","curdot":2922.983,"curprice":-13.0619,"rate":-0.44,"dealnumber":786794,"turnover":9736129},"shenzhen":{"name":"深证成指","curdot":10298.07,"curprice":-49.768,"rate":-0.48,"dealnumber":115528975,"turnover":20549747},"DJI":{"name":"道琼斯","date":"2016-06-08 07:33:05","curdot":17938.28,"rate":0.1,"growth":17.95,"startdot":17936.22,"closedot":17920.33,"hdot":18003.23,"ldot":17936.22,"turnover":0},"IXIC":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":4961.75,"rate":-0.14,"growth":-6.96,"startdot":4972.14,"closedot":4968.71,"hdot":4979.38,"ldot":4960.28,"turnover":1712138834},"INX":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":2112.13,"rate":0.13,"growth":2.72,"startdot":2110.18,"closedot":2109.41,"hdot":2119.22,"ldot":2110.18,"turnover":0},"HSI":{"name":"恒生指数","date":"2016/06/08 11:51","curdot":21275.3,"rate":-0.25,"growth":-52.94,"startdot":21294.27,"closedot":21328.24,"hdot":21298.2,"ldot":21179.95,"turnover":29677294,"52hdot":27470.5,"52ldot":18278.8}}}
     */

    private int errNum;
    private String errMsg;
    /**
     * stockinfo : [{"name":"青岛啤酒","code":"00168","date":"2016/06/08 11:34","openningPrice":28.6,"closingPrice":28.6,"hPrice":29,"lPrice":28.25,"currentPrice":29,"growth":0.4,"growthPercent":1.399,"dealnumber":336000,"turnover":9640850,"52hPrice":50.95,"52lPrice":26.1}]
     * market : {"shanghai":{"name":"上证指数","curdot":2922.983,"curprice":-13.0619,"rate":-0.44,"dealnumber":786794,"turnover":9736129},"shenzhen":{"name":"深证成指","curdot":10298.07,"curprice":-49.768,"rate":-0.48,"dealnumber":115528975,"turnover":20549747},"DJI":{"name":"道琼斯","date":"2016-06-08 07:33:05","curdot":17938.28,"rate":0.1,"growth":17.95,"startdot":17936.22,"closedot":17920.33,"hdot":18003.23,"ldot":17936.22,"turnover":0},"IXIC":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":4961.75,"rate":-0.14,"growth":-6.96,"startdot":4972.14,"closedot":4968.71,"hdot":4979.38,"ldot":4960.28,"turnover":1712138834},"INX":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":2112.13,"rate":0.13,"growth":2.72,"startdot":2110.18,"closedot":2109.41,"hdot":2119.22,"ldot":2110.18,"turnover":0},"HSI":{"name":"恒生指数","date":"2016/06/08 11:51","curdot":21275.3,"rate":-0.25,"growth":-52.94,"startdot":21294.27,"closedot":21328.24,"hdot":21298.2,"ldot":21179.95,"turnover":29677294,"52hdot":27470.5,"52ldot":18278.8}}
     */

    private RetDataBean retData;

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public RetDataBean getRetData() {
        return retData;
    }

    public void setRetData(RetDataBean retData) {
        this.retData = retData;
    }

    public static class RetDataBean {
        /**
         * shanghai : {"name":"上证指数","curdot":2922.983,"curprice":-13.0619,"rate":-0.44,"dealnumber":786794,"turnover":9736129}
         * shenzhen : {"name":"深证成指","curdot":10298.07,"curprice":-49.768,"rate":-0.48,"dealnumber":115528975,"turnover":20549747}
         * DJI : {"name":"道琼斯","date":"2016-06-08 07:33:05","curdot":17938.28,"rate":0.1,"growth":17.95,"startdot":17936.22,"closedot":17920.33,"hdot":18003.23,"ldot":17936.22,"turnover":0}
         * IXIC : {"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":4961.75,"rate":-0.14,"growth":-6.96,"startdot":4972.14,"closedot":4968.71,"hdot":4979.38,"ldot":4960.28,"turnover":1712138834}
         * INX : {"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":2112.13,"rate":0.13,"growth":2.72,"startdot":2110.18,"closedot":2109.41,"hdot":2119.22,"ldot":2110.18,"turnover":0}
         * HSI : {"name":"恒生指数","date":"2016/06/08 11:51","curdot":21275.3,"rate":-0.25,"growth":-52.94,"startdot":21294.27,"closedot":21328.24,"hdot":21298.2,"ldot":21179.95,"turnover":29677294,"52hdot":27470.5,"52ldot":18278.8}
         */

        private MarketBean market;
        /**
         * name : 青岛啤酒
         * code : 00168
         * date : 2016/06/08 11:34
         * openningPrice : 28.6
         * closingPrice : 28.6
         * hPrice : 29
         * lPrice : 28.25
         * currentPrice : 29
         * growth : 0.4
         * growthPercent : 1.399
         * dealnumber : 336000
         * turnover : 9640850
         * 52hPrice : 50.95
         * 52lPrice : 26.1
         */

        private List<StockinfoBean> stockinfo;

        public MarketBean getMarket() {
            return market;
        }

        public void setMarket(MarketBean market) {
            this.market = market;
        }

        public List<StockinfoBean> getStockinfo() {
            return stockinfo;
        }

        public void setStockinfo(List<StockinfoBean> stockinfo) {
            this.stockinfo = stockinfo;
        }

        public static class MarketBean {
            /**
             * name : 上证指数
             * curdot : 2922.983
             * curprice : -13.0619
             * rate : -0.44
             * dealnumber : 786794
             * turnover : 9736129
             */

            private ShanghaiBean shanghai;
            /**
             * name : 深证成指
             * curdot : 10298.07
             * curprice : -49.768
             * rate : -0.48
             * dealnumber : 115528975
             * turnover : 20549747
             */

            private ShenzhenBean shenzhen;
            /**
             * name : 道琼斯
             * date : 2016-06-08 07:33:05
             * curdot : 17938.28
             * rate : 0.1
             * growth : 17.95
             * startdot : 17936.22
             * closedot : 17920.33
             * hdot : 18003.23
             * ldot : 17936.22
             * turnover : 0
             */

            private DJIBean DJI;
            /**
             * name : 纳斯达克
             * date : 2016-06-08 05:40:00
             * curdot : 4961.75
             * rate : -0.14
             * growth : -6.96
             * startdot : 4972.14
             * closedot : 4968.71
             * hdot : 4979.38
             * ldot : 4960.28
             * turnover : 1712138834
             */

            private IXICBean IXIC;
            /**
             * name : 纳斯达克
             * date : 2016-06-08 05:40:00
             * curdot : 2112.13
             * rate : 0.13
             * growth : 2.72
             * startdot : 2110.18
             * closedot : 2109.41
             * hdot : 2119.22
             * ldot : 2110.18
             * turnover : 0
             */

            private INXBean INX;
            /**
             * name : 恒生指数
             * date : 2016/06/08 11:51
             * curdot : 21275.3
             * rate : -0.25
             * growth : -52.94
             * startdot : 21294.27
             * closedot : 21328.24
             * hdot : 21298.2
             * ldot : 21179.95
             * turnover : 29677294
             * 52hdot : 27470.5
             * 52ldot : 18278.8
             */

            private HSIBean HSI;

            public ShanghaiBean getShanghai() {
                return shanghai;
            }

            public void setShanghai(ShanghaiBean shanghai) {
                this.shanghai = shanghai;
            }

            public ShenzhenBean getShenzhen() {
                return shenzhen;
            }

            public void setShenzhen(ShenzhenBean shenzhen) {
                this.shenzhen = shenzhen;
            }

            public DJIBean getDJI() {
                return DJI;
            }

            public void setDJI(DJIBean DJI) {
                this.DJI = DJI;
            }

            public IXICBean getIXIC() {
                return IXIC;
            }

            public void setIXIC(IXICBean IXIC) {
                this.IXIC = IXIC;
            }

            public INXBean getINX() {
                return INX;
            }

            public void setINX(INXBean INX) {
                this.INX = INX;
            }

            public HSIBean getHSI() {
                return HSI;
            }

            public void setHSI(HSIBean HSI) {
                this.HSI = HSI;
            }

            public static class ShanghaiBean {
                private String name;
                private double curdot;
                private double curprice;
                private double rate;
                private double dealnumber;
                private int turnover;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public double getCurdot() {
                    return curdot;
                }

                public void setCurdot(double curdot) {
                    this.curdot = curdot;
                }

                public double getCurprice() {
                    return curprice;
                }

                public void setCurprice(double curprice) {
                    this.curprice = curprice;
                }

                public double getRate() {
                    return rate;
                }

                public void setRate(double rate) {
                    this.rate = rate;
                }

                public double getDealnumber() {
                    return dealnumber;
                }

                public void setDealnumber(double dealnumber) {
                    this.dealnumber = dealnumber;
                }

                public int getTurnover() {
                    return turnover;
                }

                public void setTurnover(int turnover) {
                    this.turnover = turnover;
                }
            }

            public static class ShenzhenBean {
                private String name;
                private double curdot;
                private double curprice;
                private double rate;
                private int dealnumber;
                private int turnover;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public double getCurdot() {
                    return curdot;
                }

                public void setCurdot(double curdot) {
                    this.curdot = curdot;
                }

                public double getCurprice() {
                    return curprice;
                }

                public void setCurprice(double curprice) {
                    this.curprice = curprice;
                }

                public double getRate() {
                    return rate;
                }

                public void setRate(double rate) {
                    this.rate = rate;
                }

                public int getDealnumber() {
                    return dealnumber;
                }

                public void setDealnumber(int dealnumber) {
                    this.dealnumber = dealnumber;
                }

                public int getTurnover() {
                    return turnover;
                }

                public void setTurnover(int turnover) {
                    this.turnover = turnover;
                }
            }

            public static class DJIBean {
                private String name;
                private String date;
                private double curdot;
                private double rate;
                private double growth;
                private double startdot;
                private double closedot;
                private double hdot;
                private double ldot;
                private int turnover;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getCurdot() {
                    return curdot;
                }

                public void setCurdot(double curdot) {
                    this.curdot = curdot;
                }

                public double getRate() {
                    return rate;
                }

                public void setRate(double rate) {
                    this.rate = rate;
                }

                public double getGrowth() {
                    return growth;
                }

                public void setGrowth(double growth) {
                    this.growth = growth;
                }

                public double getStartdot() {
                    return startdot;
                }

                public void setStartdot(double startdot) {
                    this.startdot = startdot;
                }

                public double getClosedot() {
                    return closedot;
                }

                public void setClosedot(double closedot) {
                    this.closedot = closedot;
                }

                public double getHdot() {
                    return hdot;
                }

                public void setHdot(double hdot) {
                    this.hdot = hdot;
                }

                public double getLdot() {
                    return ldot;
                }

                public void setLdot(double ldot) {
                    this.ldot = ldot;
                }

                public int getTurnover() {
                    return turnover;
                }

                public void setTurnover(int turnover) {
                    this.turnover = turnover;
                }
            }

            public static class IXICBean {
                private String name;
                private String date;
                private double curdot;
                private double rate;
                private double growth;
                private double startdot;
                private double closedot;
                private double hdot;
                private double ldot;
                private int turnover;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getCurdot() {
                    return curdot;
                }

                public void setCurdot(double curdot) {
                    this.curdot = curdot;
                }

                public double getRate() {
                    return rate;
                }

                public void setRate(double rate) {
                    this.rate = rate;
                }

                public double getGrowth() {
                    return growth;
                }

                public void setGrowth(double growth) {
                    this.growth = growth;
                }

                public double getStartdot() {
                    return startdot;
                }

                public void setStartdot(double startdot) {
                    this.startdot = startdot;
                }

                public double getClosedot() {
                    return closedot;
                }

                public void setClosedot(double closedot) {
                    this.closedot = closedot;
                }

                public double getHdot() {
                    return hdot;
                }

                public void setHdot(double hdot) {
                    this.hdot = hdot;
                }

                public double getLdot() {
                    return ldot;
                }

                public void setLdot(double ldot) {
                    this.ldot = ldot;
                }

                public int getTurnover() {
                    return turnover;
                }

                public void setTurnover(int turnover) {
                    this.turnover = turnover;
                }
            }

            public static class INXBean {
                private String name;
                private String date;
                private double curdot;
                private double rate;
                private double growth;
                private double startdot;
                private double closedot;
                private double hdot;
                private double ldot;
                private int turnover;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getCurdot() {
                    return curdot;
                }

                public void setCurdot(double curdot) {
                    this.curdot = curdot;
                }

                public double getRate() {
                    return rate;
                }

                public void setRate(double rate) {
                    this.rate = rate;
                }

                public double getGrowth() {
                    return growth;
                }

                public void setGrowth(double growth) {
                    this.growth = growth;
                }

                public double getStartdot() {
                    return startdot;
                }

                public void setStartdot(double startdot) {
                    this.startdot = startdot;
                }

                public double getClosedot() {
                    return closedot;
                }

                public void setClosedot(double closedot) {
                    this.closedot = closedot;
                }

                public double getHdot() {
                    return hdot;
                }

                public void setHdot(double hdot) {
                    this.hdot = hdot;
                }

                public double getLdot() {
                    return ldot;
                }

                public void setLdot(double ldot) {
                    this.ldot = ldot;
                }

                public int getTurnover() {
                    return turnover;
                }

                public void setTurnover(int turnover) {
                    this.turnover = turnover;
                }
            }

            public static class HSIBean {
                private String name;
                private String date;
                private double curdot;
                private double rate;
                private double growth;
                private double startdot;
                private double closedot;
                private double hdot;
                private double ldot;
                private int turnover;
                @SerializedName("52hdot")
                private double value52hdot;
                @SerializedName("52ldot")
                private double value52ldot;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getCurdot() {
                    return curdot;
                }

                public void setCurdot(double curdot) {
                    this.curdot = curdot;
                }

                public double getRate() {
                    return rate;
                }

                public void setRate(double rate) {
                    this.rate = rate;
                }

                public double getGrowth() {
                    return growth;
                }

                public void setGrowth(double growth) {
                    this.growth = growth;
                }

                public double getStartdot() {
                    return startdot;
                }

                public void setStartdot(double startdot) {
                    this.startdot = startdot;
                }

                public double getClosedot() {
                    return closedot;
                }

                public void setClosedot(double closedot) {
                    this.closedot = closedot;
                }

                public double getHdot() {
                    return hdot;
                }

                public void setHdot(double hdot) {
                    this.hdot = hdot;
                }

                public double getLdot() {
                    return ldot;
                }

                public void setLdot(double ldot) {
                    this.ldot = ldot;
                }

                public int getTurnover() {
                    return turnover;
                }

                public void setTurnover(int turnover) {
                    this.turnover = turnover;
                }

                public double getValue52hdot() {
                    return value52hdot;
                }

                public void setValue52hdot(double value52hdot) {
                    this.value52hdot = value52hdot;
                }

                public double getValue52ldot() {
                    return value52ldot;
                }

                public void setValue52ldot(double value52ldot) {
                    this.value52ldot = value52ldot;
                }
            }
        }

        public static class StockinfoBean {
            private String name;
            private String code;
            private String date;
            private double openningPrice;
            private double closingPrice;
            private double hPrice;
            private double lPrice;
            private int currentPrice;
            private double growth;
            private double growthPercent;
            private int dealnumber;
            private int turnover;
            @SerializedName("52hPrice")
            private double value52hPrice;
            @SerializedName("52lPrice")
            private double value52lPrice;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public double getOpenningPrice() {
                return openningPrice;
            }

            public void setOpenningPrice(double openningPrice) {
                this.openningPrice = openningPrice;
            }

            public double getClosingPrice() {
                return closingPrice;
            }

            public void setClosingPrice(double closingPrice) {
                this.closingPrice = closingPrice;
            }

            public double getHPrice() {
                return hPrice;
            }

            public void setHPrice(double hPrice) {
                this.hPrice = hPrice;
            }

            public double getLPrice() {
                return lPrice;
            }

            public void setLPrice(double lPrice) {
                this.lPrice = lPrice;
            }

            public int getCurrentPrice() {
                return currentPrice;
            }

            public void setCurrentPrice(int currentPrice) {
                this.currentPrice = currentPrice;
            }

            public double getGrowth() {
                return growth;
            }

            public void setGrowth(double growth) {
                this.growth = growth;
            }

            public double getGrowthPercent() {
                return growthPercent;
            }

            public void setGrowthPercent(double growthPercent) {
                this.growthPercent = growthPercent;
            }

            public int getDealnumber() {
                return dealnumber;
            }

            public void setDealnumber(int dealnumber) {
                this.dealnumber = dealnumber;
            }

            public int getTurnover() {
                return turnover;
            }

            public void setTurnover(int turnover) {
                this.turnover = turnover;
            }

            public double getValue52hPrice() {
                return value52hPrice;
            }

            public void setValue52hPrice(double value52hPrice) {
                this.value52hPrice = value52hPrice;
            }

            public double getValue52lPrice() {
                return value52lPrice;
            }

            public void setValue52lPrice(double value52lPrice) {
                this.value52lPrice = value52lPrice;
            }
        }
    }
}