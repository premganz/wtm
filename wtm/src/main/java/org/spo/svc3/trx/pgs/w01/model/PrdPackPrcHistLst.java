
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
    "prd_pack_qtt",
    "prd_pack_prc",
    "prd_pack_prc_star_dt",
    "prd_pack_prc_end_dt"
})
public class PrdPackPrcHistLst {

    @JsonProperty("prd_pack_qtt")
    private String prdPackQtt;
    @JsonProperty("prd_pack_prc")
    private String prdPackPrc;
    @JsonProperty("prd_pack_prc_star_dt")
    private String prdPackPrcStarDt;
    @JsonProperty("prd_pack_prc_end_dt")
    private String prdPackPrcEndDt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prd_pack_qtt")
    public String getPrdPackQtt() {
        return prdPackQtt;
    }

    @JsonProperty("prd_pack_qtt")
    public void setPrdPackQtt(String prdPackQtt) {
        this.prdPackQtt = prdPackQtt;
    }

    @JsonProperty("prd_pack_prc")
    public String getPrdPackPrc() {
        return prdPackPrc;
    }

    @JsonProperty("prd_pack_prc")
    public void setPrdPackPrc(String prdPackPrc) {
        this.prdPackPrc = prdPackPrc;
    }

    @JsonProperty("prd_pack_prc_star_dt")
    public String getPrdPackPrcStarDt() {
        return prdPackPrcStarDt;
    }

    @JsonProperty("prd_pack_prc_star_dt")
    public void setPrdPackPrcStarDt(String prdPackPrcStarDt) {
        this.prdPackPrcStarDt = prdPackPrcStarDt;
    }

    @JsonProperty("prd_pack_prc_end_dt")
    public String getPrdPackPrcEndDt() {
        return prdPackPrcEndDt;
    }

    @JsonProperty("prd_pack_prc_end_dt")
    public void setPrdPackPrcEndDt(String prdPackPrcEndDt) {
        this.prdPackPrcEndDt = prdPackPrcEndDt;
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
