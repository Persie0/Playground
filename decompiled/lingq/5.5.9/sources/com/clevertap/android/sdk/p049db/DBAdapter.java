package com.clevertap.android.sdk.p049db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.C0141b;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p408u6.C9473l;

/* JADX INFO: loaded from: classes.dex */
public final class DBAdapter {

    /* JADX INFO: renamed from: d */
    public static final String f11023d;

    /* JADX INFO: renamed from: e */
    public static final String f11024e;

    /* JADX INFO: renamed from: f */
    public static final String f11025f;

    /* JADX INFO: renamed from: g */
    public static final String f11026g;

    /* JADX INFO: renamed from: h */
    public static final String f11027h;

    /* JADX INFO: renamed from: i */
    public static final String f11028i;

    /* JADX INFO: renamed from: j */
    public static final String f11029j;

    /* JADX INFO: renamed from: k */
    public static final String f11030k;

    /* JADX INFO: renamed from: l */
    public static final String f11031l;

    /* JADX INFO: renamed from: m */
    public static final String f11032m;

    /* JADX INFO: renamed from: n */
    public static final String f11033n;

    /* JADX INFO: renamed from: o */
    public static final String f11034o;

    /* JADX INFO: renamed from: p */
    public static final String f11035p;

    /* JADX INFO: renamed from: q */
    public static final String f11036q;

    /* JADX INFO: renamed from: r */
    public static final String f11037r;

    /* JADX INFO: renamed from: s */
    public static final String f11038s;

    /* JADX INFO: renamed from: a */
    public final CleverTapInstanceConfig f11039a;

    /* JADX INFO: renamed from: b */
    public final C2183a f11040b;

    /* JADX INFO: renamed from: c */
    public boolean f11041c;

    public enum Table {
        EVENTS("events"),
        PROFILE_EVENTS("profileEvents"),
        USER_PROFILES("userProfiles"),
        INBOX_MESSAGES("inboxMessages"),
        PUSH_NOTIFICATIONS("pushNotifications"),
        UNINSTALL_TS("uninstallTimestamp"),
        PUSH_NOTIFICATION_VIEWED("notificationViewed");

        private final String tableName;

        Table(String str) {
            this.tableName = str;
        }

        public String getName() {
            return this.tableName;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.db.DBAdapter$a */
    public static class C2183a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a */
        public final File f11042a;

        public C2183a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
            this.f11042a = context.getDatabasePath(str);
        }

