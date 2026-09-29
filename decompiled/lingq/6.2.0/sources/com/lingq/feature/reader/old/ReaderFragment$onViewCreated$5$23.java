package com.lingq.feature.reader.old;

import com.lingq.feature.reader.R$drawable;
import com.lingq.feature.reader.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b89;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.fx5;
import p000.gm5;
import p000.jfa;
import p000.lw7;
import p000.r79;
import p000.t79;
import p000.un1;
import p000.v79;
import p000.x79;
import p000.xfa;
import p000.z79;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$23", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$23 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28308b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$23$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$23$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22911 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28309a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28310b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22911(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28310b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22911 c22911 = new C22911(this.f28310b, continuation);
            c22911.f28309a = obj;
            return c22911;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22911 c22911 = (C22911) create((b89) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22911.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            b89 b89Var = (b89) this.f28309a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28310b;
            fx5 fx5Var = readerFragment.f28224H0;
            if (fx5Var == null) {
                fa4.m11636J("viewLessonMenuBinding");
                throw null;
            }
            fx5Var.f39864m.setImageResource(R$drawable.ic_simplified_simplify);
            readerFragment.m9288U0().f66720z.setOnClickListener(new lw7(readerFragment, 0));
            if (fa4.m11650l(b89Var, v79.f64982a)) {
                fx5 fx5Var2 = readerFragment.f28224H0;
                if (fx5Var2 == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                fx5Var2.f39867p.setText(readerFragment.m2111m(R$string.lesson_simplify_menu_processing));
                if (!readerFragment.m9290W0().m9331k3()) {
                    jfa.m14429l(readerFragment.m9288U0().f66720z);
                    readerFragment.m9288U0().f66711q.setImageResource(R$drawable.ic_simplified_simplify);
                    readerFragment.m9288U0().f66680A.setText(readerFragment.m2111m(R$string.lesson_simplify_menu_processing));
                    readerFragment.m9288U0().f66718x.setText(readerFragment.m2111m(R$string.lesson_simplify_sentence));
                }
            } else if (fa4.m11650l(b89Var, t79.f61954a)) {
                fx5 fx5Var3 = readerFragment.f28224H0;
                if (fx5Var3 == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                fx5Var3.f39867p.setText(readerFragment.m2111m(R$string.lesson_simplify));
                jfa.m14425h(readerFragment.m9288U0().f66720z);
            } else if (b89Var instanceof x79) {
                fx5 fx5Var4 = readerFragment.f28224H0;
                if (fx5Var4 == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                fx5Var4.f39864m.setImageResource(R$drawable.ic_simplified_original);
                fx5 fx5Var5 = readerFragment.f28224H0;
                if (fx5Var5 == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                fx5Var5.f39867p.setText(readerFragment.m2111m(R$string.lesson_simplify_switch_to_original));
                if (!readerFragment.m9290W0().m9331k3()) {
                    jfa.m14429l(readerFragment.m9288U0().f66720z);
                    readerFragment.m9288U0().f66711q.setImageResource(R$drawable.ic_simplified_original);
                    readerFragment.m9288U0().f66680A.setText(readerFragment.m2111m(R$string.lesson_simplify_original));
                    readerFragment.m9288U0().f66718x.setText(readerFragment.m2111m(R$string.lesson_simplify_sentence));
                }
            } else if (b89Var instanceof z79) {
                fx5 fx5Var6 = readerFragment.f28224H0;
                if (fx5Var6 == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                fx5Var6.f39867p.setText(readerFragment.m2111m(R$string.lesson_simplify_switch_to_simplified));
                if (!readerFragment.m9290W0().m9331k3()) {
                    jfa.m14429l(readerFragment.m9288U0().f66720z);
                    readerFragment.m9288U0().f66711q.setImageResource(R$drawable.ic_simplified_simplify);
                    readerFragment.m9288U0().f66680A.setText(readerFragment.m2111m(R$string.lesson_simplify_simplified_ai));
                    readerFragment.m9288U0().f66718x.setText(readerFragment.m2111m(R$string.lesson_simplify_sentence));
                }
            } else {
                if (!fa4.m11650l(b89Var, r79.f58859a)) {
                    gm5.m12750e();
                    return null;
                }
                fx5 fx5Var7 = readerFragment.f28224H0;
                if (fx5Var7 == null) {
                    fa4.m11636J("viewLessonMenuBinding");
                    throw null;
                }
                jfa.m14425h(fx5Var7.f39861j);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$23(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28308b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$23(this.f28308b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$23) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28307a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28308b;
            c18 c18Var = readerFragment.m9290W0().f29367h2;
            C22911 c22911 = new C22911(readerFragment, null);
            c18Var.getClass();
            this.f28307a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22911, this) == coroutineSingletons) {
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
