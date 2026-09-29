package com.lingq.feature.reader.old;

import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.mv7;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$5", m4291f = "ReaderPageFragment.kt", m4292l = {479}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28566b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$5$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$5$2", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23512 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28567a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23512(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28568b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23512 c23512 = new C23512(this.f28568b, continuation);
            c23512.f28567a = obj;
            return c23512;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23512 c23512 = (C23512) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23512.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f28567a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            SpannableString spannableString = new SpannableString(str);
            ReaderPageFragment readerPageFragment = this.f28568b;
            spannableString.setSpan(new LeadingMarginSpan.Standard(readerPageFragment.m2090R().getResources().getDimensionPixelSize(R$dimen.activity_horizontal_margin)), 0, spannableString.length(), 33);
            LessonTextView lessonTextView = readerPageFragment.f28444F0;
            if (lessonTextView != null) {
                lessonTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
                return xfa.f68157a;
            }
            fa4.m11636J("tvContent");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$5(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28566b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$5(this.f28566b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28565a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28566b;
            mv7 mv7Var = new mv7(readerPageFragment.m9299X0().f29258z, 11);
            C23512 c23512 = new C23512(readerPageFragment, null);
            this.f28565a = 1;
            if (AbstractC3224d.m15529h(mv7Var, c23512, this) == coroutineSingletons) {
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
