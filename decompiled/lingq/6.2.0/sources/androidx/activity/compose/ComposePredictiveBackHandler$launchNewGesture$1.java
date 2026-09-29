package androidx.activity.compose;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.du0;
import p000.l83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", m4291f = "PredictiveBackHandler.kt", m4292l = {231}, m4293m = "invokeSuspend", m4294v = 1)
final class ComposePredictiveBackHandler$launchNewGesture$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$BooleanRef f998a;

    /* JADX INFO: renamed from: b */
    public int f999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0033a f1000c;

    /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1 */
    @c32(m4290c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", m4291f = "PredictiveBackHandler.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00321 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref$BooleanRef f1001a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00321(Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
            super(3, continuation);
            this.f1001a = ref$BooleanRef;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C00321 c00321 = new C00321(this.f1001a, (Continuation) obj3);
            xfa xfaVar = xfa.f68157a;
            c00321.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f1001a.f47713a = true;
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePredictiveBackHandler$launchNewGesture$1(C0033a c0033a, Continuation continuation) {
        super(2, continuation);
        this.f1000c = c0033a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposePredictiveBackHandler$launchNewGesture$1(this.f1000c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposePredictiveBackHandler$launchNewGesture$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f999b;
        boolean z = true;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0033a c0033a = this.f1000c;
            if (c0033a.m24292d()) {
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                zi3 zi3Var = c0033a.f1003d;
                C3211a c3211a = c0033a.f1004e;
                c3211a.getClass();
                l83 l83Var = new l83(new du0(c3211a, z), new C00321(ref$BooleanRef2, null), 0);
                this.f998a = ref$BooleanRef2;
                this.f999b = 1;
                if (zi3Var.invoke(l83Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$BooleanRef = this.f998a;
        AbstractC3193b.m15359b(obj);
        if (!ref$BooleanRef.f47713a) {
            C3386nv.m17633t("You must collect the progress flow");
            return null;
        }
        return xfa.f68157a;
    }
}
