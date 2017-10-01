
package org.spo.svc3.trx.pgs.w01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdDiscRateHistLst {

    @SerializedName("prd_disc_rate")
    @Expose
    private Long prdDiscRate;
    @SerializedName("prd_disc_star_date")
    @Expose
    private Long prdDiscStarDate;
    @SerializedName("prd_disc_end_date")
    @Expose
    private Long prdDiscEndDate;

    public Long getPrdDiscRate() {
        return prdDiscRate;
    }

    public void setPrdDiscRate(Long prdDiscRate) {
        this.prdDiscRate = prdDiscRate;
    }

    public Long getPrdDiscStarDate() {
        return prdDiscStarDate;
    }

    public void setPrdDiscStarDate(Long prdDiscStarDate) {
        this.prdDiscStarDate = prdDiscStarDate;
    }

    public Long getPrdDiscEndDate() {
        return prdDiscEndDate;
    }

    public void setPrdDiscEndDate(Long prdDiscEndDate) {
        this.prdDiscEndDate = prdDiscEndDate;
    }

}
