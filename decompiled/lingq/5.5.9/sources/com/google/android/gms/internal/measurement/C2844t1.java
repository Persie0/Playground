package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2844t1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f14433e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC2751m0 f14434f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2857u1 f14435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2844t1(C2857u1 c2857u1, Activity activity, BinderC2751m0 binderC2751m0) {
        super(c2857u1.f14449a, true);
        this.f14435g = c2857u1;
        this.f14433e = activity;
        this.f14434f = binderC2751m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        InterfaceC2804q0 interfaceC2804q0 = this.f14435g.f14449a.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.onActivitySaveInstanceState(new BinderC8215b(this.f14433e), this.f14434f, this.f14384b);
    }
}
