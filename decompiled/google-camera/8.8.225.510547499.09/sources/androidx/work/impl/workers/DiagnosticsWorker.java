package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.C0139dr;
import p000.C0166er;
import p000.aeq;
import p000.aey;
import p000.apy;
import p000.axr;
import p000.axt;
import p000.ayc;
import p000.azp;
import p000.bce;
import p000.bcl;
import p000.bcv;
import p000.bcw;
import p000.bdk;
import p000.bdl;
import p000.bfa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: b */
    public final C0139dr mo1698b() throws Throwable {
        apy apyVar;
        bce bceVar;
        bcl bclVar;
        bdl bdlVar;
        WorkDatabase workDatabase = azp.m2125e(this.f2705c).f2782d;
        workDatabase.getClass();
        bcw bcwVarMo1700B = workDatabase.mo1700B();
        bcl bclVarMo1705z = workDatabase.mo1705z();
        bdl bdlVarMo1701C = workDatabase.mo1701C();
        bce bceVarMo1704y = workDatabase.mo1704y();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        apy apyVarM1841a = apy.m1841a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        apyVarM1841a.mo1845e(1, jCurrentTimeMillis);
        bdk bdkVar = (bdk) bcwVarMo1700B;
        bdkVar.f2987a.m1824l();
        Cursor cursorM409e = aey.m409e(bdkVar.f2987a, apyVarM1841a, false);
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
                    int i4 = iM379o11;
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
                    iM379o11 = i4;
                    i = i3;
                }
                cursorM409e.close();
                apyVar.m1850j();
                List listMo2233b = bcwVarMo1700B.mo2233b();
                List listMo2240i = bcwVarMo1700B.mo2240i();
                if (arrayList.isEmpty()) {
                    bceVar = bceVarMo1704y;
                    bclVar = bclVarMo1705z;
                    bdlVar = bdlVarMo1701C;
                } else {
                    ayc.m2099a();
                    int i20 = bfa.f3081a;
                    ayc.m2099a();
                    bceVar = bceVarMo1704y;
                    bclVar = bclVarMo1705z;
                    bdlVar = bdlVarMo1701C;
                    bfa.m2289a(bclVar, bdlVar, bceVar, arrayList);
                }
                if (!listMo2233b.isEmpty()) {
                    ayc.m2099a();
                    int i21 = bfa.f3081a;
                    ayc.m2099a();
                    bfa.m2289a(bclVar, bdlVar, bceVar, listMo2233b);
                }
                if (!listMo2240i.isEmpty()) {
                    ayc.m2099a();
                    int i22 = bfa.f3081a;
                    ayc.m2099a();
                    bfa.m2289a(bclVar, bdlVar, bceVar, listMo2240i);
                }
                return C0139dr.m6616e();
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
}
