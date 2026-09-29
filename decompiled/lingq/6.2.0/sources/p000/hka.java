package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class hka {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f42549a = 0;

    /* JADX INFO: renamed from: b */
    public static p04 f42550b;

    /* JADX INFO: renamed from: a */
    public static final p04 m13318a() {
        p04 p04Var = f42550b;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(12.0f, 6.5f);
        f57VarM17730e.m11548c(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        f57VarM17730e.m11548c(0.0f, 0.51f, -0.1f, 1.0f, -0.24f, 1.46f);
        f57VarM17730e.m11552g(3.06f, 3.06f);
        f57VarM17730e.m11548c(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        f57VarM17730e.m11547b(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        f57VarM17730e.m11548c(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        f57VarM17730e.m11552g(2.17f, 2.17f);
        f57VarM17730e.m11548c(0.47f, -0.14f, 0.96f, -0.24f, 1.47f, -0.24f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(2.71f, 3.16f);
        f57VarM17730e.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57VarM17730e.m11552g(1.97f, 1.97f);
        f57VarM17730e.m11547b(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        f57VarM17730e.m11547b(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        f57VarM17730e.m11548c(1.52f, 0.0f, 2.97f, -0.3f, 4.31f, -0.82f);
        f57VarM17730e.m11552g(2.72f, 2.72f);
        f57VarM17730e.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57VarM17730e.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f57VarM17730e.m11551f(4.13f, 3.16f);
        f57VarM17730e.m11548c(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.0f, 16.5f);
        f57VarM17730e.m11548c(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        f57VarM17730e.m11548c(0.0f, -0.77f, 0.18f, -1.5f, 0.49f, -2.14f);
        f57VarM17730e.m11552g(1.57f, 1.57f);
        f57VarM17730e.m11548c(-0.03f, 0.18f, -0.06f, 0.37f, -0.06f, 0.57f);
        f57VarM17730e.m11548c(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        f57VarM17730e.m11548c(0.2f, 0.0f, 0.38f, -0.03f, 0.57f, -0.07f);
        f57VarM17730e.m11551f(14.14f, 16.0f);
        f57VarM17730e.m11548c(-0.65f, 0.32f, -1.37f, 0.5f, -2.14f, 0.5f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(14.97f, 11.17f);
        f57VarM17730e.m11548c(-0.15f, -1.4f, -1.25f, -2.49f, -2.64f, -2.64f);
        f57VarM17730e.m11552g(2.64f, 2.64f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f42550b = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static void m13319b(xcc xccVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        if (xccVar == null) {
            C3386nv.m17626m("Monitor must not be null");
            return;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        sQLiteDatabase2 = sQLiteDatabase;
                        try {
                            cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                            try {
                                try {
                                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                                    cursorQuery.close();
                                    if (!zMoveToFirst) {
                                        sQLiteDatabase2.execSQL(str2);
                                    }
                                } catch (SQLiteException e) {
                                    e = e;
                                    xccVar.f68083i.m17925c("Error querying for table", str, e);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursorQuery = null;
                            xccVar.f68083i.m17925c("Error querying for table", str, e);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            sQLiteDatabase2.execSQL(str2);
                            hashSet = new HashSet();
                            StringBuilder sb = new StringBuilder(str.length() + 22);
                            sb.append("SELECT * FROM ");
                            sb.append(str);
                            sb.append(" LIMIT 0");
                            cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                            cursorRawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (hashSet.remove(str4)) {
                                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase2.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            xccVar.f68083i.m17925c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (cursor != null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    sQLiteDatabase2 = sQLiteDatabase;
                }
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i2 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb3.append("Table ");
                        sb3.append(str);
                        sb3.append(" is missing required column: ");
                        sb3.append(str4);
                        throw new SQLiteException(sb3.toString());
                    }
                }
                if (strArr != null) {
                    while (i < strArr.length) {
                        if (!hashSet.remove(strArr[i])) {
                            sQLiteDatabase2.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    xccVar.f68083i.m17925c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    return;
                }
                return;
            } catch (Throwable th4) {
                cursorRawQuery.close();
                throw th4;
            }
            hashSet = new HashSet();
            StringBuilder sb4 = new StringBuilder(str.length() + 22);
            sb4.append("SELECT * FROM ");
            sb4.append(str);
            sb4.append(" LIMIT 0");
            cursorRawQuery = sQLiteDatabase2.rawQuery(sb4.toString(), null);
        } catch (SQLiteException e4) {
            xccVar.f68080f.m17924b(str, "Failed to verify columns on table that was just created");
            throw e4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m13320c(xcc xccVar, SQLiteDatabase sQLiteDatabase) {
        if (xccVar == null) {
            C3386nv.m17626m("Monitor must not be null");
            return;
        }
        occ occVar = xccVar.f68083i;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            occVar.m17923a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            occVar.m17923a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            occVar.m17923a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        occVar.m17923a("Failed to turn on database write permission for owner");
    }
}
