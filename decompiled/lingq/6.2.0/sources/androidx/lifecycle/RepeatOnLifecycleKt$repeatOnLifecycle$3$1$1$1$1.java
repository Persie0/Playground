package androidx.lifecycle;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c32;
import p000.c76;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.xi3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m4291f = "RepeatOnLifecycle.kt", m4292l = {166, 110}, m4293m = "invokeSuspend", m4294v = 1)
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public c76 f6331a;

    /* JADX INFO: renamed from: b */
    public SuspendLambda f6332b;

    /* JADX INFO: renamed from: c */
    public int f6333c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3248a f6334d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f6335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(C3248a c3248a, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6334d = c3248a;
        this.f6335e = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.f6334d, this.f6335e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [zi3] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c76 c76Var;
        xi3 xi3Var;
        ?? r1;
        Throwable th;
        c76 c76Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6333c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                c76Var = this.f6334d;
                this.f6331a = c76Var;
                xi3Var = this.f6335e;
                this.f6332b = (SuspendLambda) xi3Var;
                this.f6333c = 1;
                if (c76Var.mo4388c(this) != coroutineSingletons) {
                }
                r1 = xi3Var;
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c76Var2 = this.f6331a;
                try {
                    AbstractC3193b.m15359b(obj);
                    c76Var2.mo4387b(null);
                    return xfa.f68157a;
                } catch (Throwable th2) {
                    th = th2;
                    c76Var2.mo4387b(null);
                    throw th;
                }
            }
            zi3 zi3Var = (zi3) this.f6332b;
            c76 c76Var3 = this.f6331a;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var3;
            r1 = zi3Var;
            r1 = xi3Var;
            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(r1, null);
            this.f6331a = c76Var;
            this.f6332b = null;
            this.f6333c = 2;
            if (vz1.m23649s(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutineSingletons) {
                c76Var2 = c76Var;
                c76Var2.mo4387b(null);
                return xfa.f68157a;
            }
            r1 = xi3Var;
            return coroutineSingletons;
        } catch (Throwable th3) {
            c76 c76Var4 = c76Var;
            th = th3;
            c76Var2 = c76Var4;
            c76Var2.mo4387b(null);
            throw th;
        }
    }
}
