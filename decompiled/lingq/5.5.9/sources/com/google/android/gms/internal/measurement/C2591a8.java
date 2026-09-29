package com.google.android.gms.internal.measurement;

import cc.CallableC1969w4;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.concurrent.Callable;
import p290o6.C7968m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2591a8 extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f14054c = 1;

    /* JADX INFO: renamed from: d */
    public final Object f14055d;

    public C2591a8(CallableC1969w4 callableC1969w4) {
        super("internal.appMetadata");
        this.f14055d = callableC1969w4;
    }

    public C2591a8(C7968m c7968m) {
        super("internal.remoteConfig");
        this.f14055d = c7968m;
        this.f14261b.put("getValue", new C2632d7(c7968m));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        C2855u c2855u = InterfaceC2790p.f14375r;
        switch (this.f14054c) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return c2855u;
            default:
                try {
                    return C2873v4.m8307b(((Callable) this.f14055d).call());
                } catch (Exception unused) {
                    return c2855u;
                }
        }
    }
}
