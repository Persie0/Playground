package p000;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgp {

    /* JADX INFO: renamed from: a */
    private static final AtomicBoolean f10947a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    private final dge f10948b;

    /* JADX INFO: renamed from: c */
    private final boolean f10949c;

    /* JADX INFO: renamed from: d */
    private final fcp f10950d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f10951e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private mrm f10952f;

    /* JADX INFO: renamed from: g */
    private mrm f10953g;

    /* JADX INFO: renamed from: h */
    private final imv f10954h;

    public dgp(dge dgeVar, fcp fcpVar, dhv dhvVar) {
        mqu mquVar = mqu.f41450a;
        this.f10952f = mquVar;
        this.f10953g = mquVar;
        this.f10948b = dgeVar;
        this.f10950d = fcpVar;
        this.f10954h = new imv(0.02f, null);
        this.f10949c = dhvVar.mo6184l(dhi.f11121h);
    }

    /* JADX INFO: renamed from: g */
    private final boolean m6111g() {
        gsr gsrVarM6886b;
        mrm mrmVarM6098a = this.f10948b.m6098a();
        if (mrmVarM6098a.mo16813g() && (gsrVarM6886b = ((dxx) ((cvy) mrmVarM6098a.mo16809c()).f9845b).m6886b()) != null) {
            return this.f10954h.m11497a(gsrVarM6886b.f26257q, gsrVarM6886b.f26255o);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m6112h() {
        return this.f10953g.mo16813g() && ((imv) this.f10953g.mo16809c()).f31555a > 15.0f;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6113a() {
        f10947a.set(true);
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m6114b() {
        this.f10952f = mrm.m16829i(Long.valueOf(SystemClock.uptimeMillis()));
        if (this.f10951e.getAndSet(false) && !m6112h()) {
            this.f10950d.mo8197q();
        }
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m6115c() {
        this.f10950d.mo8195o();
        this.f10951e.set(true);
    }

    /* JADX INFO: renamed from: d */
    final synchronized void m6116d(float f) {
        m6111g();
        this.f10953g = mrm.m16829i(new imv(f, null));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6117e() {
        mqu mquVar = mqu.f41450a;
        this.f10952f = mquVar;
        this.f10953g = mquVar;
        this.f10951e.set(false);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m6118f() {
        return this.f10949c && m6111g() && m6112h() && (!this.f10952f.mo16813g() || SystemClock.uptimeMillis() - ((Long) this.f10952f.mo16809c()).longValue() >= 2000) && !f10947a.get();
    }
}
