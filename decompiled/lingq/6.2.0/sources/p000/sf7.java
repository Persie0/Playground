package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sf7 implements tf7 {

    /* JADX INFO: renamed from: a */
    public final List f60794a;

    /* JADX INFO: renamed from: b */
    public final boolean f60795b;

    /* JADX INFO: renamed from: c */
    public final nd7 f60796c;

    public sf7(List list, boolean z, nd7 nd7Var) {
        list.getClass();
        nd7Var.getClass();
        this.f60794a = list;
        this.f60795b = z;
        this.f60796c = nd7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf7)) {
            return false;
        }
        sf7 sf7Var = (sf7) obj;
        return fa4.m11650l(this.f60794a, sf7Var.f60794a) && this.f60795b == sf7Var.f60795b && fa4.m11650l(this.f60796c, sf7Var.f60796c);
    }

    public final int hashCode() {
        return this.f60796c.hashCode() + g9a.m12428e(this.f60794a.hashCode() * 31, 31, this.f60795b);
    }

    public final String toString() {
        return "Success(playlists=" + this.f60794a + ", canAccessPremium=" + this.f60795b + ", dialogState=" + this.f60796c + ")";
    }
}
