package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class sh2 {

    /* JADX INFO: renamed from: a */
    public final String f60859a;

    /* JADX INFO: renamed from: b */
    public final int f60860b;

    /* JADX INFO: renamed from: c */
    public final int f60861c;

    public sh2(String str, int i, int i2) {
        this.f60859a = str;
        this.f60860b = i;
        this.f60861c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh2)) {
            return false;
        }
        sh2 sh2Var = (sh2) obj;
        return this.f60859a.equals(sh2Var.f60859a) && this.f60860b == sh2Var.f60860b && this.f60861c == sh2Var.f60861c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f60860b);
        Integer numValueOf2 = Integer.valueOf(this.f60861c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f60859a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f60859a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.f60860b);
        sb.append(" displayHeight=");
        return wq1.m24123s(sb, this.f60861c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
