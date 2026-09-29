package com.lingq.feature.karaoke;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$1", m4291f = "KaraokeViewModel.kt", m4292l = {347}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2118c f26222b;

    /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$1$1", m4291f = "KaraokeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21111 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f26223a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2118c f26224b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21111(C2118c c2118c, Continuation continuation) {
            super(2, continuation);
            this.f26224b = c2118c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21111 c21111 = new C21111(this.f26224b, continuation);
            c21111.f26223a = ((Number) obj).intValue();
            return c21111;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21111 c21111 = (C21111) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21111.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f26223a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2118c c2118c = this.f26224b;
            AbstractC1263a.m7046a(c2118c.f26301o);
            c2118c.f26301o = wfb.m23926u(lda.m16103C(c2118c), null, null, new KaraokeViewModel$updateLesson$1(c2118c, i, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$1(C2118c c2118c, Continuation continuation) {
        super(2, continuation);
        this.f26222b = c2118c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeViewModel$1(this.f26222b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26221a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2118c c2118c = this.f26222b;
            C3244l c3244l = c2118c.f26300n;
            C21111 c21111 = new C21111(c2118c, null);
            c3244l.getClass();
            this.f26221a = 1;
            if (AbstractC3224d.m15529h(c3244l, c21111, this) == coroutineSingletons) {
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
