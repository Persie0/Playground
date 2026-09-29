package cc;

import android.os.SystemClock;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: renamed from: cc.e6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1809e6 extends AbstractC1874m {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f9783e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f9784f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1809e6(Object obj, InterfaceC1781b5 interfaceC1781b5, int i10) {
        super(interfaceC1781b5);
        this.f9783e = i10;
        this.f9784f = obj;
    }

    @Override // cc.AbstractC1874m
    /* JADX INFO: renamed from: b */
    public final void mo5591b() {
        int i10 = this.f9783e;
        Object obj = this.f9784f;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1881m6 c1881m6 = (C1881m6) obj;
                c1881m6.mo5748g();
                if (c1881m6.m5760n()) {
                    C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9938I.m5623a("Inactivity, disconnecting from the service");
                    c1881m6.m5768w();
                    break;
                }
                break;
            case 1:
                C1953u6 c1953u6 = (C1953u6) obj;
                c1953u6.f10245d.mo5748g();
                C1971w6 c1971w6 = c1953u6.f10245d;
                ((C1897o4) c1971w6.f10430a).f10058I.getClass();
                c1953u6.m5895a(SystemClock.elapsedRealtime(), false, false);
                C1897o4 c1897o4 = (C1897o4) c1971w6.f10430a;
                C1930s1 c1930s1M5782m = c1897o4.m5782m();
                c1897o4.f10058I.getClass();
                c1930s1M5782m.m5859k(SystemClock.elapsedRealtime());
                break;
            default:
                C1989y6 c1989y6 = (C1989y6) obj;
                c1989y6.m5929l();
                C1860k3 c1860k4 = ((C1897o4) c1989y6.f10430a).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9938I.m5623a("Starting upload from DelayedRunnable");
                c1989y6.f10436b.m5661t();
                break;
        }
    }
}
