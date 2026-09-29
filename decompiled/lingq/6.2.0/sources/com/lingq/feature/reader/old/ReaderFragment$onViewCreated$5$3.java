package com.lingq.feature.reader.old;

import androidx.fragment.app.AbstractC0638f;
import com.lingq.core.token.TokenPopupHostFragment;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.ded;
import p000.g70;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$3", m4291f = "ReaderFragment.kt", m4292l = {2110}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28335b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$3$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22981 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28336a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22981(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28337b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22981 c22981 = new C22981(this.f28337b, continuation);
            c22981.f28336a = obj;
            return c22981;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22981 c22981 = (C22981) create((Boolean) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22981.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Boolean bool = (Boolean) this.f28336a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (bool != null) {
                ReaderFragment readerFragment = this.f28337b;
                if (jfa.m14418a(readerFragment.m2090R())) {
                    if (bool.booleanValue()) {
                        if (((LessonVocabularyFragment) readerFragment.m2106h().m2137E(LessonVocabularyFragment.class.getName())) != null) {
                            AbstractC0638f abstractC0638fM2106h = readerFragment.m2106h();
                            abstractC0638fM2106h.getClass();
                            LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) abstractC0638fM2106h.m2137E(LessonVocabularyFragment.class.getName());
                            if (lessonVocabularyFragment != null) {
                                g70 g70Var = new g70(abstractC0638fM2106h);
                                g70Var.m12400j(lessonVocabularyFragment);
                                g70Var.m12396f();
                            }
                        } else if (((TokenPopupHostFragment) readerFragment.m2106h().m2137E(TokenPopupHostFragment.class.getName())) != null) {
                            ded.m10315a(readerFragment.m2106h(), false);
                        }
                    } else if (((TokenPopupHostFragment) readerFragment.m2106h().m2137E(TokenPopupHostFragment.class.getName())) != null) {
                        ded.m10315a(readerFragment.m2106h(), true);
                    }
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$3(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28335b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$3(this.f28335b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28334a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28335b;
            c18 c18Var = readerFragment.m9290W0().f29349d0;
            C22981 c22981 = new C22981(readerFragment, null);
            c18Var.getClass();
            this.f28334a = 1;
            if (AbstractC3224d.m15529h(c18Var, c22981, this) == coroutineSingletons) {
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
