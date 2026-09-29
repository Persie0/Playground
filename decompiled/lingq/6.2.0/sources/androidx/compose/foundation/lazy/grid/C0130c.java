package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.e71;
import p000.fs6;
import p000.nu4;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0130c implements nu4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0129b f2490a;

    public C0130c(C0129b c0129b) {
        this.f2490a = c0129b;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: a */
    public final int mo987a() {
        C0129b c0129b = this.f2490a;
        return (int) (c0129b.m985g().f61350q == Orientation.Vertical ? c0129b.m985g().m21675g() & 4294967295L : c0129b.m985g().m21675g() >> 32);
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: b */
    public final float mo988b() {
        C0129b c0129b = this.f2490a;
        return (c0129b.f2471d.f67245b.m21222h() * 500) + c0129b.f2471d.f67246c.m21222h();
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: c */
    public final int mo989c() {
        C0129b c0129b = this.f2490a;
        return (-c0129b.m985g().f61347n) + c0129b.m985g().f61351r;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: d */
    public final float mo990d() {
        C0129b c0129b = this.f2490a;
        int iM21222h = c0129b.f2471d.f67245b.m21222h();
        int iM21222h2 = c0129b.f2471d.f67246c.m21222h();
        return c0129b.mo975d() ? (iM21222h * 500) + iM21222h2 + 100.0f : (iM21222h * 500) + iM21222h2;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: e */
    public final Object mo991e(int i, Continuation continuation) throws Throwable {
        fs6 fs6Var = C0129b.f2467w;
        C0129b c0129b = this.f2490a;
        c0129b.getClass();
        Object objMo864c = c0129b.mo864c(MutatePriority.Default, new LazyGridState$scrollToItem$2(c0129b, i, null), (ContinuationImpl) continuation);
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
