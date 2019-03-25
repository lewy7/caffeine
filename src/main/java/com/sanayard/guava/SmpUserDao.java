package com.sanayard.guava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("com.sanayard.guava.SmpUserDao")
public class SmpUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String QUERY_ALL_USER = "select user_id,user_name,login_password,pay_password,create_date,update_date from smp_user";
    private static final String QUERY_BY_USER_ID = "select user_id,user_name,login_password,pay_password,create_date,update_date from smp_user where user_id=?";

    public void queryAllUser(){


    }

    // value = cachename,define in application properties
    @Cacheable(value = "tableCache", key = "'TAB_SMP_USER' + #userId")
    public SmpUserPo getByUserId(Long userId){
        SmpUserPo smpUserPo = null;
        try {
            System.out.println("data from sql query result");
            smpUserPo = jdbcTemplate.queryForObject(QUERY_BY_USER_ID,
                    new Object[]{userId},
                    new BeanPropertyRowMapper<SmpUserPo>(SmpUserPo.class));
        }catch (EmptyResultDataAccessException e){
            System.out.println("getCardDef "+ userId +" no data found");
            return  null;
        }catch (Exception e){
            System.out.println("getCardDef "+ userId +" Exception");
            e.printStackTrace();
            return null;
        }
        return smpUserPo;
    }

}
