package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class jic extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f45593a;

    /* JADX INFO: renamed from: b */
    public final boolean f45594b;

    /* JADX INFO: renamed from: c */
    public final String f45595c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tic f45596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jic(tic ticVar, Callable callable, boolean z) {
        super(callable);
        this.f45596d = ticVar;
        long andIncrement = tic.f62353k.getAndIncrement();
        this.f45593a = andIncrement;
        this.f45595c = "Task exception on worker thread";
        this.f45594b = z;
        if (andIncrement == Long.MAX_VALUE) {
            xcc xccVar = ((kjc) ticVar.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jic jicVar = (jic) obj;
        boolean z = jicVar.f45594b;
        boolean z2 = this.f45594b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = jicVar.f45593a;
        long j2 = this.f45593a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        xcc xccVar = ((kjc) this.f45596d.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68081g.m17924b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        xcc xccVar = ((kjc) this.f45596d.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68080f.m17924b(th, this.f45595c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jic(tic ticVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f45596d = ticVar;
        long andIncrement = tic.f62353k.getAndIncrement();
        this.f45593a = andIncrement;
        this.f45595c = str;
        this.f45594b = z;
        if (andIncrement == Long.MAX_VALUE) {
            xcc xccVar = ((kjc) ticVar.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Tasks index overflow");
        }
    }
}
