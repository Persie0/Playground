package p000;

import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36544a;

    public /* synthetic */ e0b(int i) {
        this.f36544a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        ik8 ik8Var;
        int i = this.f36544a;
        wxa wxaVar = wxa.f67489a;
        switch (i) {
            case 0:
                sxa sxaVar = (sxa) obj;
                sxaVar.getClass();
                return Integer.valueOf(sxaVar.f61562a);
            case 1:
                n1b n1bVar = (n1b) obj;
                n1bVar.getClass();
                return n1b.m17171a(n1bVar, null, null, null, r0b.m20229a(n1bVar.f52194d, 1, 0, 30), null, false, false, false, false, null, null, 2039);
            case 2:
                n1b n1bVar2 = (n1b) obj;
                n1bVar2.getClass();
                return n1b.m17171a(n1bVar2, null, null, null, null, null, false, false, false, false, null, gya.f41535a, 1023);
            case 3:
                n1b n1bVar3 = (n1b) obj;
                n1bVar3.getClass();
                return n1b.m17171a(n1bVar3, null, null, null, null, null, false, false, false, false, null, null, 1535);
            case 4:
                n1b n1bVar4 = (n1b) obj;
                n1bVar4.getClass();
                return n1b.m17171a(n1bVar4, null, null, null, null, null, false, false, false, false, null, hya.f43221a, 1023);
            case 5:
                n1b n1bVar5 = (n1b) obj;
                n1bVar5.getClass();
                return n1bVar5;
            case 6:
                n1b n1bVar6 = (n1b) obj;
                n1bVar6.getClass();
                return n1b.m17171a(n1bVar6, null, null, null, new r0b(), null, false, false, false, false, null, hya.f43221a, 503);
            case 7:
                return n1b.m17171a((n1b) obj, null, null, null, null, null, false, false, false, false, null, new jya(wxaVar), 1023);
            case 8:
                return n1b.m17171a((n1b) obj, null, null, null, null, null, false, false, false, false, null, new jya(wxaVar), 1023);
            case 9:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "state");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "worker_class_name");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "input_merger_class_name");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "input");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "output");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "initial_delay");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "interval_duration");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "flex_duration");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "run_attempt_count");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "backoff_policy");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "backoff_delay_duration");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "last_enqueue_time");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "minimum_retention_duration");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "schedule_requested_at");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "run_in_foreground");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "out_of_quota_policy");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "period_count");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "generation");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "next_schedule_time_override");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "next_schedule_time_override_generation");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e0, "stop_reason");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e0, "trace_tag");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e0, "backoff_on_system_interruptions");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e0, "required_network_type");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e0, "required_network_request");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e0, "requires_charging");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e0, "requires_device_idle");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e0, "requires_battery_not_low");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e0, "requires_storage_not_low");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e0, "trigger_content_update_delay");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e0, "trigger_max_content_delay");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        int i2 = iM14108v14;
                        ArrayList arrayList2 = arrayList;
                        WorkInfo$State workInfo$StateM3626h = bcd.m3626h((int) ik8VarMo2873e0.getLong(iM14108v2));
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v4);
                        byte[] blob = ik8VarMo2873e0.getBlob(iM14108v5);
                        sz1 sz1Var = sz1.f61645b;
                        sz1 sz1VarM14366a = jad.m14366a(blob);
                        sz1 sz1VarM14366a2 = jad.m14366a(ik8VarMo2873e0.getBlob(iM14108v6));
                        long j = ik8VarMo2873e0.getLong(iM14108v7);
                        long j2 = ik8VarMo2873e0.getLong(iM14108v8);
                        long j3 = ik8VarMo2873e0.getLong(iM14108v9);
                        int i3 = (int) ik8VarMo2873e0.getLong(iM14108v10);
                        BackoffPolicy backoffPolicyM3623e = bcd.m3623e((int) ik8VarMo2873e0.getLong(iM14108v11));
                        long j4 = ik8VarMo2873e0.getLong(iM14108v12);
                        long j5 = ik8VarMo2873e0.getLong(iM14108v13);
                        long j6 = ik8VarMo2873e0.getLong(i2);
                        int i4 = iM14108v15;
                        long j7 = ik8VarMo2873e0.getLong(i4);
                        int i5 = iM14108v;
                        int i6 = iM14108v16;
                        boolean z = ((int) ik8VarMo2873e0.getLong(i6)) != 0;
                        int i7 = iM14108v17;
                        int i8 = iM14108v2;
                        OutOfQuotaPolicy outOfQuotaPolicyM3625g = bcd.m3625g((int) ik8VarMo2873e0.getLong(i7));
                        int i9 = iM14108v18;
                        int i10 = iM14108v3;
                        int i11 = (int) ik8VarMo2873e0.getLong(i9);
                        int i12 = iM14108v19;
                        int i13 = (int) ik8VarMo2873e0.getLong(i12);
                        int i14 = iM14108v20;
                        long j8 = ik8VarMo2873e0.getLong(i14);
                        int i15 = iM14108v21;
                        int i16 = (int) ik8VarMo2873e0.getLong(i15);
                        int i17 = iM14108v22;
                        int i18 = (int) ik8VarMo2873e0.getLong(i17);
                        int i19 = iM14108v23;
                        Boolean boolValueOf = null;
                        String strMo2875L4 = ik8VarMo2873e0.isNull(i19) ? null : ik8VarMo2873e0.mo2875L(i19);
                        int i20 = iM14108v24;
                        Integer numValueOf = ik8VarMo2873e0.isNull(i20) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i20));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i21 = iM14108v25;
                        Boolean bool = boolValueOf;
                        NetworkType networkTypeM3624f = bcd.m3624f((int) ik8VarMo2873e0.getLong(i21));
                        int i22 = iM14108v26;
                        gk6 gk6VarM3631m = bcd.m3631m(ik8VarMo2873e0.getBlob(i22));
                        iM14108v25 = i21;
                        iM14108v26 = i22;
                        int i23 = iM14108v27;
                        boolean z2 = ((int) ik8VarMo2873e0.getLong(i23)) != 0;
                        iM14108v27 = i23;
                        int i24 = iM14108v28;
                        boolean z3 = ((int) ik8VarMo2873e0.getLong(i24)) != 0;
                        int i25 = iM14108v29;
                        boolean z4 = ((int) ik8VarMo2873e0.getLong(i25)) != 0;
                        iM14108v29 = i25;
                        int i26 = iM14108v30;
                        int i27 = iM14108v31;
                        int i28 = iM14108v32;
                        int i29 = iM14108v33;
                        iM14108v33 = i29;
                        ik8Var = ik8VarMo2873e0;
                        try {
                            arrayList2.add(new p8b(strMo2875L, workInfo$StateM3626h, strMo2875L2, strMo2875L3, sz1VarM14366a, sz1VarM14366a2, j, j2, j3, new ak1(gk6VarM3631m, networkTypeM3624f, z2, z3, z4, ((int) ik8VarMo2873e0.getLong(i26)) != 0, ik8VarMo2873e0.getLong(i27), ik8VarMo2873e0.getLong(i28), bcd.m3621c(ik8VarMo2873e0.getBlob(i29))), i3, backoffPolicyM3623e, j4, j5, j6, j7, z, outOfQuotaPolicyM3625g, i11, i13, j8, i16, i18, strMo2875L4, bool));
                            iM14108v30 = i26;
                            iM14108v2 = i8;
                            iM14108v17 = i7;
                            iM14108v19 = i12;
                            iM14108v22 = i17;
                            iM14108v24 = i20;
                            iM14108v = i5;
                            iM14108v32 = i28;
                            iM14108v15 = i4;
                            iM14108v16 = i6;
                            iM14108v20 = i14;
                            iM14108v21 = i15;
                            iM14108v23 = i19;
                            arrayList = arrayList2;
                            iM14108v28 = i24;
                            iM14108v3 = i10;
                            ik8VarMo2873e0 = ik8Var;
                            iM14108v18 = i9;
                            iM14108v31 = i27;
                            iM14108v14 = i2;
                        } catch (Throwable th) {
                            th = th;
                            ik8Var.close();
                            throw th;
                        }
                        break;
                    }
                    ik8 ik8Var2 = ik8VarMo2873e0;
                    ArrayList arrayList3 = arrayList;
                    ik8Var2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    ik8Var = ik8VarMo2873e0;
                }
                break;
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    return Integer.valueOf(ik8VarMo2873e1.mo2876a0() ? (int) ik8VarMo2873e1.getLong(0) : 0);
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
