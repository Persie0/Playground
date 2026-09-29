package p000;

import androidx.work.BackoffPolicy;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r8b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f58923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u8b f58924c;

    public /* synthetic */ r8b(String str, u8b u8bVar, int i) {
        this.f58922a = i;
        this.f58923b = str;
        this.f58924c = u8bVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f58922a;
        int i2 = 17;
        int i3 = 16;
        int i4 = 15;
        int i5 = 14;
        int i6 = 4;
        int i7 = 3;
        int i8 = 2;
        int i9 = 1;
        int i10 = 0;
        u8b u8bVar = this.f58924c;
        String str = this.f58923b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    int i11 = 0;
                    C3275kv c3275kv = new C3275kv(0);
                    C3275kv c3275kv2 = new C3275kv(0);
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(i11);
                        if (!c3275kv.containsKey(strMo2875L)) {
                            c3275kv.put(strMo2875L, new ArrayList());
                        }
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(0);
                        if (!c3275kv2.containsKey(strMo2875L2)) {
                            c3275kv2.put(strMo2875L2, new ArrayList());
                        }
                        i11 = 0;
                    }
                    ik8VarMo2873e0.reset();
                    u8bVar.m22566b(bk8Var, c3275kv);
                    u8bVar.m22565a(bk8Var, c3275kv2);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(0);
                        WorkInfo$State workInfo$StateM3626h = bcd.m3626h((int) ik8VarMo2873e0.getLong(i9));
                        byte[] blob = ik8VarMo2873e0.getBlob(2);
                        sz1 sz1Var = sz1.f61645b;
                        sz1 sz1VarM14366a = jad.m14366a(blob);
                        int i12 = (int) ik8VarMo2873e0.getLong(3);
                        int i13 = (int) ik8VarMo2873e0.getLong(4);
                        long j = ik8VarMo2873e0.getLong(14);
                        long j2 = ik8VarMo2873e0.getLong(15);
                        long j3 = ik8VarMo2873e0.getLong(16);
                        BackoffPolicy backoffPolicyM3623e = bcd.m3623e((int) ik8VarMo2873e0.getLong(17));
                        long j4 = ik8VarMo2873e0.getLong(18);
                        long j5 = ik8VarMo2873e0.getLong(19);
                        int i14 = (int) ik8VarMo2873e0.getLong(20);
                        long j6 = ik8VarMo2873e0.getLong(21);
                        int i15 = (int) ik8VarMo2873e0.getLong(22);
                        ak1 ak1Var = new ak1(bcd.m3631m(ik8VarMo2873e0.getBlob(6)), bcd.m3624f((int) ik8VarMo2873e0.getLong(5)), ((int) ik8VarMo2873e0.getLong(7)) != 0, ((int) ik8VarMo2873e0.getLong(8)) != 0, ((int) ik8VarMo2873e0.getLong(9)) != 0, ((int) ik8VarMo2873e0.getLong(10)) != 0, ik8VarMo2873e0.getLong(11), ik8VarMo2873e0.getLong(12), bcd.m3621c(ik8VarMo2873e0.getBlob(13)));
                        Object objM15361N = AbstractC3194a.m15361N(ik8VarMo2873e0.mo2875L(0), c3275kv);
                        objM15361N.getClass();
                        List list = (List) objM15361N;
                        Object objM15361N2 = AbstractC3194a.m15361N(ik8VarMo2873e0.mo2875L(0), c3275kv2);
                        objM15361N2.getClass();
                        arrayList.add(new o8b(strMo2875L3, workInfo$StateM3626h, sz1VarM14366a, j, j2, j3, ak1Var, i12, backoffPolicyM3623e, j4, j5, i14, i13, j6, i15, list, (List) objM15361N2));
                        i9 = 1;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    C3275kv c3275kv3 = new C3275kv(0);
                    C3275kv c3275kv4 = new C3275kv(0);
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L4 = ik8VarMo2873e1.mo2875L(0);
                        if (!c3275kv3.containsKey(strMo2875L4)) {
                            c3275kv3.put(strMo2875L4, new ArrayList());
                        }
                        String strMo2875L5 = ik8VarMo2873e1.mo2875L(0);
                        if (!c3275kv4.containsKey(strMo2875L5)) {
                            c3275kv4.put(strMo2875L5, new ArrayList());
                        }
                    }
                    ik8VarMo2873e1.reset();
                    u8bVar.m22566b(bk8Var2, c3275kv3);
                    u8bVar.m22565a(bk8Var2, c3275kv4);
                    ArrayList arrayList2 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L6 = ik8VarMo2873e1.mo2875L(i10);
                        WorkInfo$State workInfo$StateM3626h2 = bcd.m3626h((int) ik8VarMo2873e1.getLong(1));
                        byte[] blob2 = ik8VarMo2873e1.getBlob(i8);
                        sz1 sz1Var2 = sz1.f61645b;
                        sz1 sz1VarM14366a2 = jad.m14366a(blob2);
                        int i16 = (int) ik8VarMo2873e1.getLong(i7);
                        int i17 = (int) ik8VarMo2873e1.getLong(i6);
                        long j7 = ik8VarMo2873e1.getLong(i5);
                        long j8 = ik8VarMo2873e1.getLong(i4);
                        long j9 = ik8VarMo2873e1.getLong(i3);
                        BackoffPolicy backoffPolicyM3623e2 = bcd.m3623e((int) ik8VarMo2873e1.getLong(i2));
                        long j10 = ik8VarMo2873e1.getLong(18);
                        long j11 = ik8VarMo2873e1.getLong(19);
                        int i18 = (int) ik8VarMo2873e1.getLong(20);
                        long j12 = ik8VarMo2873e1.getLong(21);
                        int i19 = (int) ik8VarMo2873e1.getLong(22);
                        ak1 ak1Var2 = new ak1(bcd.m3631m(ik8VarMo2873e1.getBlob(6)), bcd.m3624f((int) ik8VarMo2873e1.getLong(5)), ((int) ik8VarMo2873e1.getLong(7)) != 0, ((int) ik8VarMo2873e1.getLong(8)) != 0, ((int) ik8VarMo2873e1.getLong(9)) != 0, ((int) ik8VarMo2873e1.getLong(10)) != 0, ik8VarMo2873e1.getLong(11), ik8VarMo2873e1.getLong(12), bcd.m3621c(ik8VarMo2873e1.getBlob(13)));
                        Object objM15361N3 = AbstractC3194a.m15361N(ik8VarMo2873e1.mo2875L(0), c3275kv3);
                        objM15361N3.getClass();
                        List list2 = (List) objM15361N3;
                        Object objM15361N4 = AbstractC3194a.m15361N(ik8VarMo2873e1.mo2875L(0), c3275kv4);
                        objM15361N4.getClass();
                        arrayList2.add(new o8b(strMo2875L6, workInfo$StateM3626h2, sz1VarM14366a2, j7, j8, j9, ak1Var2, i16, backoffPolicyM3623e2, j10, j11, i18, i17, j12, i19, list2, (List) objM15361N4));
                        i2 = 17;
                        i3 = 16;
                        i4 = 15;
                        i5 = 14;
                        i6 = 4;
                        i7 = 3;
                        i8 = 2;
                        i10 = 0;
                        break;
                    }
                    return arrayList2;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
