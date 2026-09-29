package p068d9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p010a9.C0051a;
import p030b9.C1343b;
import p090e9.InterfaceC5385a;
import p113f9.InterfaceC5478a;
import p135g9.C5717a;
import p150h9.C5931p;
import p371rl.InterfaceC8825a;
import p382s7.C8969b;
import p395t8.C9220b;
import p402u0.C9362e;
import p402u0.C9369l;
import p402u0.C9370m;
import p452w8.AbstractC9833n;
import p452w8.AbstractC9838s;
import p528z8.C10456a;

/* JADX INFO: renamed from: d9.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5104r implements InterfaceC5090d, InterfaceC5385a, InterfaceC5089c {

    /* JADX INFO: renamed from: f */
    public static final C9220b f33055f = new C9220b("proto");

    /* JADX INFO: renamed from: a */
    public final C5110x f33056a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5478a f33057b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5478a f33058c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5091e f33059d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8825a<String> f33060e;

    /* JADX INFO: renamed from: d9.r$a */
    public interface a<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: renamed from: d9.r$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f33061a;

        /* JADX INFO: renamed from: b */
        public final String f33062b;

        public b(String str, String str2) {
            this.f33061a = str;
            this.f33062b = str2;
        }
    }

    public C5104r(InterfaceC5478a interfaceC5478a, InterfaceC5478a interfaceC5478a2, AbstractC5091e abstractC5091e, C5110x c5110x, InterfaceC8825a<String> interfaceC8825a) {
        this.f33056a = c5110x;
        this.f33057b = interfaceC5478a;
        this.f33058c = interfaceC5478a2;
        this.f33059d = abstractC5091e;
        this.f33060e = interfaceC8825a;
    }

    /* JADX INFO: renamed from: C */
    public static Long m10865C(SQLiteDatabase sQLiteDatabase, AbstractC9838s abstractC9838s) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC9838s.mo18319b(), String.valueOf(C5717a.m12075a(abstractC9838s.mo18321d()))));
        if (abstractC9838s.mo18320c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC9838s.mo18320c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m10867Q(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new C9362e(9));
    }

    /* JADX INFO: renamed from: H */
    public static String m10866H(Iterable<AbstractC5095i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC5095i> it = iterable.iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    sb2.append(')');
                    return sb2.toString();
                }
                sb2.append(it.next().mo10850b());
                if (it.hasNext()) {
                    sb2.append(',');
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q */
    public static <T> T m10867Q(Cursor cursor, a<Cursor, T> aVar) {
        try {
            T tApply = aVar.apply(cursor);
            cursor.close();
            return tApply;
        } catch (Throwable th2) {
            cursor.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: E */
    public final <T> T m10868E(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseM10871r = m10871r();
        sQLiteDatabaseM10871r.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseM10871r);
            sQLiteDatabaseM10871r.setTransactionSuccessful();
            sQLiteDatabaseM10871r.endTransaction();
            return tApply;
        } catch (Throwable th2) {
            sQLiteDatabaseM10871r.endTransaction();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: G */
    public final ArrayList m10869G(SQLiteDatabase sQLiteDatabase, AbstractC9838s abstractC9838s, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lM10865C = m10865C(sQLiteDatabase, abstractC9838s);
        if (lM10865C == null) {
            return arrayList;
        }
        m10867Q(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM10865C.toString()}, null, null, null, String.valueOf(i10)), new C5102p(0, this, arrayList, abstractC9838s));
        return arrayList;
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: L0 */
    public final Iterable<AbstractC5095i> mo10855L0(AbstractC9838s abstractC9838s) {
        return (Iterable) m10868E(new C8969b(this, 3, abstractC9838s));
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: N */
    public final List mo10856N() {
        SQLiteDatabase sQLiteDatabaseM10871r = m10871r();
        sQLiteDatabaseM10871r.beginTransaction();
        try {
            List list = (List) m10867Q(sQLiteDatabaseM10871r.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C5931p(7));
            sQLiteDatabaseM10871r.setTransactionSuccessful();
            sQLiteDatabaseM10871r.endTransaction();
            return list;
        } catch (Throwable th2) {
            sQLiteDatabaseM10871r.endTransaction();
            throw th2;
        }
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: O */
    public final C5088b mo10857O(AbstractC9838s abstractC9838s, AbstractC9833n abstractC9833n) {
        Object[] objArr = {abstractC9838s.mo18321d(), abstractC9833n.mo18309g(), abstractC9838s.mo18319b()};
        String strM210c = C0051a.m210c("SQLiteEventStore");
        if (Log.isLoggable(strM210c, 3)) {
            Log.d(strM210c, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long jLongValue = ((Long) m10868E(new C1343b(this, abstractC9833n, abstractC9838s))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new C5088b(jLongValue, abstractC9838s, abstractC9833n);
    }

    @Override // p068d9.InterfaceC5089c
    /* JADX INFO: renamed from: a */
    public final void mo10852a() {
        m10868E(new C9369l(7, this));
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: a1 */
    public final long mo10858a1(AbstractC9838s abstractC9838s) {
        return ((Long) m10867Q(m10871r().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC9838s.mo18319b(), String.valueOf(C5717a.m12075a(abstractC9838s.mo18321d()))}), new C5931p(6))).longValue();
    }

    @Override // p068d9.InterfaceC5089c
    /* JADX INFO: renamed from: b */
    public final C10456a mo10853b() {
        int i10 = C10456a.f52312e;
        C10456a.a aVar = new C10456a.a();
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseM10871r = m10871r();
        sQLiteDatabaseM10871r.beginTransaction();
        try {
            C10456a c10456a = (C10456a) m10867Q(sQLiteDatabaseM10871r.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C5102p(1, this, map, aVar));
            sQLiteDatabaseM10871r.setTransactionSuccessful();
            sQLiteDatabaseM10871r.endTransaction();
            return c10456a;
        } catch (Throwable th2) {
            sQLiteDatabaseM10871r.endTransaction();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33056a.close();
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: d */
    public final int mo10859d() {
        final long jMo11713a = this.f33057b.mo11713a() - this.f33059d.mo10845b();
        return ((Integer) m10868E(new a() { // from class: d9.j
            @Override // p068d9.C5104r.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C5104r c5104r = this.f33035a;
                c5104r.getClass();
                String[] strArr = {String.valueOf(jMo11713a)};
                C5104r.m10867Q(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C5101o(c5104r, 0));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: j1 */
    public final boolean mo10860j1(AbstractC9838s abstractC9838s) {
        return ((Boolean) m10868E(new C5097k(this, 0, abstractC9838s))).booleanValue();
    }

    @Override // p068d9.InterfaceC5089c
    /* JADX INFO: renamed from: l */
    public final void mo10854l(final long j10, final LogEventDropped.Reason reason, final String str) {
        m10868E(new a() { // from class: d9.l
            @Override // p068d9.C5104r.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                String str2 = str;
                LogEventDropped.Reason reason2 = reason;
                boolean zBooleanValue = ((Boolean) C5104r.m10867Q(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())}), new C9362e(8))).booleanValue();
                long j11 = j10;
                if (zBooleanValue) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j11));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: m1 */
    public final void mo10861m1(Iterable<AbstractC5095i> iterable) {
        if (iterable.iterator().hasNext()) {
            m10868E(new C5100n(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m10866H(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: n1 */
    public final void mo10862n1(long j10, AbstractC9838s abstractC9838s) {
        m10868E(new C5099m(j10, abstractC9838s));
    }

    @Override // p068d9.InterfaceC5090d
    /* JADX INFO: renamed from: o */
    public final void mo10863o(Iterable<AbstractC5095i> iterable) {
        if (iterable.iterator().hasNext()) {
            m10871r().compileStatement("DELETE FROM events WHERE _id in " + m10866H(iterable)).execute();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p090e9.InterfaceC5385a
    /* JADX INFO: renamed from: q */
    public final <T> T mo10870q(InterfaceC5385a.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseM10871r = m10871r();
        InterfaceC5478a interfaceC5478a = this.f33058c;
        long jMo11713a = interfaceC5478a.mo11713a();
        while (true) {
            try {
                sQLiteDatabaseM10871r.beginTransaction();
                try {
                    T tMo4925g = aVar.mo4925g();
                    sQLiteDatabaseM10871r.setTransactionSuccessful();
                    sQLiteDatabaseM10871r.endTransaction();
                    return tMo4925g;
                } catch (Throwable th2) {
                    sQLiteDatabaseM10871r.endTransaction();
                    throw th2;
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (interfaceC5478a.mo11713a() >= ((long) this.f33059d.mo10844a()) + jMo11713a) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final SQLiteDatabase m10871r() {
        C5110x c5110x = this.f33056a;
        Objects.requireNonNull(c5110x);
        C9370m c9370m = new C9370m(4, c5110x);
        InterfaceC5478a interfaceC5478a = this.f33058c;
        long jMo11713a = interfaceC5478a.mo11713a();
        while (true) {
            try {
                return (SQLiteDatabase) c9370m.m17744f();
            } catch (SQLiteDatabaseLockedException e10) {
                if (interfaceC5478a.mo11713a() >= ((long) this.f33059d.mo10844a()) + jMo11713a) {
                    throw new SynchronizationException("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final long m10872w() {
        return m10871r().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }
}
