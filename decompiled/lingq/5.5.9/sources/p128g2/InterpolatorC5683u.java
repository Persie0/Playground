package p128g2;

import android.view.animation.Interpolator;
import p038c2.C1660c;

/* JADX INFO: renamed from: g2.u */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC5683u implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1660c f34666a;

    public InterpolatorC5683u(C1660c c1660c) {
        this.f34666a = c1660c;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        return (float) this.f34666a.mo5384a(f3);
    }
}
