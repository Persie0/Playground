package com.lingq.feature.reader.old;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0638f;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.ded;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$15", m4291f = "ReaderFragment.kt", m4292l = {992}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$15 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28275b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$15$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$15$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22821 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28276a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22821(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28276a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C22821(this.f28276a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22821 c22821 = (C22821) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22821.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28276a;
            if (readerFragment.m9292Y0()) {
                Bundle bundle = new Bundle();
                bundle.putInt("lessonId", readerFragment.m9290W0().m9332l3());
                bundle.putBoolean("isDocked", true);
                AbstractC0638f abstractC0638fM2106h = readerFragment.m2106h();
                abstractC0638fM2106h.getClass();
                int i = R$id.fragment_container_token;
                if (((LessonVocabularyFragment) abstractC0638fM2106h.m2137E(LessonVocabularyFragment.class.getName())) == null) {
                    LessonVocabularyFragment lessonVocabularyFragment = new LessonVocabularyFragment();
                    lessonVocabularyFragment.m2095W(bundle);
                    ded.m10316b(abstractC0638fM2106h, lessonVocabularyFragment, i, LessonVocabularyFragment.class.getName(), false);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$15(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28275b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$15(this.f28275b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$15) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28274a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28275b;
            c83 c83VarMo8767j = readerFragment.m9290W0().f29344c.mo8767j();
            C22821 c22821 = new C22821(readerFragment, null);
            this.f28274a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8767j, c22821, this) == coroutineSingletons) {
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
