package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class n17 {

    /* JADX INFO: renamed from: a */
    public final float f52182a;

    /* JADX INFO: renamed from: b */
    public final List f52183b;

    public n17(int i, float f) {
        this((i & 1) != 0 ? 0.0f : f, EmptyList.f47638a);
    }

    /* JADX INFO: renamed from: a */
    public final n17 m17170a(n17 n17Var) {
        return new n17(this.f52182a + n17Var.f52182a, u91.m22603U0(n17Var.f52183b, this.f52183b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n17)) {
            return false;
        }
        n17 n17Var = (n17) obj;
        return xj2.m24560b(this.f52182a, n17Var.f52182a) && fa4.m11650l(this.f52183b, n17Var.f52183b);
    }

    public final int hashCode() {
        return this.f52183b.hashCode() + (Float.hashCode(this.f52182a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) xj2.m24561c(this.f52182a)) + ", resourceIds=" + this.f52183b + ')';
    }

    public n17(float f, List list) {
        this.f52182a = f;
        this.f52183b = list;
    }
}
