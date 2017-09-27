
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
    "prd_type_nm",
    "prd_type_qtt",
    "prd_pack_prc_lst"
})
public class PrdPackTypeLst {

    @JsonProperty("prd_type_nm")
    private String prdTypeNm;
    @JsonProperty("prd_type_qtt")
    private String prdTypeQtt;
    @JsonProperty("prd_pack_prc_lst")
    private List<PrdPackPrcLst> prdPackPrcLst = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prd_type_nm")
    public String getPrdTypeNm() {
        return prdTypeNm;
    }

    @JsonProperty("prd_type_nm")
    public void setPrdTypeNm(String prdTypeNm) {
        this.prdTypeNm = prdTypeNm;
    }

    @JsonProperty("prd_type_qtt")
    public String getPrdTypeQtt() {
        return prdTypeQtt;
    }

    @JsonProperty("prd_type_qtt")
    public void setPrdTypeQtt(String prdTypeQtt) {
        this.prdTypeQtt = prdTypeQtt;
    }

    @JsonProperty("prd_pack_prc_lst")
    public List<PrdPackPrcLst> getPrdPackPrcLst() {
        return prdPackPrcLst;
    }

    @JsonProperty("prd_pack_prc_lst")
    public void setPrdPackPrcLst(List<PrdPackPrcLst> prdPackPrcLst) {
        this.prdPackPrcLst = prdPackPrcLst;
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
