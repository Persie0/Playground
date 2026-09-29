package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.wn8;
import p000.xc9;
import p000.xfa;
import p000.y72;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m4291f = "ScrollableState.kt", m4292l = {208}, m4293m = "invokeSuspend", m4294v = 1)
final class DefaultScrollableState$scroll$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0101i f1865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutatePriority f1866c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f1867d;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1 */
    @c32(m4290c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m4291f = "ScrollableState.kt", m4292l = {211}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00851 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f1868a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f1869b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0101i f1870c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zi3 f1871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00851(C0101i c0101i, zi3 zi3Var, Continuation continuation) {
            super(2, continuation);
            this.f1870c = c0101i;
            this.f1871d = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00851 c00851 = new C00851(this.f1870c, this.f1871d, continuation);
            c00851.f1869b = obj;
            return c00851;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00851) create((wn8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            t66 t66Var = this.f1870c.f2263d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f1868a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    wn8 wn8Var = (wn8) this.f1869b;
                    ((xc9) t66Var).setValue(Boolean.TRUE);
                    zi3 zi3Var = this.f1871d;
                    this.f1868a = 1;
                    if (zi3Var.invoke(wn8Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                t66Var = (xc9) t66Var;
                t66Var.setValue(Boolean.FALSE);
                return xfa.f68157a;
            } catch (Throwable th) {
                ((xc9) t66Var).setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(C0101i c0101i, MutatePriority mutatePriority, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f1865b = c0101i;
        this.f1866c = mutatePriority;
        this.f1867d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultScrollableState$scroll$2(this.f1865b, this.f1866c, this.f1867d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultScrollableState$scroll$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1864a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0101i c0101i = this.f1865b;
            C0145m c0145m = c0101i.f2262c;
            y72 y72Var = c0101i.f2261b;
            C00851 c00851 = new C00851(c0101i, this.f1867d, null);
            this.f1864a = 1;
            if (c0145m.m1027c(y72Var, this.f1866c, c00851, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
