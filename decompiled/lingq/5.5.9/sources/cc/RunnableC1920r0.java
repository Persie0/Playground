package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import p290o6.C7968m;

/* JADX INFO: renamed from: cc.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1920r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f10161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1940t2 f10162c;

    public /* synthetic */ RunnableC1920r0(C1940t2 c1940t2, long j10, int i10) {
        this.f10160a = i10;
        this.f10162c = c1940t2;
        this.f10161b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10160a;
        long j10 = this.f10161b;
        C1940t2 c1940t2 = this.f10162c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C1930s1) c1940t2).m5862n(j10);
                break;
            default:
                C1971w6 c1971w6 = (C1971w6) c1940t2;
                c1971w6.mo5748g();
                c1971w6.m5908l();
                C1897o4 c1897o4 = (C1897o4) c1971w6.f10430a;
                C1860k3 c1860k3 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9938I.m5624b(Long.valueOf(j10), "Activity resumed, time");
                if (c1897o4.f10084g.m5583r()) {
                    C1953u6 c1953u6 = c1971w6.f10279e;
                    c1953u6.f10245d.mo5748g();
                    c1953u6.f10244c.m5745a();
                    c1953u6.f10242a = j10;
                    c1953u6.f10243b = j10;
                } else {
                    C1986y3 c1986y3 = c1897o4.f10085h;
                    C1897o4.m5774i(c1986y3);
                    if (c1986y3.f10394L.m5890b()) {
                        C1953u6 c1953u7 = c1971w6.f10279e;
                        c1953u7.f10245d.mo5748g();
                        c1953u7.f10244c.m5745a();
                        c1953u7.f10242a = j10;
                        c1953u7.f10243b = j10;
                    }
                }
                C7968m c7968m = c1971w6.f10280f;
                ((C1971w6) c7968m.f43384b).mo5748g();
                RunnableC1944t6 runnableC1944t6 = (RunnableC1944t6) c7968m.f43383a;
                if (runnableC1944t6 != null) {
                    ((C1971w6) c7968m.f43384b).f10277c.removeCallbacks(runnableC1944t6);
                }
                C1986y3 c1986y4 = ((C1897o4) ((C1971w6) c7968m.f43384b).f10430a).f10085h;
                C1897o4.m5774i(c1986y4);
                c1986y4.f10394L.m5889a(false);
                C1962v6 c1962v6 = c1971w6.f10278d;
                c1962v6.f10263a.mo5748g();
                C1971w6 c1971w7 = c1962v6.f10263a;
                if (((C1897o4) c1971w7.f10430a).m5779g()) {
                    ((C1897o4) c1971w7.f10430a).f10058I.getClass();
                    c1962v6.m5901b(false, System.currentTimeMillis());
                    break;
                }
                break;
        }
    }
}
