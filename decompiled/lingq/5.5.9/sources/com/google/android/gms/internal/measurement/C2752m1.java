package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2752m1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14307e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC2751m0 f14308f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2870v1 f14309g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2752m1(C2870v1 c2870v1, String str, BinderC2751m0 binderC2751m0) {
        super(c2870v1, true);
        this.f14309g = c2870v1;
        this.f14307e = str;
        this.f14308f = binderC2751m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        InterfaceC2804q0 interfaceC2804q0 = this.f14309g.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.getMaxUserProperties(this.f14307e, this.f14308f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: b */
    public final void mo7651b() {
        this.f14308f.mo8058U(null);
    }
}
