package cc;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.C2891w9;
import com.google.android.gms.internal.measurement.InterfaceC2904x9;

/* JADX INFO: renamed from: cc.u6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1953u6 {

    /* JADX INFO: renamed from: a */
    public long f10242a;

    /* JADX INFO: renamed from: b */
    public long f10243b;

    /* JADX INFO: renamed from: c */
    public final C1809e6 f10244c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1971w6 f10245d;

    public C1953u6(C1971w6 c1971w6) {
        this.f10245d = c1971w6;
        this.f10244c = new C1809e6(this, (C1897o4) c1971w6.f10430a, 1);
        ((C1897o4) c1971w6.f10430a).f10058I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f10242a = jElapsedRealtime;
        this.f10243b = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5895a(long j10, boolean z10, boolean z11) {
        C1971w6 c1971w6 = this.f10245d;
        c1971w6.mo5748g();
        c1971w6.m5851h();
        ((InterfaceC2904x9) C2891w9.f14500b.f14501a.zza()).zza();
        InterfaceC1781b5 interfaceC1781b5 = c1971w6.f10430a;
        if (!((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10350f0)) {
            C1986y3 c1986y3 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y3);
            ((C1897o4) interfaceC1781b5).f10058I.getClass();
            c1986y3.f10391I.m5898b(System.currentTimeMillis());
        } else if (((C1897o4) interfaceC1781b5).m5779g()) {
            C1986y3 c1986y4 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y4);
            ((C1897o4) interfaceC1781b5).f10058I.getClass();
            c1986y4.f10391I.m5898b(System.currentTimeMillis());
        }
        long j11 = j10 - this.f10242a;
        if (!z10 && j11 < 1000) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5624b(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f10243b;
            this.f10243b = j10;
        }
        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k4);
        c1860k4.f9938I.m5624b(Long.valueOf(j11), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !((C1897o4) interfaceC1781b5).f10084g.m5583r();
        C1782b6 c1782b6 = ((C1897o4) interfaceC1781b5).f10059J;
        C1897o4.m5775j(c1782b6);
        C1900o7.m5803u(c1782b6.m5522n(z12), bundle, true);
        if (!z11) {
            C1934s5 c1934s5 = ((C1897o4) interfaceC1781b5).f10060K;
            C1897o4.m5775j(c1934s5);
            c1934s5.m5871o("auto", "_e", bundle);
        }
        this.f10242a = j10;
        C1809e6 c1809e6 = this.f10244c;
        c1809e6.m5745a();
        c1809e6.m5746c(3600000L);
        return true;
    }
}
