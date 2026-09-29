package androidx.compose.animation.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.faa;
import p000.uk2;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", m4291f = "Transition.kt", m4292l = {1222}, m4293m = "invokeSuspend", m4294v = 1)
final class Transition$animateTo$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public float f1534a;

    /* JADX INFO: renamed from: b */
    public int f1535b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1536c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ faa f1537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(faa faaVar, Continuation continuation) {
        super(2, continuation);
        this.f1537d = faaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.f1537d, continuation);
        transition$animateTo$1$1$1.f1536c = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Transition$animateTo$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        float fM761h;
        un1 un1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1535b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var2 = (un1) this.f1536c;
            fM761h = AbstractC0063e.m761h(un1Var2.mo1309x());
            un1Var = un1Var2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fM761h = this.f1534a;
            un1Var = (un1) this.f1536c;
            AbstractC3193b.m15359b(obj);
        }
        while (vz1.m23603I(un1Var)) {
            uk2 uk2Var = new uk2(this.f1537d, fM761h);
            this.f1536c = un1Var;
            this.f1534a = fM761h;
            this.f1535b = 1;
            if (b34.m3250q(getContext()).mo1250e(uk2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfa.f68157a;
    }
}
