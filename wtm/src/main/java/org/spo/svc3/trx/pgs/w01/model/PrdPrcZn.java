
package org.spo.svc3.trx.pgs.w01.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdPrcZn {

    @SerializedName("prd_trx_by_pack_ic")
    @Expose
    private Long prdTrxByPackIc;
    @SerializedName("prd_trx_unit")
    @Expose
    private String prdTrxUnit;
    @SerializedName("prd_unit_prc")
    @Expose
    private Long prdUnitPrc;
    @SerializedName("prd_unit_prc_star_dt")
    @Expose
    private Long prdUnitPrcStarDt;
    @SerializedName("prd_unit_prc_end_dt")
    @Expose
    private Long prdUnitPrcEndDt;
    @SerializedName("prd_pack_prc_lst")
    @Expose
    private List<PrdPackPrcLst> prdPackPrcLst = new ArrayList<PrdPackPrcLst>();
    @SerializedName("prd_disc_rate")
    @Expose
    private Long prdDiscRate;
    @SerializedName("prd_disc_star_date")
    @Expose
    private Long prdDiscStarDate;
    @SerializedName("prd_disc_end_date")
    @Expose
    private Long prdDiscEndDate;

    public Long getPrdTrxByPackIc() {
        return prdTrxByPackIc;
    }

    public void setPrdTrxByPackIc(Long prdTrxByPackIc) {
        this.prdTrxByPackIc = prdTrxByPackIc;
    }

    public String getPrdTrxUnit() {
        return prdTrxUnit;
    }

    public void setPrdTrxUnit(String prdTrxUnit) {
        this.prdTrxUnit = prdTrxUnit;
    }

    public Long getPrdUnitPrc() {
        return prdUnitPrc;
    }

    public void setPrdUnitPrc(Long prdUnitPrc) {
        this.prdUnitPrc = prdUnitPrc;
    }

    public Long getPrdUnitPrcStarDt() {
        return prdUnitPrcStarDt;
    }

    public void setPrdUnitPrcStarDt(Long prdUnitPrcStarDt) {
        this.prdUnitPrcStarDt = prdUnitPrcStarDt;
    }

    public Long getPrdUnitPrcEndDt() {
        return prdUnitPrcEndDt;
    }

    public void setPrdUnitPrcEndDt(Long prdUnitPrcEndDt) {
        this.prdUnitPrcEndDt = prdUnitPrcEndDt;
    }

    public List<PrdPackPrcLst> getPrdPackPrcLst() {
        return prdPackPrcLst;
    }

    public void setPrdPackPrcLst(List<PrdPackPrcLst> prdPackPrcLst) {
        this.prdPackPrcLst = prdPackPrcLst;
    }

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
