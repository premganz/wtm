
package org.spo.svc3.trx.pgs.w01.model;

import org.spo.svc3.trx.def.WtmConst;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdVarNmLst {

    @SerializedName("prd_var_nm")
    @Expose
    private String prdVarNm=WtmConst.EMP;

    public String getPrdVarNm() {
        return prdVarNm;
    }

    public void setPrdVarNm(String prdVarNm) {
        this.prdVarNm = prdVarNm;
    }

}
