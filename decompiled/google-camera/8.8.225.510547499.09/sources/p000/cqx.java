package p000;

import android.graphics.PointF;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class cqx implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cra f9054a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f9055b = new AtomicBoolean(true);

    public cqx(cra craVar) {
        this.f9054a = craVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        PointF pointF = (PointF) obj;
        if (this.f9055b.compareAndSet(true, false)) {
            return;
        }
        if (this.f9054a.f9073h.mo6184l(dhu.f11209k) && ((Boolean) ((jwf) this.f9054a.f9082q.f3651a).f34942d).booleanValue()) {
            return;
        }
        this.f9054a.m5394f(pointF, false);
    }
}
