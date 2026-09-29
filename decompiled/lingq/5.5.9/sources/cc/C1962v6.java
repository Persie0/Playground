package cc;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2718j9;
import com.google.android.gms.internal.measurement.C2734kb;
import com.google.android.gms.internal.measurement.InterfaceC2732k9;

/* JADX INFO: renamed from: cc.v6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1962v6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1971w6 f10263a;

    public C1962v6(C1971w6 c1971w6) {
        this.f10263a = c1971w6;
    }

    /* JADX INFO: renamed from: a */
    public final void m5900a() {
        C1971w6 c1971w6 = this.f10263a;
        c1971w6.mo5748g();
        InterfaceC1781b5 interfaceC1781b5 = c1971w6.f10430a;
        C1986y3 c1986y3 = ((C1897o4) interfaceC1781b5).f10085h;
        C1897o4.m5774i(c1986y3);
        ((C1897o4) interfaceC1781b5).f10058I.getClass();
        if (c1986y3.m5923r(System.currentTimeMillis())) {
            C1986y3 c1986y4 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y4);
            c1986y4.f10409k.m5889a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9938I.m5623a("Detected application was in foreground");
                ((C1897o4) interfaceC1781b5).f10058I.getClass();
                m5902c(false, System.currentTimeMillis());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5901b(boolean z10, long j10) {
        C1971w6 c1971w6 = this.f10263a;
        c1971w6.mo5748g();
        c1971w6.m5908l();
        InterfaceC1781b5 interfaceC1781b5 = c1971w6.f10430a;
        C1986y3 c1986y3 = ((C1897o4) interfaceC1781b5).f10085h;
        C1897o4.m5774i(c1986y3);
        if (c1986y3.m5923r(j10)) {
            C1986y3 c1986y4 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y4);
            c1986y4.f10409k.m5889a(true);
            C2734kb.m7924a();
            if (((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10360k0)) {
                ((C1897o4) interfaceC1781b5).m5785p().m5532o();
            }
        }
        C1986y3 c1986y5 = ((C1897o4) interfaceC1781b5).f10085h;
        C1897o4.m5774i(c1986y5);
        c1986y5.f10391I.m5898b(j10);
        C1986y3 c1986y6 = ((C1897o4) interfaceC1781b5).f10085h;
        C1897o4.m5774i(c1986y6);
        if (c1986y6.f10409k.m5890b()) {
            m5902c(z10, j10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5902c(boolean z10, long j10) {
        C1971w6 c1971w6 = this.f10263a;
        c1971w6.mo5748g();
        InterfaceC1781b5 interfaceC1781b5 = c1971w6.f10430a;
        if (((C1897o4) interfaceC1781b5).m5779g()) {
            C1986y3 c1986y3 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y3);
            c1986y3.f10391I.m5898b(j10);
            ((C1897o4) interfaceC1781b5).f10058I.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5624b(Long.valueOf(jElapsedRealtime), "Session started, time");
            Long lValueOf = Long.valueOf(j10 / 1000);
            C1934s5 c1934s5 = ((C1897o4) interfaceC1781b5).f10060K;
            C1897o4.m5775j(c1934s5);
            c1934s5.m5880x(j10, lValueOf, "auto", "_sid");
            C1986y3 c1986y4 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y4);
            c1986y4.f10392J.m5898b(lValueOf.longValue());
            C1986y3 c1986y5 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y5);
            c1986y5.f10409k.m5889a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10342b0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            C1934s5 c1934s6 = ((C1897o4) interfaceC1781b5).f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5872p(j10, bundle, "auto", "_s");
            ((InterfaceC2732k9) C2718j9.f14273b.f14274a.zza()).zza();
            if (((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10348e0)) {
                C1986y3 c1986y6 = ((C1897o4) interfaceC1781b5).f10085h;
                C1897o4.m5774i(c1986y6);
                String strM5913a = c1986y6.f10397O.m5913a();
                if (TextUtils.isEmpty(strM5913a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strM5913a);
                C1934s5 c1934s7 = ((C1897o4) interfaceC1781b5).f10060K;
                C1897o4.m5775j(c1934s7);
                c1934s7.m5872p(j10, bundle2, "auto", "_ssr");
            }
        }
    }
}
