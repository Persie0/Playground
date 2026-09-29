package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xf7 implements yf7 {

    /* JADX INFO: renamed from: a */
    public final List f68152a;

    /* JADX INFO: renamed from: b */
    public final boolean f68153b;

    /* JADX INFO: renamed from: c */
    public final nd7 f68154c;

    public xf7(List list, boolean z, nd7 nd7Var) {
        list.getClass();
        nd7Var.getClass();
        this.f68152a = list;
        this.f68153b = z;
        this.f68154c = nd7Var;
    }

    /* JADX INFO: renamed from: a */
    public final nd7 m24485a() {
        return this.f68154c;
    }

    /* JADX INFO: renamed from: b */
    public final List m24486b() {
        return this.f68152a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf7)) {
            return false;
        }
        xf7 xf7Var = (xf7) obj;
        return fa4.m11650l(this.f68152a, xf7Var.f68152a) && this.f68153b == xf7Var.f68153b && fa4.m11650l(this.f68154c, xf7Var.f68154c);
    }

    public final int hashCode() {
        return this.f68154c.hashCode() + g9a.m12428e(this.f68152a.hashCode() * 31, 31, this.f68153b);
    }

    public final String toString() {
        return "Success(playlists=" + this.f68152a + ", canAccessPremium=" + this.f68153b + ", dialogState=" + this.f68154c + ")";
    }
}
