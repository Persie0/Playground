package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vh7 {

    /* JADX INFO: renamed from: a */
    public final boolean f65396a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f65397b;

    public vh7(ArrayList arrayList, boolean z) {
        this.f65396a = z;
        this.f65397b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh7)) {
            return false;
        }
        vh7 vh7Var = (vh7) obj;
        return this.f65396a == vh7Var.f65396a && this.f65397b.equals(vh7Var.f65397b);
    }

    public final int hashCode() {
        return this.f65397b.hashCode() + (Boolean.hashCode(this.f65396a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Posture(isTabletop=");
        sb.append(this.f65396a);
        sb.append(", hinges=[");
        return AbstractC3393o1.m17738m(sb, u91.m22596N0(this.f65397b, ", ", null, null, null, 62), "])");
    }
}
