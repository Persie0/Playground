package p000;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bie {

    /* JADX INFO: renamed from: d */
    public bko f3408d;

    /* JADX INFO: renamed from: e */
    private final bib f3409e;

    /* JADX INFO: renamed from: a */
    final List f3405a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f3406b = false;

    /* JADX INFO: renamed from: c */
    public float f3407c = 0.0f;

    /* JADX INFO: renamed from: f */
    private Object f3410f = null;

    /* JADX INFO: renamed from: g */
    private float f3411g = -1.0f;

    /* JADX INFO: renamed from: h */
    private float f3412h = -1.0f;

    public bie(List list) {
        this.f3409e = list.isEmpty() ? new bia() : list.size() == 1 ? new bid(list) : new bic(list);
    }

    /* JADX INFO: renamed from: k */
    private final float m2487k() {
        float f = this.f3411g;
        if (f != -1.0f) {
            return f;
        }
        float fMo2481b = this.f3409e.mo2481b();
        this.f3411g = fMo2481b;
        return fMo2481b;
    }

    /* JADX INFO: renamed from: a */
    public float mo2488a() {
        float f = this.f3412h;
        if (f != -1.0f) {
            return f;
        }
        float fMo2480a = this.f3409e.mo2480a();
        this.f3412h = fMo2480a;
        return fMo2480a;
    }

    /* JADX INFO: renamed from: b */
    public final float m2489b() {
        bmf bmfVarM2491d = m2491d();
        if (bmfVarM2491d.m2710e()) {
            return 0.0f;
        }
        return bmfVarM2491d.f3761d.getInterpolation(m2490c());
    }

    /* JADX INFO: renamed from: c */
    final float m2490c() {
        if (this.f3406b) {
            return 0.0f;
        }
        bmf bmfVarM2491d = m2491d();
        if (bmfVarM2491d.m2710e()) {
            return 0.0f;
        }
        return (this.f3407c - bmfVarM2491d.m2708c()) / (bmfVarM2491d.m2707b() - bmfVarM2491d.m2708c());
    }

    /* JADX INFO: renamed from: d */
    public final bmf m2491d() {
        bmf bmfVarMo2482c = this.f3409e.mo2482c();
        bgh.m2413a();
        return bmfVarMo2482c;
    }

    /* JADX INFO: renamed from: e */
    public Object mo2492e() {
        float fM2490c = m2490c();
        if (this.f3408d == null && this.f3409e.mo2483d(fM2490c)) {
            return this.f3410f;
        }
        bmf bmfVarM2491d = m2491d();
        Interpolator interpolator = bmfVarM2491d.f3762e;
        Object objMo2493f = (interpolator == null || bmfVarM2491d.f3763f == null) ? mo2493f(bmfVarM2491d, m2489b()) : mo2497j(bmfVarM2491d, interpolator.getInterpolation(fM2490c), bmfVarM2491d.f3763f.getInterpolation(fM2490c));
        this.f3410f = objMo2493f;
        return objMo2493f;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo2493f(bmf bmfVar, float f);

    /* JADX INFO: renamed from: g */
    public final void m2494g(bhz bhzVar) {
        this.f3405a.add(bhzVar);
    }

    /* JADX INFO: renamed from: h */
    public void mo2495h() {
        for (int i = 0; i < this.f3405a.size(); i++) {
            ((bhz) this.f3405a.get(i)).mo2465c();
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo2496i(float f) {
        if (this.f3409e.mo2484e()) {
            return;
        }
        if (f < m2487k()) {
            f = m2487k();
        } else if (f > mo2488a()) {
            f = mo2488a();
        }
        if (f == this.f3407c) {
            return;
        }
        this.f3407c = f;
        if (this.f3409e.mo2485f(f)) {
            mo2495h();
        }
    }

    /* JADX INFO: renamed from: j */
    protected Object mo2497j(bmf bmfVar, float f, float f2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
