package org.spo.svc3.trx.pgs.w01.form;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrdForm01 {


	@SerializedName("prd_ovv_gen_nm")
	@Expose
	private String prdOvvGenNm;
	@SerializedName("prd_ovv_desc")
	@Expose
	private String prdOvvDesc;
	@SerializedName("prd_ovv_bran_nm")
	@Expose
	private String prdOvvBranNm;
	@SerializedName("cms_ovv_img_id")
	@Expose
	private String cmsOvvImgId;
	@SerializedName("prd_act_ic")
	@Expose
	private long prdActIc;
	@SerializedName("prd_dtl_alt_nm")
	@Expose
	private String prdDtlAltNm;
	@SerializedName("prd_dtl_dtl_desc")
	@Expose
	private String prdDtlDtlDesc;
	@SerializedName("prd_dtl_usg_nm_lst_usg_nm1")
	@Expose
	private String prdDtlUsgNmLstUsgNm1;
	@SerializedName("prd_dtl_usg_nm_lst_usg_nm2")
	@Expose
	private String prdDtlUsgNmLstUsgNm2;

	public String getPrdOvvGenNm() {
	return prdOvvGenNm;
	}

	public void setPrdOvvGenNm(String prdOvvGenNm) {
	this.prdOvvGenNm = prdOvvGenNm;
	}

	public String getPrdOvvDesc() {
	return prdOvvDesc;
	}

	public void setPrdOvvDesc(String prdOvvDesc) {
	this.prdOvvDesc = prdOvvDesc;
	}

	public String getPrdOvvBranNm() {
	return prdOvvBranNm;
	}

	public void setPrdOvvBranNm(String prdOvvBranNm) {
	this.prdOvvBranNm = prdOvvBranNm;
	}

	public String getCmsOvvImgId() {
	return cmsOvvImgId;
	}

	public void setCmsOvvImgId(String cmsOvvImgId) {
	this.cmsOvvImgId = cmsOvvImgId;
	}

	public long getPrdActIc() {
	return prdActIc;
	}

	public void setPrdActIc(long prdActIc) {
	this.prdActIc = prdActIc;
	}

	public String getPrdDtlAltNm() {
	return prdDtlAltNm;
	}

	public void setPrdDtlAltNm(String prdDtlAltNm) {
	this.prdDtlAltNm = prdDtlAltNm;
	}

	public String getPrdDtlDtlDesc() {
	return prdDtlDtlDesc;
	}

	public void setPrdDtlDtlDesc(String prdDtlDtlDesc) {
	this.prdDtlDtlDesc = prdDtlDtlDesc;
	}

	public String getPrdDtlUsgNmLstUsgNm1() {
	return prdDtlUsgNmLstUsgNm1;
	}

	public void setPrdDtlUsgNmLstUsgNm1(String prdDtlUsgNmLstUsgNm1) {
	this.prdDtlUsgNmLstUsgNm1 = prdDtlUsgNmLstUsgNm1;
	}

	public String getPrdDtlUsgNmLstUsgNm2() {
	return prdDtlUsgNmLstUsgNm2;
	}

	public void setPrdDtlUsgNmLstUsgNm2(String prdDtlUsgNmLstUsgNm2) {
	this.prdDtlUsgNmLstUsgNm2 = prdDtlUsgNmLstUsgNm2;
	}

	}
	
	

