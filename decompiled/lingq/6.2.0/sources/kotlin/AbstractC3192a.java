package kotlin;

import p000.cs4;
import p000.gm5;
import p000.gr7;
import p000.gt4;
import p000.ui3;

/* JADX INFO: renamed from: kotlin.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3192a {
    /* JADX INFO: renamed from: a */
    public static cs4 m15356a(ui3 ui3Var) {
        ui3Var.getClass();
        return new SynchronizedLazyImpl(ui3Var);
    }

    /* JADX INFO: renamed from: b */
    public static cs4 m15357b(LazyThreadSafetyMode lazyThreadSafetyMode, ui3 ui3Var) {
        gr7 gr7Var = gr7.f41241f;
        lazyThreadSafetyMode.getClass();
        ui3Var.getClass();
        int i = gt4.f41297a[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(ui3Var);
        }
        if (i == 2) {
            SafePublicationLazyImpl safePublicationLazyImpl = new SafePublicationLazyImpl();
            safePublicationLazyImpl.f47628a = ui3Var;
            safePublicationLazyImpl.f47629b = gr7Var;
            return safePublicationLazyImpl;
        }
        if (i != 3) {
            gm5.m12750e();
            return null;
        }
        UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl();
        unsafeLazyImpl.f47636a = ui3Var;
        unsafeLazyImpl.f47637b = gr7Var;
        return unsafeLazyImpl;
    }
}
