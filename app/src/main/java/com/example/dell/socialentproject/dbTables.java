package com.example.dell.socialentproject;

import android.provider.BaseColumns;

public final class dbTables {
    private dbTables() {}

    public static class User implements BaseColumns {
        public static final String TABLE_USER = "user";
        public static final String COLUMN_USER_NAME = "name";
        public static final String COLUMN_USER_EMAIL = "email";
        public static final String COLUMN_USER_PHONE = "phone";
        public static final String COLUMN_USER_ADDRESS = "address";
        public static final String COLUMN_USER_WARD = "ward";
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + User.TABLE_USER + " (" +
                        User._ID + " INTEGER PRIMARY KEY," +
                        User.COLUMN_USER_NAME + " TEXT," +
                        User.COLUMN_USER_EMAIL + " TEXT," +
                        User.COLUMN_USER_PHONE + " TEXT," +
                        User.COLUMN_USER_ADDRESS + " TEXT," +
                        User.COLUMN_USER_WARD+ " TEXT)";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + User.TABLE_USER;
        public static String getSqlCreateEntries() {
            return SQL_CREATE_ENTRIES;
        }

        public static String getSqlDeleteEntries(){
            return SQL_DELETE_ENTRIES;
        }

    }
}


