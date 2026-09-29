package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3392o0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m17717a(Unsafe unsafe, AbstractC1112b abstractC1112b, long j, C3594t0 c3594t0, C3594t0 c3594t1) {
        while (!unsafe.compareAndSwapObject(abstractC1112b, j, c3594t0, c3594t1)) {
            if (unsafe.getObject(abstractC1112b, j) != c3594t0) {
                return false;
            }
        }
        return true;
    }
}
