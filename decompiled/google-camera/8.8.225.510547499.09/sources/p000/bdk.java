package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdk implements bcw {

    /* JADX INFO: renamed from: a */
    public final apt f2987a;

    /* JADX INFO: renamed from: b */
    public final apo f2988b;

    /* JADX INFO: renamed from: c */
    public final aqa f2989c;

    /* JADX INFO: renamed from: d */
    public final aqa f2990d;

    /* JADX INFO: renamed from: e */
    public final aqa f2991e;

    /* JADX INFO: renamed from: f */
    public final aqa f2992f;

    /* JADX INFO: renamed from: g */
    private final aqa f2993g;

    /* JADX INFO: renamed from: h */
    private final aqa f2994h;

    /* JADX INFO: renamed from: i */
    private final aqa f2995i;

    /* JADX INFO: renamed from: j */
    private final aqa f2996j;

    /* JADX INFO: renamed from: k */
    private final aqa f2997k;

    public bdk(apt aptVar) {
        this.f2987a = aptVar;
        this.f2988b = new bdb(aptVar);
        new bdc(aptVar);
        this.f2993g = new bdd(aptVar);
        this.f2994h = new bde(aptVar);
        this.f2989c = new bdf(aptVar);
        this.f2995i = new bdg(aptVar);
        this.f2996j = new bdh(aptVar);
        this.f2990d = new bdi(aptVar);
        this.f2991e = new bdj(aptVar);
        this.f2997k = new bcx(aptVar);
        this.f2992f = new bcy(aptVar);
        new bcz(aptVar);
        new bda(aptVar);
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: a */
    public final bcv mo2232a(String str) throws Throwable {
        apy apyVar;
        apy apyVarM1841a = apy.m1841a("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            apyVarM1841a.mo1846f(1);
        } else {
            apyVarM1841a.mo1847g(1, str);
        }
        this.f2987a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "id");
            int iM379o2 = aeq.m379o(cursorM409e, "state");
            int iM379o3 = aeq.m379o(cursorM409e, "worker_class_name");
            int iM379o4 = aeq.m379o(cursorM409e, "input_merger_class_name");
            int iM379o5 = aeq.m379o(cursorM409e, "input");
            int iM379o6 = aeq.m379o(cursorM409e, "output");
            int iM379o7 = aeq.m379o(cursorM409e, "initial_delay");
            int iM379o8 = aeq.m379o(cursorM409e, "interval_duration");
            int iM379o9 = aeq.m379o(cursorM409e, "flex_duration");
            int iM379o10 = aeq.m379o(cursorM409e, "run_attempt_count");
            int iM379o11 = aeq.m379o(cursorM409e, "backoff_policy");
            int iM379o12 = aeq.m379o(cursorM409e, "backoff_delay_duration");
            int iM379o13 = aeq.m379o(cursorM409e, "last_enqueue_time");
            int iM379o14 = aeq.m379o(cursorM409e, "minimum_retention_duration");
            apyVar = apyVarM1841a;
            try {
                int iM379o15 = aeq.m379o(cursorM409e, "schedule_requested_at");
                int iM379o16 = aeq.m379o(cursorM409e, "run_in_foreground");
                int iM379o17 = aeq.m379o(cursorM409e, "out_of_quota_policy");
                int iM379o18 = aeq.m379o(cursorM409e, "period_count");
                int iM379o19 = aeq.m379o(cursorM409e, "generation");
                int iM379o20 = aeq.m379o(cursorM409e, "required_network_type");
                int iM379o21 = aeq.m379o(cursorM409e, "requires_charging");
                int iM379o22 = aeq.m379o(cursorM409e, "requires_device_idle");
                int iM379o23 = aeq.m379o(cursorM409e, "requires_battery_not_low");
                int iM379o24 = aeq.m379o(cursorM409e, "requires_storage_not_low");
                int iM379o25 = aeq.m379o(cursorM409e, "trigger_content_update_delay");
                int iM379o26 = aeq.m379o(cursorM409e, "trigger_max_content_delay");
                int iM379o27 = aeq.m379o(cursorM409e, "content_uri_triggers");
                bcv bcvVar = null;
                byte[] blob = null;
                if (cursorM409e.moveToFirst()) {
                    String string = cursorM409e.isNull(iM379o) ? null : cursorM409e.getString(iM379o);
                    int iM7728s = C0166er.m7728s(cursorM409e.getInt(iM379o2));
                    String string2 = cursorM409e.isNull(iM379o3) ? null : cursorM409e.getString(iM379o3);
                    String string3 = cursorM409e.isNull(iM379o4) ? null : cursorM409e.getString(iM379o4);
                    axt axtVarM2090a = axt.m2090a(cursorM409e.isNull(iM379o5) ? null : cursorM409e.getBlob(iM379o5));
                    axt axtVarM2090a2 = axt.m2090a(cursorM409e.isNull(iM379o6) ? null : cursorM409e.getBlob(iM379o6));
                    long j = cursorM409e.getLong(iM379o7);
                    long j2 = cursorM409e.getLong(iM379o8);
                    long j3 = cursorM409e.getLong(iM379o9);
                    int i = cursorM409e.getInt(iM379o10);
                    int iM7725p = C0166er.m7725p(cursorM409e.getInt(iM379o11));
                    long j4 = cursorM409e.getLong(iM379o12);
                    long j5 = cursorM409e.getLong(iM379o13);
                    long j6 = cursorM409e.getLong(iM379o14);
                    long j7 = cursorM409e.getLong(iM379o15);
                    boolean z = cursorM409e.getInt(iM379o16) != 0;
                    int iM7727r = C0166er.m7727r(cursorM409e.getInt(iM379o17));
                    int i2 = cursorM409e.getInt(iM379o18);
                    int i3 = cursorM409e.getInt(iM379o19);
                    int iM7726q = C0166er.m7726q(cursorM409e.getInt(iM379o20));
                    boolean z2 = cursorM409e.getInt(iM379o21) != 0;
                    boolean z3 = cursorM409e.getInt(iM379o22) != 0;
                    boolean z4 = cursorM409e.getInt(iM379o23) != 0;
                    boolean z5 = cursorM409e.getInt(iM379o24) != 0;
                    long j8 = cursorM409e.getLong(iM379o25);
                    long j9 = cursorM409e.getLong(iM379o26);
                    if (!cursorM409e.isNull(iM379o27)) {
                        blob = cursorM409e.getBlob(iM379o27);
                    }
                    bcvVar = new bcv(string, iM7728s, string2, string3, axtVarM2090a, axtVarM2090a2, j, j2, j3, new axr(iM7726q, z2, z3, z4, z5, j8, j9, C0166er.m7719j(blob)), i, iM7725p, j4, j5, j6, j7, z, iM7727r, i2, i3);
                }
                cursorM409e.close();
                apyVar.m1850j();
                return bcvVar;
            } catch (Throwable th) {
                th = th;
                cursorM409e.close();
                apyVar.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            apyVar = apyVarM1841a;
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: b */
    public final List mo2233b() throws Throwable {
        apy apyVar;
        apy apyVarM1841a = apy.m1841a("SELECT * FROM workspec WHERE state=1", 0);
        this.f2987a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "id");
            int iM379o2 = aeq.m379o(cursorM409e, "state");
            int iM379o3 = aeq.m379o(cursorM409e, "worker_class_name");
            int iM379o4 = aeq.m379o(cursorM409e, "input_merger_class_name");
            int iM379o5 = aeq.m379o(cursorM409e, "input");
            int iM379o6 = aeq.m379o(cursorM409e, "output");
            int iM379o7 = aeq.m379o(cursorM409e, "initial_delay");
            int iM379o8 = aeq.m379o(cursorM409e, "interval_duration");
            int iM379o9 = aeq.m379o(cursorM409e, "flex_duration");
            int iM379o10 = aeq.m379o(cursorM409e, "run_attempt_count");
            int iM379o11 = aeq.m379o(cursorM409e, "backoff_policy");
            int iM379o12 = aeq.m379o(cursorM409e, "backoff_delay_duration");
            int iM379o13 = aeq.m379o(cursorM409e, "last_enqueue_time");
            int iM379o14 = aeq.m379o(cursorM409e, "minimum_retention_duration");
            apyVar = apyVarM1841a;
            try {
                int iM379o15 = aeq.m379o(cursorM409e, "schedule_requested_at");
                int iM379o16 = aeq.m379o(cursorM409e, "run_in_foreground");
                int iM379o17 = aeq.m379o(cursorM409e, "out_of_quota_policy");
                int iM379o18 = aeq.m379o(cursorM409e, "period_count");
                int iM379o19 = aeq.m379o(cursorM409e, "generation");
                int iM379o20 = aeq.m379o(cursorM409e, "required_network_type");
                int iM379o21 = aeq.m379o(cursorM409e, "requires_charging");
                int iM379o22 = aeq.m379o(cursorM409e, "requires_device_idle");
                int iM379o23 = aeq.m379o(cursorM409e, "requires_battery_not_low");
                int iM379o24 = aeq.m379o(cursorM409e, "requires_storage_not_low");
                int iM379o25 = aeq.m379o(cursorM409e, "trigger_content_update_delay");
                int iM379o26 = aeq.m379o(cursorM409e, "trigger_max_content_delay");
                int iM379o27 = aeq.m379o(cursorM409e, "content_uri_triggers");
                int i = iM379o14;
                ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                while (cursorM409e.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM409e.isNull(iM379o) ? null : cursorM409e.getString(iM379o);
                    int iM7728s = C0166er.m7728s(cursorM409e.getInt(iM379o2));
                    String string2 = cursorM409e.isNull(iM379o3) ? null : cursorM409e.getString(iM379o3);
                    String string3 = cursorM409e.isNull(iM379o4) ? null : cursorM409e.getString(iM379o4);
                    axt axtVarM2090a = axt.m2090a(cursorM409e.isNull(iM379o5) ? null : cursorM409e.getBlob(iM379o5));
                    axt axtVarM2090a2 = axt.m2090a(cursorM409e.isNull(iM379o6) ? null : cursorM409e.getBlob(iM379o6));
                    long j = cursorM409e.getLong(iM379o7);
                    long j2 = cursorM409e.getLong(iM379o8);
                    long j3 = cursorM409e.getLong(iM379o9);
                    int i2 = cursorM409e.getInt(iM379o10);
                    int iM7725p = C0166er.m7725p(cursorM409e.getInt(iM379o11));
                    long j4 = cursorM409e.getLong(iM379o12);
                    long j5 = cursorM409e.getLong(iM379o13);
                    int i3 = i;
                    long j6 = cursorM409e.getLong(i3);
                    int i4 = iM379o;
                    int i5 = iM379o15;
                    long j7 = cursorM409e.getLong(i5);
                    iM379o15 = i5;
                    int i6 = iM379o16;
                    boolean z = cursorM409e.getInt(i6) != 0;
                    iM379o16 = i6;
                    int i7 = iM379o17;
                    int iM7727r = C0166er.m7727r(cursorM409e.getInt(i7));
                    iM379o17 = i7;
                    int i8 = iM379o18;
                    int i9 = cursorM409e.getInt(i8);
                    iM379o18 = i8;
                    int i10 = iM379o19;
                    int i11 = cursorM409e.getInt(i10);
                    iM379o19 = i10;
                    int i12 = iM379o20;
                    int iM7726q = C0166er.m7726q(cursorM409e.getInt(i12));
                    iM379o20 = i12;
                    int i13 = iM379o21;
                    boolean z2 = cursorM409e.getInt(i13) != 0;
                    iM379o21 = i13;
                    int i14 = iM379o22;
                    boolean z3 = cursorM409e.getInt(i14) != 0;
                    iM379o22 = i14;
                    int i15 = iM379o23;
                    boolean z4 = cursorM409e.getInt(i15) != 0;
                    iM379o23 = i15;
                    int i16 = iM379o24;
                    boolean z5 = cursorM409e.getInt(i16) != 0;
                    iM379o24 = i16;
                    int i17 = iM379o25;
                    long j8 = cursorM409e.getLong(i17);
                    iM379o25 = i17;
                    int i18 = iM379o26;
                    long j9 = cursorM409e.getLong(i18);
                    iM379o26 = i18;
                    int i19 = iM379o27;
                    if (!cursorM409e.isNull(i19)) {
                        blob = cursorM409e.getBlob(i19);
                    }
                    iM379o27 = i19;
                    arrayList.add(new bcv(string, iM7728s, string2, string3, axtVarM2090a, axtVarM2090a2, j, j2, j3, new axr(iM7726q, z2, z3, z4, z5, j8, j9, C0166er.m7719j(blob)), i2, iM7725p, j4, j5, j6, j7, z, iM7727r, i9, i11));
                    iM379o = i4;
                    i = i3;
                }
                cursorM409e.close();
                apyVar.m1850j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM409e.close();
                apyVar.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            apyVar = apyVarM1841a;
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: c */
    public final List mo2234c() throws Throwable {
        apy apyVar;
        apy apyVarM1841a = apy.m1841a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f2987a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "id");
            int iM379o2 = aeq.m379o(cursorM409e, "state");
            int iM379o3 = aeq.m379o(cursorM409e, "worker_class_name");
            int iM379o4 = aeq.m379o(cursorM409e, "input_merger_class_name");
            int iM379o5 = aeq.m379o(cursorM409e, "input");
            int iM379o6 = aeq.m379o(cursorM409e, "output");
            int iM379o7 = aeq.m379o(cursorM409e, "initial_delay");
            int iM379o8 = aeq.m379o(cursorM409e, "interval_duration");
            int iM379o9 = aeq.m379o(cursorM409e, "flex_duration");
            int iM379o10 = aeq.m379o(cursorM409e, "run_attempt_count");
            int iM379o11 = aeq.m379o(cursorM409e, "backoff_policy");
            int iM379o12 = aeq.m379o(cursorM409e, "backoff_delay_duration");
            int iM379o13 = aeq.m379o(cursorM409e, "last_enqueue_time");
            int iM379o14 = aeq.m379o(cursorM409e, "minimum_retention_duration");
            apyVar = apyVarM1841a;
            try {
                int iM379o15 = aeq.m379o(cursorM409e, "schedule_requested_at");
                int iM379o16 = aeq.m379o(cursorM409e, "run_in_foreground");
                int iM379o17 = aeq.m379o(cursorM409e, "out_of_quota_policy");
                int iM379o18 = aeq.m379o(cursorM409e, "period_count");
                int iM379o19 = aeq.m379o(cursorM409e, "generation");
                int iM379o20 = aeq.m379o(cursorM409e, "required_network_type");
                int iM379o21 = aeq.m379o(cursorM409e, "requires_charging");
                int iM379o22 = aeq.m379o(cursorM409e, "requires_device_idle");
                int iM379o23 = aeq.m379o(cursorM409e, "requires_battery_not_low");
                int iM379o24 = aeq.m379o(cursorM409e, "requires_storage_not_low");
                int iM379o25 = aeq.m379o(cursorM409e, "trigger_content_update_delay");
                int iM379o26 = aeq.m379o(cursorM409e, "trigger_max_content_delay");
                int iM379o27 = aeq.m379o(cursorM409e, "content_uri_triggers");
                int i = iM379o14;
                ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                while (cursorM409e.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM409e.isNull(iM379o) ? null : cursorM409e.getString(iM379o);
                    int iM7728s = C0166er.m7728s(cursorM409e.getInt(iM379o2));
                    String string2 = cursorM409e.isNull(iM379o3) ? null : cursorM409e.getString(iM379o3);
                    String string3 = cursorM409e.isNull(iM379o4) ? null : cursorM409e.getString(iM379o4);
                    axt axtVarM2090a = axt.m2090a(cursorM409e.isNull(iM379o5) ? null : cursorM409e.getBlob(iM379o5));
                    axt axtVarM2090a2 = axt.m2090a(cursorM409e.isNull(iM379o6) ? null : cursorM409e.getBlob(iM379o6));
                    long j = cursorM409e.getLong(iM379o7);
                    long j2 = cursorM409e.getLong(iM379o8);
                    long j3 = cursorM409e.getLong(iM379o9);
                    int i2 = cursorM409e.getInt(iM379o10);
                    int iM7725p = C0166er.m7725p(cursorM409e.getInt(iM379o11));
                    long j4 = cursorM409e.getLong(iM379o12);
                    long j5 = cursorM409e.getLong(iM379o13);
                    int i3 = i;
                    long j6 = cursorM409e.getLong(i3);
                    int i4 = iM379o;
                    int i5 = iM379o15;
                    long j7 = cursorM409e.getLong(i5);
                    iM379o15 = i5;
                    int i6 = iM379o16;
                    boolean z = cursorM409e.getInt(i6) != 0;
                    iM379o16 = i6;
                    int i7 = iM379o17;
                    int iM7727r = C0166er.m7727r(cursorM409e.getInt(i7));
                    iM379o17 = i7;
                    int i8 = iM379o18;
                    int i9 = cursorM409e.getInt(i8);
                    iM379o18 = i8;
                    int i10 = iM379o19;
                    int i11 = cursorM409e.getInt(i10);
                    iM379o19 = i10;
                    int i12 = iM379o20;
                    int iM7726q = C0166er.m7726q(cursorM409e.getInt(i12));
                    iM379o20 = i12;
                    int i13 = iM379o21;
                    boolean z2 = cursorM409e.getInt(i13) != 0;
                    iM379o21 = i13;
                    int i14 = iM379o22;
                    boolean z3 = cursorM409e.getInt(i14) != 0;
                    iM379o22 = i14;
                    int i15 = iM379o23;
                    boolean z4 = cursorM409e.getInt(i15) != 0;
                    iM379o23 = i15;
                    int i16 = iM379o24;
                    boolean z5 = cursorM409e.getInt(i16) != 0;
                    iM379o24 = i16;
                    int i17 = iM379o25;
                    long j8 = cursorM409e.getLong(i17);
                    iM379o25 = i17;
                    int i18 = iM379o26;
                    long j9 = cursorM409e.getLong(i18);
                    iM379o26 = i18;
                    int i19 = iM379o27;
                    if (!cursorM409e.isNull(i19)) {
                        blob = cursorM409e.getBlob(i19);
                    }
                    iM379o27 = i19;
                    arrayList.add(new bcv(string, iM7728s, string2, string3, axtVarM2090a, axtVarM2090a2, j, j2, j3, new axr(iM7726q, z2, z3, z4, z5, j8, j9, C0166er.m7719j(blob)), i2, iM7725p, j4, j5, j6, j7, z, iM7727r, i9, i11));
                    iM379o = i4;
                    i = i3;
                }
                cursorM409e.close();
                apyVar.m1850j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM409e.close();
                apyVar.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            apyVar = apyVarM1841a;
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: d */
    public final List mo2235d(String str) {
        apy apyVarM1841a = apy.m1841a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            apyVarM1841a.mo1846f(1);
        } else {
            apyVarM1841a.mo1847g(1, str);
        }
        this.f2987a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM409e.getCount());
            while (cursorM409e.moveToNext()) {
                arrayList.add(new bct(cursorM409e.isNull(0) ? null : cursorM409e.getString(0), C0166er.m7728s(cursorM409e.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorM409e.close();
            apyVarM1841a.m1850j();
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: e */
    public final void mo2236e(String str) {
        this.f2987a.m1824l();
        arf arfVarM1853e = this.f2993g.m1853e();
        arfVarM1853e.mo1847g(1, str);
        this.f2987a.m1825m();
        try {
            arfVarM1853e.m1883a();
            this.f2987a.m1829q();
        } finally {
            this.f2987a.m1827o();
            this.f2993g.m1855g(arfVarM1853e);
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: f */
    public final void mo2237f(String str, long j) {
        this.f2987a.m1824l();
        arf arfVarM1853e = this.f2996j.m1853e();
        arfVarM1853e.mo1845e(1, j);
        if (str == null) {
            arfVarM1853e.mo1846f(2);
        } else {
            arfVarM1853e.mo1847g(2, str);
        }
        this.f2987a.m1825m();
        try {
            arfVarM1853e.m1883a();
            this.f2987a.m1829q();
        } finally {
            this.f2987a.m1827o();
            this.f2996j.m1855g(arfVarM1853e);
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: g */
    public final void mo2238g(String str, axt axtVar) {
        this.f2987a.m1824l();
        arf arfVarM1853e = this.f2995i.m1853e();
        byte[] bArrM2091c = axt.m2091c(axtVar);
        if (bArrM2091c == null) {
            arfVarM1853e.mo1846f(1);
        } else {
            arfVarM1853e.mo1843c(1, bArrM2091c);
        }
        arfVarM1853e.mo1847g(2, str);
        this.f2987a.m1825m();
        try {
            arfVarM1853e.m1883a();
            this.f2987a.m1829q();
        } finally {
            this.f2987a.m1827o();
            this.f2995i.m1855g(arfVarM1853e);
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: h */
    public final int mo2239h(String str) {
        apy apyVarM1841a = apy.m1841a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            apyVarM1841a.mo1846f(1);
        } else {
            apyVarM1841a.mo1847g(1, str);
        }
        this.f2987a.m1824l();
        int iM7728s = 0;
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            if (cursorM409e.moveToFirst()) {
                Integer numValueOf = cursorM409e.isNull(0) ? null : Integer.valueOf(cursorM409e.getInt(0));
                if (numValueOf != null) {
                    iM7728s = C0166er.m7728s(numValueOf.intValue());
                }
            }
            return iM7728s;
        } finally {
            cursorM409e.close();
            apyVarM1841a.m1850j();
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: i */
    public final List mo2240i() throws Throwable {
        apy apyVar;
        apy apyVarM1841a = apy.m1841a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        apyVarM1841a.mo1845e(1, 200L);
        this.f2987a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "id");
            int iM379o2 = aeq.m379o(cursorM409e, "state");
            int iM379o3 = aeq.m379o(cursorM409e, "worker_class_name");
            int iM379o4 = aeq.m379o(cursorM409e, "input_merger_class_name");
            int iM379o5 = aeq.m379o(cursorM409e, "input");
            int iM379o6 = aeq.m379o(cursorM409e, "output");
            int iM379o7 = aeq.m379o(cursorM409e, "initial_delay");
            int iM379o8 = aeq.m379o(cursorM409e, "interval_duration");
            int iM379o9 = aeq.m379o(cursorM409e, "flex_duration");
            int iM379o10 = aeq.m379o(cursorM409e, "run_attempt_count");
            int iM379o11 = aeq.m379o(cursorM409e, "backoff_policy");
            int iM379o12 = aeq.m379o(cursorM409e, "backoff_delay_duration");
            int iM379o13 = aeq.m379o(cursorM409e, "last_enqueue_time");
            int iM379o14 = aeq.m379o(cursorM409e, "minimum_retention_duration");
            apyVar = apyVarM1841a;
            try {
                int iM379o15 = aeq.m379o(cursorM409e, "schedule_requested_at");
                int iM379o16 = aeq.m379o(cursorM409e, "run_in_foreground");
                int iM379o17 = aeq.m379o(cursorM409e, "out_of_quota_policy");
                int iM379o18 = aeq.m379o(cursorM409e, "period_count");
                int iM379o19 = aeq.m379o(cursorM409e, "generation");
                int iM379o20 = aeq.m379o(cursorM409e, "required_network_type");
                int iM379o21 = aeq.m379o(cursorM409e, "requires_charging");
                int iM379o22 = aeq.m379o(cursorM409e, "requires_device_idle");
                int iM379o23 = aeq.m379o(cursorM409e, "requires_battery_not_low");
                int iM379o24 = aeq.m379o(cursorM409e, "requires_storage_not_low");
                int iM379o25 = aeq.m379o(cursorM409e, "trigger_content_update_delay");
                int iM379o26 = aeq.m379o(cursorM409e, "trigger_max_content_delay");
                int iM379o27 = aeq.m379o(cursorM409e, "content_uri_triggers");
                int i = iM379o14;
                ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                while (cursorM409e.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM409e.isNull(iM379o) ? null : cursorM409e.getString(iM379o);
                    int iM7728s = C0166er.m7728s(cursorM409e.getInt(iM379o2));
                    String string2 = cursorM409e.isNull(iM379o3) ? null : cursorM409e.getString(iM379o3);
                    String string3 = cursorM409e.isNull(iM379o4) ? null : cursorM409e.getString(iM379o4);
                    axt axtVarM2090a = axt.m2090a(cursorM409e.isNull(iM379o5) ? null : cursorM409e.getBlob(iM379o5));
                    axt axtVarM2090a2 = axt.m2090a(cursorM409e.isNull(iM379o6) ? null : cursorM409e.getBlob(iM379o6));
                    long j = cursorM409e.getLong(iM379o7);
                    long j2 = cursorM409e.getLong(iM379o8);
                    long j3 = cursorM409e.getLong(iM379o9);
                    int i2 = cursorM409e.getInt(iM379o10);
                    int iM7725p = C0166er.m7725p(cursorM409e.getInt(iM379o11));
                    long j4 = cursorM409e.getLong(iM379o12);
                    long j5 = cursorM409e.getLong(iM379o13);
                    int i3 = i;
                    long j6 = cursorM409e.getLong(i3);
                    int i4 = iM379o;
                    int i5 = iM379o15;
                    long j7 = cursorM409e.getLong(i5);
                    iM379o15 = i5;
                    int i6 = iM379o16;
                    boolean z = cursorM409e.getInt(i6) != 0;
                    iM379o16 = i6;
                    int i7 = iM379o17;
                    int iM7727r = C0166er.m7727r(cursorM409e.getInt(i7));
                    iM379o17 = i7;
                    int i8 = iM379o18;
                    int i9 = cursorM409e.getInt(i8);
                    iM379o18 = i8;
                    int i10 = iM379o19;
                    int i11 = cursorM409e.getInt(i10);
                    iM379o19 = i10;
                    int i12 = iM379o20;
                    int iM7726q = C0166er.m7726q(cursorM409e.getInt(i12));
                    iM379o20 = i12;
                    int i13 = iM379o21;
                    boolean z2 = cursorM409e.getInt(i13) != 0;
                    iM379o21 = i13;
                    int i14 = iM379o22;
                    boolean z3 = cursorM409e.getInt(i14) != 0;
                    iM379o22 = i14;
                    int i15 = iM379o23;
                    boolean z4 = cursorM409e.getInt(i15) != 0;
                    iM379o23 = i15;
                    int i16 = iM379o24;
                    boolean z5 = cursorM409e.getInt(i16) != 0;
                    iM379o24 = i16;
                    int i17 = iM379o25;
                    long j8 = cursorM409e.getLong(i17);
                    iM379o25 = i17;
                    int i18 = iM379o26;
                    long j9 = cursorM409e.getLong(i18);
                    iM379o26 = i18;
                    int i19 = iM379o27;
                    if (!cursorM409e.isNull(i19)) {
                        blob = cursorM409e.getBlob(i19);
                    }
                    iM379o27 = i19;
                    arrayList.add(new bcv(string, iM7728s, string2, string3, axtVarM2090a, axtVarM2090a2, j, j2, j3, new axr(iM7726q, z2, z3, z4, z5, j8, j9, C0166er.m7719j(blob)), i2, iM7725p, j4, j5, j6, j7, z, iM7727r, i9, i11));
                    iM379o = i4;
                    i = i3;
                }
                cursorM409e.close();
                apyVar.m1850j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM409e.close();
                apyVar.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            apyVar = apyVarM1841a;
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: j */
    public final void mo2241j(String str, long j) {
        this.f2987a.m1824l();
        arf arfVarM1853e = this.f2997k.m1853e();
        arfVarM1853e.mo1845e(1, j);
        if (str == null) {
            arfVarM1853e.mo1846f(2);
        } else {
            arfVarM1853e.mo1847g(2, str);
        }
        this.f2987a.m1825m();
        try {
            arfVarM1853e.m1883a();
            this.f2987a.m1829q();
        } finally {
            this.f2987a.m1827o();
            this.f2997k.m1855g(arfVarM1853e);
        }
    }

    @Override // p000.bcw
    /* JADX INFO: renamed from: k */
    public final void mo2242k(int i, String str) {
        this.f2987a.m1824l();
        arf arfVarM1853e = this.f2994h.m1853e();
        arfVarM1853e.mo1845e(1, C0166er.m7724o(i));
        if (str == null) {
            arfVarM1853e.mo1846f(2);
        } else {
            arfVarM1853e.mo1847g(2, str);
        }
        this.f2987a.m1825m();
        try {
            arfVarM1853e.m1883a();
            this.f2987a.m1829q();
        } finally {
            this.f2987a.m1827o();
            this.f2994h.m1855g(arfVarM1853e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2243l(C1109wy c1109wy) {
        Set<String> setKeySet = c1109wy.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (c1109wy.f48004d > 999) {
            C1109wy c1109wy2 = new C1109wy(999);
            int i = c1109wy.f48004d;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c1109wy2.put((String) c1109wy.m19559d(i2), (ArrayList) c1109wy.m19560g(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    m2243l(c1109wy2);
                    c1109wy2 = new C1109wy(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                m2243l(c1109wy2);
                return;
            }
            return;
        }
        StringBuilder sbM451l = afc.m451l();
        sbM451l.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        afc.m452m(sbM451l, size);
        sbM451l.append(")");
        apy apyVarM1841a = apy.m1841a(sbM451l.toString(), size);
        int i4 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                apyVarM1841a.mo1846f(i4);
            } else {
                apyVarM1841a.mo1847g(i4, str);
            }
            i4++;
        }
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            int iM378n = aeq.m378n(cursorM409e, "work_spec_id");
            if (iM378n != -1) {
                while (cursorM409e.moveToNext()) {
                    ArrayList arrayList = (ArrayList) c1109wy.get(cursorM409e.getString(iM378n));
                    if (arrayList != null) {
                        arrayList.add(axt.m2090a(cursorM409e.isNull(0) ? null : cursorM409e.getBlob(0)));
                    }
                }
            }
        } finally {
            cursorM409e.close();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2244m(C1109wy c1109wy) {
        Set<String> setKeySet = c1109wy.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (c1109wy.f48004d > 999) {
            C1109wy c1109wy2 = new C1109wy(999);
            int i = c1109wy.f48004d;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                c1109wy2.put((String) c1109wy.m19559d(i2), (ArrayList) c1109wy.m19560g(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    m2244m(c1109wy2);
                    c1109wy2 = new C1109wy(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                m2244m(c1109wy2);
                return;
            }
            return;
        }
        StringBuilder sbM451l = afc.m451l();
        sbM451l.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        afc.m452m(sbM451l, size);
        sbM451l.append(")");
        apy apyVarM1841a = apy.m1841a(sbM451l.toString(), size);
        int i4 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                apyVarM1841a.mo1846f(i4);
            } else {
                apyVarM1841a.mo1847g(i4, str);
            }
            i4++;
        }
        Cursor cursorM409e = aey.m409e(this.f2987a, apyVarM1841a, false);
        try {
            int iM378n = aeq.m378n(cursorM409e, "work_spec_id");
            if (iM378n != -1) {
                while (cursorM409e.moveToNext()) {
                    ArrayList arrayList = (ArrayList) c1109wy.get(cursorM409e.getString(iM378n));
                    if (arrayList != null) {
                        arrayList.add(cursorM409e.isNull(0) ? null : cursorM409e.getString(0));
                    }
                }
            }
        } finally {
            cursorM409e.close();
        }
    }
}
