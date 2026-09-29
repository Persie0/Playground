package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2589a6 {

    /* JADX INFO: renamed from: b */
    public static volatile C2589a6 f14048b;

    /* JADX INFO: renamed from: c */
    public static final C2589a6 f14049c = new C2589a6(0);

    /* JADX INFO: renamed from: a */
    public final Map f14050a;

    public C2589a6() {
        this.f14050a = new HashMap();
    }

    public C2589a6(int i10) {
        this.f14050a = Collections.emptyMap();
    }

    /* JADX INFO: renamed from: a */
    public final C2743l6 m7642a(InterfaceC2730k7 interfaceC2730k7, int i10) {
        return (C2743l6) this.f14050a.get(new C2926z5(i10, interfaceC2730k7));
    }
}
