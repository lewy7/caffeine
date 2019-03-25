package com.sanayard.guava;


/**
 CREATE TABLE IF NOT EXISTS `smp_user` (
 `user_id` int(11) NOT NULL AUTO_INCREMENT,
 `user_name` varchar(100) DEFAULT NULL,
 `login_password` varchar(40) DEFAULT NULL,
 `pay_password` varchar(40) DEFAULT NULL,
 `create_date` int(11) DEFAULT NULL,
 `update_date` int(11) DEFAULT NULL,
 PRIMARY KEY (`user_id`)
 ) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;
 */
public class SmpUserPo {
    private Long userId;
    private String userName;
    private String loginPassword;
    private String payPassword;
    private Long createDate;
    private Long updateDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }
}
