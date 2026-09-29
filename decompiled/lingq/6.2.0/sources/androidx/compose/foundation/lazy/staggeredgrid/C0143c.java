package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.e71;
import p000.fs6;
import p000.nu4;
import p000.sc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0143c implements nu4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0144d f2596a;

    public C0143c(C0144d c0144d) {
        this.f2596a = c0144d;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: a */
    public final int mo987a() {
        C0144d c0144d = this.f2596a;
        return (int) (c0144d.m1023g().f36315u == Orientation.Vertical ? c0144d.m1023g().f36308n & 4294967295L : c0144d.m1023g().f36308n >> 32);
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: b */
    public final float mo988b() {
        C0144d c0144d = this.f2596a;
        return (((sc9) c0144d.f2600c.f71351d).m21222h() * 500) + ((sc9) c0144d.f2600c.f71353f).m21222h();
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: c */
    public final int mo989c() {
        C0144d c0144d = this.f2596a;
        return c0144d.m1023g().f36311q + c0144d.m1023g().f36312r;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: d */
    public final float mo990d() {
        C0144d c0144d = this.f2596a;
        int iM21222h = ((sc9) c0144d.f2600c.f71351d).m21222h();
        int iM21222h2 = ((sc9) c0144d.f2600c.f71353f).m21222h();
        return c0144d.mo975d() ? (iM21222h * 500) + iM21222h2 + 100.0f : (iM21222h * 500) + iM21222h2;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: e */
    public final Object mo991e(int i, Continuation continuation) throws Throwable {
        fs6 fs6Var = C0144d.f2597x;
        C0144d c0144d = this.f2596a;
        c0144d.getClass();
        Object objMo864c = c0144d.mo864c(MutatePriority.Default, new LazyStaggeredGridState$scrollToItem$2(c0144d, i, null), (ContinuationImpl) continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xfa xfaVar = xfa.f68157a;
        if (objMo864c != coroutineSingletons) {
            objMo864c = xfaVar;
        }
        return objMo864c == coroutineSingletons ? objMo864c : xfaVar;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: f */
    public final e71 mo992f() {
        return new e71(-1, -1);
    }
}
