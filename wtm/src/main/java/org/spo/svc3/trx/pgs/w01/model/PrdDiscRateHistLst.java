
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
    "prd_disc_rate",
    "prd_disc_star_date",
    "prd_disc_end_date"
})
public class PrdDiscRateHistLst {

    @JsonProperty("prd_disc_rate")
    private String prdDiscRate;
    @JsonProperty("prd_disc_star_date")
    private String prdDiscStarDate;
    @JsonProperty("prd_disc_end_date")
    private String prdDiscEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
