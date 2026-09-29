package com.lingq.feature.reader.old;

import android.content.SharedPreferences;
import com.lingq.feature.reader.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.fr5;
import p000.iw7;
import p000.ow7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$44", m4291f = "ReaderFragment.kt", m4292l = {1744}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$44 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28396b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$44$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$44$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23151 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28397a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23151(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28397a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23151(this.f28397a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23151 c23151 = (C23151) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23151.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28397a;
            SharedPreferences.Editor editorEdit = readerFragment.m9287T0().f58118b.edit();
            editorEdit.getClass();
            editorEdit.putBoolean("shownSimplifiedAiPopup", true);
            editorEdit.apply();
            fr5 fr5Var = new fr5(readerFragment.m2090R(), 0);
            fr5Var.m12028k(R$string.lesson_simplify_title);
            fr5Var.m12020c(R$string.lesson_simplify_description);
            fr5Var.m12025h(R$string.texts_try_it, new iw7(4, readerFragment)).m12022e(com.lingq.core.p012ui.R$string.ui_not_now, ow7.f55078d).m25557a();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$44(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28396b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$44(this.f28396b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$44) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28395a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28396b;
            du0 du0Var = readerFragment.m9290W0().f29351d2;
            C23151 c23151 = new C23151(readerFragment, null);
            this.f28395a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23151, this) == coroutineSingletons) {
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
