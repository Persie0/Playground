package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2710j1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14263e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14264f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f14265g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC2751m0 f14266h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2870v1 f14267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2710j1(C2870v1 c2870v1, String str, String str2, boolean z10, BinderC2751m0 binderC2751m0) {
        super(c2870v1, true);
        this.f14267i = c2870v1;
        this.f14263e = str;
        this.f14264f = str2;
        this.f14265g = z10;
        this.f14266h = binderC2751m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        InterfaceC2804q0 interfaceC2804q0 = this.f14267i.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.getUserProperties(this.f14263e, this.f14264f, this.f14265g, this.f14266h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: b */
    public final void mo7651b() {
        this.f14266h.mo8058U(null);
    }
}
