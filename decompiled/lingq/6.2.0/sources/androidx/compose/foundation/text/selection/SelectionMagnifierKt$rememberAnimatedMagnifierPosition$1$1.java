package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0059a;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dh9;
import p000.eo4;
import p000.kk8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", m4291f = "SelectionMagnifier.kt", m4292l = {83}, m4293m = "invokeSuspend", m4294v = 1)
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3026a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dh9 f3028c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0059a f3029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(dh9 dh9Var, C0059a c0059a, Continuation continuation) {
        super(2, continuation);
        this.f3028c = dh9Var;
        this.f3029d = c0059a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.f3028c, this.f3029d, continuation);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.f3027b = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3026a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f3027b;
            kk8 kk8VarM1264n = AbstractC0278f.m1264n(new eo4(this.f3028c, 5));
            C0204e c0204e = new C0204e(un1Var, this.f3029d);
            this.f3026a = 1;
            if (kk8VarM1264n.collect(c0204e, this) == coroutineSingletons) {
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
