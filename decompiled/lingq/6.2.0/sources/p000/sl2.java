package p000;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class sl2 extends q23 {

    /* JADX INFO: renamed from: a */
    public final Drawable f60972a;

    /* JADX INFO: renamed from: b */
    public final boolean f60973b;

    /* JADX INFO: renamed from: c */
    public final DataSource f60974c;

    public sl2(Drawable drawable, boolean z, DataSource dataSource) {
        this.f60972a = drawable;
        this.f60973b = z;
        this.f60974c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return fa4.m11650l(this.f60972a, sl2Var.f60972a) && this.f60973b == sl2Var.f60973b && this.f60974c == sl2Var.f60974c;
    }

    public final int hashCode() {
        return this.f60974c.hashCode() + g9a.m12428e(this.f60972a.hashCode() * 31, 31, this.f60973b);
    }
}
