package coil;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3057h;
import p000.C3386nv;
import p000.c32;
import p000.dp5;
import p000.e04;
import p000.ph2;
import p000.t04;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.xq3;
import p000.y92;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "coil.RealImageLoader$execute$2", m4291f = "RealImageLoader.kt", m4292l = {138}, m4293m = "invokeSuspend")
final class RealImageLoader$execute$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10380a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e04 f10382c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0855a f10383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(e04 e04Var, C0855a c0855a, Continuation continuation) {
        super(2, continuation);
        this.f10382c = e04Var;
        this.f10383d = c0855a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.f10382c, this.f10383d, continuation);
        realImageLoader$execute$2.f10381b = obj;
        return realImageLoader$execute$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10380a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        un1 un1Var = (un1) this.f10381b;
        v72 v72Var = ph2.f56212a;
        xq3 xq3Var = dp5.f36000a.f68538f;
        C0855a c0855a = this.f10383d;
        e04 e04Var = this.f10382c;
        y92 y92VarM23910e = wfb.m23910e(un1Var, xq3Var, new RealImageLoader$execute$2$job$1(e04Var, c0855a, null), 2);
        AbstractC3057h.m12988c(((t04) e04Var.f36504c).f61703b).m17058a();
        this.f10380a = 1;
        Object objM15517w = y92VarM23910e.m15517w(this);
        return objM15517w == coroutineSingletons ? coroutineSingletons : objM15517w;
    }
}
