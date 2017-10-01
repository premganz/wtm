
package org.spo.svc3.trx.pgs.w01.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdDtlZn {

    @SerializedName("prd_alt_nm")
    @Expose
    private String prdAltNm;
    @SerializedName("prd_dtl_desc")
    @Expose
    private String prdDtlDesc;
    @SerializedName("prd_usg_nm_lst")
    @Expose
    private List<PrdUsgNmLst> prdUsgNmLst = new ArrayList<PrdUsgNmLst>();
    @SerializedName("prd_var_nm_lst")
    @Expose
    private List<PrdVarNmLst> prdVarNmLst = new ArrayList<PrdVarNmLst>();

    public String getPrdAltNm() {
        return prdAltNm;
    }

    public void setPrdAltNm(String prdAltNm) {
        this.prdAltNm = prdAltNm;
    }

    public String getPrdDtlDesc() {
        return prdDtlDesc;
    }

    public void setPrdDtlDesc(String prdDtlDesc) {
        this.prdDtlDesc = prdDtlDesc;
    }

    public List<PrdUsgNmLst> getPrdUsgNmLst() {
        return prdUsgNmLst;
    }

    public void setPrdUsgNmLst(List<PrdUsgNmLst> prdUsgNmLst) {
        this.prdUsgNmLst = prdUsgNmLst;
    }

    public List<PrdVarNmLst> getPrdVarNmLst() {
        return prdVarNmLst;
    }

    public void setPrdVarNmLst(List<PrdVarNmLst> prdVarNmLst) {
        this.prdVarNmLst = prdVarNmLst;
    }

}
