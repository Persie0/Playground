package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2682h1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f14223e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f14224f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f14225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2682h1(C2857u1 c2857u1, Activity activity) {
        super(c2857u1.f14449a, true);
        this.f14225g = c2857u1;
        this.f14224f = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2682h1(C2870v1 c2870v1, BinderC2751m0 binderC2751m0) {
        super(c2870v1, true);
        this.f14225g = c2870v1;
        this.f14224f = binderC2751m0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        switch (this.f14223e) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2804q0 interfaceC2804q0 = ((C2870v1) this.f14225g).f14473h;
                C6272i.m12915i(interfaceC2804q0);
                interfaceC2804q0.getCachedAppInstanceId((BinderC2751m0) this.f14224f);
                break;
            default:
                InterfaceC2804q0 interfaceC2804q1 = ((C2857u1) this.f14225g).f14449a.f14473h;
                C6272i.m12915i(interfaceC2804q1);
                interfaceC2804q1.onActivityPaused(new BinderC8215b((Activity) this.f14224f), this.f14384b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: b */
    public final void mo7651b() {
        switch (this.f14223e) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((BinderC2751m0) this.f14224f).mo8058U(null);
                break;
        }
    }
}
