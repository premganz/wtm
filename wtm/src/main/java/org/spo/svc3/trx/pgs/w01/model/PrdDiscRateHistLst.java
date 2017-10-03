
package org.spo.svc3.trx.pgs.w01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdDiscRateHistLst {

    @SerializedName("prd_disc_rate")
    @Expose
    private long prdDiscRate;
    @SerializedName("prd_disc_star_date")
    @Expose
    private long prdDiscStarDate;
    @SerializedName("prd_disc_end_date")
    @Expose
    private long prdDiscEndDate;

    public long getPrdDiscRate() {
        return prdDiscRate;
    }

    public void setPrdDiscRate(long prdDiscRate) {
        this.prdDiscRate = prdDiscRate;
    }

    public long getPrdDiscStarDate() {
        return prdDiscStarDate;
    }

    public void setPrdDiscStarDate(long prdDiscStarDate) {
        this.prdDiscStarDate = prdDiscStarDate;
    }

    public long getPrdDiscEndDate() {
        return prdDiscEndDate;
    }

    public void setPrdDiscEndDate(long prdDiscEndDate) {
        this.prdDiscEndDate = prdDiscEndDate;
    }

}
