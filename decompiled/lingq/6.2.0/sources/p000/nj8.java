package p000;

import androidx.glance.appwidget.LayoutType;

/* JADX INFO: loaded from: classes2.dex */
public final class nj8 {

    /* JADX INFO: renamed from: a */
    public final LayoutType f52846a;

    /* JADX INFO: renamed from: b */
    public final boolean f52847b;

    /* JADX INFO: renamed from: c */
    public final boolean f52848c;

    public nj8(LayoutType layoutType, boolean z, boolean z2) {
        this.f52846a = layoutType;
        this.f52847b = z;
        this.f52848c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj8)) {
            return false;
        }
        nj8 nj8Var = (nj8) obj;
        return this.f52846a == nj8Var.f52846a && this.f52847b == nj8Var.f52847b && this.f52848c == nj8Var.f52848c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52848c) + g9a.m12428e(this.f52846a.hashCode() * 31, 31, this.f52847b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.f52846a);
        sb.append(", expandWidth=");
        sb.append(this.f52847b);
        sb.append(", expandHeight=");
        return ux5.m22993p(sb, this.f52848c, ')');
    }
}
