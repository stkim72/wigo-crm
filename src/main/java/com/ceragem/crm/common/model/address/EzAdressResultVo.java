package com.ceragem.crm.common.model.address;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EzAdressResultVo {
	private EzAddressCodeVo common;
	private List<EzAddressVo> juso;
}
