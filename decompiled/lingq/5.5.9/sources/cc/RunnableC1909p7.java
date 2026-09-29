package cc;

import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: cc.p7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1909p7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2843t0 f10135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10137c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f10138d;

    public RunnableC1909p7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2843t0 interfaceC2843t0, String str, String str2) {
        this.f10138d = appMeasurementDynamiteService;
        this.f10135a = interfaceC2843t0;
        this.f10136b = str;
        this.f10137c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1881m6 c1881m6M5788t = this.f10138d.f14599a.m5788t();
        InterfaceC2843t0 interfaceC2843t0 = this.f10135a;
        String str = this.f10136b;
        String str2 = this.f10137c;
        c1881m6M5788t.mo5748g();
        c1881m6M5788t.m5851h();
        c1881m6M5788t.m5766t(new RunnableC1854j6(c1881m6M5788t, str, str2, c1881m6M5788t.m5763q(false), interfaceC2843t0));
    }
}
