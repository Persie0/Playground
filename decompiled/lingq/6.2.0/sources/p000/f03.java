package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f03 {

    /* JADX INFO: renamed from: a */
    public final List f38134a;

    /* JADX INFO: renamed from: b */
    public final t17 f38135b;

    public f03(List list, t17 t17Var) {
        list.getClass();
        t17Var.getClass();
        this.f38134a = list;
        this.f38135b = t17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f03)) {
            return false;
        }
        f03 f03Var = (f03) obj;
        return fa4.m11650l(this.f38134a, f03Var.f38134a) && fa4.m11650l(this.f38135b, f03Var.f38135b);
    }

    public final int hashCode() {
        return this.f38135b.hashCode() + (this.f38134a.hashCode() * 31);
    }

    public final String toString() {
        return "FastSearchItemsListState(items=" + this.f38134a + ", contentPadding=" + this.f38135b + ")";
    }
}
