package p000;

import androidx.compose.foundation.C0125l;

/* JADX INFO: loaded from: classes.dex */
final class jq5 extends i16 {

    /* JADX INFO: renamed from: b */
    public final int f46004b;

    /* JADX INFO: renamed from: c */
    public final lq5 f46005c;

    /* JADX INFO: renamed from: d */
    public final float f46006d;

    public jq5(int i, fg2 fg2Var, float f) {
        this.f46004b = i;
        this.f46005c = fg2Var;
        this.f46006d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq5)) {
            return false;
        }
        jq5 jq5Var = (jq5) obj;
        return this.f46004b == jq5Var.f46004b && fa4.m11650l(this.f46005c, jq5Var.f46005c) && xj2.m24560b(this.f46006d, jq5Var.f46006d);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0125l(this.f46004b, this.f46005c, this.f46006d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f46006d) + ((this.f46005c.hashCode() + wq1.m24106b(this.f46004b, wq1.m24106b(1200, wq1.m24106b(0, Integer.hashCode(3) * 31, 31), 31), 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "basicMarquee";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(3, "iterations");
        z91Var.m25511b(new iq5(), "animationMode");
        z91Var.m25511b(1200, "delayMillis");
        z91Var.m25511b(Integer.valueOf(this.f46004b), "initialDelayMillis");
        z91Var.m25511b(this.f46005c, "spacing");
        z91Var.m25511b(new xj2(this.f46006d), "velocity");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0125l c0125l = (C0125l) d16Var;
        ((xc9) c0125l.f2416Q).setValue(this.f46005c);
        ((xc9) c0125l.f2417R).setValue(new iq5());
        int i = c0125l.f2409J;
        int i2 = this.f46004b;
        float f = this.f46006d;
        if (i == i2 && xj2.m24560b(c0125l.f2410K, f)) {
            return;
        }
        c0125l.f2409J = i2;
        c0125l.f2410K = f;
        c0125l.m966a1();
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=3, animationMode=Immediately, delayMillis=1200, initialDelayMillis=" + this.f46004b + ", spacing=" + this.f46005c + ", velocity=" + ((Object) xj2.m24561c(this.f46006d)) + ')';
    }
}
