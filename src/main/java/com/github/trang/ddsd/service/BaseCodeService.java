package com.github.trang.ddsd.service;

import com.github.trang.ddsd.domain.enums.EnumBaseCode;
import com.github.trang.ddsd.domain.model.BaseCode;

import java.util.List;
import java.util.Optional;

/**
 * BaseCodeService
 *
 * @author trang
 */
public interface BaseCodeService extends BaseService<BaseCode, Long> {

    /**
     * 获取列表
     */
    Optional<List<BaseCode>> getListByCity(EnumBaseCode type, Integer officeAddress);

    /**
     * 分级别的返回list，填充sublist。目前仅支持两级
     */
    Optional<List<BaseCode>> getListClassifyByCity(EnumBaseCode type, Integer officeAddress);

    /**
     * 获取具体的basecode
     */
    Optional<BaseCode> getOneByCity(EnumBaseCode type, Integer officeAddress);
}
