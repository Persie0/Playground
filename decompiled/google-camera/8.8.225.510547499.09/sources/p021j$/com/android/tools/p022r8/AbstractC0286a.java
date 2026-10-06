package p021j$.com.android.tools.p022r8;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.com.android.tools.r8.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0286a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11969a(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }
}
