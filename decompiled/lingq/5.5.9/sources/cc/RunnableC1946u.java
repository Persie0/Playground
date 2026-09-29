package cc;

import p176ib.C6272i;
import p326q.C8446b;

/* JADX INFO: renamed from: cc.u */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1946u implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f10225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1930s1 f10226c;

    public RunnableC1946u(C1930s1 c1930s1, String str, long j10) {
        this.f10226c = c1930s1;
        this.f10224a = str;
        this.f10225b = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C1930s1 c1930s1 = this.f10226c;
        c1930s1.mo5748g();
        String str = this.f10224a;
        C6272i.m12912f(str);
        C8446b c8446b = c1930s1.f10175c;
        Integer num = (Integer) c8446b.getOrDefault(str, null);
        InterfaceC1781b5 interfaceC1781b5 = c1930s1.f10430a;
        if (num != null) {
            C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
            C1782b6 c1782b6 = c1897o4.f10059J;
            C1897o4.m5775j(c1782b6);
            C1988y5 c1988y5M5522n = c1782b6.m5522n(false);
            int iIntValue = num.intValue() - 1;
            if (iIntValue != 0) {
                c8446b.put(str, Integer.valueOf(iIntValue));
                return;
            }
            c8446b.remove(str);
            C8446b c8446b2 = c1930s1.f10174b;
            Long l10 = (Long) c8446b2.getOrDefault(str, null);
            C1860k3 c1860k3 = c1897o4.f10086i;
            long j10 = this.f10225b;
            if (l10 == null) {
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5623a("First ad unit exposure time was never set");
            } else {
                long jLongValue = j10 - l10.longValue();
                c8446b2.remove(str);
                c1930s1.m5861m(str, jLongValue, c1988y5M5522n);
            }
            if (c8446b.isEmpty()) {
                long j11 = c1930s1.f10176d;
                if (j11 == 0) {
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5623a("First ad exposure time was never set");
                } else {
                    c1930s1.m5860l(j10 - j11, c1988y5M5522n);
                    c1930s1.f10176d = 0L;
                }
            }
        } else {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5624b(str, "Call to endAdUnitExposure for unknown ad unit id");
        }
    }
}
