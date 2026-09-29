package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class y66 {
    /* JADX INFO: renamed from: a */
    public static final void m24953a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m24955c(i, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24954b(int i, int i2, List list) {
        if (i > i2) {
            m24958f(i, i2);
        }
        if (i < 0) {
            m24956d(i);
        }
        if (i2 > list.size()) {
            m24957e(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m24955c(int i, int i2) {
        throw new IndexOutOfBoundsException(ux5.m22987j(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    /* JADX INFO: renamed from: d */
    private static final void m24956d(int i) {
        throw new IndexOutOfBoundsException(ux5.m22989l("fromIndex (", i, ") is less than 0."));
    }

    /* JADX INFO: renamed from: e */
    private static final void m24957e(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    /* JADX INFO: renamed from: f */
    private static final void m24958f(int i, int i2) {
        throw new IllegalArgumentException(ux5.m22987j(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
