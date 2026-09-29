package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3443p0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m18850a(Unsafe unsafe, AbstractC1112b abstractC1112b, long j, C3095i0 c3095i0, C3095i0 c3095i1) {
        while (!unsafe.compareAndSwapObject(abstractC1112b, j, c3095i0, c3095i1)) {
            if (unsafe.getObject(abstractC1112b, j) != c3095i0) {
                return false;
            }
        }
        return true;
    }
}
