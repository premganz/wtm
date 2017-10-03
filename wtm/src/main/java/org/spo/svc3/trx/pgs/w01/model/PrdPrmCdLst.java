
package org.spo.svc3.trx.pgs.w01.model;

import org.spo.svc3.trx.def.WtmConst;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdPrmCdLst {

    @SerializedName("prd_grp_prm_cd_type")
    @Expose
    private String prdGrpPrmCdType=WtmConst.EMP;
    @SerializedName("prd_grp_prm_cd")
    @Expose
    private String prdGrpPrmCd=WtmConst.EMP;

    public String getPrdGrpPrmCdType() {
        return prdGrpPrmCdType;
    }

    public void setPrdGrpPrmCdType(String prdGrpPrmCdType) {
        this.prdGrpPrmCdType = prdGrpPrmCdType;
    }

    public String getPrdGrpPrmCd() {
        return prdGrpPrmCd;
    }

    public void setPrdGrpPrmCd(String prdGrpPrmCd) {
        this.prdGrpPrmCd = prdGrpPrmCd;
    }

}
