/*
 * Alipay.com Inc.
 * Copyright (c) 2004 - 2010 All Rights Reserved.
 * Powered By [rapid-generator]
 */
package com.mock.dal.daointerface;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mock.dal.dataobject.LableDO;

/**
 * LableDAO
 * database table: anymock_lable
 * database table comments: Lable
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * @author badqiu(zhongxuan)
 * 
 */
public interface LableDAO {

    /**
     * 
     * sql:
     * <pre>insert      into         anymock_lable         (        communication_id,        lable_name)          values         (?,?)</pre> 
     */
    public java.lang.String insert(LableDO lable) throws DataAccessException;

    /**
     * 
     * sql:
     * <pre>select         communication_id,         lable_name          from         anymock_lable</pre> 
     */
    public List<LableDO> loadAll() throws DataAccessException;

    /**
     * 
     * sql:
     * <pre>update         anymock_lable      set         lable_name =?          where         communication_id =?</pre> 
     */
    public int updateLable(String lableName, String communicationId) throws DataAccessException;

    /**
     * 
     * sql:
     * <pre>delete      from         anymock_lable          where         communication_id = ?</pre> 
     */
    public int deleteByCommuId(String communicationId) throws DataAccessException;

}