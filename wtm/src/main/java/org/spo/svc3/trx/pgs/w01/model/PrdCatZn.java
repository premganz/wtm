
package org.spo.svc3.trx.pgs.w01.model;

import java.util.ArrayList;
import java.util.List;

import org.spo.svc3.trx.def.WtmConst;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdCatZn {

    @SerializedName("prd_pri_txo_cd")
    @Expose
    private String prdPriTxoCd=WtmConst.EMP;
    @SerializedName("prd_sec_txo_cd")
    @Expose
    private String prdSecTxoCd=WtmConst.EMP;;
    @SerializedName("prd_ter_txo_cd")
    @Expose
    private String prdTerTxoCd=WtmConst.EMP;;
    @SerializedName("prd_cst_seg_cd")
    @Expose
    private String prdCstSegCd=WtmConst.EMP;;
    @SerializedName("prd_prm_cd_lst")
    @Expose
    private List<PrdPrmCdLst> prdPrmCdLst = new ArrayList<PrdPrmCdLst>();
    @SerializedName("prd_end_dt")
    @Expose
    private long prdEndDt;

    public String getPrdPriTxoCd() {
        return prdPriTxoCd;
    }

    public void setPrdPriTxoCd(String prdPriTxoCd) {
        this.prdPriTxoCd = prdPriTxoCd;
    }

    public String getPrdSecTxoCd() {
        return prdSecTxoCd;
    }

    public void setPrdSecTxoCd(String prdSecTxoCd) {
        this.prdSecTxoCd = prdSecTxoCd;
    }

    public String getPrdTerTxoCd() {
        return prdTerTxoCd;
    }

    public void setPrdTerTxoCd(String prdTerTxoCd) {
        this.prdTerTxoCd = prdTerTxoCd;
    }

    public String getPrdCstSegCd() {
        return prdCstSegCd;
    }

    public void setPrdCstSegCd(String prdCstSegCd) {
        this.prdCstSegCd = prdCstSegCd;
    }

    public List<PrdPrmCdLst> getPrdPrmCdLst() {
        return prdPrmCdLst;
    }

    public void setPrdPrmCdLst(List<PrdPrmCdLst> prdPrmCdLst) {
        this.prdPrmCdLst = prdPrmCdLst;
    }

    public long getPrdEndDt() {
        return prdEndDt;
    }

    public void setPrdEndDt(long prdEndDt) {
        this.prdEndDt = prdEndDt;
    }

}
