package p000;

import androidx.glance.appwidget.LayoutType;

/* JADX INFO: loaded from: classes2.dex */
public final class nh0 {

    /* JADX INFO: renamed from: a */
    public final LayoutType f52723a;

    /* JADX INFO: renamed from: b */
    public final int f52724b;

    /* JADX INFO: renamed from: c */
    public final int f52725c;

    public nh0(LayoutType layoutType, int i, int i2) {
        this.f52723a = layoutType;
        this.f52724b = i;
        this.f52725c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh0)) {
            return false;
        }
        nh0 nh0Var = (nh0) obj;
        return this.f52723a == nh0Var.f52723a && this.f52724b == nh0Var.f52724b && this.f52725c == nh0Var.f52725c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52725c) + wq1.m24106b(this.f52724b, this.f52723a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f52723a + ", horizontalAlignment=" + ((Object) C3406oe.m17945b(this.f52724b)) + ", verticalAlignment=" + ((Object) C3494qe.m19887b(this.f52725c)) + ')';
    }
}
