package kotlin;

import cm.InterfaceC2041a;
import dm.C5207g;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: kotlin.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6740a {

    /* JADX INFO: renamed from: kotlin.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38026a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38026a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC9070c<T> m13372a(InterfaceC2041a<? extends T> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "initializer");
        return new SynchronizedLazyImpl(interfaceC2041a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC9070c<T> m13373b(LazyThreadSafetyMode lazyThreadSafetyMode, InterfaceC2041a<? extends T> interfaceC2041a) {
        C5207g.m11111f(lazyThreadSafetyMode, "mode");
        C5207g.m11111f(interfaceC2041a, "initializer");
        int i10 = a.f38026a[lazyThreadSafetyMode.ordinal()];
        if (i10 == 1) {
            return new SynchronizedLazyImpl(interfaceC2041a);
        }
        if (i10 == 2) {
            return new SafePublicationLazyImpl(interfaceC2041a);
        }
        if (i10 == 3) {
            return new UnsafeLazyImpl(interfaceC2041a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
