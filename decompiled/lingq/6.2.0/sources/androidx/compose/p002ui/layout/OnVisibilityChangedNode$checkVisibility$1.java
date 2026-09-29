package androidx.compose.p002ui.layout;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.layout.OnVisibilityChangedNode$checkVisibility$1", m4291f = "OnVisibilityChangedModifier.kt", m4292l = {219}, m4293m = "invokeSuspend", m4294v = 1)
final class OnVisibilityChangedNode$checkVisibility$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0341h f4158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnVisibilityChangedNode$checkVisibility$1(C0341h c0341h, Continuation continuation) {
        super(2, continuation);
        this.f4158b = c0341h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnVisibilityChangedNode$checkVisibility$1(this.f4158b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnVisibilityChangedNode$checkVisibility$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f4157a = 1;
            if (AbstractC3208a.m15437d(200L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f4158b.m1517b1();
        return xfa.f68157a;
    }
}
