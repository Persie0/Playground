package com.lingq.feature.reader.old;

import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.je9;
import p000.kj3;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$12", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$12 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28486b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$12$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$12$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23311 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28487a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23311(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28488b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23311 c23311 = new C23311(this.f28488b, continuation);
            c23311.f28487a = obj;
            return c23311;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23311 c23311 = (C23311) create((je9) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23311.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            je9 je9Var = (je9) this.f28487a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderPageFragment readerPageFragment = this.f28488b;
            LessonTextView lessonTextView = readerPageFragment.f28444F0;
            if (lessonTextView != null) {
                lessonTextView.post(new kj3(8, readerPageFragment, je9Var));
                return xfa.f68157a;
            }
            fa4.m11636J("tvContent");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$12(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28486b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$12(this.f28486b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$12) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28485a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28486b;
            c18 c18Var = readerPageFragment.m9299X0().f29213R;
            C23311 c23311 = new C23311(readerPageFragment, null);
            c18Var.getClass();
            this.f28485a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23311, this) == coroutineSingletons) {
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
