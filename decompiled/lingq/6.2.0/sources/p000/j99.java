package p000;

import androidx.glance.appwidget.LayoutSize;

/* JADX INFO: loaded from: classes2.dex */
public final class j99 {

    /* JADX INFO: renamed from: a */
    public final LayoutSize f45240a;

    /* JADX INFO: renamed from: b */
    public final LayoutSize f45241b;

    public j99(LayoutSize layoutSize, LayoutSize layoutSize2) {
        this.f45240a = layoutSize;
        this.f45241b = layoutSize2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j99)) {
            return false;
        }
        j99 j99Var = (j99) obj;
        return this.f45240a == j99Var.f45240a && this.f45241b == j99Var.f45241b;
    }

    public final int hashCode() {
        return this.f45241b.hashCode() + (this.f45240a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.f45240a + ", height=" + this.f45241b + ')';
    }
}
