package p000;

import androidx.compose.foundation.lazy.C0127b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zq8 {

    /* JADX INFO: renamed from: a */
    public final List f71985a;

    /* JADX INFO: renamed from: b */
    public final C0127b f71986b;

    /* JADX INFO: renamed from: c */
    public final t17 f71987c;

    public zq8(List list, C0127b c0127b, t17 t17Var) {
        list.getClass();
        c0127b.getClass();
        t17Var.getClass();
        this.f71985a = list;
        this.f71986b = c0127b;
        this.f71987c = t17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq8)) {
            return false;
        }
        zq8 zq8Var = (zq8) obj;
        return fa4.m11650l(this.f71985a, zq8Var.f71985a) && fa4.m11650l(this.f71986b, zq8Var.f71986b) && fa4.m11650l(this.f71987c, zq8Var.f71987c);
    }

    public final int hashCode() {
        return this.f71987c.hashCode() + ((this.f71986b.hashCode() + (this.f71985a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SearchItemsListState(items=" + this.f71985a + ", listState=" + this.f71986b + ", contentPadding=" + this.f71987c + ")";
    }
}
