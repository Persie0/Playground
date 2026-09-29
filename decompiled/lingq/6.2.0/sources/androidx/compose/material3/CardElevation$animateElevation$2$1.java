package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lj7;
import p000.q84;
import p000.q93;
import p000.rv3;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.xj2;
import p000.xk2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.CardElevation$animateElevation$2$1", m4291f = "Card.kt", m4292l = {727, 737}, m4293m = "invokeSuspend", m4294v = 1)
final class CardElevation$animateElevation$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f3148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f3149c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f3150d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0233h f3151e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ q84 f3152f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2$1(C0059a c0059a, float f, boolean z, C0233h c0233h, q84 q84Var, Continuation continuation) {
        super(2, continuation);
        this.f3148b = c0059a;
        this.f3149c = f;
        this.f3150d = z;
        this.f3151e = c0233h;
        this.f3152f = q84Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardElevation$animateElevation$2$1(this.f3148b, this.f3149c, this.f3150d, this.f3151e, this.f3152f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CardElevation$animateElevation$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r9.m747f(r1, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (p000.ap2.m2965a(r9, r5, r2, r8.f3152f, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3147a;
        q84 xk2Var = null;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f3148b;
            float f = ((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a;
            float f2 = this.f3149c;
            if (!xj2.m24560b(f, f2)) {
                if (this.f3150d) {
                    float f3 = ((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a;
                    C0233h c0233h = this.f3151e;
                    if (xj2.m24560b(f3, c0233h.f3427b)) {
                        xk2Var = new lj7(0L);
                    } else if (xj2.m24560b(f3, c0233h.f3429d)) {
                        xk2Var = new rv3();
                    } else if (xj2.m24560b(f3, c0233h.f3428c)) {
                        xk2Var = new q93();
                    } else if (xj2.m24560b(f3, c0233h.f3430e)) {
                        xk2Var = new xk2();
                    }
                    this.f3147a = 2;
                } else {
                    xj2 xj2Var = new xj2(f2);
                    this.f3147a = 1;
                }
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
