package p000;

import androidx.compose.foundation.lazy.C0127b;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y91 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f69508b;

    public /* synthetic */ y91(C0127b c0127b, int i) {
        this.f69507a = 2;
        this.f69508b = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Integer numValueOf;
        ik8 ik8Var;
        int i = this.f69507a;
        int i2 = this.f69508b;
        switch (i) {
            case 0:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(wq1.m24114j("Collection doesn't contain element at index ", i2, '.'));
            case 1:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `order` FROM DictionaryDataEntity WHERE id = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i2);
                    if (ik8VarMo2873e0.mo2876a0() && !ik8VarMo2873e0.isNull(0)) {
                        numValueOf = Integer.valueOf((int) ik8VarMo2873e0.getLong(0));
                        break;
                    } else {
                        numValueOf = null;
                    }
                    return numValueOf;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 2:
                ju4 ju4Var = (ju4) obj;
                jc9 jc9VarM16139y = lda.m16139y();
                lda.m16110J(jc9VarM16139y, lda.m16106F(jc9VarM16139y), jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null);
                int i3 = ju4Var.f46158a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    ju4Var.m14656a(i2 + i4);
                }
                return xfa.f68157a;
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "state");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "worker_class_name");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "input_merger_class_name");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "input");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "output");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "initial_delay");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "interval_duration");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "flex_duration");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "run_attempt_count");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "backoff_policy");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "backoff_delay_duration");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "last_enqueue_time");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "minimum_retention_duration");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "schedule_requested_at");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "run_in_foreground");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "out_of_quota_policy");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "period_count");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e1, "generation");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e1, "next_schedule_time_override");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e1, "next_schedule_time_override_generation");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e1, "stop_reason");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e1, "trace_tag");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e1, "backoff_on_system_interruptions");
                    int iM14108v25 = AbstractC3122is.m14108v(ik8VarMo2873e1, "required_network_type");
                    int iM14108v26 = AbstractC3122is.m14108v(ik8VarMo2873e1, "required_network_request");
                    int iM14108v27 = AbstractC3122is.m14108v(ik8VarMo2873e1, "requires_charging");
                    int iM14108v28 = AbstractC3122is.m14108v(ik8VarMo2873e1, "requires_device_idle");
                    int iM14108v29 = AbstractC3122is.m14108v(ik8VarMo2873e1, "requires_battery_not_low");
                    int iM14108v30 = AbstractC3122is.m14108v(ik8VarMo2873e1, "requires_storage_not_low");
                    int iM14108v31 = AbstractC3122is.m14108v(ik8VarMo2873e1, "trigger_content_update_delay");
                    int iM14108v32 = AbstractC3122is.m14108v(ik8VarMo2873e1, "trigger_max_content_delay");
                    int iM14108v33 = AbstractC3122is.m14108v(ik8VarMo2873e1, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e1.mo2875L(iM14108v);
                        ArrayList arrayList2 = arrayList;
                        int i5 = iM14108v14;
                        WorkInfo$State workInfo$StateM3626h = bcd.m3626h((int) ik8VarMo2873e1.getLong(iM14108v2));
                        String strMo2875L2 = ik8VarMo2873e1.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e1.mo2875L(iM14108v4);
                        byte[] blob = ik8VarMo2873e1.getBlob(iM14108v5);
                        sz1 sz1Var = sz1.f61645b;
                        sz1 sz1VarM14366a = jad.m14366a(blob);
                        sz1 sz1VarM14366a2 = jad.m14366a(ik8VarMo2873e1.getBlob(iM14108v6));
                        long j = ik8VarMo2873e1.getLong(iM14108v7);
                        long j2 = ik8VarMo2873e1.getLong(iM14108v8);
                        long j3 = ik8VarMo2873e1.getLong(iM14108v9);
                        int i6 = (int) ik8VarMo2873e1.getLong(iM14108v10);
                        BackoffPolicy backoffPolicyM3623e = bcd.m3623e((int) ik8VarMo2873e1.getLong(iM14108v11));
                        long j4 = ik8VarMo2873e1.getLong(iM14108v12);
                        long j5 = ik8VarMo2873e1.getLong(iM14108v13);
                        long j6 = ik8VarMo2873e1.getLong(i5);
                        int i7 = iM14108v15;
                        long j7 = ik8VarMo2873e1.getLong(i7);
                        int i8 = iM14108v;
                        int i9 = iM14108v16;
                        boolean z = ((int) ik8VarMo2873e1.getLong(i9)) != 0;
                        int i10 = iM14108v17;
                        int i11 = iM14108v13;
                        OutOfQuotaPolicy outOfQuotaPolicyM3625g = bcd.m3625g((int) ik8VarMo2873e1.getLong(i10));
                        int i12 = iM14108v18;
                        int i13 = iM14108v2;
                        int i14 = (int) ik8VarMo2873e1.getLong(i12);
                        int i15 = iM14108v19;
                        int i16 = (int) ik8VarMo2873e1.getLong(i15);
                        int i17 = iM14108v20;
                        long j8 = ik8VarMo2873e1.getLong(i17);
                        int i18 = iM14108v21;
                        int i19 = (int) ik8VarMo2873e1.getLong(i18);
                        int i20 = iM14108v22;
                        int i21 = (int) ik8VarMo2873e1.getLong(i20);
                        int i22 = iM14108v23;
                        String strMo2875L4 = ik8VarMo2873e1.isNull(i22) ? null : ik8VarMo2873e1.mo2875L(i22);
                        int i23 = iM14108v24;
                        Integer numValueOf2 = ik8VarMo2873e1.isNull(i23) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(i23));
                        Boolean boolValueOf = numValueOf2 != null ? Boolean.valueOf(numValueOf2.intValue() != 0) : null;
                        int i24 = iM14108v25;
                        NetworkType networkTypeM3624f = bcd.m3624f((int) ik8VarMo2873e1.getLong(i24));
                        int i25 = iM14108v26;
                        gk6 gk6VarM3631m = bcd.m3631m(ik8VarMo2873e1.getBlob(i25));
                        iM14108v25 = i24;
                        iM14108v26 = i25;
                        int i26 = iM14108v27;
                        boolean z2 = ((int) ik8VarMo2873e1.getLong(i26)) != 0;
                        iM14108v27 = i26;
                        int i27 = iM14108v28;
                        boolean z3 = ((int) ik8VarMo2873e1.getLong(i27)) != 0;
                        int i28 = iM14108v29;
                        boolean z4 = ((int) ik8VarMo2873e1.getLong(i28)) != 0;
                        iM14108v29 = i28;
                        int i29 = iM14108v30;
                        int i30 = iM14108v31;
                        int i31 = iM14108v32;
                        int i32 = iM14108v33;
                        iM14108v33 = i32;
                        ik8Var = ik8VarMo2873e1;
                        try {
                            arrayList2.add(new p8b(strMo2875L, workInfo$StateM3626h, strMo2875L2, strMo2875L3, sz1VarM14366a, sz1VarM14366a2, j, j2, j3, new ak1(gk6VarM3631m, networkTypeM3624f, z2, z3, z4, ((int) ik8VarMo2873e1.getLong(i29)) != 0, ik8VarMo2873e1.getLong(i30), ik8VarMo2873e1.getLong(i31), bcd.m3621c(ik8VarMo2873e1.getBlob(i32))), i6, backoffPolicyM3623e, j4, j5, j6, j7, z, outOfQuotaPolicyM3625g, i14, i16, j8, i19, i21, strMo2875L4, boolValueOf));
                            arrayList = arrayList2;
                            ik8VarMo2873e1 = ik8Var;
                            iM14108v31 = i30;
                            iM14108v30 = i29;
                            iM14108v13 = i11;
                            iM14108v17 = i10;
                            iM14108v19 = i15;
                            iM14108v22 = i20;
                            iM14108v24 = i23;
                            iM14108v = i8;
                            iM14108v15 = i7;
                            iM14108v32 = i31;
                            iM14108v16 = i9;
                            iM14108v20 = i17;
                            iM14108v21 = i18;
                            iM14108v23 = i22;
                            iM14108v14 = i5;
                            iM14108v28 = i27;
                            iM14108v2 = i13;
                            iM14108v18 = i12;
                        } catch (Throwable th) {
                            th = th;
                            ik8Var.close();
                            throw th;
                        }
                        break;
                    }
                    ik8 ik8Var2 = ik8VarMo2873e1;
                    ArrayList arrayList3 = arrayList;
                    ik8Var2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    ik8Var = ik8VarMo2873e1;
                }
                break;
        }
    }

    public /* synthetic */ y91(int i, int i2) {
        this.f69507a = i2;
        this.f69508b = i;
    }
}
