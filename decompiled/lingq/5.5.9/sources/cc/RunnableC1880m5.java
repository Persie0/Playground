package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: cc.m5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1880m5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10001a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10003c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f10004d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f10005e;

    public RunnableC1880m5(C1934s5 c1934s5, AtomicReference atomicReference, String str, String str2) {
        this.f10005e = c1934s5;
        this.f10003c = atomicReference;
        this.f10002b = str;
        this.f10004d = str2;
    }

    public RunnableC1880m5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2843t0 interfaceC2843t0, zzaw zzawVar, String str) {
        this.f10005e = appMeasurementDynamiteService;
        this.f10003c = interfaceC2843t0;
        this.f10004d = zzawVar;
        this.f10002b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10001a;
        Object obj = this.f10004d;
        Object obj2 = this.f10003c;
        Object obj3 = this.f10005e;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1881m6 c1881m6M5788t = ((C1897o4) ((C1934s5) obj3).f10430a).m5788t();
                c1881m6M5788t.mo5748g();
                c1881m6M5788t.m5851h();
                c1881m6M5788t.m5766t(new RunnableC1845i6(c1881m6M5788t, (AtomicReference) obj2, this.f10002b, (String) obj, c1881m6M5788t.m5763q(false)));
                break;
            default:
                C1881m6 c1881m6M5788t2 = ((AppMeasurementDynamiteService) obj3).f14599a.m5788t();
                InterfaceC2843t0 interfaceC2843t0 = (InterfaceC2843t0) obj2;
                zzaw zzawVar = (zzaw) obj;
                c1881m6M5788t2.mo5748g();
                c1881m6M5788t2.m5851h();
                C1897o4 c1897o4 = (C1897o4) c1881m6M5788t2.f10430a;
                C1900o7 c1900o7 = c1897o4.f10089l;
                C1897o4.m5774i(c1900o7);
                c1900o7.getClass();
                if (C2549d.f13922b.mo7586c(((C1897o4) c1900o7.f10430a).f10076a, 12451000) == 0) {
                    c1881m6M5788t2.m5766t(new RunnableC1818f6(c1881m6M5788t2, zzawVar, this.f10002b, interfaceC2843t0));
                } else {
                    C1860k3 c1860k3 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9945i.m5623a("Not bundling data. Service unavailable or out of date");
                    C1900o7 c1900o8 = c1897o4.f10089l;
                    C1897o4.m5774i(c1900o8);
                    c1900o8.m5808D(interfaceC2843t0, new byte[0]);
                }
                break;
        }
    }
}
