package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2626d1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f14144e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14145f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f14146g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2870v1 f14147h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2626d1(C2870v1 c2870v1, Activity activity, String str, String str2) {
        super(c2870v1, true);
        this.f14147h = c2870v1;
        this.f14144e = activity;
        this.f14145f = str;
        this.f14146g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        InterfaceC2804q0 interfaceC2804q0 = this.f14147h.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.setCurrentScreen(new BinderC8215b(this.f14144e), this.f14145f, this.f14146g, this.f14383a);
    }
}
