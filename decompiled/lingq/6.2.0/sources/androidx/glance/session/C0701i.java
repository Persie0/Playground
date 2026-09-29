package androidx.glance.session;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.time.DurationUnit;
import p000.AbstractC3352my;
import p000.cd4;
import p000.cn2;
import p000.fg2;
import p000.iy5;
import p000.kn1;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.session.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0701i implements un1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ un1 f6278a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f6279b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fg2 f6280c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un1 f6281d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f6282e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f6283f;

    public C0701i(un1 un1Var, fg2 fg2Var, un1 un1Var2, zi3 zi3Var, AtomicReference atomicReference) {
        this.f6280c = fg2Var;
        this.f6281d = un1Var2;
        this.f6282e = zi3Var;
        this.f6283f = atomicReference;
        this.f6278a = un1Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m2499a() {
        Long l = (Long) this.f6279b.get();
        if (l == null) {
            iy5 iy5Var = cn2.f10315b;
            return cn2.f10316c;
        }
        long jLongValue = l.longValue();
        this.f6280c.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        iy5 iy5Var2 = cn2.f10315b;
        return AbstractC3352my.m17119f0(jCurrentTimeMillis, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final void m2500b(long j) {
        if (cn2.m4886d(j) <= 0) {
            vz1.m23637j(this.f6281d, new TimeoutCancellationException("Timed out immediately", this.f6282e.hashCode()));
            return;
        }
        if (cn2.m4885c(m2499a(), j) < 0) {
            return;
        }
        this.f6280c.getClass();
        this.f6279b.set(Long.valueOf(cn2.m4886d(j) + System.currentTimeMillis()));
        zi3 zi3Var = this.f6282e;
        fg2 fg2Var = this.f6280c;
        un1 un1Var = this.f6281d;
        cd4 cd4Var = (cd4) this.f6283f.getAndSet(wfb.m23926u(un1Var, null, null, new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this, fg2Var, un1Var, zi3Var, null), 3));
        if (cd4Var != null) {
            cd4Var.mo4537a(null);
        }
    }

    @Override // p000.un1
    /* JADX INFO: renamed from: x */
    public final kn1 mo1309x() {
        return this.f6278a.mo1309x();
    }
}
