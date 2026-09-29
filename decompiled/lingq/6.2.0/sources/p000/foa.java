package p000;

import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class foa implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39396a;

    public /* synthetic */ foa(int i) {
        this.f39396a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z;
        Boolean boolValueOf3;
        switch (this.f39396a) {
            case 0:
                C2970en c2970en = (C2970en) obj;
                return new gq6((((long) Float.floatToRawIntBits(c2970en.f37539a)) << 32) | (((long) Float.floatToRawIntBits(c2970en.f37540b)) & 4294967295L));
            case 1:
                long j = ((f84) obj).f38612a;
                return new C2970en((int) (j >> 32), (int) (j & 4294967295L));
            case 2:
                C2970en c2970en2 = (C2970en) obj;
                return new f84((((long) Math.round(c2970en2.f37539a)) << 32) | (((long) Math.round(c2970en2.f37540b)) & 4294967295L));
            case 3:
                long j2 = ((n84) obj).f52482a;
                return new C2970en((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 4:
                C2970en c2970en3 = (C2970en) obj;
                int iRound = Math.round(c2970en3.f37539a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c2970en3.f37540b);
                return new n84((((long) iRound) << 32) | (((long) (iRound2 < 0 ? 0 : iRound2)) & 4294967295L));
            case 5:
                e28 e28Var = (e28) obj;
                return new C3044gn(e28Var.f36620a, e28Var.f36621b, e28Var.f36622c, e28Var.f36623d);
            case 6:
                C3044gn c3044gn = (C3044gn) obj;
                return new e28(c3044gn.f41033a, c3044gn.f41034b, c3044gn.f41035c, c3044gn.f41036d);
            case 7:
                return Float.valueOf(((C2934dn) obj).f35886a);
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
            case 9:
                return ((l6b) obj).f49210f;
            case 10:
                return ((l6b) obj).f49207c;
            case 11:
                return ((l6b) obj).f49209e;
            case 12:
                t6b t6bVar = (t6b) obj;
                t6bVar.getClass();
                return t6bVar;
            case 13:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM WorkProgress");
                try {
                    ik8VarMo2873e0.mo2876a0();
                    return xfa.f68157a;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 14:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM workspec WHERE state=1");
                try {
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
                        int i = iM14108v;
                        int i2 = iM14108v14;
                        WorkInfo$State workInfo$StateM3626h = bcd.m3626h((int) ik8VarMo2873e1.getLong(iM14108v2));
                        String strMo2875L2 = ik8VarMo2873e1.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e1.mo2875L(iM14108v4);
                        byte[] blob = ik8VarMo2873e1.getBlob(iM14108v5);
                        sz1 sz1Var = sz1.f61645b;
                        sz1 sz1VarM14366a = jad.m14366a(blob);
                        sz1 sz1VarM14366a2 = jad.m14366a(ik8VarMo2873e1.getBlob(iM14108v6));
                        long j3 = ik8VarMo2873e1.getLong(iM14108v7);
                        long j4 = ik8VarMo2873e1.getLong(iM14108v8);
                        long j5 = ik8VarMo2873e1.getLong(iM14108v9);
                        int i3 = (int) ik8VarMo2873e1.getLong(iM14108v10);
                        int i4 = iM14108v2;
                        BackoffPolicy backoffPolicyM3623e = bcd.m3623e((int) ik8VarMo2873e1.getLong(iM14108v11));
                        long j6 = ik8VarMo2873e1.getLong(iM14108v12);
                        long j7 = ik8VarMo2873e1.getLong(iM14108v13);
                        long j8 = ik8VarMo2873e1.getLong(i2);
                        int i5 = iM14108v15;
                        long j9 = ik8VarMo2873e1.getLong(i5);
                        int i6 = iM14108v16;
                        boolean z2 = ((int) ik8VarMo2873e1.getLong(i6)) != 0;
                        int i7 = iM14108v3;
                        int i8 = iM14108v17;
                        int i9 = iM14108v13;
                        OutOfQuotaPolicy outOfQuotaPolicyM3625g = bcd.m3625g((int) ik8VarMo2873e1.getLong(i8));
                        int i10 = iM14108v18;
                        int i11 = (int) ik8VarMo2873e1.getLong(i10);
                        int i12 = iM14108v19;
                        int i13 = (int) ik8VarMo2873e1.getLong(i12);
                        int i14 = iM14108v20;
                        long j10 = ik8VarMo2873e1.getLong(i14);
                        int i15 = iM14108v21;
                        int i16 = (int) ik8VarMo2873e1.getLong(i15);
                        int i17 = iM14108v22;
                        int i18 = (int) ik8VarMo2873e1.getLong(i17);
                        int i19 = iM14108v23;
                        String strMo2875L4 = ik8VarMo2873e1.isNull(i19) ? null : ik8VarMo2873e1.mo2875L(i19);
                        int i20 = iM14108v24;
                        Integer numValueOf = ik8VarMo2873e1.isNull(i20) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(i20));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i21 = iM14108v25;
                        NetworkType networkTypeM3624f = bcd.m3624f((int) ik8VarMo2873e1.getLong(i21));
                        int i22 = iM14108v26;
                        gk6 gk6VarM3631m = bcd.m3631m(ik8VarMo2873e1.getBlob(i22));
                        int i23 = iM14108v27;
                        boolean z3 = ((int) ik8VarMo2873e1.getLong(i23)) != 0;
                        int i24 = iM14108v28;
                        boolean z4 = ((int) ik8VarMo2873e1.getLong(i24)) != 0;
                        int i25 = iM14108v29;
                        boolean z5 = ((int) ik8VarMo2873e1.getLong(i25)) != 0;
                        iM14108v29 = i25;
                        int i26 = iM14108v30;
                        int i27 = iM14108v31;
                        int i28 = iM14108v32;
                        iM14108v31 = i27;
                        int i29 = iM14108v33;
                        iM14108v33 = i29;
                        arrayList.add(new p8b(strMo2875L, workInfo$StateM3626h, strMo2875L2, strMo2875L3, sz1VarM14366a, sz1VarM14366a2, j3, j4, j5, new ak1(gk6VarM3631m, networkTypeM3624f, z3, z4, z5, ((int) ik8VarMo2873e1.getLong(i26)) != 0, ik8VarMo2873e1.getLong(i27), ik8VarMo2873e1.getLong(i28), bcd.m3621c(ik8VarMo2873e1.getBlob(i29))), i3, backoffPolicyM3623e, j6, j7, j8, j9, z2, outOfQuotaPolicyM3625g, i11, i13, j10, i16, i18, strMo2875L4, boolValueOf));
                        iM14108v2 = i4;
                        iM14108v32 = i28;
                        iM14108v30 = i26;
                        iM14108v15 = i5;
                        iM14108v3 = i7;
                        iM14108v20 = i14;
                        iM14108v27 = i23;
                        iM14108v = i;
                        iM14108v16 = i6;
                        iM14108v28 = i24;
                        iM14108v13 = i9;
                        iM14108v17 = i8;
                        iM14108v18 = i10;
                        iM14108v19 = i12;
                        iM14108v21 = i15;
                        iM14108v22 = i17;
                        iM14108v23 = i19;
                        iM14108v24 = i20;
                        iM14108v25 = i21;
                        iM14108v26 = i22;
                        iM14108v14 = i2;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 15:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iM14108v34 = AbstractC3122is.m14108v(ik8VarMo2873e2, "id");
                    int iM14108v35 = AbstractC3122is.m14108v(ik8VarMo2873e2, "state");
                    int iM14108v36 = AbstractC3122is.m14108v(ik8VarMo2873e2, "worker_class_name");
                    int iM14108v37 = AbstractC3122is.m14108v(ik8VarMo2873e2, "input_merger_class_name");
                    int iM14108v38 = AbstractC3122is.m14108v(ik8VarMo2873e2, "input");
                    int iM14108v39 = AbstractC3122is.m14108v(ik8VarMo2873e2, "output");
                    int iM14108v40 = AbstractC3122is.m14108v(ik8VarMo2873e2, "initial_delay");
                    int iM14108v41 = AbstractC3122is.m14108v(ik8VarMo2873e2, "interval_duration");
                    int iM14108v42 = AbstractC3122is.m14108v(ik8VarMo2873e2, "flex_duration");
                    int iM14108v43 = AbstractC3122is.m14108v(ik8VarMo2873e2, "run_attempt_count");
                    int iM14108v44 = AbstractC3122is.m14108v(ik8VarMo2873e2, "backoff_policy");
                    int iM14108v45 = AbstractC3122is.m14108v(ik8VarMo2873e2, "backoff_delay_duration");
                    int iM14108v46 = AbstractC3122is.m14108v(ik8VarMo2873e2, "last_enqueue_time");
                    int iM14108v47 = AbstractC3122is.m14108v(ik8VarMo2873e2, "minimum_retention_duration");
                    int iM14108v48 = AbstractC3122is.m14108v(ik8VarMo2873e2, "schedule_requested_at");
                    int iM14108v49 = AbstractC3122is.m14108v(ik8VarMo2873e2, "run_in_foreground");
                    int iM14108v50 = AbstractC3122is.m14108v(ik8VarMo2873e2, "out_of_quota_policy");
                    int iM14108v51 = AbstractC3122is.m14108v(ik8VarMo2873e2, "period_count");
                    int iM14108v52 = AbstractC3122is.m14108v(ik8VarMo2873e2, "generation");
                    int iM14108v53 = AbstractC3122is.m14108v(ik8VarMo2873e2, "next_schedule_time_override");
                    int iM14108v54 = AbstractC3122is.m14108v(ik8VarMo2873e2, "next_schedule_time_override_generation");
                    int iM14108v55 = AbstractC3122is.m14108v(ik8VarMo2873e2, "stop_reason");
                    int iM14108v56 = AbstractC3122is.m14108v(ik8VarMo2873e2, "trace_tag");
                    int iM14108v57 = AbstractC3122is.m14108v(ik8VarMo2873e2, "backoff_on_system_interruptions");
                    int iM14108v58 = AbstractC3122is.m14108v(ik8VarMo2873e2, "required_network_type");
                    int iM14108v59 = AbstractC3122is.m14108v(ik8VarMo2873e2, "required_network_request");
                    int iM14108v60 = AbstractC3122is.m14108v(ik8VarMo2873e2, "requires_charging");
                    int iM14108v61 = AbstractC3122is.m14108v(ik8VarMo2873e2, "requires_device_idle");
                    int iM14108v62 = AbstractC3122is.m14108v(ik8VarMo2873e2, "requires_battery_not_low");
                    int iM14108v63 = AbstractC3122is.m14108v(ik8VarMo2873e2, "requires_storage_not_low");
                    int iM14108v64 = AbstractC3122is.m14108v(ik8VarMo2873e2, "trigger_content_update_delay");
                    int iM14108v65 = AbstractC3122is.m14108v(ik8VarMo2873e2, "trigger_max_content_delay");
                    int iM14108v66 = AbstractC3122is.m14108v(ik8VarMo2873e2, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        String strMo2875L5 = ik8VarMo2873e2.mo2875L(iM14108v34);
                        int i30 = iM14108v34;
                        int i31 = iM14108v47;
                        WorkInfo$State workInfo$StateM3626h2 = bcd.m3626h((int) ik8VarMo2873e2.getLong(iM14108v35));
                        String strMo2875L6 = ik8VarMo2873e2.mo2875L(iM14108v36);
                        String strMo2875L7 = ik8VarMo2873e2.mo2875L(iM14108v37);
                        byte[] blob2 = ik8VarMo2873e2.getBlob(iM14108v38);
                        sz1 sz1Var2 = sz1.f61645b;
                        sz1 sz1VarM14366a3 = jad.m14366a(blob2);
                        sz1 sz1VarM14366a4 = jad.m14366a(ik8VarMo2873e2.getBlob(iM14108v39));
                        long j11 = ik8VarMo2873e2.getLong(iM14108v40);
                        long j12 = ik8VarMo2873e2.getLong(iM14108v41);
                        long j13 = ik8VarMo2873e2.getLong(iM14108v42);
                        int i32 = (int) ik8VarMo2873e2.getLong(iM14108v43);
                        int i33 = iM14108v35;
                        BackoffPolicy backoffPolicyM3623e2 = bcd.m3623e((int) ik8VarMo2873e2.getLong(iM14108v44));
                        long j14 = ik8VarMo2873e2.getLong(iM14108v45);
                        long j15 = ik8VarMo2873e2.getLong(iM14108v46);
                        long j16 = ik8VarMo2873e2.getLong(i31);
                        int i34 = iM14108v48;
                        long j17 = ik8VarMo2873e2.getLong(i34);
                        iM14108v48 = i34;
                        int i35 = iM14108v49;
                        boolean z6 = ((int) ik8VarMo2873e2.getLong(i35)) != 0;
                        iM14108v49 = i35;
                        int i36 = iM14108v50;
                        OutOfQuotaPolicy outOfQuotaPolicyM3625g2 = bcd.m3625g((int) ik8VarMo2873e2.getLong(i36));
                        int i37 = iM14108v36;
                        int i38 = iM14108v51;
                        int i39 = iM14108v46;
                        int i40 = (int) ik8VarMo2873e2.getLong(i38);
                        int i41 = iM14108v52;
                        int i42 = (int) ik8VarMo2873e2.getLong(i41);
                        long j18 = ik8VarMo2873e2.getLong(iM14108v53);
                        int i43 = iM14108v54;
                        int i44 = (int) ik8VarMo2873e2.getLong(i43);
                        iM14108v54 = i43;
                        iM14108v55 = iM14108v55;
                        int i45 = (int) ik8VarMo2873e2.getLong(iM14108v55);
                        iM14108v56 = iM14108v56;
                        String strMo2875L8 = ik8VarMo2873e2.isNull(iM14108v56) ? null : ik8VarMo2873e2.mo2875L(iM14108v56);
                        int i46 = iM14108v57;
                        Integer numValueOf2 = ik8VarMo2873e2.isNull(i46) ? null : Integer.valueOf((int) ik8VarMo2873e2.getLong(i46));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i47 = iM14108v58;
                        NetworkType networkTypeM3624f2 = bcd.m3624f((int) ik8VarMo2873e2.getLong(i47));
                        int i48 = iM14108v59;
                        gk6 gk6VarM3631m2 = bcd.m3631m(ik8VarMo2873e2.getBlob(i48));
                        int i49 = iM14108v60;
                        boolean z7 = ((int) ik8VarMo2873e2.getLong(i49)) != 0;
                        int i50 = iM14108v61;
                        boolean z8 = ((int) ik8VarMo2873e2.getLong(i50)) != 0;
                        int i51 = iM14108v62;
                        boolean z9 = ((int) ik8VarMo2873e2.getLong(i51)) != 0;
                        iM14108v62 = i51;
                        int i52 = iM14108v63;
                        int i53 = iM14108v64;
                        int i54 = iM14108v65;
                        iM14108v64 = i53;
                        int i55 = iM14108v66;
                        iM14108v66 = i55;
                        arrayList2.add(new p8b(strMo2875L5, workInfo$StateM3626h2, strMo2875L6, strMo2875L7, sz1VarM14366a3, sz1VarM14366a4, j11, j12, j13, new ak1(gk6VarM3631m2, networkTypeM3624f2, z7, z8, z9, ((int) ik8VarMo2873e2.getLong(i52)) != 0, ik8VarMo2873e2.getLong(i53), ik8VarMo2873e2.getLong(i54), bcd.m3621c(ik8VarMo2873e2.getBlob(i55))), i32, backoffPolicyM3623e2, j14, j15, j16, j17, z6, outOfQuotaPolicyM3625g2, i40, i42, j18, i44, i45, strMo2875L8, boolValueOf2));
                        iM14108v61 = i50;
                        iM14108v46 = i39;
                        iM14108v51 = i38;
                        iM14108v52 = i41;
                        iM14108v60 = i49;
                        iM14108v65 = i54;
                        iM14108v63 = i52;
                        iM14108v36 = i37;
                        iM14108v50 = i36;
                        iM14108v57 = i46;
                        iM14108v58 = i47;
                        iM14108v34 = i30;
                        iM14108v35 = i33;
                        iM14108v59 = i48;
                        iM14108v47 = i31;
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 16:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (ik8VarMo2873e3.mo2876a0()) {
                        z = false;
                        if (((int) ik8VarMo2873e3.getLong(0)) != 0) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    ik8VarMo2873e3.close();
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    ik8VarMo2873e3.close();
                    throw th;
                }
            case 17:
                bk8 bk8Var5 = (bk8) obj;
                bk8Var5.getClass();
                ik8 ik8VarMo2873e4 = bk8Var5.mo2873e0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    ik8VarMo2873e4.mo2878j(1, 200L);
                    int iM14108v67 = AbstractC3122is.m14108v(ik8VarMo2873e4, "id");
                    int iM14108v68 = AbstractC3122is.m14108v(ik8VarMo2873e4, "state");
                    int iM14108v69 = AbstractC3122is.m14108v(ik8VarMo2873e4, "worker_class_name");
                    int iM14108v70 = AbstractC3122is.m14108v(ik8VarMo2873e4, "input_merger_class_name");
                    int iM14108v71 = AbstractC3122is.m14108v(ik8VarMo2873e4, "input");
                    int iM14108v72 = AbstractC3122is.m14108v(ik8VarMo2873e4, "output");
                    int iM14108v73 = AbstractC3122is.m14108v(ik8VarMo2873e4, "initial_delay");
                    int iM14108v74 = AbstractC3122is.m14108v(ik8VarMo2873e4, "interval_duration");
                    int iM14108v75 = AbstractC3122is.m14108v(ik8VarMo2873e4, "flex_duration");
                    int iM14108v76 = AbstractC3122is.m14108v(ik8VarMo2873e4, "run_attempt_count");
                    int iM14108v77 = AbstractC3122is.m14108v(ik8VarMo2873e4, "backoff_policy");
                    int iM14108v78 = AbstractC3122is.m14108v(ik8VarMo2873e4, "backoff_delay_duration");
                    int iM14108v79 = AbstractC3122is.m14108v(ik8VarMo2873e4, "last_enqueue_time");
                    int iM14108v80 = AbstractC3122is.m14108v(ik8VarMo2873e4, "minimum_retention_duration");
                    int iM14108v81 = AbstractC3122is.m14108v(ik8VarMo2873e4, "schedule_requested_at");
                    int iM14108v82 = AbstractC3122is.m14108v(ik8VarMo2873e4, "run_in_foreground");
                    int iM14108v83 = AbstractC3122is.m14108v(ik8VarMo2873e4, "out_of_quota_policy");
                    int iM14108v84 = AbstractC3122is.m14108v(ik8VarMo2873e4, "period_count");
                    int iM14108v85 = AbstractC3122is.m14108v(ik8VarMo2873e4, "generation");
                    int iM14108v86 = AbstractC3122is.m14108v(ik8VarMo2873e4, "next_schedule_time_override");
                    int iM14108v87 = AbstractC3122is.m14108v(ik8VarMo2873e4, "next_schedule_time_override_generation");
                    int iM14108v88 = AbstractC3122is.m14108v(ik8VarMo2873e4, "stop_reason");
                    int iM14108v89 = AbstractC3122is.m14108v(ik8VarMo2873e4, "trace_tag");
                    int iM14108v90 = AbstractC3122is.m14108v(ik8VarMo2873e4, "backoff_on_system_interruptions");
                    int iM14108v91 = AbstractC3122is.m14108v(ik8VarMo2873e4, "required_network_type");
                    int iM14108v92 = AbstractC3122is.m14108v(ik8VarMo2873e4, "required_network_request");
                    int iM14108v93 = AbstractC3122is.m14108v(ik8VarMo2873e4, "requires_charging");
                    int iM14108v94 = AbstractC3122is.m14108v(ik8VarMo2873e4, "requires_device_idle");
                    int iM14108v95 = AbstractC3122is.m14108v(ik8VarMo2873e4, "requires_battery_not_low");
                    int iM14108v96 = AbstractC3122is.m14108v(ik8VarMo2873e4, "requires_storage_not_low");
                    int iM14108v97 = AbstractC3122is.m14108v(ik8VarMo2873e4, "trigger_content_update_delay");
                    int iM14108v98 = AbstractC3122is.m14108v(ik8VarMo2873e4, "trigger_max_content_delay");
                    int iM14108v99 = AbstractC3122is.m14108v(ik8VarMo2873e4, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e4.mo2876a0()) {
                        String strMo2875L9 = ik8VarMo2873e4.mo2875L(iM14108v67);
                        int i56 = iM14108v79;
                        int i57 = iM14108v80;
                        WorkInfo$State workInfo$StateM3626h3 = bcd.m3626h((int) ik8VarMo2873e4.getLong(iM14108v68));
                        String strMo2875L10 = ik8VarMo2873e4.mo2875L(iM14108v69);
                        String strMo2875L11 = ik8VarMo2873e4.mo2875L(iM14108v70);
                        byte[] blob3 = ik8VarMo2873e4.getBlob(iM14108v71);
                        sz1 sz1Var3 = sz1.f61645b;
                        sz1 sz1VarM14366a5 = jad.m14366a(blob3);
                        sz1 sz1VarM14366a6 = jad.m14366a(ik8VarMo2873e4.getBlob(iM14108v72));
                        long j19 = ik8VarMo2873e4.getLong(iM14108v73);
                        long j20 = ik8VarMo2873e4.getLong(iM14108v74);
                        long j21 = ik8VarMo2873e4.getLong(iM14108v75);
                        int i58 = (int) ik8VarMo2873e4.getLong(iM14108v76);
                        int i59 = iM14108v68;
                        int i60 = iM14108v67;
                        BackoffPolicy backoffPolicyM3623e3 = bcd.m3623e((int) ik8VarMo2873e4.getLong(iM14108v77));
                        long j22 = ik8VarMo2873e4.getLong(iM14108v78);
                        long j23 = ik8VarMo2873e4.getLong(i56);
                        long j24 = ik8VarMo2873e4.getLong(i57);
                        int i61 = iM14108v81;
                        long j25 = ik8VarMo2873e4.getLong(i61);
                        int i62 = iM14108v69;
                        int i63 = iM14108v82;
                        int i64 = iM14108v70;
                        boolean z10 = ((int) ik8VarMo2873e4.getLong(i63)) != 0;
                        int i65 = iM14108v83;
                        OutOfQuotaPolicy outOfQuotaPolicyM3625g3 = bcd.m3625g((int) ik8VarMo2873e4.getLong(i65));
                        iM14108v83 = i65;
                        int i66 = iM14108v84;
                        int i67 = (int) ik8VarMo2873e4.getLong(i66);
                        iM14108v84 = i66;
                        int i68 = iM14108v85;
                        int i69 = (int) ik8VarMo2873e4.getLong(i68);
                        int i70 = iM14108v86;
                        long j26 = ik8VarMo2873e4.getLong(i70);
                        int i71 = iM14108v87;
                        int i72 = (int) ik8VarMo2873e4.getLong(i71);
                        int i73 = iM14108v88;
                        int i74 = (int) ik8VarMo2873e4.getLong(i73);
                        int i75 = iM14108v89;
                        String strMo2875L12 = ik8VarMo2873e4.isNull(i75) ? null : ik8VarMo2873e4.mo2875L(i75);
                        int i76 = iM14108v90;
                        Integer numValueOf3 = ik8VarMo2873e4.isNull(i76) ? null : Integer.valueOf((int) ik8VarMo2873e4.getLong(i76));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        iM14108v90 = i76;
                        int i77 = iM14108v91;
                        NetworkType networkTypeM3624f3 = bcd.m3624f((int) ik8VarMo2873e4.getLong(i77));
                        int i78 = iM14108v92;
                        gk6 gk6VarM3631m3 = bcd.m3631m(ik8VarMo2873e4.getBlob(i78));
                        iM14108v91 = i77;
                        int i79 = iM14108v93;
                        boolean z11 = ((int) ik8VarMo2873e4.getLong(i79)) != 0;
                        iM14108v93 = i79;
                        int i80 = iM14108v94;
                        boolean z12 = ((int) ik8VarMo2873e4.getLong(i80)) != 0;
                        iM14108v94 = i80;
                        int i81 = iM14108v95;
                        boolean z13 = ((int) ik8VarMo2873e4.getLong(i81)) != 0;
                        iM14108v95 = i81;
                        int i82 = iM14108v96;
                        int i83 = iM14108v97;
                        int i84 = iM14108v98;
                        iM14108v97 = i83;
                        int i85 = iM14108v99;
                        arrayList3.add(new p8b(strMo2875L9, workInfo$StateM3626h3, strMo2875L10, strMo2875L11, sz1VarM14366a5, sz1VarM14366a6, j19, j20, j21, new ak1(gk6VarM3631m3, networkTypeM3624f3, z11, z12, z13, ((int) ik8VarMo2873e4.getLong(i82)) != 0, ik8VarMo2873e4.getLong(i83), ik8VarMo2873e4.getLong(i84), bcd.m3621c(ik8VarMo2873e4.getBlob(i85))), i58, backoffPolicyM3623e3, j22, j23, j24, j25, z10, outOfQuotaPolicyM3625g3, i67, i69, j26, i72, i74, strMo2875L12, boolValueOf3));
                        iM14108v92 = i78;
                        iM14108v70 = i64;
                        iM14108v82 = i63;
                        iM14108v85 = i68;
                        iM14108v86 = i70;
                        iM14108v87 = i71;
                        iM14108v88 = i73;
                        iM14108v89 = i75;
                        iM14108v99 = i85;
                        iM14108v98 = i84;
                        iM14108v96 = i82;
                        iM14108v79 = i56;
                        iM14108v67 = i60;
                        iM14108v68 = i59;
                        iM14108v69 = i62;
                        iM14108v81 = i61;
                        iM14108v80 = i57;
                        break;
                    }
                    return arrayList3;
                } finally {
                    ik8VarMo2873e4.close();
                }
            default:
                bk8 bk8Var6 = (bk8) obj;
                bk8Var6.getClass();
                ik8 ik8VarMo2873e5 = bk8Var6.mo2873e0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    ik8VarMo2873e5.mo2876a0();
                    return Integer.valueOf(AbstractC3489q9.m19787q(bk8Var6));
                } finally {
                    ik8VarMo2873e5.close();
                }
        }
    }
}
