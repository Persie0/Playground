package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2598b1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14062e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14063f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BinderC2751m0 f14064g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2870v1 f14065h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2598b1(C2870v1 c2870v1, String str, String str2, BinderC2751m0 binderC2751m0) {
        super(c2870v1, true);
        this.f14065h = c2870v1;
        this.f14062e = str;
        this.f14063f = str2;
        this.f14064g = binderC2751m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        InterfaceC2804q0 interfaceC2804q0 = this.f14065h.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.getConditionalUserProperties(this.f14062e, this.f14063f, this.f14064g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: b */
    public final void mo7651b() {
        this.f14064g.mo8058U(null);
    }
}
