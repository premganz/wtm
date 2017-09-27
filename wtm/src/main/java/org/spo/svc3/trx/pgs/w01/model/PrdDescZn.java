
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
    "prd_gen_nm",
    "prd_alt_nm",
    "prd_desc",
    "prd_bran_nm",
    "prd_usg_nm_lst",
    "prd_var_nm_lst",
    "prd_pack_type_lst"
})
public class PrdDescZn {

    @JsonProperty("prd_gen_nm")
    private String prdGenNm;
    @JsonProperty("prd_alt_nm")
    private String prdAltNm;
    @JsonProperty("prd_desc")
    private String prdDesc;
    @JsonProperty("prd_bran_nm")
    private String prdBranNm;
    @JsonProperty("prd_usg_nm_lst")
    private List<PrdUsgNmLst> prdUsgNmLst = null;
    @JsonProperty("prd_var_nm_lst")
    private List<PrdVarNmLst> prdVarNmLst = null;
    @JsonProperty("prd_pack_type_lst")
    private List<PrdPackTypeLst> prdPackTypeLst = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prd_gen_nm")
    public String getPrdGenNm() {
        return prdGenNm;
    }

    @JsonProperty("prd_gen_nm")
    public void setPrdGenNm(String prdGenNm) {
        this.prdGenNm = prdGenNm;
    }

    @JsonProperty("prd_alt_nm")
    public String getPrdAltNm() {
        return prdAltNm;
    }

    @JsonProperty("prd_alt_nm")
    public void setPrdAltNm(String prdAltNm) {
        this.prdAltNm = prdAltNm;
    }

    @JsonProperty("prd_desc")
    public String getPrdDesc() {
        return prdDesc;
    }

    @JsonProperty("prd_desc")
    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    @JsonProperty("prd_bran_nm")
    public String getPrdBranNm() {
        return prdBranNm;
    }

    @JsonProperty("prd_bran_nm")
    public void setPrdBranNm(String prdBranNm) {
        this.prdBranNm = prdBranNm;
    }

    @JsonProperty("prd_usg_nm_lst")
    public List<PrdUsgNmLst> getPrdUsgNmLst() {
        return prdUsgNmLst;
    }

    @JsonProperty("prd_usg_nm_lst")
    public void setPrdUsgNmLst(List<PrdUsgNmLst> prdUsgNmLst) {
        this.prdUsgNmLst = prdUsgNmLst;
    }

    @JsonProperty("prd_var_nm_lst")
    public List<PrdVarNmLst> getPrdVarNmLst() {
        return prdVarNmLst;
    }

    @JsonProperty("prd_var_nm_lst")
    public void setPrdVarNmLst(List<PrdVarNmLst> prdVarNmLst) {
        this.prdVarNmLst = prdVarNmLst;
    }

    @JsonProperty("prd_pack_type_lst")
    public List<PrdPackTypeLst> getPrdPackTypeLst() {
        return prdPackTypeLst;
    }

    @JsonProperty("prd_pack_type_lst")
    public void setPrdPackTypeLst(List<PrdPackTypeLst> prdPackTypeLst) {
        this.prdPackTypeLst = prdPackTypeLst;
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
