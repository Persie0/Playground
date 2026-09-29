package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hk8 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final bs2 f42542f = new bs2("proto");

    /* JADX INFO: renamed from: a */
    public final an8 f42543a;

    /* JADX INFO: renamed from: b */
    public final a41 f42544b;

    /* JADX INFO: renamed from: c */
    public final a41 f42545c;

    /* JADX INFO: renamed from: d */
    public final m40 f42546d;

    /* JADX INFO: renamed from: e */
    public final so7 f42547e;

    public hk8(a41 a41Var, a41 a41Var2, m40 m40Var, an8 an8Var, so7 so7Var) {
        this.f42543a = an8Var;
        this.f42544b = a41Var;
        this.f42545c = a41Var2;
        this.f42546d = m40Var;
        this.f42547e = so7Var;
    }

    /* JADX INFO: renamed from: b */
    public static Long m13310b(SQLiteDatabase sQLiteDatabase, q50 q50Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(q50Var.f57279a, String.valueOf(mk7.m16869a(q50Var.f57281c))));
        byte[] bArr = q50Var.f57280b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m13311q(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((a50) it.next()).f247a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static Object m13312r(Cursor cursor, fk8 fk8Var) {
        try {
            return fk8Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m13313a() {
        an8 an8Var = this.f42543a;
        Objects.requireNonNull(an8Var);
        a41 a41Var = this.f42545c;
        long jMo100g = a41Var.mo100g();
        while (true) {
            try {
                return an8Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (a41Var.mo100g() >= ((long) this.f42546d.f50556c) + jMo100g) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m13314c(fk8 fk8Var) {
        SQLiteDatabase sQLiteDatabaseM13313a = m13313a();
        sQLiteDatabaseM13313a.beginTransaction();
        try {
            Object objApply = fk8Var.apply(sQLiteDatabaseM13313a);
            sQLiteDatabaseM13313a.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM13313a.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42543a.close();
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m13315e(SQLiteDatabase sQLiteDatabase, q50 q50Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM13310b = m13310b(sQLiteDatabase, q50Var);
        if (lM13310b == null) {
            return arrayList;
        }
        m13312r(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM13310b.toString()}, null, null, null, String.valueOf(i)), new ar1(this, arrayList, q50Var, 7));
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final void m13316n(final long j, final LogEventDropped$Reason logEventDropped$Reason, final String str) {
        m13314c(new fk8() { // from class: ek8
            @Override // p000.fk8
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                LogEventDropped$Reason logEventDropped$Reason2 = logEventDropped$Reason;
                String string = Integer.toString(logEventDropped$Reason2.getNumber());
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    boolean z = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j2 = j;
                    if (z) {
                        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(logEventDropped$Reason2.getNumber())});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(logEventDropped$Reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final Object m13317p(gp9 gp9Var) {
        SQLiteDatabase sQLiteDatabaseM13313a = m13313a();
        a41 a41Var = this.f42545c;
        long jMo100g = a41Var.mo100g();
        while (true) {
            try {
                sQLiteDatabaseM13313a.beginTransaction();
                try {
                    Object objMo395n = gp9Var.mo395n();
                    sQLiteDatabaseM13313a.setTransactionSuccessful();
                    return objMo395n;
                } finally {
                    sQLiteDatabaseM13313a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (a41Var.mo100g() >= ((long) this.f42546d.f50556c) + jMo100g) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
