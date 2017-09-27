
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
    "prd_pack_prc_hist_lst",
    "prd_disc_rate_hist_lst"
})
public class PrdHistZn {

    @JsonProperty("prd_pack_prc_hist_lst")
    private List<PrdPackPrcHistLst> prdPackPrcHistLst = null;
    @JsonProperty("prd_disc_rate_hist_lst")
    private List<PrdDiscRateHistLst> prdDiscRateHistLst = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prd_pack_prc_hist_lst")
    public List<PrdPackPrcHistLst> getPrdPackPrcHistLst() {
        return prdPackPrcHistLst;
    }

    @JsonProperty("prd_pack_prc_hist_lst")
    public void setPrdPackPrcHistLst(List<PrdPackPrcHistLst> prdPackPrcHistLst) {
        this.prdPackPrcHistLst = prdPackPrcHistLst;
    }

    @JsonProperty("prd_disc_rate_hist_lst")
    public List<PrdDiscRateHistLst> getPrdDiscRateHistLst() {
        return prdDiscRateHistLst;
    }

    @JsonProperty("prd_disc_rate_hist_lst")
    public void setPrdDiscRateHistLst(List<PrdDiscRateHistLst> prdDiscRateHistLst) {
        this.prdDiscRateHistLst = prdDiscRateHistLst;
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
