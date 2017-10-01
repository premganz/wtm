
package org.spo.svc3.trx.pgs.w01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdPackPrcLst {

    @SerializedName("prd_pack_qtt")
    @Expose
    private Long prdPackQtt;
    @SerializedName("prd_pack_prc")
    @Expose
    private Long prdPackPrc;
    @SerializedName("prd_pack_prc_star_dt")
    @Expose
    private Long prdPackPrcStarDt;
    @SerializedName("prd_pack_prc_end_dt")
    @Expose
    private Long prdPackPrcEndDt;

    public Long getPrdPackQtt() {
        return prdPackQtt;
    }

    public void setPrdPackQtt(Long prdPackQtt) {
        this.prdPackQtt = prdPackQtt;
    }

    public Long getPrdPackPrc() {
        return prdPackPrc;
    }

    public void setPrdPackPrc(Long prdPackPrc) {
        this.prdPackPrc = prdPackPrc;
    }

    public Long getPrdPackPrcStarDt() {
        return prdPackPrcStarDt;
    }

    public void setPrdPackPrcStarDt(Long prdPackPrcStarDt) {
        this.prdPackPrcStarDt = prdPackPrcStarDt;
    }

    public Long getPrdPackPrcEndDt() {
        return prdPackPrcEndDt;
    }

    public void setPrdPackPrcEndDt(Long prdPackPrcEndDt) {
        this.prdPackPrcEndDt = prdPackPrcEndDt;
    }

}
