package com.lensim.fingerchat.hexmeet.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "REST_USER_".
 */
public class RestUser_Dao extends AbstractDao<RestUser_, Long> {

  public static final String TABLENAME = "REST_USER_";

  /**
   * Properties of entity RestUser_.<br/>
   * Can be used for QueryBuilder and for referencing column names.
   */
  public static class Properties {

    public final static Property Id = new Property(0, Long.class, "id", true, "_id");
    public final static Property Name = new Property(1, String.class, "name", false, "NAME");
    public final static Property DisplayName = new Property(2, String.class, "displayName", false, "DISPLAY_NAME");
    public final static Property Email = new Property(3, String.class, "email", false, "EMAIL");
    public final static Property Telephone = new Property(4, String.class, "telephone", false, "TELEPHONE");
    public final static Property Cellphone = new Property(5, String.class, "cellphone", false, "CELLPHONE");
    public final static Property UnitId = new Property(6, Integer.class, "unitId", false, "UNIT_ID");
    public final static Property UnitName = new Property(7, String.class, "unitName", false, "UNIT_NAME");
    public final static Property DepartmentId = new Property(8, Integer.class, "departmentId", false, "DEPARTMENT_ID");
    public final static Property DepName = new Property(9, String.class, "depName", false, "DEP_NAME");
    public final static Property OrgId = new Property(10, Integer.class, "orgId", false, "ORG_ID");
    public final static Property OrgName = new Property(11, String.class, "orgName", false, "ORG_NAME");
    public final static Property H323ConfNumber = new Property(12, String.class, "h323ConfNumber", false, "H323_CONF_NUMBER");
    public final static Property SipConfNumber = new Property(13, String.class, "sipConfNumber", false, "SIP_CONF_NUMBER");
    public final static Property Pstn = new Property(14, String.class, "pstn", false, "PSTN");
    public final static Property Description = new Property(15, String.class, "description", false, "DESCRIPTION");
    public final static Property CallNumber = new Property(16, String.class, "callNumber", false, "CALL_NUMBER");
    public final static Property ImageURL = new Property(17, String.class, "imageURL", false, "IMAGE_URL");
    public final static Property LastModifiedTime = new Property(18, Long.class, "lastModifiedTime", false, "LAST_MODIFIED_TIME");
  }

  ;


  public RestUser_Dao(DaoConfig config) {
    super(config);
  }

  public RestUser_Dao(DaoConfig config, DaoSession daoSession) {
    super(config, daoSession);
  }

