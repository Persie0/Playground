package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2779o1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14356e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14357f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f14358g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f14359h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2870v1 f14360i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2779o1(C2870v1 c2870v1, String str, String str2, Object obj, boolean z10) {
        super(c2870v1, true);
        this.f14360i = c2870v1;
        this.f14356e = str;
        this.f14357f = str2;
        this.f14358g = obj;
        this.f14359h = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        InterfaceC2804q0 interfaceC2804q0 = this.f14360i.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.setUserProperty(this.f14356e, this.f14357f, new BinderC8215b(this.f14358g), this.f14359h, this.f14383a);
    }
}
