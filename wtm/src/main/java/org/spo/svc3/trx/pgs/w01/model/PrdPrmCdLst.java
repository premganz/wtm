
package org.spo.svc3.trx.pgs.w01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdPrmCdLst {

    @SerializedName("prd_grp_prm_cd_type")
    @Expose
    private String prdGrpPrmCdType;
    @SerializedName("prd_grp_prm_cd")
    @Expose
    private String prdGrpPrmCd;

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
