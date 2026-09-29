package com.google.android.gms.internal.measurement;

import java.util.List;
import p387t0.C9166r;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.jc */
/* JADX INFO: loaded from: classes.dex */
public final class C2721jc extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final C9166r f14276c;

    public C2721jc(C9166r c9166r) {
        super("internal.logger");
        this.f14276c = c9166r;
        this.f14261b.put("log", new C2707ic(this, false, true));
        this.f14261b.put("silent", new C2826r9(0));
        ((AbstractC2708j) this.f14261b.get("silent")).mo7788m("log", new C2707ic(this, true, true));
        this.f14261b.put("unmonitored", new C2840sa());
        ((AbstractC2708j) this.f14261b.get("unmonitored")).mo7788m("log", new C2707ic(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        return InterfaceC2790p.f14375r;
    }
}
