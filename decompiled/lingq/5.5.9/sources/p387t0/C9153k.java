package p387t0;

import android.graphics.PathMeasure;
import dm.C5207g;

/* JADX INFO: renamed from: t0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9153k implements InterfaceC9142e0 {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f47683a;

    public C9153k(PathMeasure pathMeasure) {
        this.f47683a = pathMeasure;
    }

    @Override // p387t0.InterfaceC9142e0
    /* JADX INFO: renamed from: a */
    public final float mo17434a() {
        return this.f47683a.getLength();
    }

    @Override // p387t0.InterfaceC9142e0
    /* JADX INFO: renamed from: b */
    public final void mo17435b(C9151j c9151j) {
        this.f47683a.setPath(c9151j != null ? c9151j.f47676a : null, false);
    }

    @Override // p387t0.InterfaceC9142e0
    /* JADX INFO: renamed from: c */
    public final boolean mo17436c(float f3, float f10, C9151j c9151j) {
        C5207g.m11111f(c9151j, "destination");
        return this.f47683a.getSegment(f3, f10, c9151j.f47676a, true);
    }
}
