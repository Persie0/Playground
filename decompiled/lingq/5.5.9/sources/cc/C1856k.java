package cc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: cc.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1856k {
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: SQLiteException -> 0x00dd, TryCatch #7 {SQLiteException -> 0x00dd, blocks: (B:26:0x0053, B:28:0x0074, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00ad, B:37:0x00b1, B:39:0x00b4, B:41:0x00bc, B:42:0x00c3, B:43:0x00c6, B:45:0x00cc, B:48:0x00d9, B:49:0x00dc, B:27:0x006d), top: B:63:0x0053, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: SQLiteException -> 0x00dd, LOOP:0: B:29:0x0082->B:32:0x008c, LOOP_END, TryCatch #7 {SQLiteException -> 0x00dd, blocks: (B:26:0x0053, B:28:0x0074, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00ad, B:37:0x00b1, B:39:0x00b4, B:41:0x00bc, B:42:0x00c3, B:43:0x00c6, B:45:0x00cc, B:48:0x00d9, B:49:0x00dc, B:27:0x006d), top: B:63:0x0053, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[Catch: SQLiteException -> 0x00dd, TryCatch #7 {SQLiteException -> 0x00dd, blocks: (B:26:0x0053, B:28:0x0074, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00ad, B:37:0x00b1, B:39:0x00b4, B:41:0x00bc, B:42:0x00c3, B:43:0x00c6, B:45:0x00cc, B:48:0x00d9, B:49:0x00dc, B:27:0x006d), top: B:63:0x0053, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[Catch: SQLiteException -> 0x00dd, TryCatch #7 {SQLiteException -> 0x00dd, blocks: (B:26:0x0053, B:28:0x0074, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00ad, B:37:0x00b1, B:39:0x00b4, B:41:0x00bc, B:42:0x00c3, B:43:0x00c6, B:45:0x00cc, B:48:0x00d9, B:49:0x00dc, B:27:0x006d), top: B:63:0x0053, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: SQLiteException -> 0x00dd, TryCatch #7 {SQLiteException -> 0x00dd, blocks: (B:26:0x0053, B:28:0x0074, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00ad, B:37:0x00b1, B:39:0x00b4, B:41:0x00bc, B:42:0x00c3, B:43:0x00c6, B:45:0x00cc, B:48:0x00d9, B:49:0x00dc, B:27:0x006d), top: B:63:0x0053, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m5698a(C1860k3 c1860k3, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        String[] strArr2;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i10;
        int i11;
        C1842i3 c1842i3 = c1860k3.f9945i;
        Cursor cursorQuery = null;
        try {
            try {
                strArr2 = null;
                try {
                    cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        boolean zMoveToFirst = cursorQuery.moveToFirst();
                        cursorQuery.close();
                        if (!zMoveToFirst) {
                            sQLiteDatabase.execSQL(str2);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        c1842i3.m5625c(str, e, "Error querying for table");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursorQuery = strArr2;
                    c1842i3.m5625c(str, e, "Error querying for table");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    hashSet = new HashSet();
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", strArr2);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                            }
                        }
                        if (strArr != null) {
                            for (i11 = 0; i11 < strArr.length; i11 += 2) {
                                if (!hashSet.remove(strArr[i11])) {
                                    sQLiteDatabase.execSQL(strArr[i11 + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        c1842i3.m5625c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursorQuery = strArr2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            strArr2 = null;
        } catch (Throwable th5) {
            th = th5;
            strArr2 = null;
        }
        try {
            hashSet = new HashSet();
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", strArr2);
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            cursorRawQuery.close();
            while (i10 < r3) {
                if (hashSet.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                while (i11 < strArr.length) {
                    if (!hashSet.remove(strArr[i11])) {
                        sQLiteDatabase.execSQL(strArr[i11 + 1]);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                c1842i3.m5625c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
            }
        } catch (SQLiteException e13) {
            c1860k3.f9942f.m5624b(str, "Failed to verify columns on table that was just created");
            throw e13;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5699b(C1860k3 c1860k3, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        C1842i3 c1842i3 = c1860k3.f9945i;
        if (!readable) {
            c1842i3.m5623a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c1842i3.m5623a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c1842i3.m5623a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c1842i3.m5623a("Failed to turn on database write permission for owner");
    }
}
