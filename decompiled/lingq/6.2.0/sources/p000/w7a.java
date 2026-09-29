package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w7a {

    /* JADX INFO: renamed from: a */
    public final List f66492a;

    /* JADX INFO: renamed from: b */
    public final boolean f66493b;

    /* JADX INFO: renamed from: c */
    public final vg6 f66494c;

    public w7a(List list, boolean z, vg6 vg6Var) {
        list.getClass();
        this.f66492a = list;
        this.f66493b = z;
        this.f66494c = vg6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7a)) {
            return false;
        }
        w7a w7aVar = (w7a) obj;
        return fa4.m11650l(this.f66492a, w7aVar.f66492a) && this.f66493b == w7aVar.f66493b && fa4.m11650l(this.f66494c, w7aVar.f66494c);
    }

    public final int hashCode() {
        return this.f66494c.hashCode() + g9a.m12428e(this.f66492a.hashCode() * 31, 31, this.f66493b);
    }

    public final String toString() {
        return "TopicsUiState(items=" + this.f66492a + ", canContinue=" + this.f66493b + ", nextNavigation=" + this.f66494c + ")";
    }
}
