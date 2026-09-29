package cc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: cc.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1861k4 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f9949a;

    /* JADX INFO: renamed from: b */
    public final boolean f9950b;

    /* JADX INFO: renamed from: c */
    public final String f9951c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1879m4 f9952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861k4(C1879m4 c1879m4, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f9952d = c1879m4;
        long andIncrement = C1879m4.f9992k.getAndIncrement();
        this.f9949a = andIncrement;
        this.f9951c = str;
        this.f9950b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            C1860k3 c1860k3 = ((C1897o4) c1879m4.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861k4(C1879m4 c1879m4, Callable callable, boolean z10) {
        super(callable);
        this.f9952d = c1879m4;
        long andIncrement = C1879m4.f9992k.getAndIncrement();
        this.f9949a = andIncrement;
        this.f9951c = "Task exception on worker thread";
        this.f9950b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            C1860k3 c1860k3 = ((C1897o4) c1879m4.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1861k4 c1861k4 = (C1861k4) obj;
        boolean z10 = c1861k4.f9950b;
        boolean z11 = this.f9950b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = c1861k4.f9949a;
        long j11 = this.f9949a;
        if (j11 < j10) {
            return -1;
        }
        if (j11 > j10) {
            return 1;
        }
        C1860k3 c1860k3 = ((C1897o4) this.f9952d.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9943g.m5624b(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        C1860k3 c1860k3 = ((C1897o4) this.f9952d.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9942f.m5624b(th2, this.f9951c);
        super.setException(th2);
    }
}
