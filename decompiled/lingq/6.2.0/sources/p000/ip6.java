package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ip6 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f44399a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final h66 f44400b = new h66(0);

    /* JADX INFO: renamed from: a */
    public static final void m14064a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            v63.m23143u(ux5.m22987j(i, size, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14065b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            C3386nv.m17626m(ux5.m22987j(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
            return;
        }
        if (i < 0) {
            v63.m23143u(ux5.m22989l("fromIndex (", i, ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
