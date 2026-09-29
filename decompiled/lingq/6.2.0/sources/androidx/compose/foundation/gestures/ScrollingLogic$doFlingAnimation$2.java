package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p000.C3386nv;
import p000.C3831zf;
import p000.c32;
import p000.dpa;
import p000.ho8;
import p000.x63;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m4291f = "Scrollable.kt", m4292l = {912}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C0116v f2092a;

    /* JADX INFO: renamed from: b */
    public Ref$LongRef f2093b;

    /* JADX INFO: renamed from: c */
    public long f2094c;

    /* JADX INFO: renamed from: d */
    public int f2095d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2096e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0116v f2097f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Ref$LongRef f2098g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f2099h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(C0116v c0116v, Ref$LongRef ref$LongRef, long j, Continuation continuation) {
        super(2, continuation);
        this.f2097f = c0116v;
        this.f2098g = ref$LongRef;
        this.f2099h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f2097f, this.f2098g, this.f2099h, continuation);
        scrollingLogic$doFlingAnimation$2.f2096e = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((ho8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0116v c0116v;
        Ref$LongRef ref$LongRef;
        C0116v c0116v2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2095d;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ho8 ho8Var = (ho8) this.f2096e;
            c0116v = this.f2097f;
            C3831zf c3831zf = new C3831zf(i2, c0116v, ho8Var);
            x63 x63Var = c0116v.f2362c;
            ref$LongRef = this.f2098g;
            long j2 = ref$LongRef.f47717a;
            Orientation orientation = c0116v.f2363d;
            Orientation orientation2 = Orientation.Horizontal;
            long j3 = this.f2099h;
            float fM932d = c0116v.m932d(orientation == orientation2 ? dpa.m10571b(j3) : dpa.m10572c(j3));
            this.f2096e = c0116v;
            this.f2092a = c0116v;
            this.f2093b = ref$LongRef;
            this.f2094c = j2;
            this.f2095d = 1;
            obj = x63Var.mo862a(c3831zf, fM932d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0116v2 = c0116v;
            j = j2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f2094c;
            ref$LongRef = this.f2093b;
            c0116v = this.f2092a;
            c0116v2 = (C0116v) this.f2096e;
            AbstractC3193b.m15359b(obj);
        }
        float fM932d2 = c0116v2.m932d(((Number) obj).floatValue());
        ref$LongRef.f47717a = c0116v.f2363d == Orientation.Horizontal ? dpa.m10570a(j, fM932d2, 0.0f, 2) : dpa.m10570a(j, 0.0f, fM932d2, 1);
        return xfa.f68157a;
    }
}
