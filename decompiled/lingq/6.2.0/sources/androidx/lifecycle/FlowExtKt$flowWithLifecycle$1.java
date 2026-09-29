package androidx.lifecycle;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3572sf;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.kl7;
import p000.ll7;
import p000.un1;
import p000.xfa;
import p000.ye0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m4291f = "FlowExt.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6309a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC3572sf f6311c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lifecycle$State f6312d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ c83 f6313e;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    @c32(m4290c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m4291f = "FlowExt.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 1)
    final class C07051 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c83 f6315b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ll7 f6316c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07051(c83 c83Var, ll7 ll7Var, Continuation continuation) {
            super(2, continuation);
            this.f6315b = c83Var;
            this.f6316c = ll7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C07051(this.f6315b, this.f6316c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C07051) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6314a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                ye0 ye0Var = new ye0(this.f6316c, 4);
                this.f6314a = 1;
                if (this.f6315b.collect(ye0Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(AbstractC3572sf abstractC3572sf, Lifecycle$State lifecycle$State, c83 c83Var, Continuation continuation) {
        super(2, continuation);
        this.f6311c = abstractC3572sf;
        this.f6312d = lifecycle$State;
        this.f6313e = c83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.f6311c, this.f6312d, this.f6313e, continuation);
        flowExtKt$flowWithLifecycle$1.f6310b = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$flowWithLifecycle$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ll7 ll7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6309a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ll7 ll7Var2 = (ll7) this.f6310b;
            C07051 c07051 = new C07051(this.f6313e, ll7Var2, null);
            this.f6310b = ll7Var2;
            this.f6309a = 1;
            if (AbstractC0708b.m2509b(this.f6311c, this.f6312d, c07051, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ll7Var = ll7Var2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ll7Var = (ll7) this.f6310b;
            AbstractC3193b.m15359b(obj);
        }
        ((kl7) ll7Var).mo15331i(null);
        return xfa.f68157a;
    }
}
