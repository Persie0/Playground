package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.amplitude.android.migration.CursorWindowAllocationException;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u02 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final pj5 f63163a;

    /* JADX INFO: renamed from: b */
    public final File f63164b;

    /* JADX INFO: renamed from: c */
    public boolean f63165c;

    /* JADX INFO: renamed from: d */
    public int f63166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u02(Context context, String str, pj5 pj5Var) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        context.getClass();
        pj5Var.getClass();
        this.f63163a = pj5Var;
        File databasePath = context.getDatabasePath(str);
        databasePath.getClass();
        this.f63164b = databasePath;
        this.f63165c = true;
        this.f63166d = 4;
    }

    /* JADX INFO: renamed from: b */
    public static void m22365b(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null || message.length() == 0) {
            throw runtimeException;
        }
        if (!cl9.m4842Y(message, "Cursor window allocation of", false) && !cl9.m4842Y(message, "Could not allocate CursorWindow", false)) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    /* JADX INFO: renamed from: a */
    public final void m22366a() {
        try {
            close();
        } catch (Exception e) {
            lj5 lj5Var = lj5.f49738c;
            lj5.f49738c.mo16255a("close failed: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Long m22367c(String str) {
        return (Long) m22368e("long_store", str);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0092 A[PHI: r14
      0x0092: PHI (r14v7 android.database.Cursor) = (r14v5 android.database.Cursor), (r14v6 android.database.Cursor), (r14v8 android.database.Cursor) binds: [B:54:0x00b9, B:49:0x0090, B:56:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: e */
    public final Object m22368e(String str, String str2) throws Throwable {
        Throwable th;
        RuntimeException runtimeException;
        IllegalStateException illegalStateException;
        Cursor cursorQuery;
        String str3;
        StackOverflowError stackOverflowError;
        SQLiteException sQLiteException;
        ?? r3 = 0;
        Object string = null;
        try {
            if (this.f63164b.exists()) {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        if (!this.f63165c) {
                            close();
                            return null;
                        }
                        readableDatabase.getClass();
                        str3 = str;
                        try {
                            cursorQuery = readableDatabase.query(str3, new String[]{"key", "value"}, "key = ?", new String[]{str2}, null, null, null, null);
                            try {
                                cursorQuery.getClass();
                                if (cursorQuery.moveToFirst()) {
                                    string = str3.equals("store") ? cursorQuery.getString(1) : Long.valueOf(cursorQuery.getLong(1));
                                }
                                cursorQuery.close();
                                close();
                                return string;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                            } catch (IllegalStateException e2) {
                                illegalStateException = e2;
                                m22369n(illegalStateException);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                close();
                                return null;
                            } catch (RuntimeException e3) {
                                runtimeException = e3;
                                m22365b(runtimeException);
                                throw null;
                            } catch (StackOverflowError e4) {
                                stackOverflowError = e4;
                                lj5.f49738c.mo16255a("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                                m22366a();
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                close();
                                return null;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            sQLiteException = e;
                            cursorQuery = null;
                        } catch (StackOverflowError e6) {
                            e = e6;
                            stackOverflowError = e;
                            cursorQuery = null;
                            lj5.f49738c.mo16255a("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                            m22366a();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            close();
                            return null;
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        str3 = str;
                    } catch (StackOverflowError e8) {
                        e = e8;
                        str3 = str;
                    }
                } catch (IllegalStateException e9) {
                    illegalStateException = e9;
                    cursorQuery = null;
                } catch (RuntimeException e10) {
                    runtimeException = e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (r3 != 0) {
                        r3.close();
                    }
                    close();
                    throw th;
                }
                sQLiteException = e;
                cursorQuery = null;
                lj5.f49738c.mo16255a("getValue from " + str3 + " failed: " + sQLiteException.getMessage());
                m22366a();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r3 = str;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m22369n(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message == null || message.length() == 0 || !vk9.m23380c0(message, "Couldn't read", false) || !vk9.m23380c0(message, "CursorWindow", false)) {
            throw illegalStateException;
        }
        m22366a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.f63165c = false;
        this.f63163a.mo16255a("Attempt to re-create existing legacy database file " + this.f63164b.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f63166d = i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[PHI: r4
      0x00a7: PHI (r4v6 android.database.Cursor) = (r4v2 android.database.Cursor), (r4v5 android.database.Cursor), (r4v7 android.database.Cursor) binds: [B:60:0x00d1, B:55:0x00a5, B:62:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9  */
    /* JADX INFO: renamed from: p */
    public final AbstractList m22370p(String str) throws Throwable {
        RuntimeException runtimeException;
        Cursor cursor;
        String str2;
        Throwable th;
        if (!this.f63164b.exists()) {
            return new ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        Cursor cursor2 = null;
        try {
            try {
                try {
                    SQLiteDatabase readableDatabase = getReadableDatabase();
                    if (!this.f63165c) {
                        ArrayList arrayList = new ArrayList();
                        close();
                        return arrayList;
                    }
                    readableDatabase.getClass();
                    str2 = str;
                    try {
                        Cursor cursorQuery = readableDatabase.query(str2, new String[]{"id", "event"}, null, null, null, null, "id ASC", null);
                        while (true) {
                            try {
                                cursorQuery.getClass();
                                if (!cursorQuery.moveToNext()) {
                                    cursorQuery.close();
                                    close();
                                    return linkedList;
                                }
                                long j = cursorQuery.getLong(0);
                                String string = cursorQuery.getString(1);
                                if (string != null && string.length() != 0) {
                                    JSONObject jSONObject = new JSONObject(string);
                                    jSONObject.put("$rowId", j);
                                    linkedList.add(jSONObject);
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                cursor2 = cursorQuery;
                                lj5.f49738c.mo16255a("read events from " + str2 + " failed: " + e.getMessage());
                                m22366a();
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (IllegalStateException e2) {
                                e = e2;
                                cursor2 = cursorQuery;
                                m22369n(e);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (RuntimeException e3) {
                                cursor = cursorQuery;
                                runtimeException = e3;
                                try {
                                    m22365b(runtimeException);
                                    throw null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    close();
                                    throw th;
                                }
                            } catch (StackOverflowError e4) {
                                e = e4;
                                cursor2 = cursorQuery;
                                lj5.f49738c.mo16255a("read events from " + str2 + " failed: " + e.getMessage());
                                m22366a();
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursorQuery;
                                th = th;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                throw th;
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                    } catch (StackOverflowError e6) {
                        e = e6;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (SQLiteException e7) {
                e = e7;
                str2 = str;
            } catch (StackOverflowError e8) {
                e = e8;
                str2 = str;
            }
        } catch (IllegalStateException e9) {
            e = e9;
        } catch (RuntimeException e10) {
            runtimeException = e10;
            cursor = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m22371q(String str, long j) {
        try {
            getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j)});
        } catch (StackOverflowError e) {
            lj5.f49738c.mo16255a("remove events from " + str + " failed: " + e.getMessage());
            m22366a();
        } catch (SQLiteException e2) {
            lj5.f49738c.mo16255a("remove events from " + str + " failed: " + e2.getMessage());
            m22366a();
        } finally {
            close();
        }
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m22372r(String str) {
        m22373u(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m22373u(String str) {
        try {
            getWritableDatabase().delete("long_store", "key = ?", new String[]{str});
        } catch (SQLiteException e) {
            lj5.f49738c.mo16255a("remove value from long_store failed: " + e.getMessage());
            m22366a();
        } catch (StackOverflowError e2) {
            lj5.f49738c.mo16255a("remove value from long_store failed: " + e2.getMessage());
            m22366a();
        } finally {
            close();
        }
    }
}
