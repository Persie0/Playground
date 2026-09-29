package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: cc.o5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1898o5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2843t0 f10091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppMeasurementDynamiteService f10092c;

    public /* synthetic */ RunnableC1898o5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2843t0 interfaceC2843t0, int i10) {
        this.f10090a = i10;
        this.f10092c = appMeasurementDynamiteService;
        this.f10091b = interfaceC2843t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10090a;
        InterfaceC2843t0 interfaceC2843t0 = this.f10091b;
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f10092c;
        boolean z10 = false;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1881m6 c1881m6M5788t = appMeasurementDynamiteService.f14599a.m5788t();
                c1881m6M5788t.mo5748g();
                c1881m6M5788t.m5851h();
                c1881m6M5788t.m5766t(new RunnableC1906p4(c1881m6M5788t, c1881m6M5788t.m5763q(false), interfaceC2843t0));
                break;
            default:
                C1900o7 c1900o7 = appMeasurementDynamiteService.f14599a.f10089l;
                C1897o4.m5774i(c1900o7);
                C1897o4 c1897o4 = appMeasurementDynamiteService.f14599a;
                if (c1897o4.f10071V != null && c1897o4.f10071V.booleanValue()) {
                    z10 = true;
                }
                c1900o7.m5805A(interfaceC2843t0, z10);
                break;
        }
    }
}
