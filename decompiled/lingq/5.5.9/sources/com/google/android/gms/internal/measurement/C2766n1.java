package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2766n1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14326f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f14327g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f14328h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f14329i;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2870v1 f14331k;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Long f14325e = null;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f14330j = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2766n1(C2870v1 c2870v1, String str, String str2, Bundle bundle, boolean z10) {
        super(c2870v1, true);
        this.f14331k = c2870v1;
        this.f14326f = str;
        this.f14327g = str2;
        this.f14328h = bundle;
        this.f14329i = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        Long l10 = this.f14325e;
        long jLongValue = l10 == null ? this.f14383a : l10.longValue();
        InterfaceC2804q0 interfaceC2804q0 = this.f14331k.f14473h;
        C6272i.m12915i(interfaceC2804q0);
        interfaceC2804q0.logEvent(this.f14326f, this.f14327g, this.f14328h, this.f14329i, this.f14330j, jLongValue);
    }
}
