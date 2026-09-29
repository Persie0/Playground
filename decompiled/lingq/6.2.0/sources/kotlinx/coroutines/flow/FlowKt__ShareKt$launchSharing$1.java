package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0842cc;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.gm5;
import p000.i59;
import p000.iy5;
import p000.j59;
import p000.pb1;
import p000.s83;
import p000.un1;
import p000.vm9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m4291f = "Share.kt", m4292l = {210, 214, 215, 221}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f47929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j59 f47930b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83 f47931c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3244l f47932d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f47933e;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    /* JADX INFO: loaded from: classes3.dex */
    @c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m4291f = "Share.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    final class C32141 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f47934a;

        public C32141() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C32141 c32141 = new C32141(2, continuation);
            c32141.f47934a = ((Number) obj).intValue();
            return c32141;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C32141) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f47934a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return Boolean.valueOf(i > 0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    @c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m4291f = "Share.kt", m4292l = {223}, m4293m = "invokeSuspend", m4294v = 1)
    final class C32152 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f47935a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f47936b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ c83 f47937c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3244l f47938d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f47939e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32152(c83 c83Var, C3244l c3244l, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f47937c = c83Var;
            this.f47938d = c3244l;
            this.f47939e = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C32152 c32152 = new C32152(this.f47937c, this.f47938d, this.f47939e, continuation);
            c32152.f47936b = obj;
            return c32152;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C32152) create((SharingCommand) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SharingCommand sharingCommand = (SharingCommand) this.f47936b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f47935a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                int i2 = s83.f60507a[sharingCommand.ordinal()];
                C3244l c3244l = this.f47938d;
                if (i2 == 1) {
                    this.f47936b = null;
                    this.f47935a = 1;
                    if (this.f47937c.collect(c3244l, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    C0842cc c0842cc = pb1.f55917e;
                    Object obj2 = this.f47939e;
                    if (obj2 == c0842cc) {
                        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                    }
                    c3244l.m15571i(obj2);
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
    public FlowKt__ShareKt$launchSharing$1(j59 j59Var, c83 c83Var, C3244l c3244l, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f47930b = j59Var;
        this.f47931c = c83Var;
        this.f47932d = c3244l;
        this.f47933e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.f47930b, this.f47931c, this.f47932d, this.f47933e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharing$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r7.collect(r8, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r7.collect(r8, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r10, r1, r9) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47929a;
        c83 c83Var = this.f47931c;
        C3244l c3244l = this.f47932d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC3193b.m15359b(obj);
                    this.f47929a = 3;
                } else if (i != 3 && i != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        iy5 iy5Var = i59.f43549a;
        j59 j59Var = this.f47930b;
        if (j59Var != iy5Var) {
            if (j59Var == i59.f43550b) {
                vm9 vm9VarM23671g = c3244l.m23671g();
                C32141 c32141 = new C32141();
                this.f47929a = 2;
                if (AbstractC3224d.m15540s(vm9VarM23671g, c32141, this) != coroutineSingletons) {
                    this.f47929a = 3;
                }
            } else {
                c83 c83VarM15536o = AbstractC3224d.m15536o(j59Var.mo14203a(c3244l.m23671g()));
                C32152 c32152 = new C32152(c83Var, c3244l, this.f47933e, null);
                this.f47929a = 4;
            }
            return coroutineSingletons;
        }
        this.f47929a = 1;
    }
}
