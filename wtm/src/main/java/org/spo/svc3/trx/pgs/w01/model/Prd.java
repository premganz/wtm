
package org.spo.svc3.trx.pgs.w01.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prd_id",
    "adv_zn",
    "prd_desc_zn",
    "cms_img_id",
    "cms_img_res",
    "prd_disc_rate",
    "prd_disc_star_date",
    "prd_disc_end_date",
    "prd_hist_zn",
    "prd_cat_zn",
    "prd_act_ic",
    "prd_end_dt"
})
public class Prd {

    @JsonProperty("prd_id")
    private String prdId;
    @JsonProperty("adv_zn")
    private List<AdvZn> advZn = null;
    @JsonProperty("prd_desc_zn")
    private List<PrdDescZn> prdDescZn = null;
    @JsonProperty("cms_img_id")
    private String cmsImgId;
    @JsonProperty("cms_img_res")
    private String cmsImgRes;
    @JsonProperty("prd_disc_rate")
    private String prdDiscRate;
    @JsonProperty("prd_disc_star_date")
    private String prdDiscStarDate;
    @JsonProperty("prd_disc_end_date")
    private String prdDiscEndDate;
    @JsonProperty("prd_hist_zn")
    private List<PrdHistZn> prdHistZn = null;
    @JsonProperty("prd_cat_zn")
    private List<PrdCatZn> prdCatZn = null;
    @JsonProperty("prd_act_ic")
    private String prdActIc;
    @JsonProperty("prd_end_dt")
    private String prdEndDt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prd_id")
    public String getPrdId() {
        return prdId;
    }

    @JsonProperty("prd_id")
    public void setPrdId(String prdId) {
        this.prdId = prdId;
    }

    @JsonProperty("adv_zn")
    public List<AdvZn> getAdvZn() {
        return advZn;
    }

    @JsonProperty("adv_zn")
    public void setAdvZn(List<AdvZn> advZn) {
        this.advZn = advZn;
    }

    @JsonProperty("prd_desc_zn")
    public List<PrdDescZn> getPrdDescZn() {
        return prdDescZn;
    }

    @JsonProperty("prd_desc_zn")
    public void setPrdDescZn(List<PrdDescZn> prdDescZn) {
        this.prdDescZn = prdDescZn;
    }

    @JsonProperty("cms_img_id")
    public String getCmsImgId() {
        return cmsImgId;
    }

    @JsonProperty("cms_img_id")
    public void setCmsImgId(String cmsImgId) {
        this.cmsImgId = cmsImgId;
    }

    @JsonProperty("cms_img_res")
    public String getCmsImgRes() {
        return cmsImgRes;
    }

    @JsonProperty("cms_img_res")
    public void setCmsImgRes(String cmsImgRes) {
        this.cmsImgRes = cmsImgRes;
    }

    @JsonProperty("prd_disc_rate")
    public String getPrdDiscRate() {
        return prdDiscRate;
    }

    @JsonProperty("prd_disc_rate")
    public void setPrdDiscRate(String prdDiscRate) {
        this.prdDiscRate = prdDiscRate;
    }

    @JsonProperty("prd_disc_star_date")
    public String getPrdDiscStarDate() {
        return prdDiscStarDate;
    }

    @JsonProperty("prd_disc_star_date")
    public void setPrdDiscStarDate(String prdDiscStarDate) {
        this.prdDiscStarDate = prdDiscStarDate;
    }

    @JsonProperty("prd_disc_end_date")
    public String getPrdDiscEndDate() {
        return prdDiscEndDate;
    }

    @JsonProperty("prd_disc_end_date")
    public void setPrdDiscEndDate(String prdDiscEndDate) {
        this.prdDiscEndDate = prdDiscEndDate;
    }

    @JsonProperty("prd_hist_zn")
    public List<PrdHistZn> getPrdHistZn() {
        return prdHistZn;
    }

    @JsonProperty("prd_hist_zn")
    public void setPrdHistZn(List<PrdHistZn> prdHistZn) {
        this.prdHistZn = prdHistZn;
    }

    @JsonProperty("prd_cat_zn")
    public List<PrdCatZn> getPrdCatZn() {
        return prdCatZn;
    }

    @JsonProperty("prd_cat_zn")
    public void setPrdCatZn(List<PrdCatZn> prdCatZn) {
        this.prdCatZn = prdCatZn;
    }

    @JsonProperty("prd_act_ic")
    public String getPrdActIc() {
        return prdActIc;
    }

    @JsonProperty("prd_act_ic")
    public void setPrdActIc(String prdActIc) {
        this.prdActIc = prdActIc;
    }

    @JsonProperty("prd_end_dt")
    public String getPrdEndDt() {
        return prdEndDt;
    }

    @JsonProperty("prd_end_dt")
    public void setPrdEndDt(String prdEndDt) {
        this.prdEndDt = prdEndDt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
