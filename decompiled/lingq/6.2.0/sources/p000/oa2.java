package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class oa2 extends AbstractC3632u1 implements ScheduledFuture {

    /* JADX INFO: renamed from: h */
    public final ScheduledFuture f54097h;

    public oa2(na2 na2Var) {
        this.f54097h = na2Var.mo13154a(new vqb(this, 10));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f54097h.compareTo(delayed);
    }

    @Override // p000.AbstractC3632u1
    /* JADX INFO: renamed from: d */
    public final void mo17883d() {
        ScheduledFuture scheduledFuture = this.f54097h;
        Object obj = this.f63229a;
        scheduledFuture.cancel((obj instanceof C3444p1) && ((C3444p1) obj).f55410a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f54097h.getDelay(timeUnit);
    }
}
