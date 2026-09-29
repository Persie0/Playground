package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.p012ui.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.ag0;
import p000.bg0;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.gm5;
import p000.jfa;
import p000.un1;
import p000.vx7;
import p000.xf0;
import p000.xfa;
import p000.yf0;
import p000.zf0;
import p000.zi3;
import p000.zx7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$20", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$20 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28527a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28528b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$20$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$20$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23421 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28529a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28530b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23421(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28530b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23421 c23421 = new C23421(this.f28530b, continuation);
            c23421.f28529a = obj;
            return c23421;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23421 c23421 = (C23421) create((bg0) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23421.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            bg0 bg0Var = (bg0) this.f28529a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zM11650l = fa4.m11650l(bg0Var, zf0.f71481a);
            ReaderPageFragment readerPageFragment = this.f28530b;
            if (zM11650l) {
                vx7 vx7Var = ReaderPageFragment.Companion;
                jfa.m14429l(readerPageFragment.m9297V0().f69710a);
                readerPageFragment.m9297V0().f69710a.setText(readerPageFragment.m2111m(R$string.lesson_review_study_sentence));
                readerPageFragment.m9297V0().f69710a.setOnClickListener(new zx7(readerPageFragment, 1));
            } else if (fa4.m11650l(bg0Var, ag0.f595a)) {
                vx7 vx7Var2 = ReaderPageFragment.Companion;
                jfa.m14429l(readerPageFragment.m9297V0().f69710a);
                readerPageFragment.m9297V0().f69710a.setText(readerPageFragment.m2111m(R$string.ui_continue));
                readerPageFragment.m9297V0().f69710a.setOnClickListener(new zx7(readerPageFragment, 2));
            } else if (bg0Var instanceof yf0) {
                vx7 vx7Var3 = ReaderPageFragment.Companion;
                jfa.m14429l(readerPageFragment.m9297V0().f69710a);
                Lesson lesson = (Lesson) readerPageFragment.m9298W0().f29381l0.getValue();
                if (lesson != null ? lesson.f19154m : false) {
                    readerPageFragment.m9297V0().f69710a.setText(readerPageFragment.m2111m(com.lingq.feature.reader.R$string.lesson_view_lesson_stats));
                    readerPageFragment.m9297V0().f69710a.setOnClickListener(new zx7(readerPageFragment, 3));
                } else {
                    readerPageFragment.m9297V0().f69710a.setText(readerPageFragment.m2111m(com.lingq.feature.reader.R$string.lesson_finish_lesson));
                    readerPageFragment.m9297V0().f69710a.setOnClickListener(new zx7(readerPageFragment, 4));
                }
            } else {
                if (!fa4.m11650l(bg0Var, xf0.f68147a)) {
                    gm5.m12750e();
                    return null;
                }
                vx7 vx7Var4 = ReaderPageFragment.Companion;
                jfa.m14425h(readerPageFragment.m9297V0().f69710a);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$20(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28528b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$20(this.f28528b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$20) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28527a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28528b;
            c18 c18Var = readerPageFragment.m9299X0().f29217V;
            C23421 c23421 = new C23421(readerPageFragment, null);
            c18Var.getClass();
            this.f28527a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23421, this) == coroutineSingletons) {
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
