
package org.spo.svc3.trx.pgs.w01.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdHistZn {

    @SerializedName("prd_pack_prc_hist_lst")
    @Expose
    private List<PrdPackPrcHistLst> prdPackPrcHistLst = new ArrayList<PrdPackPrcHistLst>();
    @SerializedName("prd_disc_rate_hist_lst")
    @Expose
    private List<PrdDiscRateHistLst> prdDiscRateHistLst = new ArrayList<PrdDiscRateHistLst>();

    public List<PrdPackPrcHistLst> getPrdPackPrcHistLst() {
        return prdPackPrcHistLst;
    }

    public void setPrdPackPrcHistLst(List<PrdPackPrcHistLst> prdPackPrcHistLst) {
        this.prdPackPrcHistLst = prdPackPrcHistLst;
    }

    public List<PrdDiscRateHistLst> getPrdDiscRateHistLst() {
        return prdDiscRateHistLst;
    }

    public void setPrdDiscRateHistLst(List<PrdDiscRateHistLst> prdDiscRateHistLst) {
        this.prdDiscRateHistLst = prdDiscRateHistLst;
    }

}
