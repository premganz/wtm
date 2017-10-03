
package org.spo.svc3.trx.pgs.w01.model;

import java.util.ArrayList;
import java.util.List;

import org.spo.svc3.trx.def.WtmConst;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdPrcZn {

    @SerializedName("prd_trx_by_pack_ic")
    @Expose
    private long prdTrxByPackIc;
    @SerializedName("prd_trx_unit")
    @Expose
    private String prdTrxUnit=WtmConst.EMP;
    @SerializedName("prd_unit_prc")
    @Expose
    private long prdUnitPrc;
    @SerializedName("prd_unit_prc_star_dt")
    @Expose
    private long prdUnitPrcStarDt;
    @SerializedName("prd_unit_prc_end_dt")
    @Expose
    private long prdUnitPrcEndDt;
    @SerializedName("prd_pack_prc_lst")
    @Expose
    private List<PrdPackPrcLst> prdPackPrcLst = new ArrayList<PrdPackPrcLst>();
    @SerializedName("prd_disc_rate")
    @Expose
    private long prdDiscRate;
    @SerializedName("prd_disc_star_date")
    @Expose
    private long prdDiscStarDate;
    @SerializedName("prd_disc_end_date")
    @Expose
    private long prdDiscEndDate;

    public long getPrdTrxByPackIc() {
        return prdTrxByPackIc;
    }

    public void setPrdTrxByPackIc(long prdTrxByPackIc) {
        this.prdTrxByPackIc = prdTrxByPackIc;
    }

    public String getPrdTrxUnit() {
        return prdTrxUnit;
    }

    public void setPrdTrxUnit(String prdTrxUnit) {
        this.prdTrxUnit = prdTrxUnit;
    }

    public long getPrdUnitPrc() {
        return prdUnitPrc;
    }

    public void setPrdUnitPrc(long prdUnitPrc) {
        this.prdUnitPrc = prdUnitPrc;
    }

    public long getPrdUnitPrcStarDt() {
        return prdUnitPrcStarDt;
    }

    public void setPrdUnitPrcStarDt(long prdUnitPrcStarDt) {
        this.prdUnitPrcStarDt = prdUnitPrcStarDt;
    }

    public long getPrdUnitPrcEndDt() {
        return prdUnitPrcEndDt;
    }

    public void setPrdUnitPrcEndDt(long prdUnitPrcEndDt) {
        this.prdUnitPrcEndDt = prdUnitPrcEndDt;
    }

    public List<PrdPackPrcLst> getPrdPackPrcLst() {
        return prdPackPrcLst;
    }

    public void setPrdPackPrcLst(List<PrdPackPrcLst> prdPackPrcLst) {
        this.prdPackPrcLst = prdPackPrcLst;
    }

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
