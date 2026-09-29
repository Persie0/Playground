package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3110ig;
import p000.C3386nv;
import p000.InterfaceC3483q3;
import p000.c32;
import p000.gm5;
import p000.sb9;
import p000.ub9;
import p000.un1;
import p000.vb9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", m4291f = "SnackbarHost.kt", m4292l = {231}, m4293m = "invokeSuspend", m4294v = 1)
final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sb9 f3320b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3483q3 f3321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(sb9 sb9Var, InterfaceC3483q3 interfaceC3483q3, Continuation continuation) {
        super(2, continuation);
        this.f3320b = sb9Var;
        this.f3321c = interfaceC3483q3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.f3320b, this.f3321c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3319a;
        sb9 sb9Var = this.f3320b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (sb9Var != null) {
                vb9 vb9Var = (vb9) sb9Var;
                SnackbarDuration snackbarDurationM23838b = vb9Var.m23218b().m23838b();
                boolean z = vb9Var.m23218b().m23837a() != null;
                int i2 = ub9.f63673a[snackbarDurationM23838b.ordinal()];
                long j2 = Long.MAX_VALUE;
                if (i2 == 1) {
                    j = Long.MAX_VALUE;
                } else if (i2 == 2) {
                    j = 10000;
                } else {
                    if (i2 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    j = 4000;
                }
                InterfaceC3483q3 interfaceC3483q3 = this.f3321c;
                if (interfaceC3483q3 == null) {
                    j2 = j;
                } else {
                    C3110ig c3110ig = (C3110ig) interfaceC3483q3;
                    if (j >= 2147483647L) {
                        j2 = j;
                    } else {
                        int recommendedTimeoutMillis = c3110ig.f44064a.getRecommendedTimeoutMillis((int) j, z ? 7 : 3);
                        if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                            j2 = recommendedTimeoutMillis;
                        }
                    }
                }
                this.f3319a = 1;
                if (AbstractC3208a.m15437d(j2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ((vb9) sb9Var).m23217a();
        return xfa.f68157a;
    }
}
