package be;

import android.os.Bundle;
import cc.InterfaceC1943t5;
import com.google.android.gms.internal.measurement.BinderC2751m0;
import com.google.android.gms.internal.measurement.C2584a1;
import com.google.android.gms.internal.measurement.C2598b1;
import com.google.android.gms.internal.measurement.C2612c1;
import com.google.android.gms.internal.measurement.C2654f1;
import com.google.android.gms.internal.measurement.C2668g1;
import com.google.android.gms.internal.measurement.C2682h1;
import com.google.android.gms.internal.measurement.C2696i1;
import com.google.android.gms.internal.measurement.C2710j1;
import com.google.android.gms.internal.measurement.C2752m1;
import com.google.android.gms.internal.measurement.C2766n1;
import com.google.android.gms.internal.measurement.C2870v1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: be.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1378a implements InterfaceC1943t5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2870v1 f8289a;

    public C1378a(C2870v1 c2870v1) {
        this.f8289a = c2870v1;
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: c */
    public final long mo213c() {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2654f1(c2870v1, binderC2751m0, 1));
        Long l10 = (Long) BinderC2751m0.m8057b1(binderC2751m0.m8060j(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNanoTime = System.nanoTime();
        c2870v1.f14467b.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i10 = c2870v1.f14471f + 1;
        c2870v1.f14471f = i10;
        return jNextLong + ((long) i10);
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: e */
    public final String mo214e() {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2682h1(c2870v1, binderC2751m0));
        return binderC2751m0.m8059h0(50L);
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: f */
    public final String mo215f() {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2668g1(c2870v1, binderC2751m0, 1));
        return binderC2751m0.m8059h0(500L);
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: h */
    public final String mo216h() {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2696i1(c2870v1, binderC2751m0));
        return binderC2751m0.m8059h0(500L);
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: j */
    public final String mo217j() {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2668g1(c2870v1, binderC2751m0, 0));
        return binderC2751m0.m8059h0(500L);
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: k */
    public final List mo218k(String str, String str2) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2598b1(c2870v1, str, str2, binderC2751m0));
        List list = (List) BinderC2751m0.m8057b1(binderC2751m0.m8060j(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: l */
    public final Map mo219l(String str, String str2, boolean z10) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2710j1(c2870v1, str, str2, z10, binderC2751m0));
        Bundle bundleM8060j = binderC2751m0.m8060j(5000L);
        if (bundleM8060j == null || bundleM8060j.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleM8060j.size());
        for (String str3 : bundleM8060j.keySet()) {
            Object obj = bundleM8060j.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: m */
    public final void mo220m(Bundle bundle) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        c2870v1.m8300b(new C2668g1(c2870v1, bundle, 2));
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: n */
    public final void mo221n(String str, String str2, Bundle bundle) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        c2870v1.m8300b(new C2766n1(c2870v1, str, str2, bundle, true));
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: o */
    public final void mo222o(String str) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        c2870v1.m8300b(new C2654f1(c2870v1, str, 0));
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: p */
    public final void mo223p(String str, String str2, Bundle bundle) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        c2870v1.m8300b(new C2584a1(c2870v1, str, str2, bundle));
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: q */
    public final void mo224q(String str) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        c2870v1.m8300b(new C2612c1(c2870v1, str, 1));
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: r */
    public final int mo225r(String str) {
        C2870v1 c2870v1 = this.f8289a;
        c2870v1.getClass();
        BinderC2751m0 binderC2751m0 = new BinderC2751m0();
        c2870v1.m8300b(new C2752m1(c2870v1, str, binderC2751m0));
        Integer num = (Integer) BinderC2751m0.m8057b1(binderC2751m0.m8060j(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }
}
