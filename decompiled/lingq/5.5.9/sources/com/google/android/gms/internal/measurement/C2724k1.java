package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import p176ib.C6272i;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2724k1 extends AbstractRunnableC2792p1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f14280e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f14281f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f14282g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f14283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2724k1(C2857u1 c2857u1, Bundle bundle, Activity activity) {
        super(c2857u1.f14449a, true);
        this.f14280e = 1;
        this.f14283h = c2857u1;
        this.f14281f = bundle;
        this.f14282g = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2724k1(C2870v1 c2870v1, Object obj) {
        super(c2870v1, false);
        this.f14280e = 0;
        this.f14283h = c2870v1;
        this.f14281f = "Error with data collection. Data lost.";
        this.f14282g = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2792p1
    /* JADX INFO: renamed from: a */
    public final void mo7635a() throws RemoteException {
        Bundle bundle = null;
        switch (this.f14280e) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2804q0 interfaceC2804q0 = ((C2870v1) this.f14283h).f14473h;
                C6272i.m12915i(interfaceC2804q0);
                interfaceC2804q0.logHealthData(5, (String) this.f14281f, new BinderC8215b(this.f14282g), new BinderC8215b(null), new BinderC8215b(null));
                break;
            default:
                if (((Bundle) this.f14281f) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f14281f).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f14281f).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                InterfaceC2804q0 interfaceC2804q1 = ((C2857u1) this.f14283h).f14449a.f14473h;
                C6272i.m12915i(interfaceC2804q1);
                interfaceC2804q1.onActivityCreated(new BinderC8215b((Activity) this.f14282g), bundle, this.f14384b);
                break;
        }
    }
}
