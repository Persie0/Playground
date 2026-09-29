package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2654f1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f14187e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f14188f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f14189g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2654f1(C2857u1 c2857u1, Activity activity) {
        super(c2857u1.f14449a, true);
        this.f14187e = 3;
        this.f14188f = c2857u1;
        this.f14189g = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2654f1(C2870v1 c2870v1, Object obj, int i10) {
        super(c2870v1, true);
        this.f14187e = i10;
        this.f14188f = c2870v1;
        this.f14189g = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        switch (this.f14187e) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2804q0 interfaceC2804q0 = ((C2870v1) this.f14188f).f14473h;
                C6272i.m12915i(interfaceC2804q0);
                interfaceC2804q0.beginAdUnitExposure((String) this.f14189g, this.f14384b);
                break;
            case 1:
                InterfaceC2804q0 interfaceC2804q1 = ((C2870v1) this.f14188f).f14473h;
                C6272i.m12915i(interfaceC2804q1);
                interfaceC2804q1.generateEventId((BinderC2751m0) this.f14189g);
                break;
            case 2:
                InterfaceC2804q0 interfaceC2804q2 = ((C2870v1) this.f14188f).f14473h;
                C6272i.m12915i(interfaceC2804q2);
                interfaceC2804q2.registerOnMeasurementEventListener((BinderC2805q1) this.f14189g);
                break;
            default:
                InterfaceC2804q0 interfaceC2804q3 = ((C2857u1) this.f14188f).f14449a.f14473h;
                C6272i.m12915i(interfaceC2804q3);
                interfaceC2804q3.onActivityStopped(new BinderC8215b((Activity) this.f14189g), this.f14384b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: b */
    public final void mo7651b() {
        switch (this.f14187e) {
            case 1:
                ((BinderC2751m0) this.f14189g).mo8058U(null);
                break;
        }
    }
}
