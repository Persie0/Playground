package p000;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azf {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f2762a = 0;

    static {
        ayc.m2100b("Schedulers");
    }

    /* JADX INFO: renamed from: a */
    public static void m2120a(axp axpVar, WorkDatabase workDatabase, List list) {
        apy apyVar;
        if (list == null || list.size() == 0) {
            return;
        }
        bcw bcwVarMo1700B = workDatabase.mo1700B();
        workDatabase.m1825m();
        try {
            int i = axpVar.f2674e;
            apy apyVarM1841a = apy.m1841a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
            apyVarM1841a.mo1845e(1, 20L);
            ((bdk) bcwVarMo1700B).f2987a.m1824l();
            Cursor cursorM409e = aey.m409e(((bdk) bcwVarMo1700B).f2987a, apyVarM1841a, false);
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
                bcw bcwVar = bcwVarMo1700B;
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
                    int iM379o26 = aeq.m379o(cursorM409e, JrxsYuVZZqnFC.RWW);
                    int iM379o27 = aeq.m379o(cursorM409e, "content_uri_triggers");
                    int i2 = iM379o14;
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
                        int i3 = cursorM409e.getInt(iM379o10);
                        int iM7725p = C0166er.m7725p(cursorM409e.getInt(iM379o11));
                        long j4 = cursorM409e.getLong(iM379o12);
                        long j5 = cursorM409e.getLong(iM379o13);
                        int i4 = i2;
                        long j6 = cursorM409e.getLong(i4);
                        i2 = i4;
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
                        arrayList.add(new bcv(string, iM7728s, string2, string3, axtVarM2090a, axtVarM2090a2, j, j2, j3, new axr(iM7726q, z2, z3, z4, z5, j8, j9, C0166er.m7719j(blob)), i3, iM7725p, j4, j5, j6, j7, z, iM7727r, i9, i11));
                    }
                    cursorM409e.close();
                    apyVar.m1850j();
                    List listMo2240i = bcwVar.mo2240i();
                    if (arrayList.size() > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            bcw bcwVar2 = bcwVar;
                            bcwVar2.mo2241j(((bcv) it.next()).f2964a, jCurrentTimeMillis);
                            bcwVar = bcwVar2;
                        }
                    }
                    workDatabase.m1829q();
                    workDatabase.m1827o();
                    if (arrayList.size() > 0) {
                        bcv[] bcvVarArr = (bcv[]) arrayList.toArray(new bcv[arrayList.size()]);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            azd azdVar = (azd) it2.next();
                            if (azdVar.mo2119d()) {
                                azdVar.mo2118c(bcvVarArr);
                            }
                        }
                    }
                    if (listMo2240i.size() > 0) {
                        bcv[] bcvVarArr2 = (bcv[]) listMo2240i.toArray(new bcv[listMo2240i.size()]);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            azd azdVar2 = (azd) it3.next();
                            if (!azdVar2.mo2119d()) {
                                azdVar2.mo2118c(bcvVarArr2);
                            }
                        }
                    }
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
        } catch (Throwable th3) {
            workDatabase.m1827o();
            throw th3;
        }
    }
}
