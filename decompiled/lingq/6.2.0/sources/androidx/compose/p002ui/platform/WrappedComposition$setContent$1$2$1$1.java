package androidx.compose.p002ui.platform;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$2$1$1", m4291f = "Wrapper.android.kt", m4292l = {125}, m4293m = "invokeSuspend", m4294v = 1)
final class WrappedComposition$setContent$1$2$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0413y f4621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1$2$1$1(C0413y c0413y, Continuation continuation) {
        super(2, continuation);
        this.f4621b = c0413y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WrappedComposition$setContent$1$2$1$1(this.f4621b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WrappedComposition$setContent$1$2$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4620a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4621b.f4873a;
        this.f4620a = 1;
        Object objM1785l = viewTreeObserverOnGlobalLayoutListenerC0391c.f4666Q.m1785l(this);
        if (objM1785l != coroutineSingletons) {
            objM1785l = xfaVar;
        }
        return objM1785l == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
