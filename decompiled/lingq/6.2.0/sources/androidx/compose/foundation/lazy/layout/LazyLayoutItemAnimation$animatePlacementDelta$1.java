package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.lazy.layout.C0134c;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bg9;
import p000.c32;
import p000.f84;
import p000.l43;
import p000.tt4;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", m4291f = "LazyLayoutItemAnimation.kt", m4292l = {140, 147}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public l43 f2505a;

    /* JADX INFO: renamed from: b */
    public int f2506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0134c f2507c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l43 f2508d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f2509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(C0134c c0134c, l43 l43Var, long j, Continuation continuation) {
        super(2, continuation);
        this.f2507c = c0134c;
        this.f2508d = l43Var;
        this.f2509e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.f2507c, this.f2508d, this.f2509e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r8, r9, r3, r11, r14, 4) == r2) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        l43 l43Var;
        final C0134c c0134c = this.f2507c;
        C0059a c0059a = c0134c.f2551p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2506b;
        long j = this.f2509e;
        try {
            if (i != 0) {
                if (i == 1) {
                    l43Var = this.f2505a;
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                c0134c.m1005g(false);
                c0134c.f2542g = false;
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            boolean zM746e = c0059a.m746e();
            l43Var = this.f2508d;
            if (zM746e) {
                l43Var = l43Var instanceof bg9 ? (bg9) l43Var : tt4.f62844a;
            }
            if (c0059a.m746e()) {
                final long jM11594c = f84.m11594c(((f84) c0059a.m745d()).f38612a, j);
                C0059a c0059a2 = c0134c.f2551p;
                f84 f84Var = new f84(jM11594c);
                vi3 vi3Var = new vi3() { // from class: st4
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) throws Exception {
                        long jM11594c2 = f84.m11594c(((f84) ((C0059a) obj2).m745d()).f38612a, jM11594c);
                        C0134c c0134c2 = c0134c;
                        c0134c2.m1006h(jM11594c2);
                        c0134c2.f2538c.mo0a();
                        return xfa.f68157a;
                    }
                };
                this.f2505a = null;
                this.f2506b = 2;
            } else {
                f84 f84Var2 = new f84(j);
                this.f2505a = l43Var;
                this.f2506b = 1;
                if (c0059a.m747f(f84Var2, this) == coroutineSingletons) {
                }
            }
            return coroutineSingletons;
            c0134c.f2538c.mo0a();
            final long jM11594c2 = f84.m11594c(((f84) c0059a.m745d()).f38612a, j);
            C0059a c0059a3 = c0134c.f2551p;
            f84 f84Var3 = new f84(jM11594c2);
            vi3 vi3Var2 = new vi3() { // from class: st4
                @Override // p000.vi3
                public final Object invoke(Object obj2) throws Exception {
                    long jM11594c3 = f84.m11594c(((f84) ((C0059a) obj2).m745d()).f38612a, jM11594c2);
                    C0134c c0134c2 = c0134c;
                    c0134c2.m1006h(jM11594c3);
                    c0134c2.f2538c.mo0a();
                    return xfa.f68157a;
                }
            };
            this.f2505a = null;
            this.f2506b = 2;
        } catch (CancellationException unused) {
        }
    }
}
