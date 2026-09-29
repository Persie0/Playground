package cc;

import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.d6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1800d6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzq f9758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f9759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzli f9760c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1881m6 f9761d;

    public RunnableC1800d6(C1881m6 c1881m6, zzq zzqVar, boolean z10, zzli zzliVar) {
        this.f9761d = c1881m6;
        this.f9758a = zzqVar;
        this.f9759b = z10;
        this.f9760c = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C1881m6 c1881m6 = this.f9761d;
        InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
        if (interfaceC1779b3 == null) {
            C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Discarding data. Failed to set user property");
        } else {
            zzq zzqVar = this.f9758a;
            C6272i.m12915i(zzqVar);
            c1881m6.m5758l(interfaceC1779b3, this.f9759b ? null : this.f9760c, zzqVar);
            c1881m6.m5765s();
        }
    }
}
