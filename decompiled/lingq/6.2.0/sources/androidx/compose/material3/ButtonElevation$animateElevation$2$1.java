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
import p000.xj0;
import p000.xj2;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", m4291f = "Button.kt", m4292l = {1762, 1771}, m4293m = "invokeSuspend", m4294v = 1)
final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f3139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f3140c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f3141d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xj0 f3142e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ q84 f3143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(C0059a c0059a, float f, boolean z, xj0 xj0Var, q84 q84Var, Continuation continuation) {
        super(2, continuation);
        this.f3139b = c0059a;
        this.f3140c = f;
        this.f3141d = z;
        this.f3142e = xj0Var;
        this.f3143f = q84Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonElevation$animateElevation$2$1(this.f3139b, this.f3140c, this.f3141d, this.f3142e, this.f3143f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonElevation$animateElevation$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r9.m747f(r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (p000.ap2.m2965a(r9, r5, r2, r8.f3143f, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3138a;
        q84 q93Var = null;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f3139b;
            float f = ((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a;
            float f2 = this.f3140c;
            if (!xj2.m24560b(f, f2)) {
                if (this.f3141d) {
                    float f3 = ((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a;
                    if (xj2.m24560b(f3, 0.0f)) {
                        q93Var = new lj7(0L);
                    } else if (xj2.m24560b(f3, this.f3142e.f68279b)) {
                        q93Var = new rv3();
                    } else if (xj2.m24560b(f3, 0.0f)) {
                        q93Var = new q93();
                    }
                    this.f3138a = 2;
                } else {
                    xj2 xj2Var = new xj2(f2);
                    this.f3138a = 1;
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
