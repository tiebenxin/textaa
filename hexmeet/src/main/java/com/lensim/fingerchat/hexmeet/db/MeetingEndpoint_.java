package com.lensim.fingerchat.hexmeet.db;



// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import de.greenrobot.dao.DaoException;

/**
 * Entity mapped to table "MEETING_ENDPOINT_".
 */
public class MeetingEndpoint_ {

  private Long id;
  private Long meetingId;
  private Long endpointId;

  /**
   * Used to resolve relations
   */
  private transient DaoSession daoSession;

  /**
   * Used for active entity operations.
   */
  private transient MeetingEndpoint_Dao myDao;

  private RestEndpoint_ endpoint;
  private Long endpoint__resolvedKey;

  private RestMeeting_ meeting;
  private Long meeting__resolvedKey;


  public MeetingEndpoint_() {
  }

  public MeetingEndpoint_(Long id) {
    this.id = id;
  }

  public MeetingEndpoint_(Long id, Long meetingId, Long endpointId) {
    this.id = id;
    this.meetingId = meetingId;
    this.endpointId = endpointId;
  }

  /**
   * called by internal mechanisms, do not call yourself.
   */
  public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getMeetingEndpoint_Dao() : null;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getMeetingId() {
    return meetingId;
  }

  public void setMeetingId(Long meetingId) {
    this.meetingId = meetingId;
  }

  public Long getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(Long endpointId) {
    this.endpointId = endpointId;
  }

  /**
   * To-one relationship, resolved on first access.
   */
  public RestEndpoint_ getEndpoint() {
    Long __key = this.endpointId;
    if (endpoint__resolvedKey == null || !endpoint__resolvedKey.equals(__key)) {
      if (daoSession == null) {
        throw new DaoException("Entity is detached from DAO context");
      }
      RestEndpoint_Dao targetDao = daoSession.getRestEndpoint_Dao();
      RestEndpoint_ endpointNew = targetDao.load(__key);
      synchronized (this) {
        endpoint = endpointNew;
        endpoint__resolvedKey = __key;
      }
    }
    return endpoint;
  }

  public void setEndpoint(RestEndpoint_ endpoint) {
    synchronized (this) {
      this.endpoint = endpoint;
      endpointId = endpoint == null ? null : endpoint.getId();
      endpoint__resolvedKey = endpointId;
    }
  }

  /**
   * To-one relationship, resolved on first access.
   */
  public RestMeeting_ getMeeting() {
    Long __key = this.meetingId;
    if (meeting__resolvedKey == null || !meeting__resolvedKey.equals(__key)) {
      if (daoSession == null) {
        throw new DaoException("Entity is detached from DAO context");
      }
      RestMeeting_Dao targetDao = daoSession.getRestMeeting_Dao();
      RestMeeting_ meetingNew = targetDao.load(__key);
      synchronized (this) {
        meeting = meetingNew;
        meeting__resolvedKey = __key;
      }
    }
    return meeting;
  }

  public void setMeeting(RestMeeting_ meeting) {
    synchronized (this) {
      this.meeting = meeting;
      meetingId = meeting == null ? null : meeting.getId();
      meeting__resolvedKey = meetingId;
    }
  }

  /**
   * Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context.
   */
  public void delete() {
    if (myDao == null) {
      throw new DaoException("Entity is detached from DAO context");
    }
    myDao.delete(this);
  }

  /**
   * Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context.
   */
  public void update() {
    if (myDao == null) {
      throw new DaoException("Entity is detached from DAO context");
    }
    myDao.update(this);
  }

  /**
   * Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context.
   */
  public void refresh() {
    if (myDao == null) {
      throw new DaoException("Entity is detached from DAO context");
    }
    myDao.refresh(this);
  }

}