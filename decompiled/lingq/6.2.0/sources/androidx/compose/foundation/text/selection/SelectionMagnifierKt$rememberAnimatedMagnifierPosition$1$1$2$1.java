package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bg9;
import p000.c32;
import p000.gq6;
import p000.gv8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", m4291f = "SelectionMagnifier.kt", m4292l = {96}, m4293m = "invokeSuspend", m4294v = 1)
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f3031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f3032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(C0059a c0059a, long j, Continuation continuation) {
        super(2, continuation);
        this.f3031b = c0059a;
        this.f3032c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(this.f3031b, this.f3032c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3030a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            gq6 gq6Var = new gq6(this.f3032c);
            bg9 bg9Var = gv8.f41399d;
            this.f3030a = 1;
            if (C0059a.m744c(this.f3031b, gq6Var, bg9Var, null, this, 12) == coroutineSingletons) {
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
