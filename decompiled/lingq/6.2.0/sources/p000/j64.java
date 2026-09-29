package p000;

import java.util.Map;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final class j64 {

    /* JADX INFO: renamed from: a */
    public final int f45111a;

    /* JADX INFO: renamed from: b */
    public final int f45112b;

    /* JADX INFO: renamed from: c */
    public final Map f45113c;

    public /* synthetic */ j64(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? AbstractC3194a.m15360M() : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j64)) {
            return false;
        }
        j64 j64Var = (j64) obj;
        return this.f45111a == j64Var.f45111a && this.f45112b == j64Var.f45112b && fa4.m11650l(this.f45113c, j64Var.f45113c);
    }

    public final int hashCode() {
        return this.f45113c.hashCode() + wq1.m24106b(this.f45112b, Integer.hashCode(this.f45111a) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.f45111a + ", complexViewId=" + this.f45112b + ", children=" + this.f45113c + ')';
    }

    public j64(int i, int i2, Map map) {
        this.f45111a = i;
        this.f45112b = i2;
        this.f45113c = map;
    }
}
