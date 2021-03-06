package com.lensim.fingerchat.commons.global;

/**
 * Created by LL130386 on 2017/12/21.
 */

public class CommonEnum {

    public enum ESearchTabs {
        DEFAULT(0),
        ACCOUT(1),
        PHONE_NUM(2),
        NICK(3),
        REAL_NAME(4),
        DEPARTMENT(5),
        SEARCH_TYPE(6);

        public final int value;

        ESearchTabs(int value) {
            this.value = value;
        }

        public static ESearchTabs fromInt(int value) {
            ESearchTabs result = null;
            for (ESearchTabs item : ESearchTabs.values()) {
                if (item.value == value) {
                    result = item;
                    break;
                }
            }
            if (result == null) {
                throw new IllegalArgumentException("ESearchTabs - fromInt");
            }
            return result;
        }
    }

    /*
    * 上传文件类型
    * */
    public enum EUploadFileType {
        JPG(1),
        GIF(2),
        VIDEO(2),
        VOICE(2),
        FILE(2);


        public final int value;

        EUploadFileType(int value) {
            this.value = value;
        }

        public static EUploadFileType fromInt(int value) {
            EUploadFileType result = null;
            for (EUploadFileType item : values()) {
                if (item.value == value) {
                    result = item;
                    break;
                }
            }
            if (result == null) {
                throw new IllegalArgumentException("EUploadFileType - fromInt");
            }
            return result;
        }
    }

    /*
      * 上传文件类型
      * */
    public enum EProgressType {
        PROGRES(1),
        SUCCESS(2),
        FAILED(2);

        public final int value;

        EProgressType(int value) {
            this.value = value;
        }

        public static EProgressType fromInt(int value) {
            EProgressType result = null;
            for (EProgressType item : values()) {
                if (item.value == value) {
                    result = item;
                    break;
                }
            }
            if (result == null) {
                throw new IllegalArgumentException("EProgressType - fromInt");
            }
            return result;
        }
    }


    /*
      * 日志水平
      * */
    public enum ELogLevel {
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        FATAL(5);

        public final int value;

        ELogLevel(int value) {
            this.value = value;
        }

        public static ELogLevel fromInt(int value) {
            ELogLevel result = null;
            for (ELogLevel item : values()) {
                if (item.value == value) {
                    result = item;
                    break;
                }
            }
            if (result == null) {
                result = INFO;
            }
            return result;
        }
    }

    /*
    * 日志op类型
    * */
    public enum ELogType {
        LOGIN(1),
        COPY(2),
        ERROR(3);

        public final int value;

        ELogType(int value) {
            this.value = value;
        }

        public static ELogType fromInt(int value) {
            ELogType result = null;
            for (ELogType item : values()) {
                if (item.value == value) {
                    result = item;
                    break;
                }
            }
            if (result == null) {
                result = ERROR;
            }
            return result;
        }
    }


}
