package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2668g1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f14203e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f14204f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2870v1 f14205g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2668g1(C2870v1 c2870v1, Object obj, int i10) {
        super(c2870v1, true);
        this.f14203e = i10;
        this.f14205g = c2870v1;
        this.f14204f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        switch (this.f14203e) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2804q0 interfaceC2804q0 = this.f14205g.f14473h;
                C6272i.m12915i(interfaceC2804q0);
                interfaceC2804q0.getGmpAppId((BinderC2751m0) this.f14204f);
                break;
            case 1:
                InterfaceC2804q0 interfaceC2804q1 = this.f14205g.f14473h;
                C6272i.m12915i(interfaceC2804q1);
                interfaceC2804q1.getCurrentScreenClass((BinderC2751m0) this.f14204f);
                break;
            default:
                InterfaceC2804q0 interfaceC2804q2 = this.f14205g.f14473h;
                C6272i.m12915i(interfaceC2804q2);
                interfaceC2804q2.setConditionalUserProperty((Bundle) this.f14204f, this.f14383a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: b */
    public final void mo7651b() {
        int i10 = this.f14203e;
        Object obj = this.f14204f;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((BinderC2751m0) obj).mo8058U(null);
                break;
            case 1:
                ((BinderC2751m0) obj).mo8058U(null);
                break;
        }
    }
}
