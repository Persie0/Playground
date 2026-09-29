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
import p000.dj3;
import p000.e83;
import p000.x50;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", m4291f = "Zip.kt", m4292l = {269}, m4293m = "invokeSuspend", m4294v = 1)
public final class C3219xd7c321e9 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48003a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83[] f48005c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dj3 f48006d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1, reason: invalid class name */
    @c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", m4291f = "Zip.kt", m4292l = {270}, m4293m = "invokeSuspend", m4294v = 1)
    public final class AnonymousClass1 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f48007a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f48008b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object[] f48009c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ dj3 f48010d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, dj3 dj3Var) {
            super(3, continuation);
            this.f48010d = dj3Var;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Continuation) obj3, this.f48010d);
            anonymousClass1.f48008b = (e83) obj;
            anonymousClass1.f48009c = (Object[]) obj2;
            return anonymousClass1.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f48008b;
            Object[] objArr = this.f48009c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f48007a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f48008b = null;
                this.f48009c = null;
                this.f48007a = 1;
                if (this.f48010d.mo1290h(e83Var, obj2, obj3, obj4, obj5, this) == coroutineSingletons) {
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
    public C3219xd7c321e9(c83[] c83VarArr, Continuation continuation, dj3 dj3Var) {
        super(2, continuation);
        this.f48005c = c83VarArr;
        this.f48006d = dj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3219xd7c321e9 c3219xd7c321e9 = new C3219xd7c321e9(this.f48005c, continuation, this.f48006d);
        c3219xd7c321e9.f48004b = obj;
        return c3219xd7c321e9;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C3219xd7c321e9) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f48004b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48003a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            x50 x50Var = x50.f67767d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f48006d);
            this.f48004b = null;
            this.f48003a = 1;
            if (AbstractC3238h.m15568a(e83Var, x50Var, anonymousClass1, this, this.f48005c) == coroutineSingletons) {
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
