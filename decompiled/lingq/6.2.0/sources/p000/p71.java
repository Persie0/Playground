package p000;

import androidx.compose.foundation.lazy.C0127b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p71 {

    /* JADX INFO: renamed from: a */
    public final List f55685a;

    /* JADX INFO: renamed from: b */
    public final C0127b f55686b;

    /* JADX INFO: renamed from: c */
    public final t17 f55687c;

    public p71(List list, C0127b c0127b, t17 t17Var) {
        list.getClass();
        c0127b.getClass();
        t17Var.getClass();
        this.f55685a = list;
        this.f55686b = c0127b;
        this.f55687c = t17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p71)) {
            return false;
        }
        p71 p71Var = (p71) obj;
        return fa4.m11650l(this.f55685a, p71Var.f55685a) && fa4.m11650l(this.f55686b, p71Var.f55686b) && fa4.m11650l(this.f55687c, p71Var.f55687c);
    }

    public final int hashCode() {
        return this.f55687c.hashCode() + ((this.f55686b.hashCode() + (this.f55685a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CollectionItemsListState(items=" + this.f55685a + ", listState=" + this.f55686b + ", contentPadding=" + this.f55687c + ")";
    }
}
