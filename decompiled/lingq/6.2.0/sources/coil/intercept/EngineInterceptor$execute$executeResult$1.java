package coil.intercept;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.bd1;
import p000.c32;
import p000.e04;
import p000.ee9;
import p000.sz6;
import p000.un1;
import p000.wt2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.intercept.EngineInterceptor$execute$executeResult$1", m4291f = "EngineInterceptor.kt", m4292l = {131}, m4293m = "invokeSuspend")
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0862a f10506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$ObjectRef f10507c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f10508d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e04 f10509e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f10510f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Ref$ObjectRef f10511g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ wt2 f10512h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(C0862a c0862a, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, e04 e04Var, Object obj, Ref$ObjectRef ref$ObjectRef3, wt2 wt2Var, Continuation continuation) {
        super(2, continuation);
        this.f10506b = c0862a;
        this.f10507c = ref$ObjectRef;
        this.f10508d = ref$ObjectRef2;
        this.f10509e = e04Var;
        this.f10510f = obj;
        this.f10511g = ref$ObjectRef3;
        this.f10512h = wt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.f10506b, this.f10507c, this.f10508d, this.f10509e, this.f10510f, this.f10511g, this.f10512h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$execute$executeResult$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10505a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ee9 ee9Var = (ee9) this.f10507c.f47718a;
        bd1 bd1Var = (bd1) this.f10508d.f47718a;
        sz6 sz6Var = (sz6) this.f10511g.f47718a;
        this.f10505a = 1;
        Object objM4975b = C0862a.m4975b(this.f10506b, ee9Var, bd1Var, this.f10509e, this.f10510f, sz6Var, this.f10512h, this);
        return objM4975b == coroutineSingletons ? coroutineSingletons : objM4975b;
    }
}
