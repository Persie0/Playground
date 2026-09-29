package com.lingq.core.web;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.eda;
import p000.k42;
import p000.l42;
import p000.pe6;
import p000.tad;
import p000.u32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.web.WebViewModel$1", m4291f = "WebViewModel.kt", m4292l = {eda.f37086g}, m4293m = "invokeSuspend", m4294v = 2)
final class WebViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1943a f24336b;

    /* JADX INFO: renamed from: com.lingq.core.web.WebViewModel$1$1 */
    @c32(m4290c = "com.lingq.core.web.WebViewModel$1$1", m4291f = "WebViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19421 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1943a f24337a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19421(C1943a c1943a, Continuation continuation) {
            super(2, continuation);
            this.f24337a = c1943a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19421(this.f24337a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19421 c19421 = (C19421) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19421.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C1943a c1943a = this.f24337a;
            C3211a c3211a = c1943a.f24343g;
            String str = c1943a.f24341e.f48996a;
            C3244l c3244l = c1943a.f24345i;
            boolean zEquals = str.equals(c3244l.getValue());
            xfa xfaVar = xfa.f68157a;
            if (!zEquals) {
                tad tadVarM22429b = new u32((String) c3244l.getValue(), c1943a.f24338b.mo4589b2(), true).m22429b();
                if (!(tadVarM22429b instanceof k42) && !(tadVarM22429b instanceof l42)) {
                    c3211a.mo4677k(xfaVar);
                    c1943a.mo8247e0((String) c3244l.getValue(), 0L);
                    return xfaVar;
                }
                c3211a.mo4677k(xfaVar);
                c1943a.f24339c.mo8243R1(pe6.f56006a);
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewModel$1(C1943a c1943a, Continuation continuation) {
        super(2, continuation);
        this.f24336b = c1943a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewModel$1(this.f24336b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24335a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1943a c1943a = this.f24336b;
            C3244l c3244l = c1943a.f24345i;
            C19421 c19421 = new C19421(c1943a, null);
            this.f24335a = 1;
            if (AbstractC3224d.m15529h(c3244l, c19421, this) == coroutineSingletons) {
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
