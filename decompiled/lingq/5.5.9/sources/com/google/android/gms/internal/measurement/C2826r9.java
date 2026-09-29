package com.google.android.gms.internal.measurement;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2826r9 extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f14417c = 1;

    public C2826r9() {
        super("internal.platform");
        this.f14261b.put("getVersion", new C2749lc());
    }

    public C2826r9(int i10) {
        super("silent");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        switch (this.f14417c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return this;
            default:
                return InterfaceC2790p.f14375r;
        }
    }
}
