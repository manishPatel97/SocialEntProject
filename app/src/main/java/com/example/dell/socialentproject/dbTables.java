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

    public static class Problem implements BaseColumns {
        public static final String TABLE_PROBLEM = "problem";
        public static final String COLUMN_PROBLEM_USER = "user";
        public static final String COLUMN_PROBLEM_CONS = "councillor";
        public static final String COLUMN_PROBLEM_TOPIC = "topic";
        public static final String COLUMN_PROBLEM_PROBLEM = "problem";
        public static final String COLUMN_PROBLEM_ADDRESS = "address";
        public static final String COLUMN_PROBLEM_IMAGE = "image";
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Problem.TABLE_PROBLEM + " (" +
                        Problem._ID + " INTEGER PRIMARY KEY," +
                        Problem.COLUMN_PROBLEM_USER + "INTEGER, "+
                        "FOREIGN KEY ("+COLUMN_PROBLEM_USER+ ") REFERENCES "+ User.TABLE_USER + "("+ User._ID +"), "+
                        Problem.COLUMN_PROBLEM_CONS + "INTEGER, "+
                        "FOREIGN KEY ("+COLUMN_PROBLEM_CONS+ ") REFERENCES "+ User.TABLE_USER + "("+ User._ID +"), "+
                        Problem.COLUMN_PROBLEM_TOPIC + " TEXT," +
                        Problem.COLUMN_PROBLEM_PROBLEM + " TEXT," +
                        Problem.COLUMN_PROBLEM_ADDRESS + " TEXT, " +
                        Problem.COLUMN_PROBLEM_IMAGE + " BLOB)";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Problem.TABLE_PROBLEM;
        public static String getSqlCreateEntries() {
            return SQL_CREATE_ENTRIES;
        }

        public static String getSqlDeleteEntries(){
            return SQL_DELETE_ENTRIES;
        }

    }

    public static class Event implements BaseColumns {
        public static final String TABLE_EVENT = "event";
        public static final String COLUMN_EVENT_USER = "user";
        public static final String COLUMN_EVENT_TOPIC = "topic";
        public static final String COLUMN_EVENT_EVENT = "problem";
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Event.TABLE_EVENT + " (" +
                        Event._ID + " INTEGER PRIMARY KEY," +
                        Event.COLUMN_EVENT_USER + "INTEGER, "+
                        "FOREIGN KEY ("+COLUMN_EVENT_USER+ ") REFERENCES "+ User.TABLE_USER + "("+ User._ID +"), "+
                        Event.COLUMN_EVENT_TOPIC + " TEXT," +
                        Event.COLUMN_EVENT_EVENT + " TEXT)";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Event.TABLE_EVENT;
        public static String getSqlCreateEntries() {
            return SQL_CREATE_ENTRIES;
        }

        public static String getSqlDeleteEntries(){
            return SQL_DELETE_ENTRIES;
        }

    }

    public static class Pol_Info implements BaseColumns {
        public static final String TABLE_POL_INFO = "pol_info";
        public static final String COLUMN_POL_INFO_NAME = "name";
        public static final String COLUMN_POL_INFO_PARTY = "party";
        public static final String COLUMN_POL_INFO_AGE = "age";
        public static final String COLUMN_POL_INFO_ADDRESS = "address";
        public static final String COLUMN_POL_INFO_SPOUSE = "spouse";
        public static final String COLUMN_POL_INFO_PROF = "profession";
        public static final String COLUMN_POL_INFO_SPOUSE_PROF = "spouse_profession";
        public static final String COLUMN_POL_INFO_PHONE = "phone";
        public static final String COLUMN_POL_INFO_EDU_QUAL = "edu_qualification";
        public static final String COLUMN_POL_INFO_ASSET = "assets";
        public static final String COLUMN_POL_INFO_CRIM = "criminal_record";
        public static final String COLUMN_POL_INFO_WARD = "ward";
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Pol_Info.TABLE_POL_INFO + " (" +
                        Pol_Info._ID + " INTEGER PRIMARY KEY," +
                        Pol_Info.COLUMN_POL_INFO_NAME + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_PARTY + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_AGE + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_ADDRESS + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_SPOUSE + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_PROF + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_SPOUSE_PROF + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_PHONE + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_EDU_QUAL + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_ASSET + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_CRIM + " TEXT," +
                        Pol_Info.COLUMN_POL_INFO_WARD+ " TEXT)";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Pol_Info.TABLE_POL_INFO;
        public static String getSqlCreateEntries() {
            return SQL_CREATE_ENTRIES;
        }

        public static String getSqlDeleteEntries(){
            return SQL_DELETE_ENTRIES;
        }

    }
}


