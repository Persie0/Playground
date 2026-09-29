package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2612c1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f14077e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14078f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2870v1 f14079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2612c1(C2870v1 c2870v1, String str, int i10) {
        super(c2870v1, true);
        this.f14077e = i10;
        this.f14079g = c2870v1;
        this.f14078f = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        switch (this.f14077e) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2804q0 interfaceC2804q0 = this.f14079g.f14473h;
                C6272i.m12915i(interfaceC2804q0);
                interfaceC2804q0.setUserId(this.f14078f, this.f14383a);
                break;
            default:
                InterfaceC2804q0 interfaceC2804q1 = this.f14079g.f14473h;
                C6272i.m12915i(interfaceC2804q1);
                interfaceC2804q1.endAdUnitExposure(this.f14078f, this.f14384b);
                break;
        }
    }
}
