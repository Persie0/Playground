package com.lingq.feature.reader.old;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0638f;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.old.settings.LessonReviewMenuFragment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.ded;
import p000.du0;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$34", m4291f = "ReaderFragment.kt", m4292l = {1561}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$34 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28353a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28354b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$34$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$34$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23031 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28355a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23031(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28355a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23031(this.f28355a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23031 c23031 = (C23031) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23031.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            AbstractC0638f abstractC0638fM14427j = jfa.m14427j(this.f28355a);
            int i = R$id.fragment_menu;
            Bundle bundle = new Bundle();
            if (((LessonReviewMenuFragment) (abstractC0638fM14427j != null ? abstractC0638fM14427j.m2137E(LessonReviewMenuFragment.class.getName()) : null)) == null) {
                LessonReviewMenuFragment lessonReviewMenuFragment = new LessonReviewMenuFragment();
                lessonReviewMenuFragment.m2095W(bundle);
                if (abstractC0638fM14427j != null) {
                    ded.m10316b(abstractC0638fM14427j, lessonReviewMenuFragment, i, LessonReviewMenuFragment.class.getName(), true);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$34(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28354b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$34(this.f28354b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$34) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28353a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28354b;
            du0 du0Var = readerFragment.m9290W0().f29288J1;
            C23031 c23031 = new C23031(readerFragment, null);
            this.f28353a = 1;
            if (AbstractC3224d.m15529h(du0Var, c23031, this) == coroutineSingletons) {
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
