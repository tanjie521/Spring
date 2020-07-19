package com.dcits.ensemble.om.table;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "recon_config_chain")
public class reconConfigChain implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 链路ID
     */
    @Column(name = "CHAIN_ID")
    private Long chainId;

    /**
     * 链路名称
     */
    @Column(name = "CHAIN_NAME")
    private String chainName;

    /**
     * 系统id
     */
    @Column(name = "SYSTEM_ID")
    private String systemId;

    /**
     * 产品id
     */
    @Column(name = "PRODUCT_ID")
    private String productId;

    /**
     * 交易类型
     */
    @Column(name = "TRAN_CODE")
    private String tranCode;

    /**
     * 子交易类型
     */
    @Column(name = "SUB_TRAN_CODE")
    private String subTranCode;

    /**
     * 宽度
     */
    @Column(name = "WIDTH")
    private String width;

    /**
     * 高度
     */
    @Column(name = "HEIGHT")
    private String height;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 最后修改时间
     */
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    /**
     * 是否删除
     */
    @Column(name = "IS_DELETED")
    private Byte isDeleted;

    /**
     * 状态
     */
    @Column(name = "STATUS_CODE")
    private Byte statusCode;

    /**
     * 扩展信息
     */
    @Column(name = "EXTEND_INFO")
    private String extendInfo;

    private static final long serialVersionUID = 1L;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取链路ID
     *
     * @return CHAIN_ID - 链路ID
     */
    public Long getChainId() {
        return chainId;
    }

    /**
     * 设置链路ID
     *
     * @param chainId 链路ID
     */
    public void setChainId(Long chainId) {
        this.chainId = chainId;
    }

    /**
     * 获取链路名称
     *
     * @return CHAIN_NAME - 链路名称
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * 设置链路名称
     *
     * @param chainName 链路名称
     */
    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    /**
     * 获取系统id
     *
     * @return SYSTEM_ID - 系统id
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * 设置系统id
     *
     * @param systemId 系统id
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * 获取产品id
     *
     * @return PRODUCT_ID - 产品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品id
     *
     * @param productId 产品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取交易类型
     *
     * @return TRAN_CODE - 交易类型
     */
    public String getTranCode() {
        return tranCode;
    }

    /**
     * 设置交易类型
     *
     * @param tranCode 交易类型
     */
    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    /**
     * 获取子交易类型
     *
     * @return SUB_TRAN_CODE - 子交易类型
     */
    public String getSubTranCode() {
        return subTranCode;
    }

    /**
     * 设置子交易类型
     *
     * @param subTranCode 子交易类型
     */
    public void setSubTranCode(String subTranCode) {
        this.subTranCode = subTranCode;
    }

    /**
     * 获取宽度
     *
     * @return WIDTH - 宽度
     */
    public String getWidth() {
        return width;
    }

    /**
     * 设置宽度
     *
     * @param width 宽度
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * 获取高度
     *
     * @return HEIGHT - 高度
     */
    public String getHeight() {
        return height;
    }

    /**
     * 设置高度
     *
     * @param height 高度
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_DATE - 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建时间
     *
     * @param createdDate 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取最后修改时间
     *
     * @return LAST_UPDATE_DATE - 最后修改时间
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastUpdateDate 最后修改时间
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * 获取是否删除
     *
     * @return IS_DELETED - 是否删除
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取状态
     *
     * @return STATUS_CODE - 状态
     */
    public Byte getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态
     *
     * @param statusCode 状态
     */
    public void setStatusCode(Byte statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 获取扩展信息
     *
     * @return EXTEND_INFO - 扩展信息
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    /**
     * 设置扩展信息
     *
     * @param extendInfo 扩展信息
     */
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }
}