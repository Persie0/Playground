package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbstractC3238h;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cj3;
import p000.e83;
import p000.x50;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", m4291f = "Zip.kt", m4292l = {269}, m4293m = "invokeSuspend", m4294v = 1)
public final class C3218xd7c321e8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f47995a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47996b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83[] f47997c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cj3 f47998d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1, reason: invalid class name */
    @c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", m4291f = "Zip.kt", m4292l = {270}, m4293m = "invokeSuspend", m4294v = 1)
    public final class AnonymousClass1 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f47999a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f48000b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object[] f48001c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ cj3 f48002d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, cj3 cj3Var) {
            super(3, continuation);
            this.f48002d = cj3Var;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Continuation) obj3, this.f48002d);
            anonymousClass1.f48000b = (e83) obj;
            anonymousClass1.f48001c = (Object[]) obj2;
            return anonymousClass1.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f48000b;
            Object[] objArr = this.f48001c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f47999a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f48000b = null;
                this.f48001c = null;
                this.f47999a = 1;
                if (this.f48002d.mo1291i(e83Var, obj2, obj3, obj4, this) == coroutineSingletons) {
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
    public C3218xd7c321e8(c83[] c83VarArr, Continuation continuation, cj3 cj3Var) {
        super(2, continuation);
        this.f47997c = c83VarArr;
        this.f47998d = cj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3218xd7c321e8 c3218xd7c321e8 = new C3218xd7c321e8(this.f47997c, continuation, this.f47998d);
        c3218xd7c321e8.f47996b = obj;
        return c3218xd7c321e8;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C3218xd7c321e8) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f47996b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47995a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            x50 x50Var = x50.f67767d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f47998d);
            this.f47996b = null;
            this.f47995a = 1;
            if (AbstractC3238h.m15568a(e83Var, x50Var, anonymousClass1, this, this.f47997c) == coroutineSingletons) {
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
