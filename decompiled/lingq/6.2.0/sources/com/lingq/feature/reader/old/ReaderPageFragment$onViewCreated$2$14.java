package com.lingq.feature.reader.old;

import android.text.SpannableString;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.vx7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$14", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$14 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28494b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$14$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$14$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23331 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderPageFragment f28495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23331(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28495a = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23331(this.f28495a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23331 c23331 = (C23331) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23331.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderPageFragment readerPageFragment = this.f28495a;
            LessonTextView lessonTextView = readerPageFragment.f28444F0;
            if (lessonTextView == null) {
                fa4.m11636J("tvContent");
                throw null;
            }
            String string = lessonTextView.getText().toString();
            LessonTextView lessonTextView2 = readerPageFragment.f28444F0;
            if (lessonTextView2 == null) {
                fa4.m11636J("tvContent");
                throw null;
            }
            CharSequence text = lessonTextView2.getText();
            text.getClass();
            ReaderPageFragment.m9294S0(readerPageFragment, string, (SpannableString) text);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$14(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28494b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$14(this.f28494b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$14) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28493a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28494b;
            c18 c18Var = readerPageFragment.m9299X0().f29244l0;
            C23331 c23331 = new C23331(readerPageFragment, null);
            c18Var.getClass();
            this.f28493a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23331, this) == coroutineSingletons) {
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
