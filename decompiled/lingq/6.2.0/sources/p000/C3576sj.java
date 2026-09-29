package p000;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: sj */
/* JADX INFO: loaded from: classes.dex */
public final class C3576sj {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f60911a;

    public C3576sj(PathMeasure pathMeasure) {
        this.f60911a = pathMeasure;
    }

    /* JADX INFO: renamed from: a */
    public final void m21398a(float f, float f2, C3500qj c3500qj) {
        if (c3500qj == null) {
            C3386nv.m17636w("Unable to obtain android.graphics.Path");
        } else {
            this.f60911a.getSegment(f, f2, c3500qj.f57839a, true);
        }
    }
}
