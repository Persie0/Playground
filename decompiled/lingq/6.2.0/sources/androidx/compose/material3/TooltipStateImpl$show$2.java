package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.TooltipStateImpl$show$2", m4291f = "Tooltip.kt", m4292l = {1068, 1070}, m4293m = "invokeSuspend", m4294v = 1)
final class TooltipStateImpl$show$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f3353a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0252k0 f3354b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutatePriority f3355c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f3356d;

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1 */
    @c32(m4290c = "androidx.compose.material3.TooltipStateImpl$show$2$1", m4291f = "Tooltip.kt", m4292l = {1070}, m4293m = "invokeSuspend", m4294v = 1)
    final class C02171 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f3357a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vi3 f3358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02171(vi3 vi3Var, Continuation continuation) {
            super(2, continuation);
            this.f3358b = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C02171(this.f3358b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C02171) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f3357a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f3357a = 1;
                if (((TooltipStateImpl$show$cancellableShow$1) this.f3358b).invoke(this) == coroutineSingletons) {
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
    public TooltipStateImpl$show$2(C0252k0 c0252k0, MutatePriority mutatePriority, vi3 vi3Var, Continuation continuation) {
        super(1, continuation);
        this.f3354b = c0252k0;
        this.f3355c = mutatePriority;
        this.f3356d = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TooltipStateImpl$show$2(this.f3354b, this.f3355c, this.f3356d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((TooltipStateImpl$show$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15445l(new p000.d1a(1500, r7), r8) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3353a;
        MutatePriority mutatePriority = this.f3355c;
        C0252k0 c0252k0 = this.f3354b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                MutatePriority mutatePriority2 = MutatePriority.UserInput;
                vi3 vi3Var = this.f3356d;
                if (mutatePriority == mutatePriority2) {
                    this.f3353a = 1;
                    if (((TooltipStateImpl$show$cancellableShow$1) vi3Var).invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    C02171 c02171 = new C02171(vi3Var, null);
                    this.f3353a = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            if (mutatePriority != MutatePriority.PreventUserInput) {
                c0252k0.m1177a();
            }
            return xfa.f68157a;
        } catch (Throwable th) {
            if (mutatePriority != MutatePriority.PreventUserInput) {
                c0252k0.m1177a();
            }
            throw th;
        }
    }
}
