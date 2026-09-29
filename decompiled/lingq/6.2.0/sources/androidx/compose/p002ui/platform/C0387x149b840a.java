package androidx.compose.p002ui.platform;

import androidx.compose.runtime.C0281i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c32;
import p000.ub5;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m4291f = "WindowRecomposer.android.kt", m4292l = {379}, m4293m = "invokeSuspend", m4294v = 1)
final class C0387x149b840a extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f4603b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0281i f4604c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ub5 f4605d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0412x f4606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387x149b840a(Ref$ObjectRef ref$ObjectRef, C0281i c0281i, ub5 ub5Var, C0412x c0412x, Continuation continuation) {
        super(2, continuation);
        this.f4603b = ref$ObjectRef;
        this.f4604c = c0281i;
        this.f4605d = ub5Var;
        this.f4606e = c0412x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0387x149b840a(this.f4603b, this.f4604c, this.f4605d, this.f4606e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0387x149b840a) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4602a;
        C0412x c0412x = this.f4606e;
        ub5 ub5Var = this.f4605d;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0409u c0409u = (C0409u) this.f4603b.f47718a;
                C0281i c0281i = this.f4604c;
                if (c0409u != null) {
                    c0409u.f4864b = vz1.m23619a(c0281i.f3779z);
                }
                this.f4602a = 1;
                if (c0281i.m1282N(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            ub5Var.mo256K().mo21331x(c0412x);
            return xfa.f68157a;
        } catch (Throwable th) {
            ub5Var.mo256K().mo21331x(c0412x);
            throw th;
        }
    }
}
