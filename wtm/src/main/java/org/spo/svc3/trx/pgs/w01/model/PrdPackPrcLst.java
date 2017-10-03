
package org.spo.svc3.trx.pgs.w01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdPackPrcLst {

    @SerializedName("prd_pack_qtt")
    @Expose
    private long prdPackQtt;
    @SerializedName("prd_pack_prc")
    @Expose
    private long prdPackPrc;
    @SerializedName("prd_pack_prc_star_dt")
    @Expose
    private long prdPackPrcStarDt;
    @SerializedName("prd_pack_prc_end_dt")
    @Expose
    private long prdPackPrcEndDt;

    public long getPrdPackQtt() {
        return prdPackQtt;
    }

    public void setPrdPackQtt(long prdPackQtt) {
        this.prdPackQtt = prdPackQtt;
    }

    public long getPrdPackPrc() {
        return prdPackPrc;
    }

    public void setPrdPackPrc(long prdPackPrc) {
        this.prdPackPrc = prdPackPrc;
    }

    public long getPrdPackPrcStarDt() {
        return prdPackPrcStarDt;
    }

    public void setPrdPackPrcStarDt(long prdPackPrcStarDt) {
        this.prdPackPrcStarDt = prdPackPrcStarDt;
    }

    public long getPrdPackPrcEndDt() {
        return prdPackPrcEndDt;
    }

    public void setPrdPackPrcEndDt(long prdPackPrcEndDt) {
        this.prdPackPrcEndDt = prdPackPrcEndDt;
    }

}
