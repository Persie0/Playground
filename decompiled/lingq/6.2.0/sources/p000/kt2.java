package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class kt2 extends f04 {

    /* JADX INFO: renamed from: a */
    public final Drawable f48405a;

    /* JADX INFO: renamed from: b */
    public final e04 f48406b;

    /* JADX INFO: renamed from: c */
    public final Throwable f48407c;

    public kt2(Drawable drawable, e04 e04Var, Throwable th) {
        this.f48405a = drawable;
        this.f48406b = e04Var;
        this.f48407c = th;
    }

    @Override // p000.f04
    /* JADX INFO: renamed from: a */
    public final Drawable mo11418a() {
        return this.f48405a;
    }

    @Override // p000.f04
    /* JADX INFO: renamed from: b */
    public final e04 mo11419b() {
        return this.f48406b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt2)) {
            return false;
        }
        kt2 kt2Var = (kt2) obj;
        return fa4.m11650l(this.f48405a, kt2Var.f48405a) && fa4.m11650l(this.f48406b, kt2Var.f48406b) && this.f48407c.equals(kt2Var.f48407c);
    }

    public final int hashCode() {
        Drawable drawable = this.f48405a;
        int iHashCode = drawable != null ? drawable.hashCode() : 0;
        return this.f48407c.hashCode() + ((this.f48406b.hashCode() + (iHashCode * 31)) * 31);
    }
}
