package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q16 {

    /* JADX INFO: renamed from: a */
    public final o16 f57127a;

    /* JADX INFO: renamed from: b */
    public final List f57128b;

    /* JADX INFO: renamed from: c */
    public final Integer f57129c;

    public q16(o16 o16Var, List list, Integer num) {
        this.f57127a = o16Var;
        this.f57128b = list;
        this.f57129c = num;
    }

    /* JADX INFO: renamed from: a */
    public static gv5 m19598a() {
        gv5 gv5Var = new gv5(24, (byte) 0);
        gv5Var.f41394d = new ArrayList();
        gv5Var.f41392b = o16.f53589b;
        gv5Var.f41393c = null;
        return gv5Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q16)) {
            return false;
        }
        q16 q16Var = (q16) obj;
        return this.f57127a.equals(q16Var.f57127a) && this.f57128b.equals(q16Var.f57128b) && Objects.equals(this.f57129c, q16Var.f57129c);
    }

    public final int hashCode() {
        return Objects.hash(this.f57127a, this.f57128b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f57127a, this.f57128b, this.f57129c);
    }
}
