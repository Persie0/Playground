package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class x17 implements t17 {

    /* JADX INFO: renamed from: a */
    public final float f67635a;

    /* JADX INFO: renamed from: b */
    public final float f67636b;

    /* JADX INFO: renamed from: c */
    public final float f67637c;

    /* JADX INFO: renamed from: d */
    public final float f67638d;

    public x17(float f, float f2, float f3, float f4) {
        this.f67635a = f;
        this.f67636b = f2;
        this.f67637c = f3;
        this.f67638d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            g54.m12362a("Padding must be non-negative");
        }
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: a */
    public final float mo14018a() {
        return this.f67638d;
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: b */
    public final float mo14019b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f67635a : this.f67637c;
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: c */
    public final float mo14020c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f67637c : this.f67635a;
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: d */
    public final float mo14021d() {
        return this.f67636b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x17)) {
            return false;
        }
        x17 x17Var = (x17) obj;
        return xj2.m24560b(this.f67635a, x17Var.f67635a) && xj2.m24560b(this.f67636b, x17Var.f67636b) && xj2.m24560b(this.f67637c, x17Var.f67637c) && xj2.m24560b(this.f67638d, x17Var.f67638d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f67638d) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f67635a) * 31, this.f67636b, 31), this.f67637c, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) xj2.m24561c(this.f67635a)) + ", top=" + ((Object) xj2.m24561c(this.f67636b)) + ", end=" + ((Object) xj2.m24561c(this.f67637c)) + ", bottom=" + ((Object) xj2.m24561c(this.f67638d)) + ')';
    }
}
