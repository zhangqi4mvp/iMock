/*
 * Alipay.com Inc.
 * Copyright (c) 2004 - 2010 All Rights Reserved.
 * Powered By [rapid-generator]
 */

package com.mock.dal.ibatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.mock.dal.daointerface.TemplateSystemDAO;
import com.mock.dal.dataobject.TemplateSystemDO;

/**
 * TemplateSystemDAO
 * database table: anymock_template_system
 * database table comments: TemplateSystem
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * @author badqiu(zhongxuan)
 *
 
 */
public class IbatisTemplateSystemDAO extends SqlMapClientDaoSupport implements TemplateSystemDAO {

    /**
     * 
     * sql: 
     * <pre>select         innerid,      communication_id,      sys_template,      macthdescription,           gmt_create,           gmt_modified          from         anymock_template_system</pre>
     */
    @SuppressWarnings("unchecked")
    public List<TemplateSystemDO> loadAll() throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("anymock.TemplateSystem.loadAll", null);
    }

    /**
     * 
     * sql: 
     * <pre>insert      into         anymock_template_system         (      innerid,      communication_id,      sys_template,      macthdescription,           gmt_create,           gmt_modified     )      values         (?,?,?,"",sysdate(),sysdate())</pre>
     */
    public java.lang.String insert(TemplateSystemDO templateSystem) throws DataAccessException {
        if (templateSystem == null) {
            throw new IllegalArgumentException("Can't insert a null data object into db.");
        }
        getSqlMapClientTemplate().insert("anymock.TemplateSystem.insert", templateSystem);
        return templateSystem.getInnerid();
    }

    /**
     * 
     * sql: 
     * <pre>select         innerid,      communication_id,      sys_template,      macthdescription,           gmt_create,           gmt_modified          from         anymock_template_system          where         communication_id = ?</pre>
     */
    public TemplateSystemDO selectByUrlId(String communicationId) throws DataAccessException {
        return (TemplateSystemDO) getSqlMapClientTemplate().queryForObject(
            "anymock.TemplateSystem.selectByUrlId", communicationId);
    }

    /**
     * 
     * sql: 
     * <pre>select         innerid,      communication_id,      sys_template,      macthdescription,           gmt_create,           gmt_modified          from         anymock_template_system          where         innerid = ?</pre>
     */
    public TemplateSystemDO selectById(String innerid) throws DataAccessException {
        return (TemplateSystemDO) getSqlMapClientTemplate().queryForObject(
            "anymock.TemplateSystem.selectById", innerid);
    }

    /**
     * 
     * sql: 
     * <pre>update         anymock_template_system      set         sys_template =?,      gmt_modified =sysdate()          where         innerid =?</pre>
     */
    public int updateTemplate(String sysTemplate, String innerid) throws DataAccessException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("sysTemplate", sysTemplate);
        param.put("innerid", innerid);
        return getSqlMapClientTemplate().update("anymock.TemplateSystem.updateTemplate", param);
    }

    /**
     * 
     * sql: 
     * <pre>update         anymock_template_system      set         macthdescription =?,      gmt_modified =sysdate()          where         innerid =?</pre>
     */
    public int updateMacth(String macthdescription, String innerid) throws DataAccessException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("macthdescription", macthdescription);
        param.put("innerid", innerid);
        return getSqlMapClientTemplate().update("anymock.TemplateSystem.updateMacth", param);
    }

    /**
     * 
     * sql: 
     * <pre>delete      from         anymock_template_system          where         innerid = ?</pre>
     */
    public int deleteById(String innerid) throws DataAccessException {
        return getSqlMapClientTemplate().delete("anymock.TemplateSystem.deleteById", innerid);
    }

}