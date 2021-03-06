package com.cn.lucky.morning.model.domain;

import java.sql.Timestamp;

public class SystemNotification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_system_notification.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_system_notification.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_system_notification.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_system_notification.created
     *
     * @mbg.generated
     */
    private Timestamp created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_system_notification.updated
     *
     * @mbg.generated
     */
    private Timestamp updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_system_notification.id
     *
     * @return the value of m_system_notification.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_system_notification.id
     *
     * @param id the value for m_system_notification.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_system_notification.title
     *
     * @return the value of m_system_notification.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_system_notification.title
     *
     * @param title the value for m_system_notification.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_system_notification.content
     *
     * @return the value of m_system_notification.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_system_notification.content
     *
     * @param content the value for m_system_notification.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_system_notification.created
     *
     * @return the value of m_system_notification.created
     *
     * @mbg.generated
     */
    public Timestamp getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_system_notification.created
     *
     * @param created the value for m_system_notification.created
     *
     * @mbg.generated
     */
    public void setCreated(Timestamp created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_system_notification.updated
     *
     * @return the value of m_system_notification.updated
     *
     * @mbg.generated
     */
    public Timestamp getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_system_notification.updated
     *
     * @param updated the value for m_system_notification.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
}