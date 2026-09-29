package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import p176ib.C6272i;
import p326q.C8446b;

/* JADX INFO: renamed from: cc.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1766a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f9664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9665c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1940t2 f9666d;

    public /* synthetic */ RunnableC1766a(C1940t2 c1940t2, Object obj, long j10, int i10) {
        this.f9663a = i10;
        this.f9666d = c1940t2;
        this.f9665c = obj;
        this.f9664b = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9663a;
        Object obj = null;
        long j10 = this.f9664b;
        Object obj2 = this.f9665c;
        C1940t2 c1940t2 = this.f9666d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1930s1 c1930s1 = (C1930s1) c1940t2;
                String str = (String) obj2;
                c1930s1.mo5748g();
                C6272i.m12912f(str);
                C8446b c8446b = c1930s1.f10175c;
                if (c8446b.isEmpty()) {
                    c1930s1.f10176d = j10;
                }
                Integer num = (Integer) c8446b.getOrDefault(str, null);
                if (num != null) {
                    c8446b.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c8446b.f45619c < 100) {
                    c8446b.put(str, 1);
                    c1930s1.f10174b.put(str, Long.valueOf(j10));
                } else {
                    C1860k3 c1860k3 = ((C1897o4) c1930s1.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9945i.m5623a("Too many ads visible");
                }
                break;
            default:
                C1782b6 c1782b6 = (C1782b6) c1940t2;
                c1782b6.m5521m((C1988y5) obj2, false, j10);
                c1782b6.f9687e = null;
                C1881m6 c1881m6M5788t = ((C1897o4) c1782b6.f10430a).m5788t();
                c1881m6M5788t.mo5748g();
                c1881m6M5788t.m5851h();
                c1881m6M5788t.m5766t(new RunnableC1888n4(c1881m6M5788t, 4, obj));
                break;
        }
    }
}
