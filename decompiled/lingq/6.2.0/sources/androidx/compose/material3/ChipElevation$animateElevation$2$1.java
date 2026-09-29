package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.q84;
import p000.t66;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.xj2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.ChipElevation$animateElevation$2$1", m4291f = "Chip.kt", m4292l = {3668, 3670}, m4293m = "invokeSuspend", m4294v = 1)
final class ChipElevation$animateElevation$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f3157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f3158c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f3159d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ q84 f3160e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f3161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$2$1(C0059a c0059a, float f, boolean z, q84 q84Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f3157b = c0059a;
        this.f3158c = f;
        this.f3159d = z;
        this.f3160e = q84Var;
        this.f3161f = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChipElevation$animateElevation$2$1(this.f3157b, this.f3158c, this.f3159d, this.f3160e, this.f3161f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChipElevation$animateElevation$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r8.m747f(r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (p000.ap2.m2965a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3156a;
        q84 q84Var = this.f3160e;
        t66 t66Var = this.f3161f;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f3157b;
            float f = ((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a;
            float f2 = this.f3158c;
            if (!xj2.m24560b(f, f2)) {
                if (this.f3159d) {
                    q84 q84Var2 = (q84) t66Var.getValue();
                    this.f3156a = 2;
                } else {
                    xj2 xj2Var = new xj2(f2);
                    this.f3156a = 1;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1 && i != 2) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        t66Var.setValue(q84Var);
        return xfa.f68157a;
    }
}
