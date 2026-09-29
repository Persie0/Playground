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

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", m4291f = "Zip.kt", m4292l = {269}, m4293m = "invokeSuspend", m4294v = 1)
public final class C3217xd7c321e7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f47987a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83[] f47989c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bj3 f47990d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1, reason: invalid class name */
    @c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", m4291f = "Zip.kt", m4292l = {270}, m4293m = "invokeSuspend", m4294v = 1)
    public final class AnonymousClass1 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f47991a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f47992b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object[] f47993c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bj3 f47994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, bj3 bj3Var) {
            super(3, continuation);
            this.f47994d = bj3Var;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Continuation) obj3, this.f47994d);
            anonymousClass1.f47992b = (e83) obj;
            anonymousClass1.f47993c = (Object[]) obj2;
            return anonymousClass1.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f47992b;
            Object[] objArr = this.f47993c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f47991a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f47992b = null;
                this.f47993c = null;
                this.f47991a = 1;
                if (this.f47994d.mo825e(e83Var, obj2, obj3, this) == coroutineSingletons) {
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
    public C3217xd7c321e7(c83[] c83VarArr, Continuation continuation, bj3 bj3Var) {
        super(2, continuation);
        this.f47989c = c83VarArr;
        this.f47990d = bj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3217xd7c321e7 c3217xd7c321e7 = new C3217xd7c321e7(this.f47989c, continuation, this.f47990d);
        c3217xd7c321e7.f47988b = obj;
        return c3217xd7c321e7;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C3217xd7c321e7) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f47988b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47987a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            x50 x50Var = x50.f67767d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f47990d);
            this.f47988b = null;
            this.f47987a = 1;
            if (AbstractC3238h.m15568a(e83Var, x50Var, anonymousClass1, this, this.f47989c) == coroutineSingletons) {
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