  /**
   * Creates the underlying database table.
   */
  public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
    String constraint = ifNotExists ? "IF NOT EXISTS " : "";
    db.execSQL("CREATE TABLE " + constraint + "\"REST_USER_\" (" + //
        "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
        "\"NAME\" TEXT," + // 1: name
        "\"DISPLAY_NAME\" TEXT," + // 2: displayName
        "\"EMAIL\" TEXT," + // 3: email
        "\"TELEPHONE\" TEXT," + // 4: telephone
        "\"CELLPHONE\" TEXT," + // 5: cellphone
        "\"UNIT_ID\" INTEGER," + // 6: unitId
        "\"UNIT_NAME\" TEXT," + // 7: unitName
        "\"DEPARTMENT_ID\" INTEGER," + // 8: departmentId
        "\"DEP_NAME\" TEXT," + // 9: depName
        "\"ORG_ID\" INTEGER," + // 10: orgId
        "\"ORG_NAME\" TEXT," + // 11: orgName
        "\"H323_CONF_NUMBER\" TEXT," + // 12: h323ConfNumber
        "\"SIP_CONF_NUMBER\" TEXT," + // 13: sipConfNumber
        "\"PSTN\" TEXT," + // 14: pstn
        "\"DESCRIPTION\" TEXT," + // 15: description
        "\"CALL_NUMBER\" TEXT," + // 16: callNumber
        "\"IMAGE_URL\" TEXT," + // 17: imageURL
        "\"LAST_MODIFIED_TIME\" INTEGER);"); // 18: lastModifiedTime
  }

  /**
   * Drops the underlying database table.
   */
  public static void dropTable(SQLiteDatabase db, boolean ifExists) {
    String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"REST_USER_\"";
    db.execSQL(sql);
  }

  /**
   * @inheritdoc
   */
  @Override
  protected void bindValues(SQLiteStatement stmt, RestUser_ entity) {
    stmt.clearBindings();

    Long id = entity.getId();
    if (id != null) {
      stmt.bindLong(1, id);
    }

    String name = entity.getName();
    if (name != null) {
      stmt.bindString(2, name);
    }

    String displayName = entity.getDisplayName();
    if (displayName != null) {
      stmt.bindString(3, displayName);
    }

    String email = entity.getEmail();
    if (email != null) {
      stmt.bindString(4, email);
    }

    String telephone = entity.getTelephone();
    if (telephone != null) {
      stmt.bindString(5, telephone);
    }

    String cellphone = entity.getCellphone();
    if (cellphone != null) {
      stmt.bindString(6, cellphone);
    }

    Integer unitId = entity.getUnitId();
    if (unitId != null) {
      stmt.bindLong(7, unitId);
    }

    String unitName = entity.getUnitName();
    if (unitName != null) {
      stmt.bindString(8, unitName);
    }

    Integer departmentId = entity.getDepartmentId();
    if (departmentId != null) {
      stmt.bindLong(9, departmentId);
    }

    String depName = entity.getDepName();
    if (depName != null) {
      stmt.bindString(10, depName);
    }

    Integer orgId = entity.getOrgId();
    if (orgId != null) {
      stmt.bindLong(11, orgId);
    }

    String orgName = entity.getOrgName();
    if (orgName != null) {
      stmt.bindString(12, orgName);
    }

    String h323ConfNumber = entity.getH323ConfNumber();
    if (h323ConfNumber != null) {
      stmt.bindString(13, h323ConfNumber);
    }

    String sipConfNumber = entity.getSipConfNumber();
    if (sipConfNumber != null) {
      stmt.bindString(14, sipConfNumber);
    }

    String pstn = entity.getPstn();
    if (pstn != null) {
      stmt.bindString(15, pstn);
    }

    String description = entity.getDescription();
    if (description != null) {
      stmt.bindString(16, description);
    }

    String callNumber = entity.getCallNumber();
    if (callNumber != null) {
      stmt.bindString(17, callNumber);
    }

    String imageURL = entity.getImageURL();
    if (imageURL != null) {
      stmt.bindString(18, imageURL);
    }

    Long lastModifiedTime = entity.getLastModifiedTime();
    if (lastModifiedTime != null) {
      stmt.bindLong(19, lastModifiedTime);
    }
  }

  /**
   * @inheritdoc
   */
  @Override
  public Long readKey(Cursor cursor, int offset) {
    return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
  }

  /**
   * @inheritdoc
   */
  @Override
  public RestUser_ readEntity(Cursor cursor, int offset) {
    RestUser_ entity = new RestUser_( //
        cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
        cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
        cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // displayName
        cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // email
        cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // telephone
        cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // cellphone
        cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // unitId
        cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // unitName
        cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // departmentId
        cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // depName
        cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // orgId
        cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // orgName
        cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // h323ConfNumber
        cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // sipConfNumber
        cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // pstn
        cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // description
        cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // callNumber
        cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // imageURL
        cursor.isNull(offset + 18) ? null : cursor.getLong(offset + 18) // lastModifiedTime
    );
    return entity;
  }

  /**
   * @inheritdoc
   */
  @Override
  public void readEntity(Cursor cursor, RestUser_ entity, int offset) {
    entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
    entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
    entity.setDisplayName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
    entity.setEmail(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
    entity.setTelephone(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
    entity.setCellphone(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
    entity.setUnitId(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
    entity.setUnitName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
    entity.setDepartmentId(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
    entity.setDepName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
    entity.setOrgId(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
    entity.setOrgName(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
    entity.setH323ConfNumber(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
    entity.setSipConfNumber(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
    entity.setPstn(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
    entity.setDescription(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
    entity.setCallNumber(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
    entity.setImageURL(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
    entity.setLastModifiedTime(cursor.isNull(offset + 18) ? null : cursor.getLong(offset + 18));
  }

  /**
   * @inheritdoc
   */
  @Override
  protected Long updateKeyAfterInsert(RestUser_ entity, long rowId) {
    entity.setId(rowId);
    return rowId;
  }

  /**
   * @inheritdoc
   */
  @Override
  public Long getKey(RestUser_ entity) {
    if (entity != null) {
      return entity.getId();
    } else {
      return null;
    }
  }

  /**
   * @inheritdoc
   */
  @Override
  protected boolean isEntityUpdateable() {
    return true;
  }

}