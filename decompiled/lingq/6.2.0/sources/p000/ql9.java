package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ql9 {

    /* JADX INFO: renamed from: a */
    public final List f57913a;

    /* JADX INFO: renamed from: b */
    public final List f57914b;

    /* JADX INFO: renamed from: c */
    public final float f57915c;

    /* JADX INFO: renamed from: d */
    public final float f57916d;

    public ql9(List list, List list2, float f, float f2) {
        this.f57913a = list;
        this.f57914b = list2;
        this.f57915c = f;
        this.f57916d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql9)) {
            return false;
        }
        ql9 ql9Var = (ql9) obj;
        return fa4.m11650l(this.f57913a, ql9Var.f57913a) && fa4.m11650l(this.f57914b, ql9Var.f57914b) && Float.compare(this.f57915c, ql9Var.f57915c) == 0 && Float.compare(this.f57916d, ql9Var.f57916d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57916d) + wq1.m24105a(ux5.m22979b(this.f57913a.hashCode() * 31, 31, this.f57914b), this.f57915c, 31);
    }

    public final String toString() {
        return "StudyTimeChartUiState(thisWeekData=" + this.f57913a + ", lastWeekData=" + this.f57914b + ", dailyAverage=" + this.f57915c + ", trendingPercent=" + this.f57916d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ql9() {
        EmptyList emptyList = EmptyList.f47638a;
        this(emptyList, emptyList, 0.0f, 0.0f);
    }
}
