package androidx.compose.p002ui.scrollcapture;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", m4291f = "ComposeScrollCaptureCallback.android.kt", m4292l = {188}, m4293m = "invokeSuspend", m4294v = 1)
final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ScrollCaptureCallbackC0417a f4882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f4883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.f4882b = scrollCaptureCallbackC0417a;
        this.f4883c = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.f4882b, this.f4883c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4881a;
        xfa xfaVar = xfa.f68157a;
        ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a = this.f4882b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0419c c0419c = scrollCaptureCallbackC0417a.f4912f;
            this.f4881a = 1;
            Object objM1835d = c0419c.m1835d(0.0f - c0419c.f4915c, this);
            if (objM1835d != coroutineSingletons) {
                objM1835d = xfaVar;
            }
            if (objM1835d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ((xc9) scrollCaptureCallbackC0417a.f4909c.f4916a).setValue(Boolean.FALSE);
        this.f4883c.run();
        return xfaVar;
    }
}
