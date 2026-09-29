package p000;

import com.lingq.core.domain.model.onboarding.HighlightType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p6a {

    /* JADX INFO: renamed from: a */
    public final String f55663a;

    /* JADX INFO: renamed from: b */
    public final List f55664b;

    /* JADX INFO: renamed from: c */
    public final boolean f55665c;

    /* JADX INFO: renamed from: d */
    public final HighlightType f55666d;

    public p6a(String str, ArrayList arrayList, HighlightType highlightType, int i) {
        str = (i & 1) != 0 ? "" : str;
        arrayList = (i & 2) != 0 ? new ArrayList() : arrayList;
        boolean z = (i & 4) == 0;
        highlightType = (i & 8) != 0 ? HighlightType.Nothing : highlightType;
        highlightType.getClass();
        this.f55663a = str;
        this.f55664b = arrayList;
        this.f55665c = z;
        this.f55666d = highlightType;
    }

    /* JADX INFO: renamed from: a */
    public final List m18927a() {
        return this.f55664b;
    }

    /* JADX INFO: renamed from: b */
    public final HighlightType m18928b() {
        return this.f55666d;
    }

    /* JADX INFO: renamed from: c */
    public final String m18929c() {
        return this.f55663a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18930d() {
        return this.f55665c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6a)) {
            return false;
        }
        p6a p6aVar = (p6a) obj;
        return fa4.m11650l(this.f55663a, p6aVar.f55663a) && fa4.m11650l(this.f55664b, p6aVar.f55664b) && this.f55665c == p6aVar.f55665c && this.f55666d == p6aVar.f55666d;
    }

    public final int hashCode() {
        return this.f55666d.hashCode() + g9a.m12428e(ux5.m22979b(this.f55663a.hashCode() * 31, 31, this.f55664b), 31, this.f55665c);
    }

    public final String toString() {
        return "TooltipInfo(text=" + this.f55663a + ", bold=" + this.f55664b + ", isHighlightOnly=" + this.f55665c + ", highlightType=" + this.f55666d + ")";
    }
}
