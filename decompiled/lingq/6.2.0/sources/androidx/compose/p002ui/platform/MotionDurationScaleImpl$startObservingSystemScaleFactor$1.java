package androidx.compose.p002ui.platform;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3575si;
import p000.c32;
import p000.eh9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", m4291f = "WindowRecomposer.android.kt", m4292l = {446}, m4293m = "invokeSuspend", m4294v = 1)
final class MotionDurationScaleImpl$startObservingSystemScaleFactor$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh9 f4584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0409u f4585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDurationScaleImpl$startObservingSystemScaleFactor$1(eh9 eh9Var, C0409u c0409u, Continuation continuation) {
        super(2, continuation);
        this.f4584b = eh9Var;
        this.f4585c = c0409u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(this.f4584b, this.f4585c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MotionDurationScaleImpl$startObservingSystemScaleFactor$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4583a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3575si c3575si = new C3575si(this.f4585c, 2);
            this.f4583a = 1;
            if (this.f4584b.collect(c3575si, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
