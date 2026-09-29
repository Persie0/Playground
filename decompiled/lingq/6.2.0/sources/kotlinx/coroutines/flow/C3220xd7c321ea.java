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
import p000.e83;
import p000.ej3;
import p000.x50;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", m4291f = "Zip.kt", m4292l = {269}, m4293m = "invokeSuspend", m4294v = 1)
public final class C3220xd7c321ea extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48011a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83[] f48013c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ej3 f48014d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1, reason: invalid class name */
    @c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", m4291f = "Zip.kt", m4292l = {270}, m4293m = "invokeSuspend", m4294v = 1)
    public final class AnonymousClass1 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f48015a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f48016b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object[] f48017c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ej3 f48018d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, ej3 ej3Var) {
            super(3, continuation);
            this.f48018d = ej3Var;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((Continuation) obj3, this.f48018d);
            anonymousClass1.f48016b = (e83) obj;
            anonymousClass1.f48017c = (Object[]) obj2;
            return anonymousClass1.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f48016b;
            Object[] objArr = this.f48017c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f48015a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                this.f48016b = null;
                this.f48017c = null;
                this.f48015a = 1;
                if (this.f48018d.mo1286b(e83Var, obj2, obj3, obj4, obj5, obj6, this) == coroutineSingletons) {
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
    public C3220xd7c321ea(c83[] c83VarArr, Continuation continuation, ej3 ej3Var) {
        super(2, continuation);
        this.f48013c = c83VarArr;
        this.f48014d = ej3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3220xd7c321ea c3220xd7c321ea = new C3220xd7c321ea(this.f48013c, continuation, this.f48014d);
        c3220xd7c321ea.f48012b = obj;
        return c3220xd7c321ea;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C3220xd7c321ea) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f48012b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48011a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            x50 x50Var = x50.f67767d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f48014d);
            this.f48012b = null;
            this.f48011a = 1;
            if (AbstractC3238h.m15568a(e83Var, x50Var, anonymousClass1, this, this.f48013c) == coroutineSingletons) {
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
