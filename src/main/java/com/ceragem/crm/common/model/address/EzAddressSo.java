package com.ceragem.crm.common.model.address;

import com.ceragem.crm.common.model.EzPaginationInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EzAddressSo {
	String keyword;
	String language;
	private int currentPage;
	private int countPerPage;

	public EzAddressSo() {

	}

	public EzAddressSo(EzPaginationInfo page) {
		currentPage = page.getCurrentPageNo();
		countPerPage = page.getRecordCountPerPage();
	}

}
