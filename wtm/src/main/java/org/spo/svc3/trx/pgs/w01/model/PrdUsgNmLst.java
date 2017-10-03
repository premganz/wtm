
package org.spo.svc3.trx.pgs.w01.model;

import org.spo.svc3.trx.def.WtmConst;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdUsgNmLst {

    @SerializedName("prd_usg_nm")
    @Expose
    private String prdUsgNm=WtmConst.EMP;

    public String getPrdUsgNm() {
        return prdUsgNm;
    }

    public void setPrdUsgNm(String prdUsgNm) {
        this.prdUsgNm = prdUsgNm;
    }

}
