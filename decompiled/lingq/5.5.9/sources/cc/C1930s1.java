package cc;

import android.os.Bundle;
import java.util.Iterator;
import p326q.AbstractC8451g;
import p326q.C8446b;

/* JADX INFO: renamed from: cc.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1930s1 extends C1940t2 {

    /* JADX INFO: renamed from: b */
    public final C8446b f10174b;

    /* JADX INFO: renamed from: c */
    public final C8446b f10175c;

    /* JADX INFO: renamed from: d */
    public long f10176d;

    public C1930s1(C1897o4 c1897o4) {
        super(c1897o4);
        this.f10175c = new C8446b();
        this.f10174b = new C8446b();
    }

    /* JADX INFO: renamed from: h */
    public final void m5857h(String str, long j10) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (str == null || str.length() == 0) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Ad unit id must be a non-empty string");
        } else {
            C1879m4 c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(new RunnableC1766a(this, str, j10, 0));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5858j(String str, long j10) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (str != null && str.length() != 0) {
            C1879m4 c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(new RunnableC1946u(this, str, j10));
            return;
        }
        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9942f.m5623a("Ad unit id must be a non-empty string");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m5859k(long j10) {
        C1782b6 c1782b6 = ((C1897o4) this.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        C1988y5 c1988y5M5522n = c1782b6.m5522n(false);
        C8446b c8446b = this.f10174b;
        for (String str : (AbstractC8451g.c) c8446b.keySet()) {
            m5861m(str, j10 - ((Long) c8446b.getOrDefault(str, null)).longValue(), c1988y5M5522n);
        }
        if (!c8446b.isEmpty()) {
            m5860l(j10 - this.f10176d, c1988y5M5522n);
        }
        m5862n(j10);
    }

    /* JADX INFO: renamed from: l */
    public final void m5860l(long j10, C1988y5 c1988y5) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (c1988y5 == null) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5623a("Not logging ad exposure. No active activity");
        } else {
            if (j10 < 1000) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9938I.m5624b(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            C1900o7.m5803u(c1988y5, bundle, true);
            C1934s5 c1934s5 = ((C1897o4) interfaceC1781b5).f10060K;
            C1897o4.m5775j(c1934s5);
            c1934s5.m5871o("am", "_xa", bundle);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5861m(String str, long j10, C1988y5 c1988y5) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (c1988y5 == null) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5623a("Not logging ad unit exposure. No active activity");
        } else {
            if (j10 < 1000) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9938I.m5624b(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            C1900o7.m5803u(c1988y5, bundle, true);
            C1934s5 c1934s5 = ((C1897o4) interfaceC1781b5).f10060K;
            C1897o4.m5775j(c1934s5);
            c1934s5.m5871o("am", "_xu", bundle);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5862n(long j10) {
        C8446b c8446b = this.f10174b;
        Iterator it = ((AbstractC8451g.c) c8446b.keySet()).iterator();
        while (it.hasNext()) {
            c8446b.put((String) it.next(), Long.valueOf(j10));
        }
        if (c8446b.isEmpty()) {
            return;
        }
        this.f10176d = j10;
    }
}
