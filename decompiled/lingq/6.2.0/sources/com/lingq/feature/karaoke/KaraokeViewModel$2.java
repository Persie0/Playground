package com.lingq.feature.karaoke;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.hc7;
import p000.tb7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$2", m4291f = "KaraokeViewModel.kt", m4292l = {347}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2118c f26226b;

    /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$2$1", m4291f = "KaraokeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21121 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26227a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2118c f26228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21121(C2118c c2118c, Continuation continuation) {
            super(2, continuation);
            this.f26228b = c2118c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21121 c21121 = new C21121(this.f26228b, continuation);
            c21121.f26227a = obj;
            return c21121;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21121 c21121 = (C21121) create((hc7) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21121.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            hc7 hc7Var = (hc7) this.f26227a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2118c c2118c = this.f26228b;
            C3244l c3244l = c2118c.f26307u;
            Long l = new Long(hc7Var.f42177e);
            c3244l.getClass();
            c3244l.m15572j(null, l);
            tb7 tb7Var = hc7Var.f42185m;
            if (tb7Var != null) {
                int i = tb7Var.f62101a;
                C3244l c3244l2 = c2118c.f26300n;
                Integer num = new Integer(i);
                c3244l2.getClass();
                c3244l2.m15572j(null, num);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$2(C2118c c2118c, Continuation continuation) {
        super(2, continuation);
        this.f26226b = c2118c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeViewModel$2(this.f26226b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26225a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2118c c2118c = this.f26226b;
            c18 c18Var = c2118c.f26293g.f21946D;
            C21121 c21121 = new C21121(c2118c, null);
            c18Var.getClass();
            this.f26225a = 1;
            if (AbstractC3224d.m15529h(c18Var, c21121, this) == coroutineSingletons) {
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
