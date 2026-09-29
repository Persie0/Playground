package cc;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.h6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1836h6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzq f9850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f9851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzaw f9852c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1881m6 f9853d;

    public RunnableC1836h6(C1881m6 c1881m6, zzq zzqVar, boolean z10, zzaw zzawVar) {
        this.f9853d = c1881m6;
        this.f9850a = zzqVar;
        this.f9851b = z10;
        this.f9852c = zzawVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C1881m6 c1881m6 = this.f9853d;
        InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
        if (interfaceC1779b3 == null) {
            C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Discarding data. Failed to send event to service");
        } else {
            zzq zzqVar = this.f9850a;
            C6272i.m12915i(zzqVar);
            c1881m6.m5758l(interfaceC1779b3, this.f9851b ? null : this.f9852c, zzqVar);
            c1881m6.m5765s();
        }
    }
}
