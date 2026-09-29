package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2818r1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f14412e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f14413f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2857u1 f14414g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2818r1(C2857u1 c2857u1, Activity activity, int i10) {
        super(c2857u1.f14449a, true);
        this.f14412e = i10;
        if (i10 != 1) {
            this.f14414g = c2857u1;
            this.f14413f = activity;
        } else {
            this.f14414g = c2857u1;
            this.f14413f = activity;
            super(c2857u1.f14449a, true);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        switch (this.f14412e) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2804q0 interfaceC2804q0 = this.f14414g.f14449a.f14473h;
                C6272i.m12915i(interfaceC2804q0);
                interfaceC2804q0.onActivityResumed(new BinderC8215b(this.f14413f), this.f14384b);
                break;
            default:
                InterfaceC2804q0 interfaceC2804q1 = this.f14414g.f14449a.f14473h;
                C6272i.m12915i(interfaceC2804q1);
                interfaceC2804q1.onActivityDestroyed(new BinderC8215b(this.f14413f), this.f14384b);
                break;
        }
    }
}
