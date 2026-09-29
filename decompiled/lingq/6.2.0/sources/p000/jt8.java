package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jt8 {

    /* JADX INFO: renamed from: a */
    public final List f46130a;

    /* JADX INFO: renamed from: b */
    public final boolean f46131b;

    /* JADX INFO: renamed from: c */
    public final boolean f46132c;

    public jt8(List list, boolean z, boolean z2) {
        this.f46130a = list;
        this.f46131b = z;
        this.f46132c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt8)) {
            return false;
        }
        jt8 jt8Var = (jt8) obj;
        return this.f46130a.equals(jt8Var.f46130a) && this.f46131b == jt8Var.f46131b && this.f46132c == jt8Var.f46132c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46132c) + g9a.m12428e(this.f46130a.hashCode() * 31, 31, this.f46131b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListScreenData(items=");
        sb.append(this.f46130a);
        sb.append(", isRefreshing=");
        sb.append(this.f46131b);
        sb.append(", showRemoveLessonWarning=");
        return AbstractC3393o1.m17740o(sb, this.f46132c, ")");
    }
}
