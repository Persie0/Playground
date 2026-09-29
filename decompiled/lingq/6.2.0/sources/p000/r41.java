package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r41 implements zc1, fn9, bm1, tg5, w92, j69, fk8, gp9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f58596c;

    public /* synthetic */ r41(int i, Object obj, Object obj2) {
        this.f58594a = i;
        this.f58596c = obj;
        this.f58595b = obj2;
    }

    @Override // p000.j69
    /* JADX INFO: renamed from: a */
    public boolean mo14307a() {
        ej7 ej7Var = (ej7) this.f58596c;
        f60 f60Var = (f60) this.f58595b;
        if (!ej7Var.f37357q) {
            ej7Var.m11182h();
            long jM11563a = f60.m11563a(ej7Var.f37355o, f60Var.f38503a);
            f60Var.f38503a = jM11563a;
            ej7Var.f37357q = !ej7Var.m11181g(ej7Var.f37354n, jM11563a + f60Var.f38504b);
        }
        return ej7Var.f37357q;
    }

    @Override // p000.fk8
    public Object apply(Object obj) {
        hk8 hk8Var = (hk8) this.f58596c;
        q50 q50Var = (q50) this.f58595b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        m40 m40Var = hk8Var.f42546d;
        ArrayList arrayListM13315e = hk8Var.m13315e(sQLiteDatabase, q50Var, m40Var.f50555b);
        for (Priority priority : Priority.values()) {
            if (priority != q50Var.f57281c) {
                int size = m40Var.f50555b - arrayListM13315e.size();
                if (size <= 0) {
                    break;
                }
                arrayListM13315e.addAll(hk8Var.m13315e(sQLiteDatabase, q50Var.m19659b(priority), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListM13315e.size(); i++) {
            sb.append(((a50) arrayListM13315e.get(i)).f247a);
            if (i < arrayListM13315e.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new gk8(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM13315e.listIterator();
        while (listIterator.hasNext()) {
            a50 a50Var = (a50) listIterator.next();
            long j2 = a50Var.f247a;
            if (map.containsKey(Long.valueOf(j2))) {
                k40 k40VarM15778c = a50Var.f249c.m15778c();
                for (gk8 gk8Var : (Set) map.get(Long.valueOf(j2))) {
                    k40VarM15778c.m14797b(gk8Var.f40915a, gk8Var.f40916b);
                }
                listIterator.set(new a50(j2, a50Var.f248b, k40VarM15778c.m14798c()));
            }
        }
        return arrayListM13315e;
    }

    @Override // p000.tg5
    /* JADX INFO: renamed from: b */
    public void mo13388b(Object obj, t63 t63Var) {
        l52 l52Var = (l52) this.f58596c;
        da7 da7Var = (da7) this.f58595b;
        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
        SparseArray sparseArray = l52Var.f49068e;
        b64 b64Var = new b64();
        b64Var.f8006a = t63Var;
        SparseBooleanArray sparseBooleanArray = t63Var.f61911a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            bna.m3973s(i, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i);
            C3496qf c3496qf = (C3496qf) sparseArray.get(iKeyAt);
            c3496qf.getClass();
            sparseArray2.append(iKeyAt, c3496qf);
        }
        b64Var.f8007b = sparseArray2;
        interfaceC3534rf.mo20635t(da7Var, b64Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX INFO: renamed from: c */
    public void m20288c() {
        boolean z;
        boolean zM22852a;
        w23 w23Var = (w23) this.f58596c;
        String str = (String) this.f58595b;
        Set set = lp1.f49971a;
        if (set.contains(t41.class)) {
            return;
        }
        int i = 0;
        if (w23Var != null) {
            try {
                if (w23Var.f66258g) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                lp1.m16420a(t41.class, th);
            }
        } else {
            z = false;
        }
        sy2 sy2Var = sy2.f61585a;
        ema emaVar = ema.f37526a;
        if (set.contains(ema.class)) {
            zM22852a = false;
        } else {
            try {
                ema.f37526a.m11260e();
                zM22852a = ema.f37532g.m22852a();
            } catch (Throwable th2) {
                lp1.m16420a(ema.class, th2);
                zM22852a = false;
            }
        }
        if (z && zM22852a) {
            t41 t41Var = t41.f61839a;
            if (lp1.f49971a.contains(t41Var)) {
                return;
            }
            try {
                if (t41.f61846h) {
                    return;
                }
                t41.f61846h = true;
                sy2.m21768c().execute(new s41(str, i));
                return;
            } catch (Throwable th3) {
                lp1.m16420a(t41Var, th3);
                return;
            }
            lp1.m16420a(t41.class, th);
        }
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        switch (this.f58594a) {
            case 3:
                xg1 xg1Var = (xg1) this.f58596c;
                Date date = (Date) this.f58595b;
                if (task.mo5971m()) {
                    eh1 eh1Var = (eh1) xg1Var.f68172g;
                    synchronized (eh1Var.f37251b) {
                        eh1Var.f37250a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception excMo5966h = task.mo5966h();
                    if (excMo5966h != null) {
                        boolean z = excMo5966h instanceof FirebaseRemoteConfigFetchThrottledException;
                        eh1 eh1Var2 = (eh1) xg1Var.f68172g;
                        Object obj = eh1Var2.f37251b;
                        if (!z) {
                            synchronized (obj) {
                                eh1Var2.f37250a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        } else {
                            synchronized (obj) {
                                eh1Var2.f37250a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
            default:
                fs6 fs6Var = (fs6) this.f58596c;
                String str = (String) this.f58595b;
                synchronized (fs6Var) {
                    ((C3275kv) fs6Var.f39591c).remove(str);
                    break;
                }
                return task;
        }
    }

    @Override // p000.w92
    /* JADX INFO: renamed from: h */
    public void mo13969h(uo7 uo7Var) {
        w92 w92Var = (w92) this.f58596c;
        w92 w92Var2 = (w92) this.f58595b;
        w92Var.mo13969h(uo7Var);
        w92Var2.mo13969h(uo7Var);
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        qg1 qg1Var = (qg1) this.f58596c;
        sg1 sg1Var = (sg1) this.f58595b;
        synchronized (qg1Var) {
            qg1Var.f57745c = Tasks.m5975c(sg1Var);
        }
        return Tasks.m5975c(sg1Var);
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        int i = this.f58594a;
        Object obj = this.f58596c;
        String str = (String) this.f58595b;
        switch (i) {
            case 1:
                hc1 hc1Var = (hc1) obj;
                try {
                    Trace.beginSection(str);
                    return hc1Var.f42158f.mo3790l(co7Var);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) co7Var.mo4926a(Context.class);
                int i2 = ((ho2) obj).f42684a;
                String strValueOf = "";
                switch (i2) {
                    case 18:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 19:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 20:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.m6667a(installerPackageName);
                        }
                        break;
                }
                return new u40(str, strValueOf);
        }
    }

    @Override // p000.gp9
    /* JADX INFO: renamed from: n */
    public Object mo395n() {
        int i = this.f58594a;
        Object obj = this.f58595b;
        n16 n16Var = (n16) this.f58596c;
        switch (i) {
            case 11:
                Iterable iterable = (Iterable) obj;
                hk8 hk8Var = (hk8) n16Var.f52175c;
                hk8Var.getClass();
                if (iterable.iterator().hasNext()) {
                    hk8Var.m13313a().compileStatement("DELETE FROM events WHERE _id in ".concat(hk8.m13311q(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((hk8) n16Var.f52181i).m13316n(((Integer) entry.getValue()).intValue(), LogEventDropped$Reason.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    public /* synthetic */ r41(String str, int i, Object obj) {
        this.f58594a = i;
        this.f58595b = str;
        this.f58596c = obj;
    }
}
