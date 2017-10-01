
package org.spo.svc3.trx.pgs.w01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prd {

    @SerializedName("prd_id")
    @Expose
    private Long prdId;
    @SerializedName("prd_ovv_zn")
    @Expose
    private PrdOvvZn prdOvvZn;
    @SerializedName("adv_zn")
    @Expose
    private AdvZn advZn;
    @SerializedName("prd_dtl_zn")
    @Expose
    private PrdDtlZn prdDtlZn;
    @SerializedName("prd_prc_zn")
    @Expose
    private PrdPrcZn prdPrcZn;
    @SerializedName("prd_hist_zn")
    @Expose
    private PrdHistZn prdHistZn;
    @SerializedName("prd_cat_zn")
    @Expose
    private PrdCatZn prdCatZn;

    public Long getPrdId() {
        return prdId;
    }

    public void setPrdId(Long prdId) {
        this.prdId = prdId;
    }

    public PrdOvvZn getPrdOvvZn() {
        return prdOvvZn;
    }

    public void setPrdOvvZn(PrdOvvZn prdOvvZn) {
        this.prdOvvZn = prdOvvZn;
    }

    public AdvZn getAdvZn() {
        return advZn;
    }

    public void setAdvZn(AdvZn advZn) {
        this.advZn = advZn;
    }

    public PrdDtlZn getPrdDtlZn() {
        return prdDtlZn;
    }

    public void setPrdDtlZn(PrdDtlZn prdDtlZn) {
        this.prdDtlZn = prdDtlZn;
    }

    public PrdPrcZn getPrdPrcZn() {
        return prdPrcZn;
    }

    public void setPrdPrcZn(PrdPrcZn prdPrcZn) {
        this.prdPrcZn = prdPrcZn;
    }

    public PrdHistZn getPrdHistZn() {
        return prdHistZn;
    }

    public void setPrdHistZn(PrdHistZn prdHistZn) {
        this.prdHistZn = prdHistZn;
    }

    public PrdCatZn getPrdCatZn() {
        return prdCatZn;
    }

    public void setPrdCatZn(PrdCatZn prdCatZn) {
        this.prdCatZn = prdCatZn;
    }

}
