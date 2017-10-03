
package org.spo.svc3.trx.pgs.w01.model;

import org.spo.svc3.trx.def.WtmConst;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdOvvZn {

    @SerializedName("prd_gen_nm")
    @Expose
    private String prdGenNm=WtmConst.EMP;
    @SerializedName("prd_act_ic")
    @Expose
    private long prdActIc;
    @SerializedName("prd_desc")
    @Expose
    private String prdDesc=WtmConst.EMP;
    @SerializedName("prd_bran_nm")
    @Expose
    private String prdBranNm=WtmConst.EMP;
    @SerializedName("cms_img_id")
    @Expose
    private String cmsImgId=WtmConst.EMP;
    @SerializedName("cms_img_res")
    @Expose
    private String cmsImgRes=WtmConst.EMP;

    public String getPrdGenNm() {
        return prdGenNm;
    }

    public void setPrdGenNm(String prdGenNm) {
        this.prdGenNm = prdGenNm;
    }

    public long getPrdActIc() {
        return prdActIc;
    }

    public void setPrdActIc(long prdActIc) {
        this.prdActIc = prdActIc;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public String getPrdBranNm() {
        return prdBranNm;
    }

    public void setPrdBranNm(String prdBranNm) {
        this.prdBranNm = prdBranNm;
    }

    public String getCmsImgId() {
        return cmsImgId;
    }

    public void setCmsImgId(String cmsImgId) {
        this.cmsImgId = cmsImgId;
    }

    public String getCmsImgRes() {
        return cmsImgRes;
    }

    public void setCmsImgRes(String cmsImgRes) {
        this.cmsImgRes = cmsImgRes;
    }

}
