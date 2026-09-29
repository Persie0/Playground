package com.lingq.feature.reader.old;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.fa4;
import p000.gm5;
import p000.rj2;
import p000.sj2;
import p000.tj2;
import p000.uj2;
import p000.un1;
import p000.vj2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$21", m4291f = "ReaderViewModel.kt", m4292l = {2943}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$21 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28864b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$21$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$21$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23861 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28865a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23861(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28866b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23861 c23861 = new C23861(this.f28866b, continuation);
            c23861.f28865a = obj;
            return c23861;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23861 c23861 = (C23861) create((vj2) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23861.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C3244l c3244l = this.f28866b.f29387m2;
            vj2 vj2Var = (vj2) this.f28865a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (vj2Var instanceof rj2) {
                Pair pair = new Pair(((rj2) vj2Var).f59401a, new Integer(100));
                c3244l.getClass();
                c3244l.m15572j(null, pair);
            } else if (vj2Var instanceof uj2) {
                uj2 uj2Var = (uj2) vj2Var;
                Pair pair2 = new Pair(uj2Var.f63987a, new Integer(uj2Var.f63988b));
                c3244l.getClass();
                c3244l.m15572j(null, pair2);
            } else if (vj2Var instanceof sj2) {
                Pair pair3 = new Pair(((sj2) vj2Var).f60923a, new Integer(-1));
                c3244l.getClass();
                c3244l.m15572j(null, pair3);
            } else if (!fa4.m11650l(vj2Var, tj2.f62365a)) {
                gm5.m12750e();
                return null;
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$21(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28864b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$21(this.f28864b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$21) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28863a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28864b;
            eh9 eh9VarMo8236I0 = c2412n.f29364h.mo8236I0();
            C23861 c23861 = new C23861(c2412n, null);
            eh9VarMo8236I0.getClass();
            this.f28863a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo8236I0, c23861, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
