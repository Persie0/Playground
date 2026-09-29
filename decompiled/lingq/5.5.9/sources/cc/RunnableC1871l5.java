package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.concurrent.atomic.AtomicReference;
import p290o6.C7968m;

/* JADX INFO: renamed from: cc.l5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1871l5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f9980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1914q3 f9981c;

    public /* synthetic */ RunnableC1871l5(AbstractC1914q3 abstractC1914q3, long j10, int i10) {
        this.f9979a = i10;
        this.f9981c = abstractC1914q3;
        this.f9980b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9979a;
        AbstractC1914q3 abstractC1914q3 = this.f9981c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1934s5 c1934s5 = (C1934s5) abstractC1914q3;
                c1934s5.m5874r(true, this.f9980b);
                ((C1897o4) c1934s5.f10430a).m5788t().m5769x(new AtomicReference());
                break;
            default:
                C1971w6 c1971w6 = (C1971w6) abstractC1914q3;
                long j10 = this.f9980b;
                c1971w6.mo5748g();
                c1971w6.m5908l();
                C1897o4 c1897o4 = (C1897o4) c1971w6.f10430a;
                C1860k3 c1860k3 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9938I.m5624b(Long.valueOf(j10), "Activity paused, time");
                C7968m c7968m = c1971w6.f10280f;
                ((C1897o4) ((C1971w6) c7968m.f43384b).f10430a).f10058I.getClass();
                RunnableC1944t6 runnableC1944t6 = new RunnableC1944t6(c7968m, System.currentTimeMillis(), j10);
                c7968m.f43383a = runnableC1944t6;
                ((C1971w6) c7968m.f43384b).f10277c.postDelayed(runnableC1944t6, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                if (c1897o4.f10084g.m5583r()) {
                    c1971w6.f10279e.f10244c.m5745a();
                }
                break;
        }
    }
}
