
package org.spo.svc3.trx.pgs.w01.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prd_pri_txo_cd",
    "prd_sec_txo_cd",
    "prd_ter_txo_cd",
    "prd_cst_seg_cd",
    "prd_prm_cd_lst"
})
public class PrdCatZn {
	
    @JsonProperty("prd_pri_txo_cd")
    private String prdPriTxoCd;
    @JsonProperty("prd_sec_txo_cd")
    private String prdSecTxoCd;
    @JsonProperty("prd_ter_txo_cd")
    private String prdTerTxoCd;
    @JsonProperty("prd_cst_seg_cd")
    private String prdCstSegCd;
    @JsonProperty("prd_prm_cd_lst")
    private List<PrdPrmCdLst> prdPrmCdLst = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prd_pri_txo_cd")
    public String getPrdPriTxoCd() {
        return prdPriTxoCd;
    }

    @JsonProperty("prd_pri_txo_cd")
    public void setPrdPriTxoCd(String prdPriTxoCd) {
        this.prdPriTxoCd = prdPriTxoCd;
    }

    @JsonProperty("prd_sec_txo_cd")
    public String getPrdSecTxoCd() {
        return prdSecTxoCd;
    }

    @JsonProperty("prd_sec_txo_cd")
    public void setPrdSecTxoCd(String prdSecTxoCd) {
        this.prdSecTxoCd = prdSecTxoCd;
    }

    @JsonProperty("prd_ter_txo_cd")
    public String getPrdTerTxoCd() {
        return prdTerTxoCd;
    }

    @JsonProperty("prd_ter_txo_cd")
    public void setPrdTerTxoCd(String prdTerTxoCd) {
        this.prdTerTxoCd = prdTerTxoCd;
    }

    @JsonProperty("prd_cst_seg_cd")
    public String getPrdCstSegCd() {
        return prdCstSegCd;
    }

    @JsonProperty("prd_cst_seg_cd")
    public void setPrdCstSegCd(String prdCstSegCd) {
        this.prdCstSegCd = prdCstSegCd;
    }

    @JsonProperty("prd_prm_cd_lst")
    public List<PrdPrmCdLst> getPrdPrmCdLst() {
        return prdPrmCdLst;
    }

    @JsonProperty("prd_prm_cd_lst")
    public void setPrdPrmCdLst(List<PrdPrmCdLst> prdPrmCdLst) {
        this.prdPrmCdLst = prdPrmCdLst;
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
