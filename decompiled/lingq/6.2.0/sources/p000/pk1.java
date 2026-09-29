package p000;

import androidx.glance.appwidget.LayoutType;

/* JADX INFO: loaded from: classes2.dex */
public final class pk1 {

    /* JADX INFO: renamed from: a */
    public final LayoutType f56330a;

    /* JADX INFO: renamed from: b */
    public final int f56331b;

    /* JADX INFO: renamed from: c */
    public final C3406oe f56332c;

    /* JADX INFO: renamed from: d */
    public final C3494qe f56333d;

    public /* synthetic */ pk1(LayoutType layoutType, int i, C3406oe c3406oe, C3494qe c3494qe, int i2) {
        this(layoutType, i, (i2 & 4) != 0 ? null : c3406oe, (i2 & 8) != 0 ? null : c3494qe);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1)) {
            return false;
        }
        pk1 pk1Var = (pk1) obj;
        return this.f56330a == pk1Var.f56330a && this.f56331b == pk1Var.f56331b && fa4.m11650l(this.f56332c, pk1Var.f56332c) && fa4.m11650l(this.f56333d, pk1Var.f56333d);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f56331b, this.f56330a.hashCode() * 31, 31);
        C3406oe c3406oe = this.f56332c;
        int iHashCode = (iM24106b + (c3406oe == null ? 0 : Integer.hashCode(c3406oe.f54237a))) * 31;
        C3494qe c3494qe = this.f56333d;
        return iHashCode + (c3494qe != null ? Integer.hashCode(c3494qe.f57630a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f56330a + ", numChildren=" + this.f56331b + ", horizontalAlignment=" + this.f56332c + ", verticalAlignment=" + this.f56333d + ')';
    }

    public pk1(LayoutType layoutType, int i, C3406oe c3406oe, C3494qe c3494qe) {
        this.f56330a = layoutType;
        this.f56331b = i;
        this.f56332c = c3406oe;
        this.f56333d = c3494qe;
    }
}
