package com.chanchuan.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.chanchuan.bean.DatasBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DATAS_BEAN".
*/
public class DatasBeanDao extends AbstractDao<DatasBean, Long> {

    public static final String TABLENAME = "DATAS_BEAN";

    /**
     * Properties of entity DatasBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Db_id = new Property(0, Long.class, "db_id", true, "_id");
        public final static Property Id = new Property(1, String.class, "id", false, "ID");
        public final static Property Uid = new Property(2, String.class, "uid", false, "UID");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property Excerpt = new Property(5, String.class, "excerpt", false, "EXCERPT");
        public final static Property Lead = new Property(6, String.class, "lead", false, "LEAD");
        public final static Property Model = new Property(7, String.class, "model", false, "MODEL");
        public final static Property Position = new Property(8, String.class, "position", false, "POSITION");
        public final static Property Thumbnail = new Property(9, String.class, "thumbnail", false, "THUMBNAIL");
        public final static Property Create_time = new Property(10, String.class, "create_time", false, "CREATE_TIME");
        public final static Property Update_time = new Property(11, String.class, "update_time", false, "UPDATE_TIME");
        public final static Property Status = new Property(12, String.class, "status", false, "STATUS");
        public final static Property Video = new Property(13, String.class, "video", false, "VIDEO");
        public final static Property Fm = new Property(14, String.class, "fm", false, "FM");
        public final static Property Link_url = new Property(15, String.class, "link_url", false, "LINK_URL");
        public final static Property Publish_time = new Property(16, String.class, "publish_time", false, "PUBLISH_TIME");
        public final static Property View = new Property(17, String.class, "view", false, "VIEW");
        public final static Property Share = new Property(18, String.class, "share", false, "SHARE");
        public final static Property Comment = new Property(19, String.class, "comment", false, "COMMENT");
        public final static Property Good = new Property(20, String.class, "good", false, "GOOD");
        public final static Property Bookmark = new Property(21, String.class, "bookmark", false, "BOOKMARK");
        public final static Property Show_uid = new Property(22, String.class, "show_uid", false, "SHOW_UID");
        public final static Property Fm_play = new Property(23, String.class, "fm_play", false, "FM_PLAY");
        public final static Property Lunar_type = new Property(24, String.class, "lunar_type", false, "LUNAR_TYPE");
        public final static Property Html5 = new Property(25, String.class, "html5", false, "HTML5");
        public final static Property Author = new Property(26, String.class, "author", false, "AUTHOR");
        public final static Property Tpl = new Property(27, int.class, "tpl", false, "TPL");
        public final static Property Avatar = new Property(28, String.class, "avatar", false, "AVATAR");
        public final static Property Discover = new Property(29, String.class, "discover", false, "DISCOVER");
        public final static Property Category = new Property(30, String.class, "category", false, "CATEGORY");
        public final static Property ParseXML = new Property(31, int.class, "parseXML", false, "PARSE_XML");
        public final static Property IsCollect = new Property(32, boolean.class, "isCollect", false, "IS_COLLECT");
    }


    public DatasBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DatasBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DATAS_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: db_id
                "\"ID\" TEXT," + // 1: id
                "\"UID\" TEXT," + // 2: uid
                "\"NAME\" TEXT," + // 3: name
                "\"TITLE\" TEXT," + // 4: title
                "\"EXCERPT\" TEXT," + // 5: excerpt
                "\"LEAD\" TEXT," + // 6: lead
                "\"MODEL\" TEXT," + // 7: model
                "\"POSITION\" TEXT," + // 8: position
                "\"THUMBNAIL\" TEXT," + // 9: thumbnail
                "\"CREATE_TIME\" TEXT," + // 10: create_time
                "\"UPDATE_TIME\" TEXT," + // 11: update_time
                "\"STATUS\" TEXT," + // 12: status
                "\"VIDEO\" TEXT," + // 13: video
                "\"FM\" TEXT," + // 14: fm
                "\"LINK_URL\" TEXT," + // 15: link_url
                "\"PUBLISH_TIME\" TEXT," + // 16: publish_time
                "\"VIEW\" TEXT," + // 17: view
                "\"SHARE\" TEXT," + // 18: share
                "\"COMMENT\" TEXT," + // 19: comment
                "\"GOOD\" TEXT," + // 20: good
                "\"BOOKMARK\" TEXT," + // 21: bookmark
                "\"SHOW_UID\" TEXT," + // 22: show_uid
                "\"FM_PLAY\" TEXT," + // 23: fm_play
                "\"LUNAR_TYPE\" TEXT," + // 24: lunar_type
                "\"HTML5\" TEXT," + // 25: html5
                "\"AUTHOR\" TEXT," + // 26: author
                "\"TPL\" INTEGER NOT NULL ," + // 27: tpl
                "\"AVATAR\" TEXT," + // 28: avatar
                "\"DISCOVER\" TEXT," + // 29: discover
                "\"CATEGORY\" TEXT," + // 30: category
                "\"PARSE_XML\" INTEGER NOT NULL ," + // 31: parseXML
                "\"IS_COLLECT\" INTEGER NOT NULL );"); // 32: isCollect
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DATAS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DatasBean entity) {
        stmt.clearBindings();
 
        Long db_id = entity.getDb_id();
        if (db_id != null) {
            stmt.bindLong(1, db_id);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(3, uid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String excerpt = entity.getExcerpt();
        if (excerpt != null) {
            stmt.bindString(6, excerpt);
        }
 
        String lead = entity.getLead();
        if (lead != null) {
            stmt.bindString(7, lead);
        }
 
        String model = entity.getModel();
        if (model != null) {
            stmt.bindString(8, model);
        }
 
        String position = entity.getPosition();
        if (position != null) {
            stmt.bindString(9, position);
        }
 
        String thumbnail = entity.getThumbnail();
        if (thumbnail != null) {
            stmt.bindString(10, thumbnail);
        }
 
        String create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindString(11, create_time);
        }
 
        String update_time = entity.getUpdate_time();
        if (update_time != null) {
            stmt.bindString(12, update_time);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(13, status);
        }
 
        String video = entity.getVideo();
        if (video != null) {
            stmt.bindString(14, video);
        }
 
        String fm = entity.getFm();
        if (fm != null) {
            stmt.bindString(15, fm);
        }
 
        String link_url = entity.getLink_url();
        if (link_url != null) {
            stmt.bindString(16, link_url);
        }
 
        String publish_time = entity.getPublish_time();
        if (publish_time != null) {
            stmt.bindString(17, publish_time);
        }
 
        String view = entity.getView();
        if (view != null) {
            stmt.bindString(18, view);
        }
 
        String share = entity.getShare();
        if (share != null) {
            stmt.bindString(19, share);
        }
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(20, comment);
        }
 
        String good = entity.getGood();
        if (good != null) {
            stmt.bindString(21, good);
        }
 
        String bookmark = entity.getBookmark();
        if (bookmark != null) {
            stmt.bindString(22, bookmark);
        }
 
        String show_uid = entity.getShow_uid();
        if (show_uid != null) {
            stmt.bindString(23, show_uid);
        }
 
        String fm_play = entity.getFm_play();
        if (fm_play != null) {
            stmt.bindString(24, fm_play);
        }
 
        String lunar_type = entity.getLunar_type();
        if (lunar_type != null) {
            stmt.bindString(25, lunar_type);
        }
 
        String html5 = entity.getHtml5();
        if (html5 != null) {
            stmt.bindString(26, html5);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(27, author);
        }
        stmt.bindLong(28, entity.getTpl());
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(29, avatar);
        }
 
        String discover = entity.getDiscover();
        if (discover != null) {
            stmt.bindString(30, discover);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(31, category);
        }
        stmt.bindLong(32, entity.getParseXML());
        stmt.bindLong(33, entity.getIsCollect() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DatasBean entity) {
        stmt.clearBindings();
 
        Long db_id = entity.getDb_id();
        if (db_id != null) {
            stmt.bindLong(1, db_id);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(3, uid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String excerpt = entity.getExcerpt();
        if (excerpt != null) {
            stmt.bindString(6, excerpt);
        }
 
        String lead = entity.getLead();
        if (lead != null) {
            stmt.bindString(7, lead);
        }
 
        String model = entity.getModel();
        if (model != null) {
            stmt.bindString(8, model);
        }
 
        String position = entity.getPosition();
        if (position != null) {
            stmt.bindString(9, position);
        }
 
        String thumbnail = entity.getThumbnail();
        if (thumbnail != null) {
            stmt.bindString(10, thumbnail);
        }
 
        String create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindString(11, create_time);
        }
 
        String update_time = entity.getUpdate_time();
        if (update_time != null) {
            stmt.bindString(12, update_time);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(13, status);
        }
 
        String video = entity.getVideo();
        if (video != null) {
            stmt.bindString(14, video);
        }
 
        String fm = entity.getFm();
        if (fm != null) {
            stmt.bindString(15, fm);
        }
 
        String link_url = entity.getLink_url();
        if (link_url != null) {
            stmt.bindString(16, link_url);
        }
 
        String publish_time = entity.getPublish_time();
        if (publish_time != null) {
            stmt.bindString(17, publish_time);
        }
 
        String view = entity.getView();
        if (view != null) {
            stmt.bindString(18, view);
        }
 
        String share = entity.getShare();
        if (share != null) {
            stmt.bindString(19, share);
        }
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(20, comment);
        }
 
        String good = entity.getGood();
        if (good != null) {
            stmt.bindString(21, good);
        }
 
        String bookmark = entity.getBookmark();
        if (bookmark != null) {
            stmt.bindString(22, bookmark);
        }
 
        String show_uid = entity.getShow_uid();
        if (show_uid != null) {
            stmt.bindString(23, show_uid);
        }
 
        String fm_play = entity.getFm_play();
        if (fm_play != null) {
            stmt.bindString(24, fm_play);
        }
 
        String lunar_type = entity.getLunar_type();
        if (lunar_type != null) {
            stmt.bindString(25, lunar_type);
        }
 
        String html5 = entity.getHtml5();
        if (html5 != null) {
            stmt.bindString(26, html5);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(27, author);
        }
        stmt.bindLong(28, entity.getTpl());
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(29, avatar);
        }
 
        String discover = entity.getDiscover();
        if (discover != null) {
            stmt.bindString(30, discover);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(31, category);
        }
        stmt.bindLong(32, entity.getParseXML());
        stmt.bindLong(33, entity.getIsCollect() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DatasBean readEntity(Cursor cursor, int offset) {
        DatasBean entity = new DatasBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // db_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // uid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // excerpt
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // lead
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // model
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // position
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // thumbnail
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // create_time
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // update_time
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // status
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // video
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // fm
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // link_url
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // publish_time
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // view
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // share
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // comment
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // good
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // bookmark
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // show_uid
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // fm_play
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // lunar_type
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // html5
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // author
            cursor.getInt(offset + 27), // tpl
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // avatar
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // discover
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // category
            cursor.getInt(offset + 31), // parseXML
            cursor.getShort(offset + 32) != 0 // isCollect
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DatasBean entity, int offset) {
        entity.setDb_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setExcerpt(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLead(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setModel(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPosition(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setThumbnail(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setCreate_time(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setUpdate_time(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setStatus(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setVideo(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setFm(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setLink_url(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setPublish_time(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setView(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setShare(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setComment(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setGood(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setBookmark(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setShow_uid(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setFm_play(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setLunar_type(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setHtml5(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setAuthor(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setTpl(cursor.getInt(offset + 27));
        entity.setAvatar(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setDiscover(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setCategory(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setParseXML(cursor.getInt(offset + 31));
        entity.setIsCollect(cursor.getShort(offset + 32) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DatasBean entity, long rowId) {
        entity.setDb_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DatasBean entity) {
        if(entity != null) {
            return entity.getDb_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DatasBean entity) {
        return entity.getDb_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
