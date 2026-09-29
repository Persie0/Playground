package androidx.compose.animation;

import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3503qm;
import p000.c32;
import p000.faa;
import p000.jl7;
import p000.kk8;
import p000.t66;
import p000.ui3;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", m4291f = "AnimatedVisibility.kt", m4292l = {746}, m4293m = "invokeSuspend", m4294v = 1)
final class C0048xd7829780 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1364a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f1365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ faa f1366c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f1367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048xd7829780(faa faaVar, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f1366c = faaVar;
        this.f1367d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0048xd7829780 c0048xd7829780 = new C0048xd7829780(this.f1366c, this.f1367d, continuation);
        c0048xd7829780.f1365b = obj;
        return c0048xd7829780;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0048xd7829780) create((jl7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1364a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            jl7 jl7Var = (jl7) this.f1365b;
            final faa faaVar = this.f1366c;
            kk8 kk8VarM1264n = AbstractC0278f.m1264n(new ui3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    faa faaVar2 = faaVar;
                    Object objM11669c = faaVar2.m11669c();
                    EnterExitState enterExitState = EnterExitState.PostExit;
                    return Boolean.valueOf(objM11669c == enterExitState && ((xc9) faaVar2.f38738d).getValue() == enterExitState);
                }
            });
            C3503qm c3503qm = new C3503qm(jl7Var, faaVar, this.f1367d);
            this.f1364a = 1;
            if (kk8VarM1264n.collect(c3503qm, this) == coroutineSingletons) {
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
