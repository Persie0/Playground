package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class x08 {

    /* JADX INFO: renamed from: a */
    public final int f67593a;

    /* JADX INFO: renamed from: b */
    public final List f67594b;

    /* JADX INFO: renamed from: c */
    public final float f67595c;

    public x08(float f, int i, List list) {
        this.f67593a = i;
        this.f67594b = list;
        this.f67595c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x08)) {
            return false;
        }
        x08 x08Var = (x08) obj;
        return this.f67593a == x08Var.f67593a && fa4.m11650l(this.f67594b, x08Var.f67594b) && Float.compare(this.f67595c, x08Var.f67595c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f67595c) + ux5.m22979b(Integer.hashCode(this.f67593a) * 31, 31, this.f67594b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadingSpeedChartUiState(todaySpeed=");
        sb.append(this.f67593a);
        sb.append(", monthlyData=");
        sb.append(this.f67594b);
        sb.append(", trendingPercent=");
        return wq1.m24121q(sb, this.f67595c, ")");
    }

    public /* synthetic */ x08() {
        this(0.0f, 0, EmptyList.f47638a);
    }
}
