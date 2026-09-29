package androidx.lifecycle.compose;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3572sf;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.h83;
import p000.jl7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", m4291f = "FlowExt.kt", m4292l = {177}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6346a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6347b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC3572sf f6348c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lifecycle$State f6349d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ c83 f6350e;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1 */
    @c32(m4290c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", m4291f = "FlowExt.kt", m4292l = {179, 181}, m4293m = "invokeSuspend", m4294v = 1)
    final class C07101 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6351a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c83 f6352b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jl7 f6353c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07101(c83 c83Var, jl7 jl7Var, Continuation continuation) {
            super(2, continuation);
            this.f6352b = c83Var;
            this.f6353c = jl7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C07101(this.f6352b, this.f6353c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C07101) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6351a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                h83 h83Var = new h83(this.f6353c, 0);
                this.f6351a = 1;
                if (this.f6352b.collect(h83Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1 && i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(AbstractC3572sf abstractC3572sf, Lifecycle$State lifecycle$State, c83 c83Var, Continuation continuation) {
        super(2, continuation);
        this.f6348c = abstractC3572sf;
        this.f6349d = lifecycle$State;
        this.f6350e = c83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.f6348c, this.f6349d, this.f6350e, continuation);
        flowExtKt$collectAsStateWithLifecycle$1$1.f6347b = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create((jl7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6346a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C07101 c07101 = new C07101(this.f6350e, (jl7) this.f6347b, null);
            this.f6346a = 1;
            if (AbstractC0708b.m2509b(this.f6348c, this.f6349d, c07101, this) == coroutineSingletons) {
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
