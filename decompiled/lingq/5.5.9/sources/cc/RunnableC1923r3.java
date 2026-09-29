package cc;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: renamed from: cc.r3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1923r3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f10166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10167c;

    public /* synthetic */ RunnableC1923r3(int i10, Object obj, boolean z10) {
        this.f10165a = i10;
        this.f10167c = obj;
        this.f10166b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10165a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C1932s3) this.f10167c).f10178a.m5635C();
                break;
            default:
                boolean zM5779g = ((C1897o4) ((C1934s5) this.f10167c).f10430a).m5779g();
                C1897o4 c1897o4 = (C1897o4) ((C1934s5) this.f10167c).f10430a;
                boolean z10 = c1897o4.f10071V != null && c1897o4.f10071V.booleanValue();
                ((C1897o4) ((C1934s5) this.f10167c).f10430a).f10071V = Boolean.valueOf(this.f10166b);
                if (z10 == this.f10166b) {
                    C1860k3 c1860k3 = ((C1897o4) ((C1934s5) this.f10167c).f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9938I.m5624b(Boolean.valueOf(this.f10166b), "Default data collection state already set to");
                }
                if (((C1897o4) ((C1934s5) this.f10167c).f10430a).m5779g() != zM5779g) {
                    boolean zM5779g2 = ((C1897o4) ((C1934s5) this.f10167c).f10430a).m5779g();
                    C1897o4 c1897o5 = (C1897o4) ((C1934s5) this.f10167c).f10430a;
                    if (zM5779g2 != (c1897o5.f10071V != null && c1897o5.f10071V.booleanValue())) {
                        C1860k3 c1860k4 = ((C1897o4) ((C1934s5) this.f10167c).f10430a).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9947k.m5625c(Boolean.valueOf(this.f10166b), Boolean.valueOf(zM5779g), "Default data collection is different than actual status");
                    }
                } else {
                    C1860k3 c1860k5 = ((C1897o4) ((C1934s5) this.f10167c).f10430a).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9947k.m5625c(Boolean.valueOf(this.f10166b), Boolean.valueOf(zM5779g), "Default data collection is different than actual status");
                }
                ((C1934s5) this.f10167c).m5882z();
                break;
        }
    }
}
