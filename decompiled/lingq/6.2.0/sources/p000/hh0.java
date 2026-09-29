package p000;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class hh0 {

    /* JADX INFO: renamed from: a */
    public final int f42343a;

    /* JADX INFO: renamed from: b */
    public final int f42344b;

    /* JADX INFO: renamed from: c */
    public final int f42345c;

    /* JADX INFO: renamed from: d */
    public final int f42346d;

    static {
        new hh0(0, 0, 0, 0);
    }

    public hh0(int i, int i2, int i3, int i4) {
        this.f42343a = i;
        this.f42344b = i2;
        this.f42345c = i3;
        this.f42346d = i4;
        if (i > i3) {
            C3386nv.m17624j(wq1.m24115k("Left must be less than or equal to right, left: ", i, i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C3386nv.m17624j(wq1.m24115k("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m13237a() {
        return this.f42346d - this.f42344b;
    }

    /* JADX INFO: renamed from: b */
    public final int m13238b() {
        return this.f42345c - this.f42343a;
    }

    /* JADX INFO: renamed from: c */
    public final Rect m13239c() {
        return new Rect(this.f42343a, this.f42344b, this.f42345c, this.f42346d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hh0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        hh0 hh0Var = (hh0) obj;
        return this.f42343a == hh0Var.f42343a && this.f42344b == hh0Var.f42344b && this.f42345c == hh0Var.f42345c && this.f42346d == hh0Var.f42346d;
    }

    public final int hashCode() {
        return (((((this.f42343a * 31) + this.f42344b) * 31) + this.f42345c) * 31) + this.f42346d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hh0.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f42343a);
        sb.append(',');
        sb.append(this.f42344b);
        sb.append(',');
        sb.append(this.f42345c);
        sb.append(',');
        return wq1.m24123s(sb, this.f42346d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hh0(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