        /* JADX INFO: renamed from: a */
        public final void m6477a() {
            close();
            this.f11042a.delete();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        @SuppressLint({"SQLiteString"})
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            C2181a.m6455h("Creating CleverTap DB");
            String str = DBAdapter.f11023d;
            C0141b.m621q("Executing - ", str, sQLiteDatabase.compileStatement(str));
            String str2 = DBAdapter.f11024e;
            C0141b.m621q("Executing - ", str2, sQLiteDatabase.compileStatement(str2));
            String str3 = DBAdapter.f11025f;
            C0141b.m621q("Executing - ", str3, sQLiteDatabase.compileStatement(str3));
            String str4 = DBAdapter.f11026g;
            C0141b.m621q("Executing - ", str4, sQLiteDatabase.compileStatement(str4));
            String str5 = DBAdapter.f11030k;
            C0141b.m621q("Executing - ", str5, sQLiteDatabase.compileStatement(str5));
            String str6 = DBAdapter.f11032m;
            C0141b.m621q("Executing - ", str6, sQLiteDatabase.compileStatement(str6));
            String str7 = DBAdapter.f11034o;
            C0141b.m621q("Executing - ", str7, sQLiteDatabase.compileStatement(str7));
            String str8 = DBAdapter.f11028i;
            C0141b.m621q("Executing - ", str8, sQLiteDatabase.compileStatement(str8));
            String str9 = DBAdapter.f11029j;
            C0141b.m621q("Executing - ", str9, sQLiteDatabase.compileStatement(str9));
            String str10 = DBAdapter.f11033n;
            C0141b.m621q("Executing - ", str10, sQLiteDatabase.compileStatement(str10));
            String str11 = DBAdapter.f11031l;
            C0141b.m621q("Executing - ", str11, sQLiteDatabase.compileStatement(str11));
            String str12 = DBAdapter.f11027h;
            C0141b.m621q("Executing - ", str12, sQLiteDatabase.compileStatement(str12));
            String str13 = DBAdapter.f11035p;
            C0141b.m621q("Executing - ", str13, sQLiteDatabase.compileStatement(str13));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        @SuppressLint({"SQLiteString"})
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C2181a.m6455h("Upgrading CleverTap DB to version " + i11);
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                String str = DBAdapter.f11038s;
                C0141b.m621q("Executing - ", str, sQLiteDatabase.compileStatement(str));
                String str2 = DBAdapter.f11034o;
                C0141b.m621q("Executing - ", str2, sQLiteDatabase.compileStatement(str2));
                String str3 = DBAdapter.f11035p;
                C0141b.m621q("Executing - ", str3, sQLiteDatabase.compileStatement(str3));
                return;
            }
            String str4 = DBAdapter.f11036q;
            C0141b.m621q("Executing - ", str4, sQLiteDatabase.compileStatement(str4));
            String str5 = DBAdapter.f11037r;
            C0141b.m621q("Executing - ", str5, sQLiteDatabase.compileStatement(str5));
            String str6 = DBAdapter.f11038s;
            C0141b.m621q("Executing - ", str6, sQLiteDatabase.compileStatement(str6));
            String str7 = DBAdapter.f11026g;
            C0141b.m621q("Executing - ", str7, sQLiteDatabase.compileStatement(str7));
            String str8 = DBAdapter.f11030k;
            C0141b.m621q("Executing - ", str8, sQLiteDatabase.compileStatement(str8));
            String str9 = DBAdapter.f11032m;
            C0141b.m621q("Executing - ", str9, sQLiteDatabase.compileStatement(str9));
            String str10 = DBAdapter.f11034o;
            C0141b.m621q("Executing - ", str10, sQLiteDatabase.compileStatement(str10));
            String str11 = DBAdapter.f11033n;
            C0141b.m621q("Executing - ", str11, sQLiteDatabase.compileStatement(str11));
            String str12 = DBAdapter.f11031l;
            C0141b.m621q("Executing - ", str12, sQLiteDatabase.compileStatement(str12));
            String str13 = DBAdapter.f11027h;
            C0141b.m621q("Executing - ", str13, sQLiteDatabase.compileStatement(str13));
            String str14 = DBAdapter.f11035p;
            C0141b.m621q("Executing - ", str14, sQLiteDatabase.compileStatement(str14));
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE ");
        Table table = Table.EVENTS;
        sb2.append(table.getName());
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);");
        f11023d = sb2.toString();
        StringBuilder sb3 = new StringBuilder("CREATE TABLE ");
        Table table2 = Table.PROFILE_EVENTS;
        sb3.append(table2.getName());
        sb3.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);");
        f11024e = sb3.toString();
        f11025f = "CREATE TABLE " + Table.USER_PROFILES.getName() + " (_id STRING UNIQUE PRIMARY KEY, data STRING NOT NULL);";
        StringBuilder sb4 = new StringBuilder("CREATE TABLE ");
        Table table3 = Table.INBOX_MESSAGES;
        sb4.append(table3.getName());
        sb4.append(" (_id STRING NOT NULL, data TEXT NOT NULL, wzrkParams TEXT NOT NULL, campaignId STRING NOT NULL, tags TEXT NOT NULL, isRead INTEGER NOT NULL DEFAULT 0, expires INTEGER NOT NULL, created_at INTEGER NOT NULL, messageUser STRING NOT NULL);");
        f11026g = sb4.toString();
        f11027h = "CREATE UNIQUE INDEX IF NOT EXISTS userid_id_idx ON " + table3.getName() + " (messageUser,_id);";
        f11028i = "CREATE INDEX IF NOT EXISTS time_idx ON " + table.getName() + " (created_at);";
        f11029j = "CREATE INDEX IF NOT EXISTS time_idx ON " + table2.getName() + " (created_at);";
        StringBuilder sb5 = new StringBuilder("CREATE TABLE ");
        Table table4 = Table.PUSH_NOTIFICATIONS;
        sb5.append(table4.getName());
        sb5.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL,isRead INTEGER NOT NULL);");
        f11030k = sb5.toString();
        f11031l = "CREATE INDEX IF NOT EXISTS time_idx ON " + table4.getName() + " (created_at);";
        StringBuilder sb6 = new StringBuilder("CREATE TABLE ");
        Table table5 = Table.UNINSTALL_TS;
        sb6.append(table5.getName());
        sb6.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, created_at INTEGER NOT NULL);");
        f11032m = sb6.toString();
        f11033n = "CREATE INDEX IF NOT EXISTS time_idx ON " + table5.getName() + " (created_at);";
        StringBuilder sb7 = new StringBuilder("CREATE TABLE ");
        Table table6 = Table.PUSH_NOTIFICATION_VIEWED;
        sb7.append(table6.getName());
        sb7.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);");
        f11034o = sb7.toString();
        f11035p = "CREATE INDEX IF NOT EXISTS time_idx ON " + table6.getName() + " (created_at);";
        StringBuilder sb8 = new StringBuilder("DROP TABLE IF EXISTS ");
        sb8.append(table5.getName());
        f11036q = sb8.toString();
        f11037r = "DROP TABLE IF EXISTS " + table3.getName();
        f11038s = "DROP TABLE IF EXISTS " + table6.getName();
    }

    public DBAdapter(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        String str;
        if (cleverTapInstanceConfig.f10988H) {
            str = "clevertap";
        } else {
            str = "clevertap_" + cleverTapInstanceConfig.f10995a;
        }
        this.f11041c = true;
        this.f11040b = new C2183a(context, str);
        this.f11039a = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6464a() {
        File file = this.f11040b.f11042a;
        if (file.exists() && Math.max(file.getUsableSpace(), 20971520L) < file.length()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m6465b(Table table, long j10) {
        C2183a c2183a = this.f11040b;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
        String name = table.getName();
        try {
            try {
                c2183a.getWritableDatabase().delete(name, "created_at <= " + jCurrentTimeMillis, null);
            } catch (SQLiteException e10) {
                m6470g().getClass();
                C2181a.m6459l("Error removing stale event records from " + name + ". Recreating DB.", e10);
                c2183a.m6477a();
            }
            c2183a.close();
        } catch (Throwable th2) {
            c2183a.close();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized void m6466c(String str, Table table) {
        String name = table.getName();
        try {
            try {
                this.f11040b.getWritableDatabase().delete(name, "_id <= " + str, null);
            } catch (SQLiteException unused) {
                m6470g().getClass();
                C2181a.m6458k("Error removing sent data from table " + name + " Recreating DB");
                this.f11040b.m6477a();
            }
            this.f11040b.close();
        } catch (Throwable th2) {
            this.f11040b.close();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: all -> 0x00c3, TryCatch #1 {, blocks: (B:3:0x0001, B:16:0x0062, B:30:0x00a5, B:25:0x0096, B:27:0x009e, B:39:0x00b5, B:41:0x00be, B:42:0x00c2), top: B:50:0x0001 }] */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00b4: MOVE (r10 I:??[OBJECT, ARRAY]) = (r0 I:??[OBJECT, ARRAY]), block:B:38:0x00b4 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized JSONObject m6467d(Table table) {
        SQLiteException e10;
        Cursor cursorQuery;
        Cursor cursor;
        String string;
        String name = table.getName();
        JSONArray jSONArray = new JSONArray();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = this.f11040b.getReadableDatabase().query(name, null, null, null, null, null, "created_at ASC", String.valueOf(50));
                string = null;
                while (cursorQuery.moveToNext()) {
                    try {
                        if (cursorQuery.isLast()) {
                            string = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                        }
                        try {
                            jSONArray.put(new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex("data"))));
                        } catch (JSONException unused) {
                        }
                    } catch (SQLiteException e11) {
                        e10 = e11;
                        m6470g().getClass();
                        C2181a.m6459l("Could not fetch records out of database " + name + ".", e10);
                        this.f11040b.close();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        string = null;
                    }
                }
                this.f11040b.close();
                cursorQuery.close();
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                this.f11040b.close();
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            this.f11040b.close();
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(string, jSONArray);
                return jSONObject;
            } catch (JSONException unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized String m6468e(String str) {
        String string;
        try {
            String name = Table.PUSH_NOTIFICATIONS.getName();
            string = "";
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = this.f11040b.getReadableDatabase().query(name, null, "data =?", new String[]{str}, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("data"));
                    }
                    C2181a.m6455h("Fetching PID for check - " + string);
                    this.f11040b.close();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    this.f11040b.close();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            } catch (SQLiteException e10) {
                m6470g().getClass();
                C2181a.m6459l("Could not fetch records out of database " + name + ".", e10);
                this.f11040b.close();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: f */
    public final synchronized JSONObject m6469f(String str) {
        Throwable th2;
        SQLiteException e10;
        Cursor cursorQuery;
        ?? r10;
        ?? r11;
        ?? jSONObject;
        ?? r12 = 0;
        if (str == null) {
            return null;
        }
        try {
            try {
                String name = Table.USER_PROFILES.getName();
                try {
                    cursorQuery = this.f11040b.getReadableDatabase().query(name, null, "_id =?", new String[]{str}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                try {
                                    jSONObject = new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex("data")));
                                } catch (JSONException unused) {
                                    jSONObject = r12;
                                }
                            } else {
                                jSONObject = r12;
                            }
                        } catch (SQLiteException e11) {
                            e10 = e11;
                            m6470g().getClass();
                            C2181a.m6459l("Could not fetch records out of database " + name + ".", e10);
                            this.f11040b.close();
                            r11 = r12;
                            if (cursorQuery != null) {
                                r10 = r12;
                                cursorQuery.close();
                                r11 = r10;
                            }
                        }
                    } else {
                        jSONObject = r12;
                    }
                    this.f11040b.close();
                    r11 = jSONObject;
                    r10 = jSONObject;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        r11 = r10;
                    }
                } catch (SQLiteException e12) {
                    e10 = e12;
                    cursorQuery = null;
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f11040b.close();
                    if (r12 != 0) {
                        r12.close();
                    }
                    throw th2;
                }
                return r11;
            } catch (Throwable th4) {
                r12 = str;
                th2 = th4;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: renamed from: g */
    public final C2181a m6470g() {
        return this.f11039a.m6433b();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized ArrayList<C9473l> m6471h(String str) {
        ArrayList<C9473l> arrayList;
        String name = Table.INBOX_MESSAGES.getName();
        arrayList = new ArrayList<>();
        try {
            try {
                Cursor cursorQuery = this.f11040b.getWritableDatabase().query(name, null, "messageUser =?", new String[]{str}, null, null, "created_at DESC");
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        C9473l c9473l = new C9473l();
                        c9473l.f48567d = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                        c9473l.f48568e = new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex("data")));
                        c9473l.f48572i = new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex("wzrkParams")));
                        c9473l.f48565b = cursorQuery.getLong(cursorQuery.getColumnIndex("created_at"));
                        c9473l.f48566c = cursorQuery.getLong(cursorQuery.getColumnIndex("expires"));
                        c9473l.f48569f = cursorQuery.getInt(cursorQuery.getColumnIndex("isRead")) == 1;
                        c9473l.f48571h = cursorQuery.getString(cursorQuery.getColumnIndex("messageUser"));
                        c9473l.m17893c(cursorQuery.getString(cursorQuery.getColumnIndex("tags")));
                        c9473l.f48564a = cursorQuery.getString(cursorQuery.getColumnIndex("campaignId"));
                        arrayList.add(c9473l);
                    }
                    cursorQuery.close();
                }
                this.f11040b.close();
            } catch (SQLiteException e10) {
                m6470g().getClass();
                C2181a.m6459l("Error retrieving records from " + name, e10);
                this.f11040b.close();
                return null;
            } catch (JSONException e11) {
                C2181a c2181aM6470g = m6470g();
                String str2 = "Error retrieving records from " + name;
                String message = e11.getMessage();
                c2181aM6470g.getClass();
                C2181a.m6460m(str2, message);
                this.f11040b.close();
                return null;
            }
        } catch (Throwable th2) {
            this.f11040b.close();
            throw th2;
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final synchronized void m6472i(Table table) {
        try {
            String name = table.getName();
            try {
                try {
                    this.f11040b.getWritableDatabase().delete(name, null, null);
                } catch (SQLiteException unused) {
                    m6470g().getClass();
                    C2181a.m6458k("Error removing all events from table " + name + " Recreating DB");
                    this.f11040b.m6477a();
                }
                this.f11040b.close();
            } catch (Throwable th2) {
                this.f11040b.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized int m6473j(JSONObject jSONObject, Table table) {
        long jSimpleQueryForLong;
        try {
            if (!m6464a()) {
                C2181a.m6455h("There is not enough space left on the device to store data, data discarded");
                return -2;
            }
            String name = table.getName();
            try {
                try {
                    SQLiteDatabase writableDatabase = this.f11040b.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data", jSONObject.toString());
                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                    writableDatabase.insert(name, null, contentValues);
                    jSimpleQueryForLong = writableDatabase.compileStatement("SELECT COUNT(*) FROM " + name).simpleQueryForLong();
                    this.f11040b.close();
                } catch (SQLiteException unused) {
                    m6470g().getClass();
                    C2181a.m6458k("Error adding data to table " + name + " Recreating DB");
                    this.f11040b.m6477a();
                    this.f11040b.close();
                    jSimpleQueryForLong = -1;
                }
                return (int) jSimpleQueryForLong;
            } catch (Throwable th2) {
                this.f11040b.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final synchronized void m6474k() {
        try {
            if (!m6464a()) {
                m6470g().getClass();
                C2181a.m6458k("There is not enough space left on the device to store data, data discarded");
                return;
            }
            String name = Table.UNINSTALL_TS.getName();
            try {
                try {
                    SQLiteDatabase writableDatabase = this.f11040b.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                    writableDatabase.insert(name, null, contentValues);
                } catch (SQLiteException unused) {
                    m6470g().getClass();
                    C2181a.m6458k("Error adding data to table " + name + " Recreating DB");
                    this.f11040b.m6477a();
                }
                this.f11040b.close();
            } catch (Throwable th2) {
                this.f11040b.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final synchronized long m6475l(String str, JSONObject jSONObject) {
        long jInsertWithOnConflict = -1;
        if (str == null) {
            return -1L;
        }
        if (!m6464a()) {
            m6470g().getClass();
            C2181a.m6458k("There is not enough space left on the device to store data, data discarded");
            return -2L;
        }
        String name = Table.USER_PROFILES.getName();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f11040b.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("data", jSONObject.toString());
                contentValues.put("_id", str);
                jInsertWithOnConflict = writableDatabase.insertWithOnConflict(name, null, contentValues, 5);
            } catch (SQLiteException unused) {
                m6470g().getClass();
                C2181a.m6458k("Error adding data to table " + name + " Recreating DB");
                this.f11040b.m6477a();
            }
            this.f11040b.close();
            return jInsertWithOnConflict;
        } catch (Throwable th2) {
            this.f11040b.close();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final synchronized void m6476m(String[] strArr) {
        try {
            if (strArr.length == 0) {
                return;
            }
            try {
                if (!m6464a()) {
                    C2181a.m6455h("There is not enough space left on the device to store data, data discarded");
                    return;
                }
                try {
                    SQLiteDatabase writableDatabase = this.f11040b.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("isRead", (Integer) 1);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("?");
                    for (int i10 = 0; i10 < strArr.length - 1; i10++) {
                        sb2.append(", ?");
                    }
                    writableDatabase.update(Table.PUSH_NOTIFICATIONS.getName(), contentValues, "data IN ( " + sb2.toString() + " )", strArr);
                    this.f11041c = false;
                } catch (SQLiteException unused) {
                    C2181a c2181aM6470g = m6470g();
                    String str = "Error adding data to table " + Table.PUSH_NOTIFICATIONS.getName() + " Recreating DB";
                    c2181aM6470g.getClass();
                    C2181a.m6458k(str);
                    this.f11040b.m6477a();
                }
                this.f11040b.close();
            } catch (Throwable th2) {
                this.f11040b.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
