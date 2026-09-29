package com.lingq.feature.reader.old;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.p08;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$3", m4291f = "ReaderViewModel.kt", m4292l = {784}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28868b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$3$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$3$2", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23872 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28869a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28870b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23872(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28870b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23872 c23872 = new C23872(this.f28870b, continuation);
            c23872.f28869a = obj;
            return c23872;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23872 c23872 = (C23872) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23872.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = (Map) this.f28869a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28870b;
            wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$checkCompletedPages$1(c2412n, map, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$3(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28868b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$3(this.f28868b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28867a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28868b;
            p08 p08Var = new p08(c2412n.f29290K0, 5);
            C23872 c23872 = new C23872(c2412n, null);
            this.f28867a = 1;
            if (AbstractC3224d.m15529h(p08Var, c23872, this) == coroutineSingletons) {
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
