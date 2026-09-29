package p000;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public final class yd0 {

    /* JADX INFO: renamed from: a */
    public RenderEffect f69672a;

    /* JADX INFO: renamed from: b */
    public final float f69673b;

    /* JADX INFO: renamed from: c */
    public final float f69674c;

    /* JADX INFO: renamed from: d */
    public final int f69675d;

    public yd0(float f, float f2, int i) {
        this.f69673b = f;
        this.f69674c = f2;
        this.f69675d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd0)) {
            return false;
        }
        yd0 yd0Var = (yd0) obj;
        return this.f69673b == yd0Var.f69673b && this.f69674c == yd0Var.f69674c && this.f69675d == yd0Var.f69675d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69675d) + wq1.m24105a(Float.hashCode(this.f69673b) * 31, this.f69674c, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f69673b + ", radiusY=" + this.f69674c + ", edgeTreatment=" + ((Object) do7.m10520G(this.f69675d)) + ')';
    }
}
