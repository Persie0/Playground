package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: od */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3405od implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f54197b;

    public /* synthetic */ C3405od(int i, long j) {
        this.f54196a = i;
        this.f54197b = j;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f54196a;
        long j = this.f54197b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                List list = AbstractC3607td.f62159a;
                float size = fIntBitsToFloat / (list.size() * 2);
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    float f = ((size + size) * i2) + size;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) * ((Number) obj2).floatValue();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - fIntBitsToFloat2) / 2.0f)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(size)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                    float f2 = size / 2.0f;
                    interfaceC0310a.mo598h0(this.f54197b, (240 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (240 & 16) != 0 ? w33.f66328a : null, (240 & 128) != 0 ? 3 : 0);
                    i2 = i3;
                }
                return xfaVar;
            case 1:
                InterfaceC0310a interfaceC0310a2 = (InterfaceC0310a) obj;
                interfaceC0310a2.getClass();
                C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
                c3500qjM22757a.m19989f(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) / 2.0f, 0.0f);
                c3500qjM22757a.m19988e(0.0f, Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)));
                c3500qjM22757a.m19988e(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)), Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)));
                c3500qjM22757a.f57839a.close();
                InterfaceC0310a.m1408A0(interfaceC0310a2, c3500qjM22757a, this.f54197b, 0.0f, null, 60);
                return xfaVar;
            case 2:
                InterfaceC0310a interfaceC0310a3 = (InterfaceC0310a) obj;
                interfaceC0310a3.getClass();
                InterfaceC0310a.m1417c0(interfaceC0310a3, this.f54197b, 0.0f, 0L, 0.0f, null, 126);
                return xfaVar;
            case 3:
                ((fb2) obj).getClass();
                return new f84((((long) ss5.m21693T(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) ss5.m21693T(Float.intBitsToFloat((int) (j >> 32)))) << 32));
            default:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    ik8VarMo2873e0.mo2878j(1, j);
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
                        int i4 = iM14108v;
                        int i5 = iM14108v14;
                        WorkInfo$State workInfo$StateM3626h = bcd.m3626h((int) ik8VarMo2873e0.getLong(iM14108v2));
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v3);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(iM14108v4);
                        byte[] blob = ik8VarMo2873e0.getBlob(iM14108v5);
                        sz1 sz1Var = sz1.f61645b;
                        sz1 sz1VarM14366a = jad.m14366a(blob);
                        sz1 sz1VarM14366a2 = jad.m14366a(ik8VarMo2873e0.getBlob(iM14108v6));
                        long j2 = ik8VarMo2873e0.getLong(iM14108v7);
                        long j3 = ik8VarMo2873e0.getLong(iM14108v8);
                        long j4 = ik8VarMo2873e0.getLong(iM14108v9);
                        int i6 = (int) ik8VarMo2873e0.getLong(iM14108v10);
                        BackoffPolicy backoffPolicyM3623e = bcd.m3623e((int) ik8VarMo2873e0.getLong(iM14108v11));
                        long j5 = ik8VarMo2873e0.getLong(iM14108v12);
                        long j6 = ik8VarMo2873e0.getLong(iM14108v13);
                        long j7 = ik8VarMo2873e0.getLong(i5);
                        int i7 = iM14108v15;
                        long j8 = ik8VarMo2873e0.getLong(i7);
                        int i8 = iM14108v13;
                        int i9 = iM14108v16;
                        boolean z = ((int) ik8VarMo2873e0.getLong(i9)) != 0;
                        int i10 = iM14108v2;
                        int i11 = iM14108v17;
                        int i12 = iM14108v3;
                        OutOfQuotaPolicy outOfQuotaPolicyM3625g = bcd.m3625g((int) ik8VarMo2873e0.getLong(i11));
                        int i13 = iM14108v18;
                        int i14 = (int) ik8VarMo2873e0.getLong(i13);
                        int i15 = iM14108v19;
                        int i16 = (int) ik8VarMo2873e0.getLong(i15);
                        int i17 = iM14108v20;
                        long j9 = ik8VarMo2873e0.getLong(i17);
                        int i18 = iM14108v21;
                        int i19 = (int) ik8VarMo2873e0.getLong(i18);
                        int i20 = iM14108v22;
                        int i21 = (int) ik8VarMo2873e0.getLong(i20);
                        int i22 = iM14108v23;
                        String strMo2875L4 = ik8VarMo2873e0.isNull(i22) ? null : ik8VarMo2873e0.mo2875L(i22);
                        int i23 = iM14108v24;
                        Integer numValueOf = ik8VarMo2873e0.isNull(i23) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i23));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i24 = iM14108v25;
                        NetworkType networkTypeM3624f = bcd.m3624f((int) ik8VarMo2873e0.getLong(i24));
                        int i25 = iM14108v26;
                        gk6 gk6VarM3631m = bcd.m3631m(ik8VarMo2873e0.getBlob(i25));
                        iM14108v25 = i24;
                        int i26 = iM14108v27;
                        boolean z2 = ((int) ik8VarMo2873e0.getLong(i26)) != 0;
                        iM14108v27 = i26;
                        int i27 = iM14108v28;
                        boolean z3 = ((int) ik8VarMo2873e0.getLong(i27)) != 0;
                        iM14108v28 = i27;
                        int i28 = iM14108v29;
                        boolean z4 = ((int) ik8VarMo2873e0.getLong(i28)) != 0;
                        iM14108v29 = i28;
                        int i29 = iM14108v30;
                        int i30 = iM14108v31;
                        int i31 = iM14108v32;
                        int i32 = iM14108v33;
                        iM14108v33 = i32;
                        arrayList.add(new p8b(strMo2875L, workInfo$StateM3626h, strMo2875L2, strMo2875L3, sz1VarM14366a, sz1VarM14366a2, j2, j3, j4, new ak1(gk6VarM3631m, networkTypeM3624f, z2, z3, z4, ((int) ik8VarMo2873e0.getLong(i29)) != 0, ik8VarMo2873e0.getLong(i30), ik8VarMo2873e0.getLong(i31), bcd.m3621c(ik8VarMo2873e0.getBlob(i32))), i6, backoffPolicyM3623e, j5, j6, j7, j8, z, outOfQuotaPolicyM3625g, i14, i16, j9, i19, i21, strMo2875L4, boolValueOf));
                        iM14108v13 = i8;
                        iM14108v31 = i30;
                        iM14108v32 = i31;
                        iM14108v15 = i7;
                        iM14108v3 = i12;
                        iM14108v2 = i10;
                        iM14108v18 = i13;
                        iM14108v16 = i9;
                        iM14108v19 = i15;
                        iM14108v20 = i17;
                        iM14108v21 = i18;
                        iM14108v22 = i20;
                        iM14108v23 = i22;
                        iM14108v24 = i23;
                        iM14108v17 = i11;
                        iM14108v30 = i29;
                        iM14108v26 = i25;
                        iM14108v = i4;
                        iM14108v14 = i5;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
        }
    }
}
