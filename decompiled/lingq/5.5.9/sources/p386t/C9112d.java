package p386t;

import dm.C5207g;
import p387t0.AbstractC9161o;
import p387t0.C9156l0;
import p470x1.C10017e;

/* JADX INFO: renamed from: t.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9112d {

    /* JADX INFO: renamed from: a */
    public final float f47608a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9161o f47609b;

    public C9112d(float f3, C9156l0 c9156l0) {
        this.f47608a = f3;
        this.f47609b = c9156l0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9112d)) {
            return false;
        }
        C9112d c9112d = (C9112d) obj;
        if (C10017e.m18618a(this.f47608a, c9112d.f47608a) && C5207g.m11106a(this.f47609b, c9112d.f47609b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47609b.hashCode() + (Float.hashCode(this.f47608a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) C10017e.m18619f(this.f47608a)) + ", brush=" + this.f47609b + ')';
    }
}
