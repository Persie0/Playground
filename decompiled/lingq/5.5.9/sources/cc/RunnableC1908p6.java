package cc;

import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: cc.p6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1908p6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2843t0 f10130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f10133d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f10134e;

    public RunnableC1908p6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2843t0 interfaceC2843t0, String str, String str2, boolean z10) {
        this.f10134e = appMeasurementDynamiteService;
        this.f10130a = interfaceC2843t0;
        this.f10131b = str;
        this.f10132c = str2;
        this.f10133d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1881m6 c1881m6M5788t = this.f10134e.f14599a.m5788t();
        InterfaceC2843t0 interfaceC2843t0 = this.f10130a;
        String str = this.f10131b;
        String str2 = this.f10132c;
        boolean z10 = this.f10133d;
        c1881m6M5788t.mo5748g();
        c1881m6M5788t.m5851h();
        c1881m6M5788t.m5766t(new RunnableC1791c6(c1881m6M5788t, str, str2, c1881m6M5788t.m5763q(false), z10, interfaceC2843t0));
    }
}
