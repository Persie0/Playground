package androidx.compose.runtime;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.fa4;
import p000.h83;
import p000.jl7;
import p000.kn1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", m4291f = "SnapshotFlow.kt", m4292l = {72, 73}, m4293m = "invokeSuspend", m4294v = 1)
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3703a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3704b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kn1 f3705c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c83 f3706d;

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2 */
    @c32(m4290c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", m4291f = "SnapshotFlow.kt", m4292l = {73}, m4293m = "invokeSuspend", m4294v = 1)
    final class C02712 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f3707a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c83 f3708b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jl7 f3709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02712(c83 c83Var, jl7 jl7Var, Continuation continuation) {
            super(2, continuation);
            this.f3708b = c83Var;
            this.f3709c = jl7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C02712(this.f3708b, this.f3709c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C02712) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f3707a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                h83 h83Var = new h83(this.f3709c, 2);
                this.f3707a = 1;
                if (this.f3708b.collect(h83Var, this) == coroutineSingletons) {
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
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(kn1 kn1Var, c83 c83Var, Continuation continuation) {
        super(2, continuation);
        this.f3705c = kn1Var;
        this.f3706d = c83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(this.f3705c, this.f3706d, continuation);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1$1.f3704b = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1) create((jl7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r6.collect(r1, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (p000.wfb.m23905G(r1, r5, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3703a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            jl7 jl7Var = (jl7) this.f3704b;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f47685a;
            kn1 kn1Var = this.f3705c;
            boolean zM11650l = fa4.m11650l(kn1Var, emptyCoroutineContext);
            c83 c83Var = this.f3706d;
            if (zM11650l) {
                h83 h83Var = new h83(jl7Var, 1);
                this.f3703a = 1;
            } else {
                C02712 c02712 = new C02712(c83Var, jl7Var, null);
                this.f3703a = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
