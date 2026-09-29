package com.lingq.feature.reader.old;

import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.fa4;
import p000.gy7;
import p000.kj3;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$10", m4291f = "ReaderPageFragment.kt", m4292l = {563}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$10 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28478b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$10$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$10$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23291 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28479a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23291(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28480b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23291 c23291 = new C23291(this.f28480b, continuation);
            c23291.f28479a = obj;
            return c23291;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23291 c23291 = (C23291) create((gy7) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23291.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            gy7 gy7Var = (gy7) this.f28479a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderPageFragment readerPageFragment = this.f28480b;
            LessonTextView lessonTextView = readerPageFragment.f28444F0;
            if (lessonTextView != null) {
                lessonTextView.post(new kj3(7, readerPageFragment, gy7Var));
                return xfa.f68157a;
            }
            fa4.m11636J("tvContent");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$10(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28478b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$10(this.f28478b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$10) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28477a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28478b;
            C3540rl c3540rl = new C3540rl(readerPageFragment.m9299X0().f29220Y, 5);
            C23291 c23291 = new C23291(readerPageFragment, null);
            this.f28477a = 1;
            if (AbstractC3224d.m15529h(c3540rl, c23291, this) == coroutineSingletons) {
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
