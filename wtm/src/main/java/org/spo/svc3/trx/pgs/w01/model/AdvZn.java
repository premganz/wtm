
package org.spo.svc3.trx.pgs.w01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdvZn {

    @SerializedName("prd_tech_nm")
    @Expose
    private String prdTechNm;

    public String getPrdTechNm() {
        return prdTechNm;
    }

    public void setPrdTechNm(String prdTechNm) {
        this.prdTechNm = prdTechNm;
    }

}
