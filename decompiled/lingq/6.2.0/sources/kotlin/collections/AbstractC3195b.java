package kotlin.collections;

import java.util.Iterator;
import p000.C3386nv;
import p000.omd;
import p000.or2;
import p000.ux5;

/* JADX INFO: renamed from: kotlin.collections.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3195b {
    /* JADX INFO: renamed from: a */
    public static final void m15373a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C3386nv.m17624j(i != i2 ? ux5.m22987j(i, i2, "Both size ", " and step ", " must be greater than zero.") : ux5.m22989l("size ", i, " must be greater than zero."));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Iterator m15374b(Iterator it, int i, int i2) {
        it.getClass();
        return !it.hasNext() ? or2.f54781a : omd.m18129S(new SlidingWindowKt$windowedIterator$1(i, i2, it, null));
    }
}
