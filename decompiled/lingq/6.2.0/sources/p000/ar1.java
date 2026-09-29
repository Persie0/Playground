package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.kochava.core.job.job.internal.JobState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar1 implements bm1, vr9, js6, fk8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7379b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7380c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7381d;

    public /* synthetic */ ar1(Object obj, Object obj2, Object obj3, int i) {
        this.f7378a = i;
        this.f7379b = obj;
        this.f7380c = obj2;
        this.f7381d = obj3;
    }

    @Override // p000.vr9
    /* JADX INFO: renamed from: a */
    public void mo2997a() {
        ie4 ie4Var;
        bd4 bd4Var = (bd4) this.f7379b;
        sq5 sq5Var = (sq5) this.f7380c;
        C3309ls c3309ls = (C3309ls) this.f7381d;
        if (bd4Var.m3644o() && (ie4Var = (ie4) sq5Var.f61250d) != null) {
            bd4Var.m3638d(c3309ls, ie4Var, true);
            synchronized (bd4.f8367p) {
                try {
                    if (bd4Var.f8382o != null) {
                        bd4Var.f8373f.m21555D("Updating state from update queued during doAction");
                        Pair pair = bd4Var.f8382o;
                        bd4Var.m3640f((ie4) pair.first, (JobState) pair.second);
                        bd4Var.f8382o = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.fk8
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        hk8 hk8Var;
        int i = this.f7378a;
        int i2 = 0;
        int i3 = 1;
        Object obj2 = this.f7381d;
        Object obj3 = this.f7380c;
        Object obj4 = this.f7379b;
        switch (i) {
            case 6:
                hk8 hk8Var2 = (hk8) obj4;
                l40 l40Var = (l40) obj3;
                vr2 vr2Var = l40Var.f49003c;
                String str = l40Var.f49001a;
                q50 q50Var = (q50) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hk8Var2.m13313a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hk8Var2.m13313a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                m40 m40Var = hk8Var2.f42546d;
                if (jSimpleQueryForLong >= m40Var.f50554a) {
                    hk8Var2.m13316n(1L, LogEventDropped$Reason.CACHE_FULL, str);
                    return -1L;
                }
                Long lM13310b = hk8.m13310b(sQLiteDatabase, q50Var);
                if (lM13310b != null) {
                    jInsert = lM13310b.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", q50Var.f57279a);
                    contentValues.put("priority", Integer.valueOf(mk7.m16869a(q50Var.f57281c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = q50Var.f57280b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i4 = m40Var.f50558e;
                byte[] bArr2 = vr2Var.f65824b;
                boolean z = bArr2.length <= i4;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(l40Var.f49004d));
                contentValues2.put("uptime_ms", Long.valueOf(l40Var.f49005e));
                contentValues2.put("payload_encoding", vr2Var.f65823a.f8931a);
                contentValues2.put("code", l40Var.f49002b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", l40Var.f49007g);
                contentValues2.put("pseudonymous_id", l40Var.f49008h);
                contentValues2.put("experiment_ids_clear_blob", l40Var.f49009i);
                contentValues2.put("experiment_ids_encrypted_blob", l40Var.f49010j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i4));
                    for (int i5 = 1; i5 <= iCeil; i5++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i5 - 1) * i4, Math.min(i5 * i4, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i5));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(l40Var.f49006f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                hk8 hk8Var3 = (hk8) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                q50 q50Var2 = (q50) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(i2);
                    int i6 = cursor2.getInt(7) != 0 ? i3 : i2;
                    k40 k40Var = new k40();
                    k40Var.f46681i = new HashMap();
                    String string = cursor2.getString(i3);
                    if (string == null) {
                        C3386nv.m17635v("Null transportName");
                        return null;
                    }
                    k40Var.f46674b = string;
                    k40Var.f46679g = Long.valueOf(cursor2.getLong(2));
                    k40Var.f46680h = Long.valueOf(cursor2.getLong(3));
                    if (i6 != 0) {
                        String string2 = cursor2.getString(4);
                        k40Var.f46678f = new vr2(string2 == null ? hk8.f42542f : new bs2(string2), cursor2.getBlob(5));
                        hk8Var = hk8Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        bs2 bs2Var = string3 == null ? hk8.f42542f : new bs2(string3);
                        Cursor cursorQuery = hk8Var3.m13313a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = i2;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(i2);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int length2 = i2;
                            int i7 = length2;
                            while (i7 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i7);
                                hk8 hk8Var4 = hk8Var3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i7++;
                                    cursorQuery = cursor;
                                    hk8Var3 = hk8Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            hk8Var = hk8Var3;
                            cursorQuery.close();
                            k40Var.f46678f = new vr2(bs2Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        k40Var.f46676d = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        k40Var.f46677e = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        k40Var.f46675c = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        k40Var.f46682j = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        k40Var.f46683k = cursor2.getBlob(11);
                    }
                    arrayList.add(new a50(j, q50Var2, k40Var.m14798c()));
                    hk8Var3 = hk8Var;
                    i2 = 0;
                    i3 = 1;
                }
                return null;
        }
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        sg1 sg1Var;
        int i = this.f7378a;
        Object obj = this.f7381d;
        Object obj2 = this.f7380c;
        Object obj3 = this.f7379b;
        switch (i) {
            case 0:
                wr9 wr9Var = (wr9) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                m58 m58Var = (m58) obj;
                if (task.mo5971m()) {
                    wr9Var.m24140d(task.mo5967i());
                } else if (task.mo5966h() != null) {
                    wr9Var.m24139c(task.mo5966h());
                } else if (atomicBoolean.getAndSet(true)) {
                    m58Var.m16641d();
                }
                return Tasks.m5975c(null);
            default:
                l53 l53Var = (l53) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                l53Var.getClass();
                if (!task2.mo5971m() || task2.mo5967i() == null) {
                    return Tasks.m5975c(Boolean.FALSE);
                }
                sg1 sg1Var2 = (sg1) task2.mo5967i();
                if (task3.mo5971m() && (sg1Var = (sg1) task3.mo5967i()) != null && sg1Var2.f60807c.equals(sg1Var.f60807c)) {
                    return Tasks.m5975c(Boolean.FALSE);
                }
                qg1 qg1Var = l53Var.f49075d;
                Executor executor = qg1Var.f57743a;
                return Tasks.m5973a(new og1(0, qg1Var, sg1Var2), executor).mo5972n(executor, new r41(2, qg1Var, sg1Var2)).mo5964f(l53Var.f49073b, new k53(l53Var));
        }
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public void mo320g(Object obj) {
        ny8 ny8Var = (ny8) this.f7379b;
        Task task = (Task) this.f7380c;
        vp1 vp1Var = (vp1) this.f7381d;
        try {
            sg1 sg1Var = (sg1) task.mo5967i();
            if (sg1Var != null) {
                ((Executor) ny8Var.f53416d).execute(new mv5(7, vp1Var, ((fs6) ny8Var.f53415c).m12112s(sg1Var)));
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }
}
