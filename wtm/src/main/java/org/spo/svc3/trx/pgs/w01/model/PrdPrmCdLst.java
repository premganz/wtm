
package org.spo.svc3.trx.pgs.w01.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prd_grp_prm_cd_type",
    "prd_grp_prm_cd"
})
public class PrdPrmCdLst {

    @JsonProperty("prd_grp_prm_cd_type")
    private String prdGrpPrmCdType;
    @JsonProperty("prd_grp_prm_cd")
    private String prdGrpPrmCd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prd_grp_prm_cd_type")
    public String getPrdGrpPrmCdType() {
        return prdGrpPrmCdType;
    }

    @JsonProperty("prd_grp_prm_cd_type")
    public void setPrdGrpPrmCdType(String prdGrpPrmCdType) {
        this.prdGrpPrmCdType = prdGrpPrmCdType;
    }

    @JsonProperty("prd_grp_prm_cd")
    public String getPrdGrpPrmCd() {
        return prdGrpPrmCd;
    }

    @JsonProperty("prd_grp_prm_cd")
    public void setPrdGrpPrmCd(String prdGrpPrmCd) {
        this.prdGrpPrmCd = prdGrpPrmCd;
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
