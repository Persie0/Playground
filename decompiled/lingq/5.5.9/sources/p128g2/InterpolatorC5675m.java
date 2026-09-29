package p128g2;

import android.view.animation.Interpolator;
import p038c2.C1660c;

/* JADX INFO: renamed from: g2.m */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC5675m implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1660c f34606a;

    public InterpolatorC5675m(C1660c c1660c) {
        this.f34606a = c1660c;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        return (float) this.f34606a.mo5384a(f3);
    }
}
