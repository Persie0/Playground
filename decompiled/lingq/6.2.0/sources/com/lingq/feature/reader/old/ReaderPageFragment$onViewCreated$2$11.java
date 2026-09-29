package com.lingq.feature.reader.old;

import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.gvb;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$11", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$11 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28482b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$11$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$11$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23301 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28483a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23301(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28484b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23301 c23301 = new C23301(this.f28484b, continuation);
            c23301.f28483a = obj;
            return c23301;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23301 c23301 = (C23301) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23301.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f28483a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderPageFragment readerPageFragment = this.f28484b;
            LessonTextView lessonTextView = readerPageFragment.f28444F0;
            if (lessonTextView != null) {
                lessonTextView.post(new gvb(7, readerPageFragment, pair));
                return xfa.f68157a;
            }
            fa4.m11636J("tvContent");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$11(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28482b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$11(this.f28482b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$11) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28481a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28482b;
            c18 c18Var = readerPageFragment.m9299X0().f29219X;
            C23301 c23301 = new C23301(readerPageFragment, null);
            c18Var.getClass();
            this.f28481a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23301, this) == coroutineSingletons) {
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
