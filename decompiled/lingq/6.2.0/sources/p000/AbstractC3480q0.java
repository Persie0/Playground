package p000;

import com.google.common.util.concurrent.AbstractC1112b;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3480q0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m19581a(Unsafe unsafe, AbstractC1112b abstractC1112b, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1112b, j, obj, obj2)) {
            if (unsafe.getObject(abstractC1112b, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
