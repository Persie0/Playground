package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2584a1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14044e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14045f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f14046g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2870v1 f14047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2584a1(C2870v1 c2870v1, String str, String str2, Bundle bundle) {
        super(c2870v1, true);
        this.f14047h = c2870v1;
        this.f14044e = str;
        this.f14045f = str2;
        this.f14046g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        InterfaceC2804q0 interfaceC2804q0 = this.f14047h.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.clearConditionalUserProperty(this.f14044e, this.f14045f, this.f14046g);
    }
}
