package p000;

import androidx.constraintlayout.motion.widget.AbstractC0475b;

/* JADX INFO: loaded from: classes2.dex */
public final class e36 extends d36 {

    /* JADX INFO: renamed from: a */
    public float f36648a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f36649b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f36650c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0475b f36651d;

    public e36(AbstractC0475b abstractC0475b) {
        this.f36651d = abstractC0475b;
    }

    @Override // p000.d36
    /* JADX INFO: renamed from: a */
    public final float mo10074a() {
        return this.f36651d.f5384O;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.f36648a;
        float f3 = this.f36650c;
        AbstractC0475b abstractC0475b = this.f36651d;
        if (f2 > 0.0f) {
            float f4 = f2 / f3;
            if (f4 < f) {
                f = f4;
            }
            float f5 = f3 * f;
            abstractC0475b.f5384O = f2 - f5;
            return ((f2 * f) - ((f5 * f) / 2.0f)) + this.f36649b;
        }
        float f6 = (-f2) / f3;
        if (f6 < f) {
            f = f6;
        }
        float f7 = f3 * f;
        abstractC0475b.f5384O = f7 + f2;
        return ((f7 * f) / 2.0f) + (f2 * f) + this.f36649b;
    }
}
