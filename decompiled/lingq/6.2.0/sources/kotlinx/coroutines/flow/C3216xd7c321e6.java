package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbstractC3238h;
import p000.C3386nv;
import p000.aj3;
import p000.bj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.x50;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", m4291f = "Zip.kt", m4292l = {269}, m4293m = "invokeSuspend", m4294v = 1)
public final class C3216xd7c321e6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f47979a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83[] f47981c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bj3 f47982d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1, reason: invalid class name */
    @c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", m4291f = "Zip.kt", m4292l = {270}, m4293m = "invokeSuspend", m4294v = 1)
    public final class AnonymousClass1 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f47983a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f47984b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object[] f47985c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bj3 f47986d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, bj3 bj3Var) {
            super(3, continuation);
            this.f47986d = bj3Var;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Continuation) obj3, this.f47986d);
            anonymousClass1.f47984b = (e83) obj;
            anonymousClass1.f47985c = (Object[]) obj2;
            return anonymousClass1.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f47984b;
            Object[] objArr = this.f47985c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f47983a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f47984b = null;
                this.f47985c = null;
                this.f47983a = 1;
                if (this.f47986d.mo825e(e83Var, obj2, obj3, this) == coroutineSingletons) {
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
    public C3216xd7c321e6(c83[] c83VarArr, Continuation continuation, bj3 bj3Var) {
        super(2, continuation);
        this.f47981c = c83VarArr;
        this.f47982d = bj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3216xd7c321e6 c3216xd7c321e6 = new C3216xd7c321e6(this.f47981c, continuation, this.f47982d);
        c3216xd7c321e6.f47980b = obj;
        return c3216xd7c321e6;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C3216xd7c321e6) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f47980b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47979a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            x50 x50Var = x50.f67767d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f47982d);
            this.f47980b = null;
            this.f47979a = 1;
            if (AbstractC3238h.m15568a(e83Var, x50Var, anonymousClass1, this, this.f47981c) == coroutineSingletons) {
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
